package com.carlos.rest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.carlos.rest.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
