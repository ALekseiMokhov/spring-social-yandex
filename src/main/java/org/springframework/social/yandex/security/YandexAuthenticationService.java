package org.springframework.social.yandex.security;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;
import org.springframework.social.yandex.api.Yandex;

public class YandexAuthenticationService extends OAuth2AuthenticationService<Yandex> {
    public YandexAuthenticationService(OAuth2ConnectionFactory connectionFactory) {
        super(connectionFactory);
    }
}
