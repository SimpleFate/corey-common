package org.hust.corey.utils;

import java.util.Optional;

/**
 * Created by HUST Corey on 2019-03-15.
 */
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
