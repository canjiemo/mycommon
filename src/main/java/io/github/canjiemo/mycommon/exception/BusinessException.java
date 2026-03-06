package io.github.canjiemo.mycommon.exception;

public class BusinessException extends BaseException {

	private static final long serialVersionUID = 1L;
	
	protected static int code = 400;
	
	public BusinessException(String message) {
		super(code, message);
	}
	
}
