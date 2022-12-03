package com.meensat.repo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.meensat.models.User;

@Repository
public interface UserRepository  extends CrudRepository<User, Integer> {

	@Query(nativeQuery = true, value = "SELECT website_review, first_name, last_name FROM users where website_review is not null limit 3")
	List<String[]> findWebsiteReviews();

	User findByUsernameAndPassword(String username, String password);
		

}
