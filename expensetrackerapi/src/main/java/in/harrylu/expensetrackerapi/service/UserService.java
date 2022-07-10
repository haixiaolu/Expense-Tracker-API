package in.harrylu.expensetrackerapi.service;

import in.harrylu.expensetrackerapi.entity.User;
import in.harrylu.expensetrackerapi.entity.UserModel;

public interface UserService {
	
	User createUser(UserModel user);
	
	User readUser();
	
	User updateUser(UserModel user);
	
	void deleteUser();
	
	User getLoggedInUser();
}