package br.atitus.edu.api_example.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.atitus.edu.api_example.dtos.SignupDTO;
import br.atitus.edu.api_example.services.UserService;
import br.edu.atitus.api_examples.entities.TypeUser;
import br.edu.atitus.api_examples.entities.UserEntity;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	private final UserService service  = new UserService();
	
	@PostMapping("/signup")
	public ResponseEntity<UserEntity> postSingup(@RequestBody SignupDTO dto) throws Exception{
		UserEntity user = new UserEntity();
		BeanUtils.copyProperties(dto, user);
		user.setType(TypeUser.Common);
		
		service.save(user);
		
		return ResponseEntity.status(201).body(user);

	}
}
