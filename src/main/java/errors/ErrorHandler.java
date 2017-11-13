package errors;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
	
	Logger logger = Logger.getLogger(ErrorHandler.class.getName());

	@ExceptionHandler(RuntimeException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	public ErrorResponse handleRuntimeException(Exception e) {
		logger.log(Level.SEVERE, e.getMessage(), e);
		return new ErrorResponse(e);
	}
	
}
