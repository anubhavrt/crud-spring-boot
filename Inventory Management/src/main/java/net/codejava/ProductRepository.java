package net.codejava;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
//jpql query
	//, ' ', p.quan, ' ', p.company
	@Query("SELECT p FROM Product p WHERE CONCAT(p.name) LIKE %?1%")
	public List<Product> search(String keyword);
}
