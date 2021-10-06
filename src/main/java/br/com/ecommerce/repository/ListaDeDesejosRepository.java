package br.com.ecommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.model.ListaDeDesejos;
import br.com.ecommerce.model.Produto;

@Repository
public interface ListaDeDesejosRepository extends JpaRepository<ListaDeDesejos, Long> {
	
	//public List<ListaDeDesejos> findAllByProdutosContainingIgnoreCase(long id);

}
