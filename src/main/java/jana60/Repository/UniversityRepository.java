package jana60.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import jana60.Model.Departments;

@Repository
public interface UniversityRepository extends CrudRepository<Departments, Integer> {

}
