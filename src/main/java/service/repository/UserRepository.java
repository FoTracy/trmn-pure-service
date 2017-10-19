package service.repository;

import org.springframework.data.repository.CrudRepository;

import service.domain.User;

public interface UserRepository extends CrudRepository<User, Long>  {

}
