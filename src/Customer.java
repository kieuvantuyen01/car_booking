import java.util.ArrayList;

public class Customer {
    private static int id = 0;
    private String name;
    private String PhoneNo;
    private String Email;
    private String Address;
    private ArrayList<Customer> LstCustomer;

    final int ID = 0;
    final int NAME = 1;
    final int PHONE_NO = 2;
    final int EMAIL = 3;
    final int ADDRESS = 4;


    public Customer(int id, String name, String phoneNo, String email, String address, ArrayList<Customer> lstCustomer) {
        this.id = id;
        this.name = name;
        PhoneNo = phoneNo;
        Email = email;
        Address = address;
        this.LstCustomer = lstCustomer;
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

    public ArrayList<Customer> getLstCustomer() {
        return LstCustomer;
    }

    public void setLstCustomer(ArrayList<Customer> lstCustomer) {
        LstCustomer = lstCustomer;
    }

    public Customer searchCustomer(int type, String key) {
        switch (type) {
            case ID:
                int id = Integer.valueOf(key);
                return LstCustomer.get(id);
            case NAME:
                for (Customer customer : LstCustomer) {
                    if (customer.getName().equals(key)) {
                        return customer;
                    }
                }
                break;
            case PHONE_NO:
                for (Customer customer : LstCustomer) {
                    if (customer.getPhoneNo().equals(key)) {
                        return customer;
                    }
                }
                break;
            case EMAIL:
                for (Customer customer : LstCustomer) {
                    if (customer.getEmail().equals(key)) {
                        return customer;
                    }
                }
                break;
            case ADDRESS:
                for (Customer customer : LstCustomer) {
                    if (customer.getAddress().equals(key)) {
                        return customer;
                    }
                }
                break;
            default:
                break;
        }
        return null;
    }
}
