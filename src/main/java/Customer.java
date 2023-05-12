import java.time.LocalDate;

public class Customer<date> {
    private String name;
    private LocalDate birthday;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(String name, LocalDate birthday, String address, String image) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
