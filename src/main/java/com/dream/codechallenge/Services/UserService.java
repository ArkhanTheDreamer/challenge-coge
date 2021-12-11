package com.dream.codechallenge.Services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dream.codechallenge.Repository.UserRepository;
import com.dream.codechallenge.Services.exception.ObjectNotFoundException;
import com.dream.codechallenge.domain.User;
import com.dream.codechallenge.dto.UserDTO;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;

	public List<User> findAll() {

		return repo.findAll();

	}

	public User findById(String id) {

		User user = repo.findById(id).orElse(null);

		if (user == null) {

			throw new ObjectNotFoundException("Objeto não encontrado");
		}

		return user;

	}

	public User insert(User obj) {
		return repo.insert(obj);

	}

	public void delete(String id) {
		findById(id);

		repo.deleteById(id);

	}

	public User update(User obj) {

		User newObj = repo.findById(obj.getId()).orElse(null);
		updateData(newObj, obj);
		return repo.save(newObj);
	}

	private void updateData(User newObj, User obj) {

		newObj.setName(obj.getName());
		newObj.setCpf(obj.getCpf());

	}

	public User deposito(User obj) {

		User newObj = repo.findById(obj.getId()).orElse(null);
		updateReais(newObj, obj);
		return repo.save(newObj);
	}

	private void updateReais(User newObj, User obj) {

		newObj.setReais(obj.getReais());

	}

	public User fromDTO(UserDTO objDto) {
		return new User(objDto.getId(), objDto.getName(), objDto.getCpf(), objDto.getReais());
	}

}
