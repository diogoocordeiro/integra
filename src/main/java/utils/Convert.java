package utils;

import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class Convert {

            //Converte o String xml em JSON
    public static JSONObject converter(String path) throws IOException {
            String xml = readFile(path);
            JSONObject json = XML.toJSONObject(xml);
            return json;
        }

    //Lê o arquivo xml
    public static String readFile(String path) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded);
    }
}
