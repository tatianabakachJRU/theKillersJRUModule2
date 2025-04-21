package elective_3.yaml_2;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class YAMLReaderExample_1 {
    public static void main(String[] args) {
        ObjectMapper yamlMapper = new ObjectMapper(new YAMLFactory());

        File file = new File("animals.yaml");

        try {
            AnimalList animalList = yamlMapper.readValue(file, AnimalList.class);

            for (Animal animal : animalList.getAnimals()) {
                System.out.println(animal);
            }
        } catch (StreamReadException | DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
