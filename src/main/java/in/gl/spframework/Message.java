package in.gl.spframework;

import org.springframework.stereotype.Service;

public class Message 
{
	private int id;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Message(int id, String content) {
		super();
		this.id = id;
		this.content = content;
	}
	@Override
	public String toString() {
		return "Message [id=" + id + ", content=" + content + "]";
	}
	
	public Message() {
		
	}
}
