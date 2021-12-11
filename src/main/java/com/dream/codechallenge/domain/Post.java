package com.dream.codechallenge.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Post implements Serializable {

	User user;
	
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private Date data;

	private String title;

	private double depo;

	public Post() {

	}

	public Post(String id, Date data, String title, double depo) {
		super();
		this.id = id;
		this.data = data;
		this.title = title;
		this.depo = depo;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getDepo() {
		return depo;
	}

	public void setBody(double depo) {
		this.depo = depo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return Objects.equals(id, other.id);
	}

}
