package org.springframework.social.yandex.config.env;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class YandexEnvironment {
    private String appId;
    private String appSecret;
    private String authUrl = "https://oauth.yandex.ru/authorize/";
    private String accessTokenUrl = "https://oauth.yandex.ru/token";
    private String passportApiUrl = "https://login.yandex.ru/info?format=json";
    private String avatarApiUrl = "https://avatars.yandex.net/get-yapic/{id}/islands-200";


    public YandexEnvironment(String appId, String appSecret) {
        this.appId = appId;
        this.appSecret = appSecret;
    }
}
