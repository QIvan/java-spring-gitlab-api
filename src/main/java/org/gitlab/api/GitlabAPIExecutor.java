package org.gitlab.api;

import java.util.Map;

/**
 * Created by Aleksey Pimenov on 05.04.2015.
 */
public interface GitlabAPIExecutor {


    public <T> T get(String apiUrl,Map<String,?> queryParams,Class<T> responseType);

    public void put(String apiUrl,Object payload);

    public <T> T post(String apiUrl,T payload);

    public void delete(String apiUrl);


}
