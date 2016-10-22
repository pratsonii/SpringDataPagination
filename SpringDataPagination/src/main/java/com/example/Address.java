package com.example;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "student_info1")
public class Address 
{
	private Long addId;
	private String city;
	private Set<Student> students;
	
	@Id
	@Column(name ="student_address")
	public Long getAddId() {
		return addId;
	}
	public void setAddId(Long addId) {
		this.addId = addId;
	}
	
	@Column(name ="city")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@OneToMany(mappedBy = "address")
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	
}
