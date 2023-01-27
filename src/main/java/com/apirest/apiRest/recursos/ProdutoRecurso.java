package com.apirest.apiRest.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.apiRest.model.Produto;
import com.apirest.apiRest.repository.ProdutoRepository;

@RestController
@RequestMapping("/api")
public class ProdutoRecurso {

	@Autowired
	ProdutoRepository repository;

	@GetMapping("/hello")
	public String hello() {
		return "Hello World Manaus";
	}

	@GetMapping("/lista")
	public List<Produto> ListaProdutos() {
		return repository.findAll();
	}

	@GetMapping("/produto/{id}")
	public Produto listaProdutoUnico(@PathVariable(value = "id") long id) {
		return repository.findById(id);
	}

	@PostMapping("/produto")
	public Produto saveProduto(@RequestBody Produto produto) {
		return repository.save(produto);

	}

	@DeleteMapping("/produto")
	public void deletaProduto(@RequestBody Produto produto) {
		repository.delete(produto);
	}

	@PutMapping("/produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return repository.save(produto);
	}

}
