package lab2;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public interface Serializate {

    default void SerializeToXml(Game game) {

        File file = new File("Game.xml");
        try {
            JAXBContext jc = JAXBContext.newInstance(Game.class);
            Marshaller marshaller = jc.createMarshaller();

            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(game,file);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
            marshaller.marshal(game,System.out);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    default Game SerializeFromXml(){

        File file = new File("Game.xml");

        Game game = new Game();
        JAXBContext jc = null;
        try {
            jc = JAXBContext.newInstance(Game.class);
            Unmarshaller unmarshaller = jc.createUnmarshaller();
            game = (Game) unmarshaller.unmarshal(file);
            return game;
        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }


    default void SerializeToJson(Game game){

        File file = new File("Game.json");

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(file, game);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    default Game SerializeFromJson(){

        File file = new File("Game.json");
        Game game = null;
        ObjectMapper mapper = new ObjectMapper();
        try {
            game =  mapper.readValue(file,Game.class);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return game;

    }

    default void SerializeToTxt(Game game){

        File file = new File("Game.txt");

        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            fos = new FileOutputStream(file);
            if(fos != null) {
                try {
                    oos = new ObjectOutputStream(fos);
                    oos.writeObject(game);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


    default Game SerializeFromTxt(){

        File file = new File("Game.txt");

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(file);
            if(fis != null) {
                try {
                    ObjectInputStream ois = new ObjectInputStream(fis);
                    try {
                        Game game = (Game) ois.readObject();
                        return game;
                    } catch (ClassNotFoundException e) {
                        e.printStackTrace();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
