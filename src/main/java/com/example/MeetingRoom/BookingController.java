package com.example.MeetingRoom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingRepository bookingRepository;

    @PostMapping("/create")
    public ResponseEntity<Booking> createBooking(@RequestBody Booking booking) {
        Booking savedBooking = bookingRepository.save(booking);
        return new ResponseEntity<>(savedBooking, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Booking>> getAllBookings() {
        List<Booking> bookings = bookingRepository.findAll();
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }

    @GetMapping("/room/{roomName}/date/{date}")
    public ResponseEntity<List<Booking>> getBookingsByRoomAndDate(
            @PathVariable String roomName,
            @PathVariable String date) {
        List<Booking> bookings = bookingRepository.findByMeetingRoomAndDate(roomName, date);
        return new ResponseEntity<>(bookings, HttpStatus.OK);
    }



    // Add other CRUD operations (GET, PUT, DELETE) as needed
}
