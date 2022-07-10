package in.harrylu.expensetrackerapi.service;

import in.harrylu.expensetrackerapi.entity.User;
import in.harrylu.expensetrackerapi.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);
	
	User readUser(Long id);
	
	User updateUser(UserModel user, Long id);
	
	void deleteUser(Long id);
}