package com.jobportal.service;

import com.jobportal.dto.UserDto;
import com.jobportal.exception.JobPortalException;

public interface UserService {
   public UserDto registerUser(UserDto userDTO) throws JobPortalException;
}
