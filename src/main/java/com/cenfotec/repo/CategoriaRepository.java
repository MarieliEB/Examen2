package com.cenfotec.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
