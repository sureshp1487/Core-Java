package day2_java;

public class UseBike {
	public static void main(String[] args) {
		Bike bikeDetails =new Bike();
		
		bikeDetails.bikeBrand="Pulsar";
		bikeDetails.bikePrice=162000;
		bikeDetails.isAbs=true;
		bikeDetails.bikedisCountAmount=5000;
		bikeDetails.bikeColor="Black";
		
		bikeDetails.bikeNetPrice=bikeDetails.bikePrice - bikeDetails.bikedisCountAmount;
		
		System.out.println("Pulser Bike NetPrice : "+bikeDetails.bikeNetPrice);
		System.out.println(bikeDetails.hashCode());
		
		
		Bike bikeDetails1 =new Bike();
		bikeDetails1.bikeBrand="Duke";
		bikeDetails1.bikePrice=243000;
		bikeDetails1.isAbs=true;
		bikeDetails1.bikedisCountAmount=7500;
		bikeDetails.bikeColor="Orange";
		
		bikeDetails1.bikeNetPrice= bikeDetails1.bikePrice - bikeDetails1.bikedisCountAmount;
		System.out.println(bikeDetails1.hashCode());
		
		System.out.println("Duke Bike NetPrice : "+bikeDetails1.bikeNetPrice);
		
		
	}

}
