package com.biniyamyonas.mybookpub.models;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String description;

	@ManyToOne
	@JsonIgnore
	private Author author;

	@ElementCollection
	@CollectionTable
	private Collection<Comment> comments;

	public Book() {
	}

	public Book(String title, String description, Author author) {
		super();
		this.title = title;
		this.description = description;
		this.author = author;
		this.comments = new ArrayList<Comment>();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public Author getAuthor() {
		return author;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + "]";
	}

}
