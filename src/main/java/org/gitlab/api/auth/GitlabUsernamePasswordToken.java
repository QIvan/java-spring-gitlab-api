package org.gitlab.api.auth;

/**
 * Date: 06.04.2015
 * Time: 16:54
 *
 * @author Alexey Pimenov
 */
public class GitlabUsernamePasswordToken implements GitlabAuthToken {


    private String username;

    private String password;

    public GitlabUsernamePasswordToken(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
