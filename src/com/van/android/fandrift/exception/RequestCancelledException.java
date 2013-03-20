package com.van.android.fandrift.exception;

/**
 * 
 *
 * description: Exception throw when a problem occurs while retrieving data from network.
 * 
 * author: fanruifa
 *
 * date: 2013-3-20
 *
 */
public class RequestCancelledException extends BaseException {

	private static final long serialVersionUID = 5611823829959783897L;

	public RequestCancelledException(String detailMessage) {
		super(detailMessage);
		// TODO Auto-generated constructor stub
	}
	
	public RequestCancelledException(String detailMessage,Throwable throwable){
		super(detailMessage, throwable);
	}
	
	public RequestCancelledException(Throwable throwable){
		super(throwable);
	}

}
