package com.kietutorials.unit12_swagger_web_interface;

public class Student implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "name")
	private java.lang.String name;
	@org.kie.api.definition.type.Label(value = "result")
	private boolean result;

	public Student() {
	}

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String name) {
		this.name = name;
	}

	public boolean isResult() {
		return this.result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

	public Student(java.lang.String name, boolean result) {
		this.name = name;
		this.result = result;
	}

}
