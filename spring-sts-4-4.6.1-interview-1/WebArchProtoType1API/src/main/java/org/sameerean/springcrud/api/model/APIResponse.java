package org.sameerean.springcrud.api.model;

import java.io.Serializable;

public final class APIResponse implements Serializable {

	private String status;

	private String description;

	private Object body;

	public APIResponse() {
		super();
	}

	public APIResponse(String status, String description, Object body) {
		super();
		this.status = status;
		this.description = description;
		this.body = body;
	}

	public String getStatus() {
		return status;
	}

	public APIResponse setStatus(String status) {
		this.status = status;
		return this;
	}

	public String getDescription() {
		return description;
	}

	public APIResponse setDescription(String description) {
		this.description = description;
		return this;
	}

	public Object getBody() {
		return body;
	}

	public APIResponse setBody(Object body) {
		this.body = body;
		return this;
	}

}
