package model;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.exceptions.UnirestException;
import utils.Requests;

public class Project {

    Requests project = new Requests();


    public void CreateProject(JsonNode body) throws UnirestException {
        project.PostRequest("project", body);
    }

    public void DeleteProject(int key) throws UnirestException{
        project.DeleteRequest("project/" + key);
    }

    public void UpdateProject(int key, JsonNode body) throws UnirestException{
        project.PutRequest("project/" + key , body);
    }

    public HttpResponse<JsonNode> GetProject(int key) throws UnirestException{
        HttpResponse<JsonNode> json = project.GetRequest("project/" + key);
        return json;
    }
}
