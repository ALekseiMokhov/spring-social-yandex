package org.springframework.social.yandex.connect;

import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.yandex.api.User;
import org.springframework.social.yandex.api.Yandex;

import static org.springframework.util.StringUtils.hasText;
import static org.springframework.util.StringUtils.isEmpty;

public class YandexAdapter implements ApiAdapter<Yandex> {
    public boolean test(Yandex yandex) {
        try {
            yandex.userOperations().getUserProfile();
            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    public void setConnectionValues(Yandex yandex, ConnectionValues connectionValues) {
        User user = yandex.userOperations().getUserProfile();

        connectionValues.setProviderUserId(user.getId());
        connectionValues.setDisplayName(user.getDisplayName());
        if (hasText(user.getAvatarId())) {
            String avatarApiUrl = yandex.env().getAvatarApiUrl();
            connectionValues.setImageUrl(avatarApiUrl.replace("{id}", user.getAvatarId()));
        }

        if (!isEmpty(user.getOpenIds())) {
            connectionValues.setProfileUrl(user.getOpenIds().get(0));
        }
    }

    public UserProfile fetchUserProfile(Yandex yandex) {
        User user = yandex.userOperations().getUserProfile();
        return new UserProfileBuilder()
                .setId(user.getId())
                .setName(user.getRealName())
                .setUsername(user.getDisplayName())
                .setFirstName(user.getFirstName())
                .setLastName(user.getLastName())
                .setEmail(user.getEmail())
                .build();
    }

    public void updateStatus(Yandex yandex, String s) {

    }
}
