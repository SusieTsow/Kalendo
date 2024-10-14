package ch.informatik.m223.kalendo.controller;

import ch.informatik.m223.kalendo.model.Reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationBean {
    private List<Reservation> reservations = new ArrayList<>();
    private Reservation currentReservation = new Reservation();
    private String reservationCode;
    private boolean isPrivateView;
}
