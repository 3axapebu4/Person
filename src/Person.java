public class Person {
    public Integer user;
    public String name;
    public String surname;
    public Integer serial;
    public Integer number;

    public Person(Integer user, String name, String surname, int serial, int number) {
        this.user = user;
        this.name = name;
        this.surname = surname;
        this.serial = serial;
        this.number = number;
    }

    public Integer getUser() {
        return this.user;
    }

    public void setUser(int user) {
        this.user = user;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSerial() {
        return this.serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String toString() {
        return "\nPerson №: " + this.user + "\nName: " + this.name + "\nSurname: " + this.surname + "\nSerial: " + this.serial + "\nNumber: " + this.number + "\n";
    }
}
