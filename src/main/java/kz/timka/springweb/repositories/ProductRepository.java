package kz.timka.springweb.repositories;

import kz.timka.springweb.model.Product;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByPriceBetween(Double minPrice, Double maxPrice, Pageable pageable);
}
