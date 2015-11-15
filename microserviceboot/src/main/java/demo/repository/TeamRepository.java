package demo.repository;

import org.springframework.data.repository.CrudRepository;

import demo.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>{

}
