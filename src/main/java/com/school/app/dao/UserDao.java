package com.school.app.dao;

import com.school.app.model.User;

public interface UserDao {

	User findByUserName(String username);

}
