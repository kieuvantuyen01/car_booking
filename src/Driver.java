import java.util.ArrayList;

public class Driver {
    private static int id = 0;
    private String name;
    private String PhoneNo;
    private String Email;
    private String Address;
    private int ratingPoints = 0;
    private ArrayList<Driver> LstDriver;

    public Driver(String name, String phoneNo, String email, String address) {
        this.id++;
        this.name = name;
        PhoneNo = phoneNo;
        Email = email;
        Address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public ArrayList getLstDriver() {
        return LstDriver;
    }

    public void setLstDriver(ArrayList lstDriver) {
        LstDriver = lstDriver;
    }

    private void addDriver(String name, String phoneNo, String email, String address) {
        Driver newDriver = new Driver(name, phoneNo, email, address);
        LstDriver.add(newDriver);
    }

    private void editDriver() {

    }

    public void removeDriver(int id) {
        LstDriver.remove(id);
    }

    public Driver searchDriver(int id) {
        return LstDriver.get(id);
    }

    public int getRatingPoints() {
        return ratingPoints;
    }

    public void setRatingPoints(int ratingPoints) {
        this.ratingPoints = ratingPoints;
    }
}
