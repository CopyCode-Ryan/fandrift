package com.van.android.fandrift.exception;

/**
 * 
 *
 * description: Super class of all exception in Fandrift.
 * 
 * author: fanruifa
 *
 * date: 2013-3-20
 *
 */
public class BaseException extends Exception {

	private static final long serialVersionUID = 5220085478729057832L;

	public BaseException(String detailMessage){
		super(detailMessage);
	}
	
	public BaseException(String detailMessage,Throwable throwable){
		super(detailMessage, throwable);
	}
	
	public BaseException(Throwable throwable){
		super(throwable);
	}
}
