package vo;

public class personVO {
	private String nick;
	private String name;
	private String address;
	
	
	
	public personVO() {
		
	}
	public personVO(String nick, String name, String address) {
		this.nick = nick;
		this.name = name;
		this.address = address;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
