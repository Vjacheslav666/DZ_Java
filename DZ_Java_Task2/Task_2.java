// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).

import java.util.Scanner;

public class Task_2 {

	//Метод проверки являются ли две строки вращением друг друга (вхождение в обратном порядке) 
	public static boolean rotation(String firstString, String secondString) {
		int len = firstString.length();
		if (len == secondString.length() && len > 0) {
			String invertedSecondString = new StringBuilder(secondString).reverse().toString();
			return firstString.equals(invertedSecondString);
		}
		return false;
	}

	//Метод считывания входных данных от пользователя
	public static String getUserInput(String request) {
		Scanner input = new Scanner(System.in);
		System.out.print(request);
		return input.nextLine();
	}

	//Метод ввода пользователем данных и вывод результата на экран
	public static void main(String[] args) {
		String firstString = getUserInput("\nВведите первую строку: ");
		String secondString = getUserInput("Введите вторую строку: ");

		if (rotation(firstString, secondString)) {
			System.out.println("\nРезультат: \033[31m" + secondString + "\033[0m является вращением \033[31m" + firstString + "\033[0m");
		} else {
			System.out.println("\nРезультат: \033[31m" + secondString + "\033[0m НЕ является вращением \033[31m" + firstString + "\033[0m");
		}
	}

}

