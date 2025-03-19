package com.covid_vaccine.booking_application.prgram;

public class DoseBooking {
private boolean booked = false;

public synchronized void bookDose(){
	if(booked) {
		throw new RuntimeException("Dose already booked.");
	}
	booked = true;
}

public boolean isDoseBooked() {
	return booked;
}
}
