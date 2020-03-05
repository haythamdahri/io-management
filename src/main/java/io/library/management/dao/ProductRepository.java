package io.library.management.dao;

import io.library.management.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product, Long> {

    Collection<Product> findByNameContainingIgnoreCase(@Param(value = "name") String name);

}
