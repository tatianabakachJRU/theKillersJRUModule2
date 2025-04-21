package elective_3.yaml_1;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.core.exc.StreamWriteException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.File;
import java.io.IOException;

public class YamlExample_1 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper(new YAMLFactory());

        Cat cat = new Cat("Whiskars", 5);

        try{
            objectMapper.writeValue(new File("cat.yaml"), cat);
            System.out.println("Объект сериализован в cat.yaml");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            Cat cat1 = objectMapper.readValue(new File("cat.yaml"), Cat.class);
            System.out.println(cat1);
        } catch (StreamReadException | DatabindException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
