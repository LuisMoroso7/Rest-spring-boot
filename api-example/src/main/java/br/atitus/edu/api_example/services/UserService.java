package br.atitus.edu.api_example.services;

import br.edu.atitus.api_examples.entities.UserEntity;

public class UserService {
	
	public UserEntity save(UserEntity user) throws Exception {
		if (user == null)
			throw new Exception("Objeto Nulo");
		if (user.getName() == null  || user.getName().isEmpty())
				throw new Exception("Nome Inválido");
		user.setName(user.getName().trim());
		if (user.getName() == null  || user.getEmail().isEmpty())
				throw new Exception("E-mail Inválido");
		user.setEmail(user.getName().trim());
		if (user.getName() == null  || user.getPassword().isEmpty())
				throw new Exception("Password Inválido");
		if (user.getPassword() == null
				|| user.getPassword().isEmpty()
				|| user.getPassword().length() < 8 )
				throw new Exception("Password inválido");
		//TODO criar hash da senha
		
		//TODO validar permissão cadastro Admins
	
		
		//TODO enviar para a camada repository
		return user;
		
	}

}
