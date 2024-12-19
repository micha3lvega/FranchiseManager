package co.com.accenture.nequi.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import co.com.accenture.nequi.entity.Branch;

public interface IBranchRepository extends MongoRepository<Branch, String> {

}
