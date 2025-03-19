package com.covid_vaccine.booking_application.prgram;

public class CoronaVaccineApp {

	public static void main(String[] args) {

		User user1 = new User("RamPrasad", 50, false);
		User user2 = new User("Ravi", 20, false);

		Thread t1 = new Thread(() -> {
			try {
				user1.bookDose();
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		});
		Thread t2 = new Thread(() -> {
			try {
				user2.bookDose();
			} catch (RuntimeException e) {
				System.out.println(e.getMessage());
			}
		});

		// thread started
		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
