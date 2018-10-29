package com.aws.codestar.projecttemplates.controller;

import org.springframework.data.repository.CrudRepository;

/**
 * @author Kevin Lai, 008498282
 *
 */
public interface UserDao extends CrudRepository<User, String>{

}
