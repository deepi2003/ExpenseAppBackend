package org.deepti.app.expensetracker.model;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ExpenseRepository extends MongoRepository<Expense, String> {

}
