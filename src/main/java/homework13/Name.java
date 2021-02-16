package homework13;

public class Name {
    private String FirstName;

    public Name(String firstName) {
        FirstName = firstName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "FirstName='" + FirstName + '\'' +
                '}';
    }
}
