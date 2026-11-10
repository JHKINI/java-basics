package study_package;

public class AutoBoxingUnBoxingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =10;
		Integer intObject = n; // auto boxing
		System.out.println("intObject = " + intObject);
		
		
		int m = intObject + 10; // auto unboxing
		System.out.println("m = " + m);
	}}