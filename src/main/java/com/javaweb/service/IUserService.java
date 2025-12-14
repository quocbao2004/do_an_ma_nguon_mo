package com.javaweb.service;

import com.javaweb.model.dto.UserDTO;
import org.springframework.data.domain.Pageable;
import java.util.List;

public interface IUserService {
    UserDTO insert(UserDTO userDTO);
    UserDTO findOneByUserNameAndStatus(String name, int status);
    List<UserDTO> getUsers(String searchValue, Pageable pageable);
    int countTotalItems();
    UserDTO findOneByUserName(String userName);
    UserDTO findUserById(long id);
    UserDTO update(Long id, UserDTO userDTO);
    void UpdateInfo(UserDTO userDTO);

    void delete(long[] idList);
}
