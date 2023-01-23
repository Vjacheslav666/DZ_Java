//2. Объявить список ArrayList, добавить 20 случайных чисел.
// Отсортировать список методом sort списка и компаратором по уменьшению.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Comparator;

public class Task_2 {

	// Основной метод программы
	public static void main(String[] args) {
		ArrayList<Integer> list1 = creatingList();
		System.out.println("\nНачальный список: " + list1);

		sortList(list1);
		System.out.println("\n\033[31mОтсартированный список в порядке убывания: " + list1 + "\033[0m");
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

	//// Метод сортировки элементов списка в порядке убывания
	private static void sortList(ArrayList<Integer> list1) {
		list1.sort(Collections.reverseOrder(Comparator.comparingInt(Integer::intValue)));
	}

}