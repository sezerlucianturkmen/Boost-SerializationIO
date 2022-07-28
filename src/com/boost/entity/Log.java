package com.boost.entity;

import java.util.UUID;

public class Log {

	String id;
	String errorMessage;
	String className;
	String methodName;
	Long timeStamp;
	String detail;

	public Log() {
		super();
	}

	public Log(String errorMessage, String className, String methodName, Long timeStamp, String detail) {
		super();
		id = UUID.randomUUID().toString();
		this.errorMessage = errorMessage;
		this.className = className;
		this.methodName = methodName;
		this.timeStamp = timeStamp;
		this.detail = detail;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public Long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "log [id=" + id + ", errorMessage=" + errorMessage + ", className=" + className + ", methodName="
				+ methodName + ", timeStamp=" + timeStamp + ", detail=" + detail + "]";
	}

}
