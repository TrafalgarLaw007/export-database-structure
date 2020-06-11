package com.msw.java;

import static com.msw.java.Constants.MYSQL_CONNECTION_PARAM;
import static com.msw.java.Constants.MYSQL_CONNECTION_URL;

public final class DBUrlUtils {

    /**
     * 拼接MySQL链接
     * @param host Host
     * @param port 端口
     */
    public static String handlerMySQLUrl(String host, String port) {

        return String.format(MYSQL_CONNECTION_URL, host, port) + MYSQL_CONNECTION_PARAM;
    }
}
