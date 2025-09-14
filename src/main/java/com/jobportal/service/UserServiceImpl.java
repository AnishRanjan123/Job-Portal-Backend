package com.jobportal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobportal.dto.UserDto;
import com.jobportal.entity.User;
import com.jobportal.repository.UserRepository;

@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Autowired
	private UserRepository userRepository;
	@Override
	public UserDto registerUser(UserDto userDTO) {
	   User user = userDTO.toEntity();
	   user = userRepository.save(user);
	   return user.toDTO();
	}

}
