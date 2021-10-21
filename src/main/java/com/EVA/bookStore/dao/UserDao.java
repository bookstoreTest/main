package com.EVA.bookStore.dao;

import com.EVA.bookStore.pojo.User;

public interface UserDao {
    /**
     * 根据用户名查询用户信息,验证用户名是否已被注册，
     * 也即在数据库中查询该用户名是否存在
     * @param username
     * @return 如果返回null说明无此用户
     */
    public User queryUserByUsername(String username);

    /**
     * 根据用户名和密码查询用户信息，用于登陆操作；
     * 即在数据库中查询用户名和密码是否匹配
     * @param username
     * @param password
     * @return
     */
    public User queryUserByUsernameAndPassword(String username,String password);
    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(User user);

}
