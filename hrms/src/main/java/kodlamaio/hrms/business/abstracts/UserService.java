package kodlamaio.hrms.business.abstracts;

import java.util.List;

import kodlamaio.hrms.entities.concretes.User;

public interface UserService {
	
	void add(User user);
	void delete(User user);
	List<User>getAll();
	
	

}
