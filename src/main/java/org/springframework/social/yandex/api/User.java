package org.springframework.social.yandex.api;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

/**
 * For more details see https://tech.yandex.ru/passport/doc/dg/reference/response-docpage/
 */
@Data
public class User {
    /**
     * Уникальный идентификатор пользователя Яндекса
     */
    private String id;

    /**
     * Логин пользователя на Яндексе
     */
    private String login;

    /**
     * Идентификатор портрета пользователя Яндекса
     */
    @JsonProperty("default_avatar_id")
    private String avatarId;

    /**
     * Имя пользователя, указанное им в Яндекс.Паспорте
     */
    @JsonProperty("first_name")
    private String firstName;

    /**
     * Фамилия пользователя, указанная им в Яндекс.Паспорте
     */
    @JsonProperty("last_name")
    private String lastName;

    /**
     * Имя, которое отображается для данной учетной записи в интерфейсе Яндекса
     */
    @JsonProperty("display_name")
    private String displayName;

    /**
     * Имя и фамилия пользователя, указанные им в Яндекс.Паспорте
     */
    @JsonProperty("real_name")
    private String realName;

    /**
     * E-mail по умолчанию, предназначенный для связи с пользователем
     */
    @JsonProperty("default_email")
    private String email;

    /**
     * Дата рождения пользователя в формате ГГГГ-ММ-ДД
     */
    @JsonProperty("birthday")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    /**
     * Список всех OpenID-идентификаторов, которые пользователь мог получить от Яндекса
     */
    @JsonProperty("openid_identities")
    private List<String> openIds;

    /**
     * Пол пользователя. Возможные значения:
        «male» — мужской;
        «female» — женский;
     */
    private String sex;
}
