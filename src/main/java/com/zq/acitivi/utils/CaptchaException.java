package com.zq.acitivi.utils;

import org.springframework.security.core.AuthenticationException;

/**
 * @BelongsProject: Acitivi
 * @BelongsPackage: com.zq.acitivi.utils
 * @Author: zhangqian
 * @CreateTime: 2023-03-01  15:41
 * @Description:
 * @Version: 1.0
 */
public class CaptchaException extends AuthenticationException {

    public CaptchaException(String msg) {
        super(msg);
    }
}

