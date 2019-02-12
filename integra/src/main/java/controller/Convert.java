package controller;

import org.json.JSONObject;
import org.json.XML;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;



public class Convert {

            //Lê e converte o arquivo XML em JSON
    public static JSONObject converter(String path) throws IOException {
            byte[] xml = Files.readAllBytes(Paths.get(path));
            JSONObject json = XML.toJSONObject(new String(xml));
            return json;
        }

}
