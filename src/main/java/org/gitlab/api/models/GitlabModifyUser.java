package org.gitlab.api.models;

import org.codehaus.jackson.annotate.JsonProperty;

/**
 * Created by Aleksey Pimenov on 05.04.2015.
 */
public class GitlabModifyUser extends GitlabUser{

    private String provider;

    @JsonProperty("extern_uid")
    private String externalUid;

    /**
     * Only for user creation
     */

    @JsonProperty("confirm")
    private boolean confirmationRequired;


    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getExternalUid() {
        return externalUid;
    }

    public void setExternalUid(String externalUid) {
        this.externalUid = externalUid;
    }

    public boolean isConfirmationRequired() {
        return confirmationRequired;
    }

    public void setConfirmationRequired(boolean confirmationRequired) {
        this.confirmationRequired = confirmationRequired;
    }
}
