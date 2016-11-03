import mypackage.NombreType;
import mypackage.PokedexType;
import mypackage.PokemonType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

/**
 * Created by x3727349s on 27/10/16.
 */
public class Main {

        public static void main(String[] args) {
                mostrar();
                afegirPokemon();
        }


        public static void mostrar(){

                File f1 = new File("pokemons.xml");

                try {

                        JAXBContext context = JAXBContext.newInstance(PokedexType.class);

                        Unmarshaller um = context.createUnmarshaller();
                        PokedexType pdt = (PokedexType) um.unmarshal(f1);


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

                PokemonType pkt = new PokemonType();

                pkt.getNombre().setValue("Reshidam");
                pkt.getNombre().setClasse("Fuego");
                pkt.setPV("130");
                pkt.setAtaque1("Enfadado");
                pkt.setAtaque2("Llama azul");
                pkt.setEtapa("Legendario");

                try {

                        JAXBContext context = JAXBContext.newInstance(PokedexType.class);

                        Unmarshaller um = context.createUnmarshaller();
                        PokedexType pdt = (PokedexType) um.unmarshal(f1);


                        pdt.getPokemon().add(pkt);

                        guardar(pdt);

                } catch (JAXBException e) {
                        e.printStackTrace();
                }


        }

        public static void guardar(PokedexType pdt){

                File flg =new File("pokemon2.xml");

                try {
                        JAXBContext context = JAXBContext.newInstance(PokedexType.class);
                        Marshaller n = (context.createMarshaller());
                        n.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
                        n.marshal(pdt,flg);


                } catch (JAXBException e) {
                        e.printStackTrace();
                }


        }



}











