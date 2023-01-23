// 3. Объявить список ArrayList, добавить 20 случайных чисел.
//Отсортировать список пузырьковой сортировкой самостоятельно, без использования доп методов и классов.

import java.util.ArrayList;
import java.util.Random;

public class Task_3 {

	// Основной метод программы
	public static void main(String[] args) {
		ArrayList<Integer> list1 = creatingList();
		System.out.println("\nНачальный список: " + list1);

		// Отсартированный список в порядке возрастания
		list1 = sortAscending(list1);
		System.out.println("\n\033[31mСписок в порядке возрастания: " + list1 + "\033[0m");

		// Отсортированный список в порядке убывания
		list1 = sortDescending(list1);
		System.out.println("\033[34mСписок в порядке убывания: " + list1 + "\033[0m");

	}

	//// Метод создания нового рандомного списка ArrayList
	private static ArrayList<Integer> creatingList() {
		ArrayList<Integer> list = new ArrayList<>();
		Random randomNumber = new Random();
		for (int i = 0; i < 20; i++) {
			list.add(randomNumber.nextInt(100));
		}
		return list;
	}

	//Метод сортировки списка по возрастанию пузыркевой сортировкой
	public static ArrayList<Integer> sortAscending(ArrayList<Integer> list1) {
		for (int i = 0; i < list1.size() - 1; i++) {
			for (int j = 0; j < list1.size() - i - 1; j++) {
				if (list1.get(j) > list1.get(j + 1)) {
					int temp = list1.get(j);
					list1.set(j, list1.get(j + 1));
					list1.set(j + 1, temp);
				}
			}
		}
		return list1;
	}

	//Метод сортировки списка по убыванию пузыркевой сортировкой
	public static ArrayList<Integer> sortDescending(ArrayList<Integer> list1) {
		for (int i = 0; i < list1.size() - 1; i++) {
			for (int j = 0; j < list1.size() - i - 1; j++) {
				if (list1.get(j) < list1.get(j + 1)) {
					int temp = list1.get(j);
					list1.set(j, list1.get(j + 1));
					list1.set(j + 1, temp);
				}
			}
		}
		return list1;
	}

}