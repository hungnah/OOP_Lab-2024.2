package com.example.myapp;

public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King","Animation","Roger Allers",87,19.95f);
		anOrder.addDigitalVideoDisc(dvd1);//  them dvd1 
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
	
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin","Animation",
				18.99f);
		anOrder.addDigitalVideoDisc(dvd2,dvd3);// them 2 dvd 1 luc
		
		anOrder.prinCart();
		
		System.out.println("Total cost :   " + anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd3);// xoa dvd3
		
		anOrder.prinCart();// in ra cac dvd trong gio hang
		
		// in ra tong so luong
		System.out.println("Tong so luong : " + DigitalVideoDisc.getNbDigitalVideoDiscs());
		
		//  in ra id cho tung dvd : 
		
		System.out.println("DVD1 id: " + dvd1.getId());
        System.out.println("DVD2 id: " + dvd2.getId());
				
	}
}
