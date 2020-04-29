package br.com.gft.nivelamentojpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gft.nivelamentojpa.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
		
}