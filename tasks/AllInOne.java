package tasks;

import java.util.Arrays;

public class AllInOne {
    public static void main(String[] args) {
        /*
         * 1. В Java есть единственный оператор, способный обеспечить остаток от
         * операции
         * деления. Два числа передаются в качестве параметров. Первый параметр,
         * разделенный на второй параметр, будет иметь остаток, возможно, ноль. Верните
         * это значение.
         */
        System.out.println(remainder(-9, 45));
        /*
         * 2. Напишите функцию, которая принимает основание и высоту треугольника и
         * возвращает его площадь.
         */
        System.out.println(triArea(3, 2));
        /*
         * 3. В этой задаче фермер просит вас сказать ему, сколько ног можно сосчитать
         * среди
         * всех его животных. Фермер разводит три вида:
         * chickens = 2 legs
         * cows = 4 legs
         * pigs = 4 legs
         * Фермер подсчитал своих животных, и он дает вам промежуточный итог для каждого
         * вида.
         * Вы должны реализовать функцию, которая возвращает общее количество ног всех
         * животных.
         */
        System.out.println(animals(2, 3, 5));
        /*
         * 4. Создайте функцию, которая принимает три аргумента (prob, prize, pay) и
         * возвращает true, если prob * prize > pay; в противном случае возвращает
         * false.
         * Чтобы проиллюстрировать это: p
         */
        System.out.println(profitableGamble(0.2, 50, 9));
        /*
         * 5. Напишите функцию, которая принимает 3 числа и возвращает, что нужно
         * сделать с
         * a и b: они должны быть сложены, вычитаны, умножены или разделены, чтобы
         * получить N. Если ни одна из операций не может дать N, верните "none".
         * 3 числа – это N, a и b.
         */
        System.out.println(operation(24, 15, 9));
        /*
         * 6. Создайте функцию, которая возвращает значение ASCII переданного символа.
         */
        System.out.println(ctoa('A'));
        /*
         * 7. Напишите функцию, которая берет последнее число из последовательного
         * списка
         * чисел и возвращает сумму всех чисел до него и включая его.
         */
        System.out.println(addUpTo(3));
        /*
         * 8. Создайте функцию, которая находит максимальное значение третьего ребра
         * треугольника, где длины сторон являются целыми числами.
         */
        System.out.println(nextEdge(8, 10));
        /*
         * 9. Создайте функцию, которая принимает массив чисел и возвращает сумму его
         * кубов.
         */
        System.out.println(sumOfCubes(new int[] { 1, 5, 9 }));
        /*
         * 10. Создайте функцию, которая будет для данного a, b, c выполнять следующие
         * действия:
         * – Добавьте A к себе B раз.
         * – Проверьте, делится ли результат на C
         */
        System.out.println(abcMath(42, 5, 10));
        /*
         * 1. Создайте функцию, которая повторяет каждый символ в строке n раз.
         */
        System.out.println(repeat("mice", 5));
        /*
         * 2. Создайте функцию, которая принимает массив и возвращает разницу между
         * самыми большими и самыми маленькими числами.
         */
        System.out.println(differenceMaxMin(new int[] { 10, 4, 1, 4, -10, -50, 32, 21 }));
        /*
         * 3. Создайте функцию, которая принимает массив в качестве аргумента и
         * возвращает
         * true или false в зависимости от того, является ли среднее значение всех
         * элементов
         * массива целым числом или нет.
         */
        System.out.println(isAvgWhole(new int[] { 1, 3 }));
        /*
         * 4. Создайте метод, который берет массив целых чисел и возвращает массив, в
         * котором каждое целое число является суммой самого себя + всех предыдущих
         * чисел в массиве.
         */
        var res = cumulativeSum(new int[] { 1, 2, 3 });
        for (int i : res) {
            System.out.println(i);
        }
        /*
         * 5. Создайте функцию, которая возвращает число десятичных знаков, которое
         * имеет
         * число (заданное в виде строки). Любые нули после десятичной точки
         * отсчитываются в сторону количества десятичных знаков.
         */
        System.out.println(getDecimalPlaces("420.3"));
        /*
         * 6. Создайте функцию, которая при заданном числе возвращает соответствующее
         * число Фибоначчи.
         */
        System.out.println(Fibonacci(14));
        /*
         * 7. Почтовые индексы состоят из 5 последовательных цифр. Учитывая строку,
         * напишите функцию, чтобы определить, является ли вход действительным
         * почтовым индексом. Действительный почтовый индекс выглядит следующим
         * образом:
         * – Должно содержать только цифры (не допускается использование нецифровых
         * цифр).
         * – Не должно содержать никаких пробелов.
         * – Длина не должна превышать 5 цифр.
         */
        System.out.println(isValid("12312"));
        /*
         * 8. Пара строк образует странную пару, если оба из следующих условий истинны:
         * – Первая буква 1-й строки = последняя буква 2-й строки.
         * – Последняя буква 1-й строки = первая буква 2-й строки.
         * – Создайте функцию, которая возвращает true, если пара строк представляет
         * собой
         * странную пару, и false в противном случае.
         */
        System.out.println(isStrangePair("ratio", "operator"));
        /*
         * 9. Создайте две функции: isPrefix(word, prefix-) и isSuffix (word, -suffix).
         * – isPrefix должен возвращать true, если он начинается с префиксного
         * аргумента.
         * – isSuffix должен возвращать true, если он заканчивается аргументом суффикса.
         * – В противном случае верните false.
         */
        System.out.println(isPrefix("automation", "auto"));
        System.out.println(isSuffix("phasmaphobia", "phobia"));
        /*
         * 10. Создайте функцию, которая принимает число (шаг) в качестве аргумента и
         * возвращает количество полей на этом шаге последовательности.
         */
        System.out.println(boxSeq(2));
    }

