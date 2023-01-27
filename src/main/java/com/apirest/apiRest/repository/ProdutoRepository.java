package com.apirest.apiRest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.apiRest.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	
	Produto findById(long id);
	
}
