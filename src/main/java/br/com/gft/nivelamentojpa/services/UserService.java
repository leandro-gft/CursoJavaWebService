package br.com.gft.nivelamentojpa.services;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import br.com.gft.nivelamentojpa.entities.User;
import br.com.gft.nivelamentojpa.repositories.UserRepository;
import br.com.gft.nivelamentojpa.services.exceptions.DatabaseException;
import br.com.gft.nivelamentojpa.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	public List<User> findAll(){
		return ur.findAll();
	}
	
	public User findById(Integer id) {
		return ur.findById(id).orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return ur.save(obj);
	}
	
	public void delete(Integer id) {
		try{
			ur.deleteById(id);
		}
		catch(EmptyResultDataAccessException e) {
			throw new ResourceNotFoundException(id);
		}
		catch(DataIntegrityViolationException e) {
			throw new DatabaseException(e.getMessage());
		}
	}
	
	public User update(Integer id, User obj) {
		try {
		User entity = ur.getOne(id);
		updateData(entity, obj);
		return ur.save(entity);
		} 
		catch (EntityNotFoundException e) {
			throw new ResourceNotFoundException(id);
		}
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
	
}
