package com.xusheng.utils;

import org.apache.commons.lang.WordUtils;
import org.apache.commons.lang3.StringUtils;

/**
 * @Author xusheng
 * @Date 2021/7/20 7:33 下午
 * @Desc
 */
public class CommonStringUtil {

    public static String convertUnderStream2Camel(String originStr) {
        String str = WordUtils.capitalizeFully(originStr.toLowerCase(), new char[]{'_'}).replace("_", "");
        return StringUtils.uncapitalize(str);
    }
}
