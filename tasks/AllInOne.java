package tasks;

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
}