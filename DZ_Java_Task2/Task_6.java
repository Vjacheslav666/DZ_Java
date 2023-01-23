// 6.*Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().

public class Task_6 {
	public static void main(String[] args) {
		String initialString = "'='";
		StringBuilder modifiedString = new StringBuilder(initialString);

		int index = initialString.indexOf("=");
		modifiedString.replace(index, index + 1, "равно");

		System.out.println("\nНачальная строка: \033[31m" + initialString + "\033[0m");
		System.out.println("Новая строка: \033[31m" + modifiedString + "\033[0m");
	}
}