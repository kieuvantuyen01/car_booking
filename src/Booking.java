import java.util.ArrayList;

public class Booking {
    private static int id = 0;
    private String description;
    private String BookingDate;
    private ArrayList<Booking> LstBooking;

    public Booking(String description, String bookingDate) {
        this.id++;
        this.description = description;
        BookingDate = bookingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBookingDate() {
        return BookingDate;
    }

    public void setBookingDate(String bookingDate) {
        BookingDate = bookingDate;
    }

    public ArrayList<Booking> getLstBooking() {
        return LstBooking;
    }

    public void setLstBooking(ArrayList<Booking> lstBooking) {
        LstBooking = lstBooking;
    }

    public void addBooking(String description, String bookingDate) {
        Booking booking = new Booking(description, bookingDate);
        LstBooking.add(booking);
    }

    public void showBooking() {
        toString();
    }
}
