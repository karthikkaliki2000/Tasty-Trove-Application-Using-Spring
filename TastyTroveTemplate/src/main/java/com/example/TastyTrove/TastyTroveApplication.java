package com.example.TastyTrove;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
//public class TastyTroveApplication {
//	static Recipe recipe=null;
//	static Ingredients ingredients=null;
//	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("ApplicationContext.xml");
//		System.out.println("Welcome to Tasty Trove Application");
//		Scanner s=new Scanner(System.in);
//		System.out.println("Enter your name?");
//		String uname=s.next();
//		
//		System.out.println("Select Recipe:\n1. North Indian\n2. South Indian\n3. Chinese");
//		int recipeChoice=s.nextInt();
//		switch(recipeChoice) {
//		case 1:{
//			
//			System.out.println("Select Ingredient:\n1. Lentils\n2. Rice\n3. Wheat");
//			int ingredientChoice=s.nextInt();
//			
//			switch(ingredientChoice) {
//			case 1:{
//				recipe=(Recipe)context.getBean("northIndianLentils");
//				recipe.setUserName(uname);
//				recipe.getDetails();
//				break;
//			}
//			case 2:{
//				recipe=(Recipe)context.getBean("northIndianRice");
//				recipe.setUserName(uname);
//				recipe.getDetails();
//				break;
//			}
//			case 3:{
//				recipe=(Recipe)context.getBean("northIndianWheat");
//				recipe.setUserName(uname);
//				recipe.getDetails();
//				break;
//			}
//			}
//			
//			break;
//		}
//		case 2:{
//			
//			System.out.println("Select Ingredient:\n1. Lentils\n2. Rice\n3. Wheat");
//			int ingredientChoice=s.nextInt();
//			
//			switch(ingredientChoice) {
//			case 1:{
//				recipe=(Recipe)context.getBean("southIndianLentils");
//				recipe.setUserName(uname);
//				recipe.getDetails();
//				break;
//			}
//			case 2:{
//				recipe=(Recipe)context.getBean("southIndianRice");
//				recipe.setUserName(uname);
//				recipe.getDetails();
//				break;
//			}
//			case 3:{
//				recipe=(Recipe)context.getBean("southIndianWheat");
//				recipe.setUserName(uname);
//				recipe.getDetails();
//				break;
//			}
//			}
//			
//			break;
//		}
//		case 3:{
//			
//			System.out.println("Select Ingredient:\n1. Lentils\n2. Rice\n3. Wheat");
//			int ingredientChoice=s.nextInt();
//			
//			switch(ingredientChoice) {
//			case 1:{
//				recipe=(Recipe)context.getBean("chineseLentils");
//				recipe.getDetails();
//				break;
//			}
//			case 2:{
//				recipe=(Recipe)context.getBean("chineseRice");
//				recipe.getDetails();
//				break;
//			}
//			case 3:{
//				recipe=(Recipe)context.getBean("chineseWheat");
//				recipe.getDetails();
//				break;
//			}
//			}
//			
//			break;
//		}
//		}
//	}
//
//}

@SpringBootApplication
public class TastyTroveApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		System.out.println("Welcome to Tasty Trove Application");

		// Enter User details
		System.out.println("Enter your name?");
		String name = scanner.nextLine();

		//Recipe Selection
		System.out.println("Select Recipe:");
		System.out.println("1. North Indian");
		System.out.println("2. South Indian");
		System.out.println("3. Chinese");
		String recipeType = "";

		int recipeTypeChoice = scanner.nextInt();

		switch (recipeTypeChoice) {
			case 1 -> recipeType = "northIndian";
			case 2 -> recipeType = "southIndian";
			case 3 -> recipeType = "chinese";
			default -> {
				System.out.println("Invalid choice. Exiting...");
				System.exit(0);
			}
		}
		// Ingredient Selection
		String ingredientType = "";
		System.out.println("Select Ingredient:");
		System.out.println("1. Lentils");
		System.out.println("2. Rice");
		System.out.println("3. Wheat");
		int ingredientTypeChoice = scanner.nextInt();

		switch (ingredientTypeChoice) {
			case 1 -> ingredientType = "Lentils";
			case 2 -> ingredientType = "Rice";
			case 3 -> ingredientType = "Wheat";
			default -> {
				System.out.println("Invalid choice. Exiting...");
				System.exit(0);
			}
		}
		Recipe myRecipe = (Recipe) context.getBean(recipeType + ingredientType);
		myRecipe.setUserName(name);
		myRecipe.getDetails();
	}

}