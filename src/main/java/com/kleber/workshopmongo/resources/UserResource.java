package com.kleber.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kleber.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {

	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity <List<User>> findAll(){
		User maria = new User ("1", "maria Brown","maria@gmail.com");
		User joao = new User ("2", "Kleber Campeão","joao@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,joao));
		 return ResponseEntity.ok().body(list);
	}
}
