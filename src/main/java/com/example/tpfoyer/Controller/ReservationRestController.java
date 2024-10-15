package com.example.tpfoyer.Controller;

import com.example.tpfoyer.Entities.Reservation;
import com.example.tpfoyer.Services.IReservationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationRestController {
    IReservationService reservationService;
    @GetMapping("/retrieve-all-reservations")
    public List<Reservation>getReservations(){
        List<Reservation> listReservation=reservationService.getAllReservation();
        return listReservation;
    }
    /*@GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation getReservationById(@PathVariable("reservation-id")Long idReservation)
    Reservation reservation=reservationService.getReservationById(idReservation);
    return reservation*/

    // http://localhost:8089/tpreservation/reservation/retrieve-reservation/8
    @GetMapping("/retrieve-reservation/{reservation-id}")
    public Reservation getReservationById(@PathVariable("reservation-id") Long resId) {
        Reservation reservation = reservationService.getReservationById(resId);
        return reservation;
    }
    // http://localhost:8089/tpreservation/reservation/add-reservation
    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation f) {
        Reservation reservation = reservationService.addReservation(f);
        return reservation;
    }
    // http://localhost:8089/tpreservation/reservation/remove-reservation/{reservation-id}
    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void deleteReservation(@PathVariable("reservation-id") Long resId) {
        reservationService.deleteReservation(resId);
    }
    // http://localhost:8089/tpreservation/reservation/modify-reservation
    @PutMapping("/modify-reservation")
    public Reservation updateReservation(@RequestBody Reservation f) {
        Reservation reservation = reservationService.updateReservation(f);
        return reservation;
    }
}
