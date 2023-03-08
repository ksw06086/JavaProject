package daily.vo;

import java.sql.Date;

public class DailyEmotionVO {
	private int isbn;
	private Date date;
	private String emotion;
	private String content;
	
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public String getEmotion() {
		return emotion;
	}
	public void setEmotion(String emotion) {
		this.emotion = emotion;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "DailyEmotionVO [isbn=" + isbn + ", date=" + date + ", emotion=" + emotion + "\n content=" + content + "]";
	}
}
