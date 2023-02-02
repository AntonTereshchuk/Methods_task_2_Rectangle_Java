package task;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int height;
		int width;
		
		System.out.println("Please enter height if rectangle: ");
		height = sc.nextInt();
		System.out.println("Please enter width of rectangle: ");
		width = sc.nextInt();
		System.out.println();
		sc.close();
		
		drawOfRectangle(height, width);

	}
	
	public static void drawOfRectangle(int height, int width) {
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
