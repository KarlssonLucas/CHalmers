package exercises;

import java.util.ArrayList;

public class flygplats {
}

enum Status {
    FREE, OCCUPIED, RESERVED
}

class Seat {
    Status status;

    public Status getStatus() {
        return status;
    }
}

class Passenger {
    private final String passport;
    private final String name;

    public Passenger(String passport, String name) {
        this.passport = passport;
        this.name = name;
    }
}

class Flight {
    private String flight;
    private String destination;
    private String departure;
    private ArrayList<Seat> seats = new ArrayList<> ();

    Flight(String flight, String destination, String departure) {
        this.flight = flight;
        this.destination = destination;
        this.departure = departure;
    }

    Seat getFree() {
        for (int i = 0; i < seats.size (); i++) {
            if (seats.get (i).status == Status.FREE) {
                return seats.get (i);
            }
        }
        return null;
    }
}

class booking {
    private Flight flight;
    private Seat seat;
    private Passenger passenger;

    booking(Flight flight, Seat seat, Passenger passenger) {
        this.flight = flight;
        this.seat = seat;
        this.passenger = passenger;
    }
}

class broker {
    private ArrayList<Flight> flights = new ArrayList<> ();
    private ArrayList<booking> bookings = new ArrayList<> ();

    boolean bookFlight(String f, String destination, String departure) {


        return false;
    }
}

class M {
    A a;

    public M(A as) {
        this.a = a;
    }
}

class A {

}

