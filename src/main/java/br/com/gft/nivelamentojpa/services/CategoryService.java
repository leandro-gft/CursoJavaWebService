package br.com.gft.nivelamentojpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gft.nivelamentojpa.entities.Category;
import br.com.gft.nivelamentojpa.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository cr;
	
	public List<Category> findAll(){
		return cr.findAll();
	}
	
	public Category findById(Integer id) {
		return cr.findById(id).get();
	}
}
