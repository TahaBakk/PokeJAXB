import mypackage.NombreType;
import mypackage.PokedexType;
import mypackage.PokemonType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Scanner;

/**
 * Created by x3727349s on 27/10/16.
 */
public class Main {

        public static void main(String[] args) {
            //cridem el metodes
            mostrar();
            afegirPokemon();
        }


        public static void mostrar(){
                //pasem el fitxer a un file
                File f1 = new File("pokemons.xml");

                try {

                        JAXBContext context = JAXBContext.newInstance(PokedexType.class);

                        Unmarshaller um = context.createUnmarshaller();
                        PokedexType pdt = (PokedexType) um.unmarshal(f1);

                        //mostra quants pokemons hi ha en la llista
                        System.out.println("Hi ha" +pdt.getPokemon().size()+" pokemons\n");

                        for (int i = 0; i < pdt.getPokemon().size(); i++) {
                                System.out.println("Nombre del pokemon: "+ pdt.getPokemon().get(i).getNombre().getValue());
                                System.out.println("La classe es: "+pdt.getPokemon().get(i).getNombre().getClasse());
                                System.out.println("El PV es: "+ pdt.getPokemon().get(i).getPV());
                                System.out.println("Primer ataque: "+ pdt.getPokemon().get(i).getAtaque1());
                                System.out.println("Segundo ataque: "+ pdt.getPokemon().get(i).getAtaque2());
                                System.out.println("Fase: "+ pdt.getPokemon().get(i).getEtapa()+"\n\n");

                        }


                } catch (JAXBException e) {
                        e.printStackTrace();
                }


        }

        public static void afegirPokemon(){

                File f1 = new File("pokemons.xml");
                //he creat nt per a poder afegir la classe i el valor
                // i despres afegim el nt al pkt per poder afegirlo xml
                NombreType nt = new NombreType();
                PokemonType pkt = new PokemonType();

                Scanner sc = new Scanner(System.in);

                //afegim la classe i el nom despres afegim en setnombre
                System.out.println("Escriu el nom del pokemon: ");
                nt.setValue(sc.nextLine());
                System.out.println("Escriu la seva classe: ");
                nt.setClasse(sc.nextLine());
                pkt.setNombre(nt);
                System.out.println("El PV: ");
                pkt.setPV(sc.nextLine());
                System.out.println("El seu primer atac: ");
                pkt.setAtaque1(sc.nextLine());
                System.out.println("El seu segon atac:: ");
                pkt.setAtaque2(sc.nextLine());
                System.out.println("La seva etapa: ");
                pkt.setEtapa(sc.nextLine());

                try {

                        JAXBContext context = JAXBContext.newInstance(PokedexType.class);

                        Unmarshaller um = context.createUnmarshaller();
                        PokedexType pdt = (PokedexType) um.unmarshal(f1);

                        //afegim els valors afegits al array de la pokedex
                        pdt.getPokemon().add(pkt);
                        //cridem la funcion pero guardar
                        guardar(pdt);

                } catch (JAXBException e) {
                        e.printStackTrace();
                }

        }

        public static void guardar(PokedexType pdt){

                File flg =new File("pokemons.xml");

                try {
                        //Aquet apartat es per escriure totes le dades del xml al nou xml
                        JAXBContext context = JAXBContext.newInstance(PokedexType.class);
                        Marshaller n = (context.createMarshaller());
                        n.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
                        n.marshal(pdt,flg);//Aqui li diem que el fitxer pdt el pasarem al result amb tots el canvis, el fitxer si existeix és sobreescriu.

                } catch (JAXBException e) {
                        e.printStackTrace();
                }


        }



}











