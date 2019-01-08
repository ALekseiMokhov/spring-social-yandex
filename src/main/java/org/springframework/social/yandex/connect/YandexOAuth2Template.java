package org.springframework.social.yandex.connect;

import org.springframework.social.oauth2.OAuth2Template;
import org.springframework.social.yandex.config.env.YandexEnvironment;

public class YandexOAuth2Template extends OAuth2Template {
    public YandexOAuth2Template(YandexEnvironment env) {
        super(env.getAppId(), env.getAppSecret(), env.getAuthUrl(), env.getAccessTokenUrl());
    }
}
