package telran.java41.students.dao;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import telran.java41.students.model.Student;

public interface StudentRepository extends MongoRepository<Student, Integer> {
	Stream<Student> findByNameIgnoreCase(String name);
	
	long countByNameIn(List<String> names);
	
	@Query("{'scores.?0: {'$gte': ?1}}")
	Stream<Student> findByExamAndScoreGreateEqualsThan(String exam, int score);
}
