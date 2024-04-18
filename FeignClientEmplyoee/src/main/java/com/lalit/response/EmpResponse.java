package com.lalit.response;

public class EmpResponse {
	private Integer empId;
	private String name;
	private String email;
	private Integer age;
	private AddressResponse addResponse;
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public AddressResponse getAddResponse() {
		return addResponse;
	}
	public void setAddResponse(AddressResponse addResponse) {
		this.addResponse = addResponse;
	}

}
