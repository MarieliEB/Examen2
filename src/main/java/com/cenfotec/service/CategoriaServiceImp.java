package com.cenfotec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cenfotec.domain.Categoria;
import com.cenfotec.repo.CategoriaRepository;

public class CategoriaServiceImp implements CategoriaService {

	@Autowired
	CategoriaRepository repo;
	
	@Override
	public void save(Categoria categoria) {
		repo.save(categoria);
	}

	@Override
	public Optional<Categoria> get(Long id) {
		return repo.findById(id);
	}

	@Override
	public List<Categoria> getAll() {
		return repo.findAll();
	}

	@Override
	public List<Categoria> find(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}
}
