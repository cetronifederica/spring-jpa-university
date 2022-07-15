package jana60.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.Model.Departments;

@Repository
public interface DepartmentsRepository extends CrudRepository<Departments, Integer> {

	// order by name
	List<Departments> findAllByOrderByName();

	// order by discendente
	// List<Departments> findAllByOrderByDesc();

}
