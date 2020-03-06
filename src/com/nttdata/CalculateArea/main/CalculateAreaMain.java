package com.nttdata.CalculateArea.main;



import java.util.Scanner;

public class CalculateAreaMain {

	public static void main(String[] args) {
		try (Scanner s = new Scanner(System.in)) {
			System.out.println("Enter the Length in feet : ");
			double length = s.nextDouble();
			System.out.println("Enter the Breadth in feet :");
			double width = s.nextDouble();

			double areaInFeet = length * width;
			System.out.println("Area of the Room in feet : " + areaInFeet   + "square feet");

			double areaInSquaremeter = (areaInFeet) * 0.09290304;

			System.out.println("Area of Room in square meters: " + areaInSquaremeter  +"squaremeters");
		}

	}

}
