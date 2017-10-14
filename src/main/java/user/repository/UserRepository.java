package user.repository;

import org.springframework.data.repository.CrudRepository;
import user.domain.User;

public interface UserRepository extends CrudRepository<User, Long>  {

}
