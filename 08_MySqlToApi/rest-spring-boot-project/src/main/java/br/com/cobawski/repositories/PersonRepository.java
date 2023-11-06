package br.com.cobawski.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cobawski.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{}
