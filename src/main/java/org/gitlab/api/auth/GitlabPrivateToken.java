package org.gitlab.api.auth;

/**
 * Date: 06.04.2015
 * Time: 16:53
 *
 * @author Alexey Pimenov
 */
public class GitlabPrivateToken implements GitlabAuthToken {

    private String token;

    public GitlabPrivateToken(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }
}
