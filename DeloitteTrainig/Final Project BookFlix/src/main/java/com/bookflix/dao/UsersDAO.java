package com.bookflix.dao;

/*
 * author: anweshpatel
 * created: 07/08/2019
 * project: BookFlix
 */

import org.springframework.data.repository.CrudRepository;

import com.bookflix.models.Users;

public interface UsersDAO extends CrudRepository<Users, Integer>{

}
