package model;

import com.mashape.unirest.http.exceptions.UnirestException;
import model.Issue;

public class Main{
    public static void main(String[] args) throws UnirestException {
        Issue issue = new Issue();
        issue.CreateIssue("{\n" +
                "  \"fields\": {\n" +
                "    \"project\": {\n" +
                "      \"key\": \"TES\"\n" +
                "    },\n" +
                "    \"summary\": \"BRB - IT04 - PROJNOVO\",\n" +
                "    \"issuetype\": {\n" +
                "      \"name\": \"Problem\"\n" +
                "    },\n" +
                "    \"labels\": [\n" +
                "      \"brb\"\n" +
                "    ],\n" +
                "    \"timetracking\": {\n" +
                "      \"originalEstimate\": \"\",\n" +
                "      \"remainingEstimate\": \"\"\n" +
                "    },\n" +
                "    \"duedate\": \"2018-09-29\",\n" +
                "    \"customfield_10033\": {    \n" +
                "        \"value\": \"BRB\"\n" +
                "        },\n" +
                "    \"customfield_10056\": {    \n" +
                "      \"value\": \"Média\"\n" +
                "    },\n" +
                "\t\"customfield_10039\": \"2018-08-24\" \n" +
                "    }  \n" +
                "}\n");

    }
}
