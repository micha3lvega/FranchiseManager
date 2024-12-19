package co.com.accenture.nequi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.com.accenture.nequi.entity.Product;

public interface IProductRepository extends MongoRepository<Product, String> {

}
