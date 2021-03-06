package com.dream.codechallenge.resources;

import java.net.URI;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.dream.codechallenge.Services.UserService;
import com.dream.codechallenge.domain.User;
import com.dream.codechallenge.dto.UserDTO;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	Scanner in = new Scanner(System.in);

	@Autowired
	private UserService service;

	@GetMapping
	public ResponseEntity<List<UserDTO>> findAll() {

		List<User> list = service.findAll();

		List<UserDTO> listDto = list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());

		return ResponseEntity.ok().body(listDto);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<UserDTO> findById(@PathVariable String id) {

		User obj = service.findById(id);

		return ResponseEntity.ok().body(new UserDTO(obj));
	}

	@PostMapping
	public ResponseEntity<Void> insert(@RequestBody UserDTO objDto) {

		User obj = service.fromDTO(objDto);
		obj = service.insert(obj);

		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();

		return ResponseEntity.created(uri).build();
	}

	@DeleteMapping(value = "{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {

		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "{id}")
	public ResponseEntity<Void> update(@RequestBody UserDTO objDto, @PathVariable String id) {

		User obj = service.fromDTO(objDto);
		obj.setId(id);
		obj = service.update(obj);

		return ResponseEntity.noContent().build();
	}

	@PutMapping(value = "{id}/deposito")
	public ResponseEntity<Void> deposito(@RequestBody UserDTO objDTO, @PathVariable String id) {

		User obj = service.fromDTO(objDTO);
		obj.setCpf(id);
		obj = service.deposito(obj);
		double depo = 0;
		System.out.println("Insira o valor do dep??sito");
		depo = in.nextDouble();

		if (depo > 2000) {
			System.out.println("O valor excede o m??ximo permitido, por favor, deposite um valor inferior a R$2000,00");

			return ResponseEntity.noContent().build();
		}

		return ResponseEntity.noContent().build();
	}

}
