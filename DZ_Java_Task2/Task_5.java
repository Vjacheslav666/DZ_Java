// 5. Замените символ "="" на слово "равно". Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().

public class Task_5 {
	public static void main(String[] args) {
		String initialString = "'='";
		StringBuilder modifiedString = new StringBuilder(initialString);

		int index = initialString.indexOf("=");
		modifiedString.deleteCharAt(index);
		modifiedString.insert(index, "равно");

		String newString = modifiedString.toString();
		System.out.println("\nНачальная строка: \033[31m" + initialString + "\033[0m");
		System.out.println("Новая строка: \033[31m" + newString + "\033[0m");
	}
}