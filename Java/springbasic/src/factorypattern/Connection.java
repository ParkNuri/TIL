package factorypattern;
public abstract class Connection {
	 String url;
	 public Connection(String url){
		 this.url=url;
	 }
	 public abstract void connect();
}
