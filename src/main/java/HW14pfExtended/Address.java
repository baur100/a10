package HW14pfExtended;

public class Address {
     private String streetAddress;
	 private String town;
	 private String state;
	 private ZipCode zipCode;

	public Address(String streetAddress, String town, String state, ZipCode zipCode) {
		this.streetAddress = streetAddress;
		this.town = town;
		this.state = state;
		this.zipCode = zipCode;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public ZipCode getZipCode() {
		return zipCode;
	}

	public void setZipCode(ZipCode zipCode) {
		this.zipCode = zipCode;
	}
	public void printInfo() {
		System.out.println("streetAddress = "+this.streetAddress+"town = "+ this.town+"state ="
				+this.state+"zipCode ="+ this.zipCode);
	}

	@Override
	public String toString() {
		return "Address{" +
				"streetAddress='" + streetAddress + '\'' +
				", town='" + town + '\'' +
				", state='" + state + '\'' +
				", zipCode=" + zipCode +
				'}';
	}
}

