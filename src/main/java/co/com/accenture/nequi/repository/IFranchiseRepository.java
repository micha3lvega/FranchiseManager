package co.com.accenture.nequi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.com.accenture.nequi.entity.Franchise;

public interface IFranchiseRepository extends MongoRepository<Franchise, String> {

}
