package org.springframework.social.yandex.api.impl;

import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.yandex.api.Yandex;
import org.springframework.social.yandex.config.env.YandexEnvironment;

public class YandexTemplate extends AbstractOAuth2ApiBinding implements Yandex {
    private String accessToken;
    private YandexEnvironment env;

    private UserOperations userOperations;


    public YandexTemplate(String accessToken, YandexEnvironment env) {
        this.accessToken = accessToken;
        this.env = env;

        initSubApis();
    }

    private void initSubApis() {
        userOperations = PassportTemplate.builder()
                .accessToken(accessToken)
                .apiUrl(env.getPassportApiUrl())
                .restOperations(getRestTemplate())
                .build();
    }

    @Override
    public UserOperations userOperations() {
        return userOperations;
    }

    @Override
    public YandexEnvironment env() {
        return env;
    }

}
