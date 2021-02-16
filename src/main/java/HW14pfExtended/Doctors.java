package HW14pfExtended;

public class Doctors {
    private String name;
	private String lastName;
	private Position position;

	public Doctors(String name, String lastName, Position position) {
		this.name = name;
		this.lastName = lastName;
		this.position = position;

	}

	public static void printInfo() {
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}
	public void printDoctors(){
		System.out.println("name ="+this.name+"lastName ="+this.lastName+"position ="+this.position);
	}

	@Override
	public String toString() {
		return "Doctors{" +
				"name='" + name + '\'' +
				", lastName='" + lastName + '\'' +
				", position=" + position +
				'}';
	}
}
