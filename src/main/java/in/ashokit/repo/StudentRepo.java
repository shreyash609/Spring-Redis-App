package in.ashokit.repo;

import org.springframework.data.repository.CrudRepository;
import org.yaml.snakeyaml.events.Event.ID;

import in.ashokit.entity.Student;

public interface StudentRepo extends CrudRepository<Student,Integer>{

}
