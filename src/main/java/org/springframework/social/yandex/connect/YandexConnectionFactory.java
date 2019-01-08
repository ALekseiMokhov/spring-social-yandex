package org.springframework.social.yandex.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.yandex.api.Yandex;
import org.springframework.social.yandex.config.env.YandexEnvironment;

public class YandexConnectionFactory extends OAuth2ConnectionFactory<Yandex> {
    private static final String SERVICE_NAME = "yandex";

    public YandexConnectionFactory(YandexEnvironment environment) {
        super(SERVICE_NAME, new YandexServiceProvider(environment), new YandexAdapter());
    }

}