    private static int remainder(int value1, int value2) {
        return value1 % value2;
    }

    private static double triArea(int value1, int value2) {
        return 0.5 * value1 * value2;
    }

    private static int animals(int chickensAmmount, int cowsAmmount, int pigsAmmount) {
        return chickensAmmount * 2 + cowsAmmount * 4 + pigsAmmount * 4;
    }

    private static boolean profitableGamble(double prob, int prize, int pay) {
        return prob * prize > pay ? true : false;
    }

    private static String operation(int num1, int num2, int num3) {
        if ((num1 + num2) == num3)
            return "added";
        if ((num1 - num2) == num3)
            return "substracted";
        if ((num1 * num2) == num3)
            return "multiplied";
        if ((num1 / num2) == num3)
            return "devided";
        return "none";
    }

    private static int ctoa(char symbol) {
        return (int) symbol;
    }

    private static int addUpTo(int numero) {
        int Z = 0;
        for (int i = 1; i <= numero; i++) {
            Z += i;
        }
        return Z;
    }

    private static int nextEdge(int num1, int num2) {
        return num1 + num2 - 1;
    }

    private static int sumOfCubes(int[] numeros) {
        int Z = 0;
        for (int i = 0; i < numeros.length; i++) {
            Z += numeros[i] * numeros[i] * numeros[i];
        }
        return Z;
    }

    private static boolean abcMath(int num1, int num2, int num3) {
        int sumA = 0;
        for (int i = 0; i <= num2; i++) {
            sumA += num1;
        }
        return sumA % num3 == 0 ? true : false;
    }

    private static String repeat(String string, int numero) {
        String toReturn = "";
        char[] ch = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            ch[i] = string.charAt(i);
        }
        for (char c : ch) {
            String temp = "";
            for (int i = 0; i < numero; i++) {
                temp += c;
            }
            toReturn += temp;
        }
        return toReturn;
    }

    private static int differenceMaxMin(int[] numeros) {
        int min = Arrays.stream(numeros)
                .min()
                .getAsInt();
        int max = Arrays.stream(numeros)
                .max()
                .getAsInt();
        return max - min;
    }

    private static boolean isAvgWhole(int[] numeros) {
        int Z = 0;
        for (int i : numeros) {
            Z += i;
        }
        return Z % 2 == 0 ? true : false;
    }

    private static int[] cumulativeSum(int[] in) {
        int[] out = new int[in.length];
        int total = 0;
        for (int i = 0; i < in.length; i++) {
            total += in[i];
            out[i] = total;
        }
        return out;
    }

    private static int getDecimalPlaces(String str) {
        double d = Double.parseDouble(str);
        double x = d - Math.floor(d);
        String _str = x + "";
        String __str = _str.charAt(2) + "";
        return Integer.parseInt(__str);
    }

    private static int Fibonacci(int n) {
        if (n == 0 || n == 1)
            return 0;
        else if (n == 2)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    private static boolean isValid(String index) {
        char[] ch = new char[index.length()];

        for (int i = 0; i < index.length(); i++) {
            ch[i] = index.charAt(i);
        }
        for (char c : ch) {
            if (c == ' ')
                return false;
            try {
                double d = Double.parseDouble(c + "");
            } catch (NumberFormatException nfe) {
                return false;
            }
        }
        return true;
    }

    private static boolean isStrangePair(String str1, String str2) {
        char[] ch1 = new char[str1.length()];

        for (int i = 0; i < str1.length(); i++) {
            ch1[i] = str1.charAt(i);
        }

        char[] ch2 = new char[str2.length()];

        for (int i = 0; i < str2.length(); i++) {
            ch2[i] = str2.charAt(i);
        }

        return (ch1[0] == ch2[str2.length() - 1] && ch2[0] == ch1[str1.length() - 1]) ? true : false;
    }

    private static boolean isPrefix(String word, String prefix) {
        return (word.indexOf(prefix) == 1 ? true : false);
    }

    private static boolean isSuffix(String word, String suffix) {
        return (word.indexOf(suffix) == word.length() - suffix.length() ? true : false);
    }

    private static int boxSeq(int step) {
        int count = 0;
        for (int i = 1; i <= step; i++) {
            if (i % 2 != 0) {
                count += 3;
            } else {
                count -= 1;
            }
        }
        return count;
    }
}