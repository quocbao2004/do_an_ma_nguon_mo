package com.javaweb.service.impl;

import com.javaweb.constant.SystemConstant;
import com.javaweb.converter.UserConverter;
import com.javaweb.entity.RoleEntity;
import com.javaweb.entity.UserEntity;
import com.javaweb.model.dto.UserDTO;
import com.javaweb.repository.RoleRepository;
import com.javaweb.repository.UserRepository;
import com.javaweb.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class UserService implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private UserConverter userConverter;


    @Override
    @Transactional
    public UserDTO insert(UserDTO newUser) {
        newUser.setRoleCode("MANAGER");
        RoleEntity role = roleRepository.findOneByCode(newUser.getRoleCode());
        UserEntity userEntity = userConverter.convertToEntity(newUser);
        userEntity.setRoles(Stream.of(role).collect(Collectors.toList()));
        userEntity.setStatus(1);
        userEntity.setPassword(passwordEncoder.encode(SystemConstant.PASSWORD_DEFAULT));
        return userConverter.convertToDto(userRepository.save(userEntity));
    }

    @Override
    public UserDTO findOneByUserNameAndStatus(String name, int status) {
        return userConverter.convertToDto(userRepository.findOneByUserNameAndStatus(name, status));
    }

}
