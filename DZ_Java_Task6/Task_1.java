import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task_1 {
	public static void main(String[] args) {
		dataProcessing = new ArrayList<>();
		Scanner inputScanner = new Scanner(System.in);

		System.out.println("\n\033[34mДЛЯ ТОГО ЧТОБЫ ПРЕКРАТИТЬ ДОБАВЛЕНИЕ НАЖМИТЕ НА ЛЮБУЮ БУКВУ!!!\033[0m");
		System.out.print("\nВведите число для добавления: ");
		while (inputScanner.hasNextInt()) {
			System.out.print("Введите число для добавления: ");
			int element = inputScanner.nextInt();
			add(element);
	}

		printElements(true);
		printElements(false);

		inputScanner.close();
	}

	private static ArrayList<Integer> dataProcessing;

	public static void add(Integer element) {
		if (!dataProcessing.contains(element)) {
			dataProcessing.add(element);
		}
	}

	public static void printElements(boolean ascending) {
		if (ascending) {
			Collections.sort(dataProcessing);
			System.out.print("\nВывод результата в порядке возрастания: ");
		} else {
			Collections.sort(dataProcessing, Collections.reverseOrder());
			System.out.print("Вывод результата в порядке убывания: ");
		}
		System.out.println(dataProcessing);
	}

}
