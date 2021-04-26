package com.xw.test.testmybatisplus.utils;

import org.apache.commons.lang.StringUtils;

import java.io.File;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author ns
 * @date 2020/1/14
 */
public class CommonUtil {

    public static String trimSeparator(String source, String separator) {

        if (StringUtils.isNotEmpty(separator) && source.endsWith(separator)) {
            return source.substring(0, source.length() - 1);
        }
        return source;
    }
}