package day2_java;

public class UseCar {
	public static void main(String[] args) {
		Car carDetails= new Car();
		
		carDetails.carBrand="Ford";
		carDetails.carPrice=950000;
		carDetails.carColor="Red";
		carDetails.carTaxAmount=12000;
		carDetails.isAirBeg=true;
		
		carDetails.carNetPrice=carDetails.carPrice+carDetails.carTaxAmount;
		
		System.out.println("Net Price ="+carDetails.carNetPrice);
		
		Car carDetails1 =new Car();
		
		carDetails1.carBrand="BMW";
		carDetails1.carPrice=1500000;
		carDetails1.carColor="Blue";
		carDetails1.carTaxAmount=30000;
		carDetails1.isAirBeg=true;
		
		carDetails1.carNetPrice=carDetails1.carPrice+carDetails1.carTaxAmount;
		
		System.out.println("Net Price ="+carDetails1.carNetPrice);
		
				
	}

}
