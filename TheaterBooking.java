//Class Seat: field seatNumber, method bookSeat()
//Subclasses:
//RegularSeat: booking is allowed anytime
//PremiumSeat: booking includes snack and luxury tax
//Use method overriding and encapsulation
//File: TheaterBooking.java.

class Seat {
    private String seatNumber;  

    public Seat(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public String bookSeat() {
        return "Seat " + seatNumber + " booked.";
    }
}

class RegularSeat extends Seat {
    public RegularSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public String bookSeat() {
        return "Regular Seat " + getSeatNumber() + " booked anytime.";
    }
}

class PremiumSeat extends Seat {
    public PremiumSeat(String seatNumber) {
        super(seatNumber);
    }

    @Override
    public String bookSeat() {
        return "Premium Seat " + getSeatNumber() + " booked with snack and luxury tax.";
    }
}

public class TheaterBooking {
    public static void main(String[] args) {
       
        Seat s1 = new RegularSeat("A1");
        Seat s2 = new PremiumSeat("B1");

        
        System.out.println(s1.bookSeat());
        System.out.println(s2.bookSeat());
    }
}