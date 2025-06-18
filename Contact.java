package projetos.Agenda;

public class Contact {
	private String name;
	private String number;
	private String address;

	public Contact(String name, String number, String address) {
		this.name = name;
		this.number = number;
		this.address = address;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String  getAddress() {
		return address;
	}
}
