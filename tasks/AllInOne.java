package tasks;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

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
        /*
         * 1. Квадратное уравнение ax2 + bx + c = 0 имеет либо 0, либо 1, либо 2
         * различных
         * решения для действительных значений x. учитывая a, b и c, вы должны вернуть
         * число решений в уравнение.
         */
        System.out.println(solutions(1, 0, -1));
        /*
         * 2. Напишите функцию, которая возвращает позицию второго вхождения " zip " в
         * строку, или -1, если оно не происходит по крайней мере дважды. Ваш код должен
         * быть достаточно общим, чтобы передать все возможные случаи, когда "zip" может
         * произойти в строке.
         * 
         */
        System.out.println(findZip("all zip files are zipped"));
        /*
         * 3. Создайте функцию, которая проверяет, является ли целое число совершенным
         * числом или нет. Совершенное число - это число, которое можно записать как
         * сумму его множителей, исключая само число.
         * Например, 6-это идеальное число, так как 1 + 2 + 3 = 6, где 1, 2 и 3-Все
         * коэффициенты 6.
         * Точно так же 28-это совершенное число, так как 1 + 2 + 4 + 7 + 14 = 28.
         */
        System.out.println(checkPerfect(6));
        /*
         * 4. Создайте функцию, которая принимает строку и возвращает новую строку с
         * заменой ее первого и последнего символов, за исключением трех условий:
         * – Если длина строки меньше двух, верните "несовместимо".".
         * – Если первый и последний символы совпадают, верните "два-это пара.".
         */
        System.out.println(findEndChars("Cat, dog, and mouse."));
        /*
         * 5. Создайте функцию, которая определяет, является ли строка допустимым
         * шестнадцатеричным кодом.
         * Шестнадцатеричный код должен начинаться с фунтового ключа # и иметь длину
         * ровно 6
         * символов. Каждый символ должен быть цифрой от 0-9 или буквенным символом от
         * A-F.
         * все буквенные символы могут быть прописными или строчными.
         */
        System.out.println(isValidHexCode("#CD5C5C"));
        /*
         * 6. Напишите функцию, которая возвращает true, если два массива имеют
         * одинаковое
         * количество уникальных элементов, и false в противном случае.
         */
        System.out.println(same(new int[] { 1, 1, 2, 4 }, new int[] { 1, 1, 4, 7 }));
        /*
         * 7. Число Капрекара-это положительное целое число, которое после возведения в
         * квадрат и разбиения на две лексикографические части равно сумме двух
         * полученных новых чисел:
         * – Если количество цифр квадратного числа четное, то левая и правая части
         * будут иметь
         * одинаковую длину.
         * – Если количество цифр квадратного числа нечетно, то правая часть будет самой
         * длинной
         * половиной, а левая-самой маленькой или равной нулю, если количество цифр
         * равно 1.
         */
        System.out.println(iskaprekar(3));
        /*
         * 8. Напишите функцию, которая возвращает самую длинную последовательность
         * последовательных нулей в двоичной строке.
         */
        System.out.println(longestZero("11000010010"));
        /*
         * 9. Если задано целое число, создайте функцию, которая возвращает следующее
         * простое число. Если число простое, верните само число.
         */
        System.out.println(nextPrime(12));
        /*
         * 10. Учитывая три числа, x, y и z, определите, являются ли они ребрами
         * прямоугольного треугольника.
         */
        System.out.println(checkValidity(3, 4, 5));
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

    private static int solutions(int a, int b, int c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            return 2;
        } else if (D == 0) {
            return 1;
        } else {
            return 0;
        }
    }

    private static int findZip(String str) {
        int number = 9999999;
        int k = 0;
        int offset = 0;
        while (number != -1) {
            number = str.indexOf("zip");
            if (number != -1) {
                offset += number;
                str = str.substring(number + 3, str.length());
                // System.out.println(str);
                // System.out.println(offset);
                k++;
                if (k == 2) {
                    return offset + 3;
                } else if (k > 2) {
                    return -1;
                }
            }
        }
        return -1;
    }

    private static boolean checkPerfect(int numero) {
        int Z = 0;
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                Z += i;
            }
        }
        return (Z == numero) ? true : false;
    }

    private static String findEndChars(String str) {
        if (str.length() <= 2)
            return "Incompatible.";
        char[] ch1 = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch1[i] = str.charAt(i);
        }
        if (ch1[0] == ch1[str.length() - 1])
            return "Two's a pair";
        char buffer = ch1[0];
        String output = "";
        for (int i = 1; i < ch1.length - 1; i++) {
            output += ch1[i];
        }
        output = ch1[ch1.length - 1] + output;
        output = output + ch1[0];
        return output;
    }

    private static boolean isValidHexCode(String code) {
        Pattern pattern = Pattern.compile("^#([a-fA-F0-9]{6}|[a-fA-F0-9]{3})$");
        Matcher matcher = pattern.matcher(code);
        return matcher.matches();
    }

    private static boolean same(int[] array1, int[] array2) {
        int[] noDuplicates1 = IntStream.of(array1).distinct().toArray();
        int[] noDuplicates2 = IntStream.of(array1).distinct().toArray();
        return noDuplicates1.length == noDuplicates2.length;
    }

    private static boolean iskaprekar(int n) {
        if (n == 1)
            return true;

        // Count number of digits in square
        int sq_n = n * n;
        int count_digits = 0;
        while (sq_n != 0) {
            count_digits++;
            sq_n /= 10;
        }

        sq_n = n * n; // Recompute square as it was changed

        // Split the square at different points and see if sum
        // of any pair of splitted numbers is equal to n.
        for (int r_digits = 1; r_digits < count_digits; r_digits++) {
            int eq_parts = (int) Math.pow(10, r_digits);

            // To avoid numbers like 10, 100, 1000 (These are not
            // Kaprekar numbers
            if (eq_parts == n)
                continue;

            // Find sum of current parts and compare with n
            int sum = sq_n / eq_parts + sq_n % eq_parts;
            if (sum == n)
                return true;
        }

        // compare with original number
        return false;
    }

    private static String longestZero(String str) {
        char[] ch1 = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch1[i] = str.charAt(i);
        }
        int counter = 0;
        int max = 0;
        for (char c : ch1) {
            if (c == '0') {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            } else {
                counter = 0;
            }
        }
        String out = "";
        for (int i = 0; i < max; i++) {
            out += "0";
        }
        return out;
    }

    private static boolean isPrime(int num) {
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                flag = true;
                break;
            }
        }
        return !flag;
    }

    private static int nextPrime(int numero) {
        if (isPrime(numero))
            return numero;
        else {
            for (int i = numero; i < numero + 10000; i++) {
                if (isPrime(i))
                    return i;
            }
            return numero;
        }
    }

    private static boolean checkValidity(int a, int b, int c) {
        // check condition
        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
    }
}