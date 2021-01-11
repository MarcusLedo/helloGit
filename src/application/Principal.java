//Marcus Ledo
//Data: 11/01/2021
//Objetivo: código exemplo para aprender o básico do git/GitHub

package application;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		
		System.out.print("Enter your name: ");
		name = sc.nextLine();
		
		System.out.println("Welcome to GitHub! " + name);
		sc.close();
	}

}
