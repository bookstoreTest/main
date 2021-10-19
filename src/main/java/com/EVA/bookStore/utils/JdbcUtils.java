package com.EVA.bookStore.utils;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 创建和关闭数据库
 */
public class JdbcUtils {
   private static DruidDataSource dataSource;
   static {

       try {
           Properties properties = new Properties();
           //读取jdbc。properties属性配置文件
           InputStream inputStream= JdbcUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");
           //从流中加载数据
           properties.load(inputStream);
           //创建数据库连接池
           dataSource =(DruidDataSource) DruidDataSourceFactory.createDataSource(properties);

       } catch (Exception e) {
           e.printStackTrace();
       }
   }
    /**
     * 获取数据库中的连接
     * @return 如果返回null说明连接失败
     */
    public static Connection getConnection(){
        Connection connection = null;
        try {
            connection = dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     * 释放数据库连接
     * @param connection
     */
    public static void close(Connection connection){
        if(null!=connection){
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

}
