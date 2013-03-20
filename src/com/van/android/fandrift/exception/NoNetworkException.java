package com.van.android.fandrift.exception;

/**
 * 
 *
 * description: Exception throw when there is no available data connection.
 * 
 * author: fanruifa
 *
 * date: 2013-3-20
 *
 */
public class NoNetworkException extends BaseException {

	private static final long serialVersionUID = -2944520483688291840L;

	public NoNetworkException(){
		super("Network is no available");
	}
}
