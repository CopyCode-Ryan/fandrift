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

public class NetworkException extends BaseException {

	private static final long serialVersionUID = 6538807013210913953L;

	public NetworkException(String detailMessage) {
		super(detailMessage);
	}

	public NetworkException(Throwable throwable) {
		super(throwable);
	}

	public NetworkException(String detailMessage, Throwable throwable) {
		super(detailMessage, throwable);
	}

}
