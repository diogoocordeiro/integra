package utils;

import org.json.JSONObject;
import org.json.XML;

public class Convert {
        public static JSONObject converter(){
            String xml = "<?xml version=\"1.0\"?>\n" +
                    "<paises>\n" +
                    "   <pais sigla=\"BR\">\n" +
                    "       <nome>Brasil</nome>\n" +
                    "       <populacao>196.655.014</populacao>\n" +
                    "   </pais>\n" +
                    "   <pais sigla=\"AR\">\n" +
                    "       <nome>Argentina</nome>\n" +
                    "       <populacao>40.764.561</populacao>\n" +
                    "   </pais>\n" +
                    "</paises>";

            JSONObject json = XML.toJSONObject(xml);
            return json;
        }
}
