package org.springframework.social.yandex.api.impl;

import lombok.Builder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.social.yandex.api.User;
import org.springframework.web.client.RestOperations;

@Builder
public class PassportTemplate implements UserOperations {
    private String apiUrl;
    private String accessToken;
    private RestOperations restOperations;


    public User getUserProfile() {
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "OAuth " + accessToken);

        return restOperations.exchange(apiUrl, HttpMethod.GET, new HttpEntity<Object>(headers), User.class).getBody();
    }
}
