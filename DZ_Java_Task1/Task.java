import java.util.ArrayList;

public class Task {
    // 1 Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
    public static int randomNum(int min, int max) {
        int num = (int) (Math.random() * ((max - min) + 1)) + min;
        return num;
    }

    // 2 Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
    public static int seniorBit(int i) {
        int binLen = Integer.toBinaryString(i).length();
        return binLen;
    }

    // 3 Найти все кратные n числа большие i и сохранить в массив m1
    public static ArrayList<Integer> arrayMult(int i, int n, int max) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // int j = i;
        // while (j + 1 <= max) {
        //     if (j % n == 0) {
        //         list.add(j);
        //     }
        //     j++;
        // }
        for (int j = i + 1; j <= max; j++) {
            if (j % n == 0) {
                list.add(j);
            }
        }
        return list;
    }

    // 4 Найти все некратные n числа меньшие i и сохранить в массив m2
    public static ArrayList<Integer> arrayNotMult(int i, int n, int min) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // int c = i;
        // while (c - 1 >= min) {
        //     if (c % n != 0) {
        //         list.add(c);
        //     }
        //     c--;
        // }
        for (int j = i - 1; j >= min; j--) {
            if (j % n != 0) {
                list.add(j);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int min = 0, max = 2000;
        int i = randomNum(min, max);
        System.out.println("Случайное целое число в диапазоне от " + min + " до " + max + " и сохранённое в i = " + i);

        System.out.println();

        int n = seniorBit(i);
        System.out.println("Номер старшего значащего бита выпавшего числа " + i + " и сохранённое в n = " + n);

        System.out.println();

        ArrayList<Integer> m1 = arrayMult(i, n, max);
        System.out.println("Все кратные " + n + " числа большие " + i + " и сохранённые в массиве m1:\n" + m1);

        System.out.println();

        ArrayList<Integer> m2 = arrayNotMult(i, n, min);
        System.out.println("Все некратные " + n + " числа меньше " + i + " и сохранённые в массиве m2:\n" + m2);
    }
}
