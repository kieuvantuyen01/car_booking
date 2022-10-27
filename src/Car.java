import java.lang.reflect.Array;
import java.util.ArrayList;

public class Car {
    private static int id = 0;
    private String Type;
    private String LicenseNo;
    private int NoOfSeats;
    private String Description;
    private String Status;
    ArrayList<Car> LstCar;

    public Car(String type, String licenseNo, int noOfSeats, String description, String status) {
        id++;
        Type = type;
        LicenseNo = licenseNo;
        NoOfSeats = noOfSeats;
        Description = description;
        Status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getLicenseNo() {
        return LicenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        LicenseNo = licenseNo;
    }

    public int getNoOfSeats() {
        return NoOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        NoOfSeats = noOfSeats;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public ArrayList getLstCar() {
        return LstCar;
    }

    public void setLstCar(ArrayList listCar) {
        LstCar = listCar;
    }

    public void addCar(String type, String licenseNo, int noOfSeats, String description, String status) {
        Car newCar = new Car(type, licenseNo, noOfSeats, description, status);
        LstCar.add(newCar);
    }

    public void editCar() {

    }

    public void removeCar(int id) {
        LstCar.remove(id);
    }

    public Car searchCar(int id) {
        return LstCar.get(id);
    }
}
