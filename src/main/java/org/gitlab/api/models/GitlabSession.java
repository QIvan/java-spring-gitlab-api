package org.gitlab.api.models;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

public class GitlabSession extends GitlabResponseUser {

    public static final String URL = "/session";

    @JsonProperty("private_token")
    private String privateToken;


    public String getPrivateToken() {
        return privateToken;
    }

    public void setPrivateToken(String privateToken) {
        this.privateToken = privateToken;
    }

}


