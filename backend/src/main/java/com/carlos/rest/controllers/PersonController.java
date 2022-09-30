package com.carlos.rest.controllers;

import java.util.List;

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

import com.carlos.rest.data.vo.v1.PersonVO;
import com.carlos.rest.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService service;

	@GetMapping
	public List<PersonVO> findAll() {
		return service.findAll();
	}

	@GetMapping(value = "/{id}")
	public PersonVO findById(@PathVariable(value = "id") Long id) {
		return service.findById(id);
	}

	@PostMapping
	public PersonVO create(@RequestBody PersonVO person) {
		return service.create(person);
	}

	@PutMapping
	public PersonVO update(@RequestBody PersonVO person) {
		return service.update(person);
	}

	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> delete(@PathVariable(value = "id") Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
}