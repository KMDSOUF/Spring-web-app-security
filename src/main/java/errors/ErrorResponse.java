package errors;

public class ErrorResponse {
	
	String message;
	String cause;

	public ErrorResponse(Exception e) {
		super();
		this.message = e.getMessage();
		this.cause = (e.getCause() == null) ? "" : e.getCause().getMessage();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getCause() {
		return cause;
	}

	public void setCause(String cause) {
		this.cause = cause;
	}
	
	
}
