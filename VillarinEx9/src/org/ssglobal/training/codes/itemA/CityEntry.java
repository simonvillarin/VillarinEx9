package org.ssglobal.training.codes.itemA;

abstract class CityEntry {
	private String name;
	private String address;
	private String phone;
	private String city;
	private String state;
	
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String nameStartsWith(String prefix) {
		return name;
	}
}

class BusinessEntry extends CityEntry {
}


class GovernmentEntry extends CityEntry {
	private String government;
	
	public String getGovernment() {
		return government;
	}

	public void setGovernment(String government) {
		this.government = government;
	}
}

class ResidentialEntry extends CityEntry {
	
}
