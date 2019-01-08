package org.springframework.social.yandex.api;

import org.springframework.social.ApiBinding;
import org.springframework.social.yandex.api.impl.UserOperations;
import org.springframework.social.yandex.config.env.YandexEnvironment;

public interface Yandex extends ApiBinding {
    UserOperations userOperations();
    YandexEnvironment env();
}
