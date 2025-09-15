package com.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.dto.UserDto;
import com.jobportal.entity.User;
import com.jobportal.exception.JobPortalException;
import com.jobportal.repository.UserRepository;
import com.jobportal.utility.Utilities;

@Service(value = "userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto registerUser(UserDto userDTO) throws JobPortalException {
        // ✅ set ID on DTO (instance call, not static)
        userDTO.setId(Utilities.getNextSequence("users"));

        // ✅ convert DTO → Entity
        User user = userDTO.toEntity();

        // ✅ save entity in DB
        user = userRepository.save(user);

        // ✅ convert Entity → DTO before returning
        return user.toDTO();
    }
}

