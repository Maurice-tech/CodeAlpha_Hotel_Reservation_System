package hotel_Administration.api;



import hotel_Administration.model.customer.Customer;
import hotel_Administration.model.room.IRoom;
import hotel_Administration.service.customer.CustomerService;
import hotel_Administration.service.reservation.ReservationService;

import java.util.Collection;
import java.util.List;


public class AdminResource {

    private static final AdminResource SINGLETON = new AdminResource();

    private final CustomerService customerService = CustomerService.getSingleton();
    private final ReservationService reservationService = ReservationService.getSingleton();

    private AdminResource() {}

    public static AdminResource getSingleton() {
        return SINGLETON;
    }

    public Customer getCustomer(String email) {
        return customerService.getCustomer(email);
    }

    public void addRoom(List<IRoom> rooms) {
        rooms.forEach(reservationService::addRoom);
    }

    public Collection<IRoom> getAllRooms() {
        return reservationService.getAllRooms();
    }

    public Collection<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    public void displayAllReservations() {
        reservationService.printAllReservation();
    }
}
