// 7. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.

public class Task_7 {
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		String newLine = "";
		for (int i = 0; i < 10000; i++) {
			newLine += "=";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("\nВремя, затраченное на создание строки из 10 000 символов '=' с использованием класса \033[31mString\033[0m: \033[34m"
				+ (endTime - startTime) + " ms\033[0m");

		startTime = System.currentTimeMillis();
		StringBuilder modifiedStr = new StringBuilder();
		for (int i = 0; i < 10000; i++) {
			modifiedStr.append("=");
		}
		newLine = modifiedStr.toString();
		endTime = System.currentTimeMillis();
		System.out
				.println("Время, затраченное на создание строки из 10 000 символов '=' с использованием класса \033[31mStringBuilder\033[0m: \033[34m"
						+ (endTime - startTime) + " ms\033[0m");

		String initialString = "'='";
		StringBuilder modifiedString = new StringBuilder(initialString);

		int index = initialString.indexOf("=");
		endTime = System.currentTimeMillis();
		modifiedString.replace(index, index + 1, "равно");
		System.out
				.println("Время, затраченное замену символ '=' на слово 'равно' с использованием \033[31mStringBuilder.replace()\033[0m: \033[34m"
						+ (endTime - startTime) + " ms\033[0m");
	}
}