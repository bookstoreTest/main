package com.EVA.bookStore.utils;

import java.net.ConnectException;
import java.sql.Connection;

/**
 * 创建和关闭数据库
 */
public class JdbcUtils {
    /**
     * 获取数据库中的连接
     * @return
     */
    public static Connection getConnection(){
        return null;
    }

    /**
     * 释放数据库连接
     * @param connection
     */
    public static void close(Connection connection){

    }

}
