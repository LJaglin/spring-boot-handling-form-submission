package pl.ljaglin.springboothandlingformsubmission.models;

public class FamousPerson {

    private String firstName;
    private String lastName;
    private Integer age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String toString() {
        return "Your famous person is: " + this.firstName + " " + this.lastName + " and is " + this.age;
    }
}
