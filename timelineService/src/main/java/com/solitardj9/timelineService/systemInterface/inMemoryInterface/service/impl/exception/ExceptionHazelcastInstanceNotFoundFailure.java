package com.solitardj9.timelineService.systemInterface.inMemoryInterface.service.impl.exception;

public class ExceptionHazelcastInstanceNotFoundFailure extends Exception{
    //
	private static final long serialVersionUID = 7594371506466712673L;
	
	private final int ERR_CODE;
	
	public ExceptionHazelcastInstanceNotFoundFailure() {
		//
    	super(ExceptionHazelcastStatusCode.Resource_Not_Found.getMessage());
    	ERR_CODE = ExceptionHazelcastStatusCode.Resource_Not_Found.getCode();
    }
    
	public ExceptionHazelcastInstanceNotFoundFailure(Throwable cause) {
		//
		super(ExceptionHazelcastStatusCode.Resource_Not_Found.getMessage(), cause);
		ERR_CODE = ExceptionHazelcastStatusCode.Resource_Not_Found.getCode();
	}
	
	public int getErrCode() {
		//
		return ERR_CODE;
    }
}