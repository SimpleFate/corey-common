package org.hust.corey.utils;

import org.springframework.stereotype.Component;

import java.util.Optional;

/**
 * Created by HUST Corey on 2019-03-15.
 */
@Component
public class StringUtil {
    /**
     *  convert null to ""
     * @param str a nullable string
     * @return a not null string
     */
    public String getNullableString(String str){
        return Optional.ofNullable(str).orElse("");
    }
}
