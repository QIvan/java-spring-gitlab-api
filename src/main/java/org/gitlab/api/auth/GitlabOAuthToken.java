package org.gitlab.api.auth;

/**
 * Date: 06.04.2015
 * Time: 16:54
 *
 * @author Alexey Pimenov
 */
public class GitlabOAuthToken implements GitlabAuthToken {

    private String token;

    public GitlabOAuthToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
