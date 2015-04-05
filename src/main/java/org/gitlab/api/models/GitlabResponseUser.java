package org.gitlab.api.models;

import org.codehaus.jackson.annotate.JsonProperty;

import java.util.Date;
import java.util.List;

/**
 * Created by Aleksey Pimenov on 05.04.2015.
 */
public class GitlabResponseUser extends GitlabUser {


    private Long id;
    @JsonProperty("created_at")
    private Date createdAt;
    @JsonProperty("avatar_url")
    private String avatarUrl;

    @JsonProperty("color_scheme_id")
    private Integer colorSchemeId;

    @JsonProperty("theme_id")
    private Integer themeId;

    private List<GitlabUserIdentity> identities;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getThemeId() {
        return themeId;
    }

    public void setThemeId(Integer themeId) {
        this.themeId = themeId;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getColorSchemeId() {
        return colorSchemeId;
    }

    public void setColorSchemeId(Integer colorSchemeId) {
        this.colorSchemeId = colorSchemeId;
    }

    public List<GitlabUserIdentity> getIdentities() {
        return identities;
    }

    public void setIdentities(List<GitlabUserIdentity> identities) {
        this.identities = identities;
    }
}
