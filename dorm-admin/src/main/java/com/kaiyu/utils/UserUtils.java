package com.kaiyu.utils;

import com.kaiyu.entity.User;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author 邵桐杰
 * @date 2022/5/14
 */
public class UserUtils {

    private UserUtils() {
    }

    public static User getCurrentUser() {
        return ((User) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }
}
