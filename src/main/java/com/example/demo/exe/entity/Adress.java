package com.example.demo.exe.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="add_id")
public class Adress {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String city;
	private String type;
	
	public Adress() {
		super();
	}
	public Adress(Long id, String city, String type) {
		super();
		this.id = id;
		this.city = city;
		this.type = type;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	                                   

}
