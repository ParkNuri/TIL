package di.constructor03;

public class ArticleDTO {
	String name;
	String title;
	String content;
	String date;
	
	
	public ArticleDTO() {
		
	}
	
	public ArticleDTO(String name, String title, String content, String date) {
		super();
		this.name = name;
		this.title = title;
		this.content = content;
		this.date = date;
	}
	
	
	//getter-setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	
	
}
