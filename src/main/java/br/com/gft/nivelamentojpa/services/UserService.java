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
	
	public User update(Integer id, User obj) {
		User entity = ur.getOne(id);
		updateData(entity, obj);
		return ur.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
}
