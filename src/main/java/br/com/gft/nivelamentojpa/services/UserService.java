package br.com.gft.nivelamentojpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gft.nivelamentojpa.entities.User;
import br.com.gft.nivelamentojpa.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	public List<User> findAll(){
		return ur.findAll();
	}
	
	public User findById(Integer id) {
		return ur.findById(id).get();
	}
	
	public User insert(User obj) {
		return ur.save(obj);
	}
	
	public void delete(Integer id) {
		ur.deleteById(id);
	}
	
}
