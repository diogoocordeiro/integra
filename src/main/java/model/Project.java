package model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import utils.Requests;

public class Project {

    Requests project = new Requests();


    public void CreateProject(String body) throws UnirestException {
       HttpResponse<JsonNode> response = project.PostRequest("project", body);
       if (response.getStatus() >= 200 && response.getStatus() <= 201){
           System.out.println(response.getStatusText());
       }else if (response.getStatus() == 400){
           System.out.println(response.getBody().getObject().toString());
           System.out.println(response.getStatusText());
       }else if (response.getStatus() == 401){
           System.out.println(response.getBody().getObject().toString());
           System.out.println(response.getStatusText());
       }else if (response.getStatus() == 403){
           System.out.println(response.getBody().getObject().toString());
           System.out.println(response.getStatusText());
       }else if (response.getStatus() == 405){
           System.out.println(response.getBody().getObject().toString());
           System.out.println(response.getStatusText());
       }
    }

    public void DeleteProject(String key) throws UnirestException{
        HttpResponse<JsonNode> response = project.DeleteRequest("project/" + key);
        if (response.getStatus() >= 200 && response.getStatus() <= 204){
            System.out.println(response.getStatusText() +" Project deleted with success!");
        }else if (response.getStatus() == 401){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }else if (response.getStatus() == 404){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }else if (response.getStatus() == 405){
            System.out.println(response.getBody().getObject().toString());
            System.out.println(response.getStatusText());
        }
    }

    public void UpdateProject(String key, String body) throws UnirestException{
       HttpResponse<JsonNode> response = project.PutRequest("project/" + key , body);
       if (response.getStatus() == 200){
           System.out.println(response.getStatusText());
       }else if (response.getStatus() == 400){
           System.out.println(response.getBody().getObject().toString());
           System.out.println(response.getStatusText());
       }else if (response.getStatus() == 401){
           System.out.println(response.getBody().getObject().toString());
           System.out.println(response.getStatusText());
       }else if (response.getStatus() == 403){
           System.out.println(response.getBody().getObject().toString());
           System.out.println(response.getStatusText());
       }else if (response.getStatus() == 404){
           System.out.println(response.getBody().getObject().toString());
           System.out.println(response.getStatusText());
       }else if (response.getStatus() == 405){
           System.out.println(response.getBody().getObject().toString());
           System.out.println(response.getStatusText());
       }
    }

    public HttpResponse<JsonNode> GetProject(String key) throws UnirestException{
        HttpResponse<JsonNode> json = project.GetRequest("project/" + key);
        if (json.getStatus() == 200) {
            System.out.println(json.getBody().getObject().toString());
            return json;
        }else if (json.getStatus() == 401){
            System.out.println(json.getBody().getObject().toString());
            System.out.println(json.getStatusText());
            return json;
        }else if (json.getStatus() == 404){
            System.out.println(json.getBody().getObject().toString());
            System.out.println(json.getStatusText());
            return json;
        }else if (json.getStatus() == 405){
            System.out.println(json.getBody().getObject().toString());
            System.out.println(json.getStatusText());
            return json;
        }else{
            return json;
        }
    }
}
