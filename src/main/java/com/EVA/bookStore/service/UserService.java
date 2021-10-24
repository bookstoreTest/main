package com.EVA.bookStore.service;

import com.EVA.bookStore.pojo.User;

public interface UserService {
    /**
     * 注册用户
     * @param user
     */
    public void registerUser(User user);

    /**
     * 用户登录
     * @param user
     * @return 如为null，表示失败
     */
    public User login(User user);

    /**
     * 检查用户名是否存在
     * @param username
     * @return true表示存在，false表示用户名可用
     */
    public boolean existsUsername(String username);
}
