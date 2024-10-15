package com.example.tpfoyer.Services;

import com.example.tpfoyer.Entities.Bloc;
import com.example.tpfoyer.Entities.Reservation;
import com.example.tpfoyer.Repository.ReservationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationServiceImpl  implements  IReservationService{
    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return (List<Reservation>) reservationRepository.findAll();
    }

    @Override
    public Reservation getReservationById(long idReservation) {
        return reservationRepository.findById(idReservation).get();
    }

    @Override
    public void deleteReservation(long idReservation) {
reservationRepository.deleteById(idReservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
