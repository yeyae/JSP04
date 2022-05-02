package model;

import java.util.Date;

// �츮�� ����� �Խñۿ� �ʿ��� ����
public class Board {
	
	private String title; // �Խñ��� ����
	private String content; // �Խñ��� ����
	private String name; // �Խñ� �ۼ��� �̸�
	private String email; // �Խñ� �ۼ����� �̸���
	private String pass; // �Խñ� �ۼ��� ��й�ȣ
	private Date createdTime; // �Խñ� ���� �ð�
	
	
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
