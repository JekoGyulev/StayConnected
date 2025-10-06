package com.example.stayconnected.web.dto;

import com.example.stayconnected.user.model.User;
import com.example.stayconnected.web.dto.user.ProfileEditRequest;
import lombok.experimental.UtilityClass;

@UtilityClass
public class DtoMapper {

    public static ProfileEditRequest fromUser(User user) {
        return new ProfileEditRequest(
                                        user.getFirstName(),
                                        user.getLastName(),
                                        user.getAge(),
                                        user.getEmail(),
                                        user.getUsername(),
                                        user.getProfilePictureUrl()
        );
    }
}
