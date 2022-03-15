package telran.java41.students.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.NoArgsConstructor;

//@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "student not found")
@ResponseStatus(HttpStatus.NOT_FOUND)
@NoArgsConstructor
public class StudentNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1499261429538202762L;
	
	public StudentNotFoundException(int id) {
		super("student with id = " + id + ", not found");
	}

}
