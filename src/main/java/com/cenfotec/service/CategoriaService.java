package com.cenfotec.service;

import java.util.List;
import java.util.Optional;

import com.cenfotec.domain.Categoria;

public interface CategoriaService {

	public void save(Categoria categoria);
	public Optional<Categoria> get(Long id);
	public List<Categoria> getAll();
	public List<Categoria> find(String nombre);
}
