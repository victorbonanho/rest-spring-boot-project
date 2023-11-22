package br.com.cobawski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cobawski.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}
