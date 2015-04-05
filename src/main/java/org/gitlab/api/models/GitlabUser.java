package org.gitlab.api.models;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;

public abstract class GitlabUser {
    public static String URL = "/users";
    public static String USERS_URL = "/users";
    public static String USER_URL = "/user"; // for sudo based ops

    private String username;
    private String email;
    private String name;
    private String skype;
    private String linkedin;
    private String twitter;
    private String state;




    @JsonProperty("provider")
    private String externProviderName;

    @JsonProperty("website_url")
    private String websiteUrl;

    @JsonProperty("bio")
    private String bio;


    @JsonProperty("projects_limit")
    private Integer projectsLimit;



    @JsonProperty("is_admin")
    private boolean isAdmin;

    @JsonProperty("can_create_group")
    private boolean canCreateGroup;

    @JsonProperty("can_create_project")
    private boolean canCreateProject;

    @JsonProperty("can_create_team")
    private boolean canCreateTeam;

    public String getUsername() {
        return username;
    }

    public void setUsername(String userName) {
        username = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }



    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getExternProviderName() {
        return externProviderName;
    }

    public void setExternProviderName(String externProviderName) {
        this.externProviderName = externProviderName;
    }

    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public boolean isCanCreateGroup() {
        return canCreateGroup;
    }

    public void setCanCreateGroup(boolean canCreateGroup) {
        this.canCreateGroup = canCreateGroup;
    }

    public boolean isCanCreateProject() {
        return canCreateProject;
    }

    public void setCanCreateProject(boolean canCreateProject) {
        this.canCreateProject = canCreateProject;
    }

    public boolean isCanCreateTeam() {
        return canCreateTeam;
    }

    public void setCanCreateTeam(boolean canCreateTeam) {
        this.canCreateTeam = canCreateTeam;
    }

    public Integer getProjectsLimit() {
        return projectsLimit;
    }

    public void setProjectsLimit(Integer projectsLimit) {
        this.projectsLimit = projectsLimit;
    }
}
