package chap07_oop.poly;

public class Video extends Content {

	private String genre;
	
	//Constructor------------------------
	public Video() {
		super();
	}
	
	public Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}




	//Method-----------------------------
	@Override
	public void totalPrice() {
		if(genre.equals("new")) {
			this.price = 2000;
			//setPrice
		}
		else if(genre.equals("comic")) {
			this.price = 1500;
		}
		else if(genre.equals("child")) {
			this.price = 1000;
		}
		else {
			this.price = 500;
		}
	}

	//Getter & Setter===================
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
	
}
