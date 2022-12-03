package com.meensat.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.meensat.models.Category;

@Repository
public interface CategoriesRepository extends CrudRepository<Category, Integer> {
	

}
