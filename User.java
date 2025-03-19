package com.covid_vaccine.booking_application.prgram;

public class User {
	private String name;
	private VaccineEligibility eligibity;
	private DoseBooking doseBooking;

	public User(String name, int age, boolean hasHealthCondition) {
		super();
		this.name = name;
		this.eligibity = new VaccineEligibility(age, hasHealthCondition);
		this.doseBooking = new DoseBooking();
	}

	public boolean isEligible() {
		return eligibity.isEligible();
	}
	public void bookDose(){
		if(!isEligible()) {
			throw new RuntimeException(name+" is not eligible for the vaccine.");
		}
		doseBooking.bookDose();
		System.out.println("Dose booked successfully for "+ name);
	}
	public boolean isDoseBooked() {
		return doseBooking.isDoseBooked();
	}
}
