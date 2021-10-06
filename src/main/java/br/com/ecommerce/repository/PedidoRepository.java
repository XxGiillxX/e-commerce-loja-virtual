package br.com.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.ecommerce.model.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long>{

}
