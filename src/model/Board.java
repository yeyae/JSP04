package model;

import java.util.Date;

// 우리가 사용할 게시글에 필요한 정보
public class Board {
	
	private String title; // 게시글의 제목
	private String content; // 게시글의 내용
	private String name; // 게시글 작성자 이름
	private String email; // 게시글 작성자의 이메일
	private String pass; // 게시글 작성자 비밀번호
	private Date createdTime; // 게시글 생성 시간
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
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
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	
	@Override
	public String toString() {
		return "Board [title=" + title + ", content=" + content + ", name=" + name + ", email=" + email + ", pass="
				+ pass + ", createdTime=" + createdTime + "]";
	}
	
}
