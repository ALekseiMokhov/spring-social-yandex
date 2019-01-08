package org.springframework.social.yandex.connect;

import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.yandex.api.Yandex;
import org.springframework.social.yandex.api.impl.YandexTemplate;
import org.springframework.social.yandex.config.env.YandexEnvironment;

public class YandexServiceProvider extends AbstractOAuth2ServiceProvider<Yandex> {
    private YandexEnvironment environment;

    public YandexServiceProvider(YandexEnvironment environment) {
        super(new YandexOAuth2Template(environment));
        this.environment = environment;
    }

    @Override
    public Yandex getApi(String accessToken) {
        return new YandexTemplate(accessToken, environment);
    }

}
