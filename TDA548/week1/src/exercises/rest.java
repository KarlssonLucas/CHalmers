package exercises;

import java.util.ArrayList;

public class rest {
}

class Customer {
    private final String name;
    private final String phone;

    Customer(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}

class TimeSlot {
    boolean overlaps(TimeSlot other) {
        return false;
    }
}

class Table {
    private String id;
    private int seats;

    Table(String id, int seats) {
        this.id = id;
        this.seats = seats;
    }
}

class Booking {
    private TimeSlot timeslot;
    private Customer customer;
    private Table table;

    Booking(TimeSlot timeslot, Customer customer, Table table) {
        this.timeslot = timeslot;
        this.customer = customer;
        this.table = table;
    }
}

class Restaurant {
    private ArrayList<Table> tables = new ArrayList<> ();
    private ArrayList<Booking> bookings = new ArrayList<> ();

    boolean bookTable(int customers, Customer customer, TimeSlot timeslot) {
        if (!new TimeSlot ().overlaps (timeslot)) {
            return false;
        }
        for (int i = 0; i < tables.size (); i++) {

        }

        return true;
    }
}
