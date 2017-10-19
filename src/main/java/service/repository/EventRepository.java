package service.repository;

import org.springframework.data.repository.CrudRepository;

import service.domain.Event;

import java.util.List;

public interface EventRepository extends CrudRepository<Event, Long> {
	List<Event> findByTwoFiveK(boolean twoFiveK);
	List<Event> findByMarathon(boolean marathon);
	List<Event> findByFiveZeroK(boolean fiveZeroK);
	List<Event> findByFiveZeroM(boolean fiveZeroM);
	List<Event> findByOneZeroZeroK(boolean oneZeroZeroK);
	List<Event> findByOneZeroZeroM(boolean oneZeroZeroM);
}
