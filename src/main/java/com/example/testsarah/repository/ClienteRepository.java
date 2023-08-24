package com.example.testsarah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.testsarah.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}