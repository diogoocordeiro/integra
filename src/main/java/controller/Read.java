package controller;

import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.parser.ParseException;

public class Read {

    public JSONObject ler(String caminho) {
        JSONObject json = new JSONObject();
        JSONParser parser = new JSONParser();

        try {
            Object obj = parser.parse(new FileReader(caminho));
            System.out.println(caminho);
            JSONObject jsonObject = (JSONObject) obj;
            json = jsonObject;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return json;
    }
}