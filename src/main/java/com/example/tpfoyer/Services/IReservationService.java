package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);

    List<Reservation> getAllReservation();

    Reservation getReservationById (long idReservation );

    void deleteReservation(long idReservation);
    Reservation updateReservation(Reservation reservation);
}
