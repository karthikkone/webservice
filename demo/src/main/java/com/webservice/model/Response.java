package com.webservice.model;

public class Response {
	private int code;
	private String status;
	private String body;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Response [code=" + code + ", status=" + status + ", body=" + body + "]";
	}	
}
