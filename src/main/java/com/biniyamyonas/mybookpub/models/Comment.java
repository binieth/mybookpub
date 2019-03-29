package com.biniyamyonas.mybookpub.models;

import javax.persistence.Embeddable;

@Embeddable
public class Comment {
	
	private String content;
	
	public Comment() {}
	
	public Comment(String content) {
		this.content = content;
	}

	public String getContent() {
		return content;
	}

	@Override
	public String toString() {
		return "Comment [content=" + content + "]";
	}

}
