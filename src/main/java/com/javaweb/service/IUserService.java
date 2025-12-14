package com.javaweb.service;

import com.javaweb.model.dto.UserDTO;

public interface IUserService {
    UserDTO insert(UserDTO userDTO);
    UserDTO findOneByUserNameAndStatus(String name, int status);
}
