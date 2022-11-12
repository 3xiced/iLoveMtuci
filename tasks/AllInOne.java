package tasks;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.IntStream;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

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
        int[] res = cumulativeSum(new int[] { 1, 2, 3 });
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
        /*
         * 1. Бесси работает над сочинением для своего класса писателей. Поскольку ее
         * почерк
         * довольно плох, она решает напечатать эссе с помощью текстового процессора.
         * Эссе содержит N слов (1≤N≤100), разделенных пробелами. Каждое слово имеет
         * длину от 1 до 15 символов включительно и состоит только из прописных или
         * строчных букв. Согласно инструкции к заданию, эссе должно быть
         * отформатировано очень специфическим образом: каждая строка должна содержать
         * не более K (1≤K≤80) символов, не считая пробелов. К счастью, текстовый
         * процессор Бесси может справиться с этим требованием, используя следующую
         * стратегию:
         * – Если Бесси набирает Слово, и это слово может поместиться в текущей строке,
         * поместите
         * его в эту строку. В противном случае поместите слово на следующую строку и
         * продолжайте добавлять к этой строке. Конечно, последовательные слова в одной
         * строке
         * все равно должны быть разделены одним пробелом. В конце любой строки не
         * должно
         * быть места.
         * – К сожалению, текстовый процессор Бесси только что сломался. Пожалуйста,
         * помогите ей правильно оформить свое эссе!
         * Вам будут даны n, k и строка
         */

        textProcessor("hello my name is Bessie and this is my essay", 10, 7);
        /*
         * 2. Напишите функцию, которая группирует строку в кластер скобок. Каждый
         * кластер
         * должен быть сбалансирован.
         */
        System.out.println(split("()()()"));
        /*
         * 3. Создайте две функции toCamelCase () и toSnakeCase (), каждая из которых
         * берет
         * одну строку и преобразует ее либо в camelCase, либо в snake_case.
         */
        System.out.println(toCamelCase("hello_edabit"));
        System.out.println(toSnakeCase("helloEdabit"));
        /*
         * 4. Напишите функцию, которая вычисляет сверхурочную работу и оплату,
         * связанную
         * с сверхурочной работой.
         * Работа с 9 до 5: обычные часы работы
         * После 5 вечера это сверхурочная работа
         * Ваша функция получает массив с 4 значениями:
         * – Начало рабочего дня, в десятичном формате, (24-часовая дневная нотация)
         * – Конец рабочего дня. (Тот же формат)
         * – Почасовая ставка
         * – Множитель сверхурочных работ
         * Ваша функция должна возвращать:
         * $ + заработанные в тот день (округлены до ближайшей сотой)
         */
        System.out.println(overTime(new String[] { "9", "17", "30", "1.5" }));
        /*
         * 5. Индекс массы тела (ИМТ) определяется путем измерения вашего веса в
         * килограммах и деления на квадрат вашего роста в метрах. Категории ИМТ таковы:
         * Недостаточный вес: <18,5
         * Нормальный вес: 18.5-24.9
         * Избыточный вес: 25 и более
         * Создайте функцию, которая будет принимать вес и рост (в килограммах, фунтах,
         * метрах или дюймах) и возвращать ИМТ и связанную с ним категорию. Округлите
         * ИМТ до ближайшей десятой.
         */
        System.out.println(BMI(new String[] { "205", "pounds", "73", "inches" }));
        /*
         * 6. Создайте функцию, которая принимает число и возвращает его
         * мультипликативное
         * постоянство, которое представляет собой количество раз, которое вы должны
         * умножать цифры в num, пока не достигнете одной цифры.
         */
        System.out.println(bugger("39"));
        /*
         * 7. Напишите функцию, которая преобразует строку в звездную стенографию. Если
         * символ повторяется n раз, преобразуйте его в символ*n.
         */
        System.out.println(toStarShorthand("abbccc"));
        /*
         * 8. Создайте функцию, которая возвращает true, если две строки рифмуются, и
         * false в
         * противном случае. Для целей этого упражнения две строки рифмуются, если
         * последнее слово из каждого предложения содержит одни и те же гласные.
         */
        System.out.println(doesRhyme("Sam I am!", "Green eggs and ham."));
        /*
         * 9. Создайте функцию, которая принимает два целых числа и возвращает true,
         * если
         * число повторяется три раза подряд в любом месте в num1 и то же самое число
         * повторяется два раза подряд в num2.
         */
        System.out.println(trouble(new String[] { "451999277", "41177722899" }));
        /*
         * 10. Предположим, что пара одинаковых символов служит концами книги для всех
         * символов между ними. Напишите функцию, которая возвращает общее количество
         * уникальных символов (книг, так сказать) между всеми парами концов книги.
         */
        System.out.println(countUniqueBooks(new String[] { "AZYWABBCATTTA", "A" }));
        /*
         * 1. Пришло время отправлять и получать секретные сообщения.
         * Создайте две функции, которые принимают строку и массив и возвращают
         * закодированное или декодированное сообщение.
         * Первая буква строки или первый элемент массива представляет собой символьный
         * код
         * этой буквы. Следующие элементы-это различия между символами: например, A +3
         * --> C
         * или z -1 --> y.
         */
        encrypt("Hello");
        System.out.println(decrypt(new int[] { 72, 33, -73, 84, -12, -3, 13, -13, -68 }));
        /*
         * 2. Создайте функцию, которая принимает имя шахматной фигуры, ее положение и
         * целевую позицию. Функция должна возвращать true, если фигура может двигаться
         * к цели, и false, если она не может этого сделать.
         * Возможные входные данные - "пешка", "конь", "слон", "Ладья", "Ферзь"и
         * " король".
         */
        System.out.println(canMove("Rook", "A8", "H8"));
        /*
         * 3. Входная строка может быть завершена, если можно добавить дополнительные
         * буквы, и никакие буквы не должны быть удалены, чтобы соответствовать слову.
         * Кроме того, порядок букв во входной строке должен быть таким же, как и
         * порядок
         * букв в последнем слове.
         * Создайте функцию, которая, учитывая входную строку, определяет, может ли
         * слово быть
         * завершено.
         */
        System.out.println(canComplete("butl", "beautiful"));
        /*
         * 4. Создайте функцию, которая принимает числа в качестве аргументов,
         * складывает их
         * вместе и возвращает произведение цифр до тех пор, пока ответ не станет длиной
         * всего в 1 цифру.
         */
        System.out.println(sumDigProd(16, 28));
        /*
         * 5. Напишите функцию, которая выбирает все слова, имеющие все те же гласные (в
         * любом порядке и / или количестве), что и первое слово, включая первое слово.
         */
        sameVowelGroup(new String[] { "toe", "ocelot", "maniac" });
        /*
         * 6. Создайте функцию, которая принимает число в качестве аргумента и
         * возвращает
         * true, если это число является действительным номером кредитной карты, а в
         * противном случае-false.
         * Номера кредитных карт должны быть длиной от 14 до 19 цифр и проходить тест
         * Луна,
         * описанный ниже:
         * – Удалите последнюю цифру (это"контрольная цифра").
         * – Переверните число.
         * – Удвойте значение каждой цифры в нечетных позициях. Если удвоенное значение
         * имеет
         * более 1 цифры, сложите цифры вместе (например, 8 x 2 = 16 ➞ 1 + 6 = 7).
         * – Добавьте все цифры.
         * – Вычтите последнюю цифру суммы (из шага 4) из 10. Результат должен быть
         * равен
         * контрольной цифре из Шага 1.
         */
        System.out.println(validateCard(1234567890123456l));
        /*
         * 7. Напишите функцию, которая принимает положительное целое число от 0 до 999
         * включительно и возвращает строковое представление этого целого числа,
         * написанное на английском языке.
         */
        System.out.println(numToEng(3));
        /*
         * 8. Хеш-алгоритмы легко сделать одним способом, но по существу невозможно
         * сделать наоборот. Например, если вы хешируете что-то простое, например,
         * password123, это даст вам длинный код, уникальный для этого слова или фразы.
         * В
         * идеале, нет способа сделать это в обратном порядке. Вы не можете взять
         * хеш-код и
         * вернуться к слову или фразе, с которых вы начали.
         * Создайте функцию, которая возвращает безопасный хеш SHA-256 для данной
         * строки.
         * Хеш должен быть отформатирован в виде шестнадцатеричной цифры.
         */
        System.out.println(getSha256Hash("password123"));
        /*
         * 9. Напишите функцию, которая принимает строку и возвращает строку с
         * правильным
         * регистром для заголовков символов в серии "Игра престолов".
         * Слова and, the, of и in должны быть строчными. Все остальные слова должны
         * иметь
         * первый символ в верхнем регистре, а остальные-в Нижнем.
         */
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        /*
         * 10. Как указано в онлайн-энциклопедии целочисленных последовательностей:
         * Гексагональная решетка - это привычная двумерная решетка, в которой каждая
         * точка
         * имеет 6 соседей.
         */
        System.out.println(hexLattice(7));
        /*
         * 1. Число Белла - это количество способов, которыми массив из n элементов
         * может
         * быть разбит на непустые подмножества. Создайте функцию, которая принимает
         * число n и возвращает соответствующее число Белла.
         */
        System.out.println(bell(3));
        /*
         * 2. В «поросячей латыни» (свинский латинский) есть два очень простых правила:
         * – Если слово начинается с согласного, переместите первую букву (буквы) слова
         * до
         * гласного до конца слова и добавьте «ay» в конец.
         * have ➞ avehay
         * cram ➞ amcray
         * take ➞ aketay
         * cat ➞ atcay
         * shrimp ➞ impshray
         * trebuchet ➞ ebuchettray
         * – Если слово начинается с гласной, добавьте "yay" в конце слова.
         * ate ➞ ateyay
         * apple ➞ appleyay
         * oaken ➞ oakenyay
         * eagle ➞ eagleyay
         * Напишите две функции, чтобы сделать переводчик с английского на свинский
         * латинский.
         * Первая функция translateWord (word) получает слово на английском и возвращает
         * это
         * слово, переведенное на латинский язык. Вторая функция translateSentence
         * (предложение)
         * берет английское предложение и возвращает это предложение, переведенное на
         * латинский
         * язык.
         */
        System.out.println(translateWord("apple"));
        System.out.println(translateSentence("I like to eat honey waffles."));
        /*
         * 3. Учитывая параметры RGB (A) CSS, определите, является ли формат принимаемых
         * значений допустимым или нет. Создайте функцию, которая принимает строку
         * (например, " rgb(0, 0, 0)") и возвращает true, если ее формат правильный, в
         * противном случае возвращает false.
         */
        System.out.println(validColor("rgb(255,256,255)"));
        System.out.println(stripUrlParams("https://edabit.com?a=1&b=2&a=2", new String[] { "b" }));
        /*
         * 5. Напишите функцию, которая извлекает три самых длинных слова из заголовка
         * газеты и преобразует их в хэштеги. Если несколько слов одинаковой длины,
         * найдите слово, которое встречается первым.
         */
        System.out.println(Arrays.toString(getHashtags("Hey Parents, Surprise, Fruit Juice Is Not Fruit")));
        /*
         * 6. Последовательность Улама начинается с:
         * ulam = [1, 2]
         * Следующее число в последовательности - это наименьшее положительное число,
         * равное
         * сумме двух разных чисел (которые уже есть в последовательности) ровно одним
         * способом. Тривиально, это 3, так как в стартовой последовательности есть
         * только 2 числа.
         * ulam = [1, 2, 3]
         * Следующее число 4, которое является суммой 3 + 1. 4 также равно 2 + 2, но это
         * уравнение
         * не учитывается, так как 2 добавления должны быть различны.
         * ulam = [1, 2, 3, 4]
         * Следующее число не может быть 5, так как 5 = 1 + 4, но также и 5 = 2 + 3.
         * Должен быть
         * только один способ сделать число Улама из 2 различных добавлений, найденных в
         * последовательности. Следующее число 6 (2 + 4). Есть 2 способа сделать 7 (1 +
         * 6 или 3 +
         * 4), поэтому следующий - 8 (2 + 6). И так далее.
         * ulam = [1, 2, 3, 4, 6, 8, 11, 13, 16, 18, 26, 28, 36, 38, 47, 48, 53,
         * …]
         * Создайте функцию, которая принимает число n и возвращает n-е число в
         * последовательности Улама.
         * Пример:
         * ulam(4) ➞ 4
         * ulam(9) ➞ 16
         * ulam(206) ➞ 1856
         */
        // System.out.println(ulam(206));
        /*
         * 7. Напишите функцию, которая возвращает самую длинную неповторяющуюся
         * подстроку для строкового ввода.
         */
        System.out.println(longestNonRepeatingString("abcabcbb"));
        /*
         * 8. Создайте функцию, которая принимает арабское число и преобразует его в
         * римское
         * число
         */
        System.out.println(convertToRoman(312));
        /*
         * 9. Создайте функцию, которая принимает строку и возвращает true или false в
         * зависимости от того, является ли формула правильной или нет.
         */
        System.out.println(formula("4+2=6=3+3"));
        /*
         * 10. Число может не быть палиндромом, но его потомком может быть. Прямой
         * потомок
         * числа создается путем суммирования каждой пары соседних цифр, чтобы создать
         * цифры следующего числа.
         * Например, 123312 – это не палиндром, а его следующий потомок 363, где: 3 = 1
         * + 2; 6 = 3
         * + 3; 3 = 1 + 2.
         * Создайте функцию, которая возвращает значение true, если само число является
         * палиндромом или любой из его потомков вплоть до 2 цифр (однозначное число -
         * тривиально палиндром).
         * Пример:
         * palindromedescendant(11211230) ➞ true
         * // 11211230 ➞ 2333 ➞ 56 ➞ 11
         * palindromeDescendant(13001120) ➞ true
         * // 13001120 ➞ 4022 ➞ 44
         * palindromeDescendant(23336014) ➞ true
         * // 23336014 ➞ 5665
         * palindromeDescendant(11) ➞ true
         * // Number itself is a palindrome.
         * Примечание:
         * – Числа всегда будут иметь четное число цифр.
         */
        System.out.println(palindromeDescendant(11211230));
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
            return "Несовместимо.";
        char[] ch1 = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch1[i] = str.charAt(i);
        }
        if (ch1[0] == ch1[str.length() - 1])
            return "Два это пара";
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

        int sq_n = n * n;
        int count_digits = 0;
        while (sq_n != 0) {
            count_digits++;
            sq_n /= 10;
        }

        sq_n = n * n;

        for (int r_digits = 1; r_digits < count_digits; r_digits++) {
            int eq_parts = (int) Math.pow(10, r_digits);

            if (eq_parts == n)
                continue;

            int sum = sq_n / eq_parts + sq_n % eq_parts;
            if (sum == n)
                return true;
        }

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
        if (a + b <= c || a + c <= b || b + c <= a)
            return false;
        else
            return true;
    }

    private static int bell(int n) {
        int[][] bell = new int[n + 1][n + 1];
        bell[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            bell[i][0] = bell[i - 1][i - 1];
            for (int j = 1; j <= i; j++)
                bell[i][j] = bell[i - 1][j - 1] + bell[i][j - 1];
        }
        return bell[n][0];
    }

    private static void textProcessor(String string, int k, int n) {
        int i = 0, spaceIndex1 = 0, spaceIndex2 = 0;
        boolean f = true;
        boolean f1 = true;
        while (f) {

            while (f1) {
                spaceIndex1 = string.indexOf(" ");
                spaceIndex2 = string.indexOf(" ", spaceIndex1 + 1);
                if (spaceIndex1 < k && spaceIndex2 <= k) {
                    char sim3 = string.charAt(spaceIndex2);
                    if (sim3 == ' ') {
                        i = spaceIndex2;
                    } else {
                        i = string.indexOf(" ");
                    }
                    break;
                } else {
                    if (spaceIndex1 <= k && spaceIndex2 > k) {
                        char sim3 = string.charAt(spaceIndex2);
                        if (sim3 == ' ' && (spaceIndex2 == k + 1)) {
                            i = spaceIndex2;
                        } else {
                            i = string.indexOf(" ");
                        }
                        break;

                    }
                    break;
                }
            }
            System.out.println(string.substring(0, i));
            string = string.substring(i + 1);
            if (string.length() < k) {
                System.out.println(string);
                break;
            }
        }
    }

    private static String split(String line) {
        int leftCase = 0;
        int rightCase = 0;
        String outputLine = "";
        String currentLine = "";
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 40) {
                leftCase += 1;
                currentLine += line.substring(i, i + 1);
            } else if (line.charAt(i) == 41) {
                rightCase += 1;
                currentLine += line.substring(i, i + 1);
            }

            if (leftCase == rightCase) {
                outputLine += currentLine + "\n";
                currentLine = "";
                leftCase = 0;
                rightCase = 0;
            }
        }
        return outputLine;
    }

    private static String toCamelCase(String word) {
        String outputString = "";
        int beginIndex = 0;
        int currentIndex = 0;
        while (currentIndex < word.length() - 1) {
            if (word.substring(currentIndex, currentIndex + 1).equals("_")) {
                outputString += word.substring(beginIndex, currentIndex)
                        + word.substring(currentIndex + 1, currentIndex + 2).toUpperCase();
                currentIndex += 2;
                beginIndex = currentIndex;
                if (word.indexOf("_", currentIndex + 2) == -1) {
                    return outputString += word.substring(currentIndex, word.length());
                }
            } else
                currentIndex += 1;
        }
        return outputString;
    }

    private static String toSnakeCase(String word) {
        String outputString = "";
        int currentIndex = 0;
        int beginIndex = 0;
        while (currentIndex < word.length() - 1) {
            if (word.substring(currentIndex, currentIndex + 1).matches("^[A-Z]+$")) {
                outputString += word.substring(beginIndex, currentIndex) + "_"
                        + word.substring(currentIndex, currentIndex + 1).toLowerCase();
                currentIndex += 1;
                beginIndex = currentIndex;

                if (!word.substring(currentIndex, word.length() - 1).chars().anyMatch(Character::isUpperCase)) {
                    return outputString += word.substring(currentIndex, word.length());
                }
            } else
                currentIndex += 1;
        }
        return outputString;
    }

    private static String overTime(String[] args) {
        double beginWork = Double.parseDouble(args[0]);
        double endWork = Double.parseDouble(args[1]);
        double hourlyRate = Double.parseDouble(args[2]);
        double overRate = Double.parseDouble(args[3]);

        if (endWork > 17.00) {
            return "overwork " + "$"
                    + String.valueOf((17.00 - beginWork) * hourlyRate + (endWork - 17.00) * hourlyRate * overRate);
        } else
            return "normalwork " + "$" + String.valueOf((endWork - beginWork) * hourlyRate);
    }

    private static String BMI(String[] args) {
        double weight = Double.parseDouble(args[0]);
        double height = Double.parseDouble(args[2]);
        double indexBMI = 0;
        if (args[1].equals("pounds")) {
            weight *= 0.45;
        }
        if (args[3].equals("inches")) {
            height += 0.025;
        }

        double hundred = Math.pow(10, 2);
        indexBMI = Math.ceil((weight / Math.pow(height, 2)) * hundred) / hundred;

        if (indexBMI > 25) {
            return indexBMI + " Overweight";
        } else if (indexBMI < 18.5) {
            return indexBMI + " Underweight";
        } else
            return indexBMI + " Normal weight";
    }

    private static int bugger(String str) {
        int currentNum = toCalculate(str);
        int itterations = 1;
        if (str.length() == 1) {
            return 0;
        }
        while (currentNum > 9) {
            itterations += 1;
            currentNum = toCalculate(Integer.toString(currentNum));
        }
        return itterations;
    }

    public static int toCalculate(String str) {
        int outputNum = 1;
        int arraySum[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arraySum[i] = Integer.parseInt(str.substring(i, i + 1));
        }
        for (int i = 0; i < arraySum.length; i++) {
            outputNum *= arraySum[i];
        }
        return outputNum;
    }

    private static String toStarShorthand(String lines) {
        String outputStr = "";
        int counter = 0;
        String line = lines + "0";
        for (int i = 0; i < line.length() - 1; i++) {
            if (!line.substring(i, i + 1).equals(line.substring(i + 1, i + 2)) && counter == 0) {
                outputStr += line.substring(i, i + 1);
            }

            else if (line.substring(i, i + 1).equals(line.substring(i + 1, i + 2))) {
                counter += 1;
            } else {
                outputStr += line.substring(i, i + 1) + "*" + (counter + 1);
                counter = 0;
            }
        }
        return outputStr;
    }

    private static Boolean doesRhyme(String line1, String line2) {
        String lineCheck1 = line1;
        String lineCheck2 = line2;
        if (lineCheck1.substring(lineCheck1.length() - 1, lineCheck1.length()).matches("[?!.]($|\\s)")) {
            lineCheck1 = lineCheck1.substring(0, lineCheck1.length() - 1);
        }

        if (lineCheck2.substring(lineCheck2.length() - 1, lineCheck2.length()).matches("[?!.]($|\\s)")) {
            lineCheck2 = lineCheck2.substring(0, lineCheck2.length() - 1);
        }

        if (lineCheck1.substring(lineCheck1.length() - 2, lineCheck1.length())
                .equals(lineCheck2.substring(lineCheck2.length() - 2, lineCheck2.length()))) {
            return true;
        } else
            return false;
    }

    private static Boolean trouble(String[] strings) {
        String first = strings[0];
        String second = strings[1];
        int ch = 0;
        for (int i = 0; i < first.length() - 2; i++) {
            if ((first.charAt(i) == first.charAt(i + 1)) && (first.charAt(i) == first.charAt(i + 2))) {
                ch = first.charAt(i);
            }
        }
        if (ch == 0) {
            return false;
        }
        for (int i = 0; i < second.length() - 1; i++) {
            if ((second.charAt(i) == ch) && (second.charAt(i + 1) == ch)) {
                return true;
            }
        }
        return false;
    }

    private static int countUniqueBooks(String[] strings) {
        String[] _strings = strings[0].split("");
        Set<String> stringSet = new HashSet<String>();
        int k = 0;
        for (int i = 0; i < _strings.length; i++) {
            if (_strings[i].equals(strings[1])) {
                k += 1;
            }
            if (k % 2 != 0) {
                stringSet.add(_strings[i]);
            }
        }
        return stringSet.size() - 1;
    }

    private static void encrypt(String string) {
        int len = string.length();
        int code = 0;
        int[] arrEncrypt = new int[len];
        for (int j = 0; j < len; j++) {
            arrEncrypt[j] = string.charAt(j) - code;
            code = string.charAt(j);
            System.out.print(arrEncrypt[j]);
            if (j > 0) {
                System.out.print(" ");
            }
        }
    }

    private static String decrypt(int[] numbers) {
        String string = "";
        int code = 0;
        for (int j = 0; j < numbers.length; j++) {
            string += (char) (numbers[j] + code);
            code = numbers[j] + code;
        }
        return string;
    }

    private static boolean canMove(String p, String c, String t) {
        if (p.equals("Пешка")) {
            if (c.charAt(0) == t.charAt(0)) {

                if (c.charAt(1) == '2' && t.charAt(1) == '4') {
                    return true;
                }

                if (c.charAt(1) == '7' && t.charAt(1) == '5') {
                    return true;
                }

                if (Math.abs((int) c.charAt(1) - (int) t.charAt(1)) == 1) {
                    return true;
                }
            }
        }

        if (p.equals("Слон")) {
            if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == Math.abs((int) c.charAt(1) - (int) t.charAt(1))) {
                return true;
            }
        }

        if (p.equals("Ладья")) {
            if (c.charAt(0) == t.charAt(0)
                    || c.charAt(1) == t.charAt(1)) {
                return true;
            }
        }

        if (p.equals("Конь")) {

            if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == 2
                    && Math.abs((int) c.charAt(1) - (int) t.charAt(1)) == 1) {
                return true;
            }

            if (Math.abs((int) c.charAt(1) - (int) t.charAt(1)) == 2
                    && Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == 1) {
                return true;
            }
        }
        if (p.equals("Король")) {
            if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) <= 1
                    && Math.abs((int) c.charAt(1) - (int) t.charAt(1)) <= 1) {
                return true;
            }
        }
        if (p.equals("Королева")) {
            if (Math.abs((int) c.charAt(0) - (int) t.charAt(0)) == Math.abs((int) c.charAt(1) - (int) t.charAt(1))) {
                return true;
            }

            if (c.charAt(0) == t.charAt(0)
                    || c.charAt(1) == t.charAt(1)) {
                return true;
            }

        }

        return false;
    }

    private static boolean canComplete(String start, String string) {
        int in = 0;

        for (int w = 0; w < string.length(); w++) {
            if (string.charAt(w) == start.charAt(in))
                in++;
        }

        if (in == start.length())
            return true;
        else
            return false;
    }

    private static int sumDigProd(int... i) {
        int s = 0;
        for (int n : i)
            s += n;
        if (s < 10)
            return s;
        int p = 1;
        while (s > 0) {
            p *= s % 10;
            s /= 10;
        }
        return sumDigProd(p);
    }

    private static void sameVowelGroup(String[] strings) {

        char[] chars = strings[0].toCharArray();
        Set<Character> v = new HashSet<>();
        for (char _char : chars) {
            if (_char == 'a' || _char == 'e' || _char == 'i' || _char == 'o' || _char == 'u') {
                v.add(_char);
            }
        }
        for (String _string : strings) {
            boolean isValid = true;
            for (char c : _string.toCharArray()) {
                if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                    if (!v.contains(c)) {
                        isValid = false;
                    }
                }
            }
            if (isValid) {
                System.out.print(_string + " ");
            }
        }

    }

    private static boolean validateCard(long numero) {

        int strLen = String.valueOf(numero).length();
        if ((strLen < 14) || (strLen > 19))
            return false;
        int last_digit = (int) (numero % 10);
        StringBuilder stringNumber = new StringBuilder(String.valueOf(numero / 10)).reverse();
        int temp = 0;
        for (int i = 0; i < stringNumber.length(); i = i + 2) {
            temp = Integer.parseInt(stringNumber.charAt(i) + "") * 2;
            if (temp / 10 > 0) {
                temp = temp / 10 + temp % 10;
            }
            stringNumber.replace(i, i + 1, String.valueOf(temp));
        }
        temp = 0;
        for (char x : stringNumber.toString().toCharArray()) {
            temp += Integer.parseInt(x + "");
        }

        return ((10 - (temp % 10)) == last_digit);

    }

    private static String numToEng(int n) {
        String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven",
                "eight", "nine" };
        String[] twenties = { "ten", "eleven", "twelve", "thirten", "fourten", "fifteen",
                "sixteen", "seventeen", "eighten", "nineteen" };
        String[] tens = { "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty",
                "ninety" };
        String numero = Integer.toString(n);

        switch (numero.length()) {
            case 1:
                return ones[Integer.parseInt(numero)];
            case 2:
                return twenties[Integer.parseInt(numero)];
            case 3:
                StringBuilder sb = new StringBuilder();
                int[] digits = new int[3];
                int k = 0;
                while (n != 0) {
                    digits[k] = n % 10;
                    n = n / 10;
                    k++;
                }
                sb.append(ones[digits[2]]).append(" hundred ");
                if (digits[1] == 1) {
                    int c = digits[1] + digits[2];
                    sb.append(twenties[c]);
                    return sb.toString();
                }
                if (digits[1] > 1)
                    sb.append(tens[digits[1] - 1]).append(" ");
                if (digits[0] > 0)
                    sb.append(ones[digits[0]]);
                return sb.toString();
            default:
                break;
        }
        return "";
    }

    private static String getSha256Hash(String str) {
        return hash(str, "SHA-256");
    }

    private static String hash(String msg, String algo) {
        String result = "";
        MessageDigest md;
        try {
            md = MessageDigest.getInstance(algo);
            byte[] hashes = md.digest(msg.getBytes());
            for (int i = 0; i < hashes.length; i++) {
                String hex = Integer.toHexString(0xff & hashes[i]);
                if (hex.length() == 1)
                    result += 0;
                result += hex;
            }
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static String correctTitle(String str) {
        String[] strings = str.split(" ");
        String output = "";
        for (int i = 0; i < strings.length; i++) {
            if (i > 0) {
                output += " ";
            }
            String[] _strings = strings[i].split("-");
            for (int j = 0; j < _strings.length; j++) {
                if (j > 0) {
                    output += "-";
                }
                if (_strings[j].equalsIgnoreCase("and")
                        || _strings[j].equalsIgnoreCase("the")
                        || _strings[j].equalsIgnoreCase("of")
                        || _strings[j].equalsIgnoreCase("in")) {
                    output += _strings[j].toLowerCase();
                } else {
                    output += _strings[j].substring(0, 1).toUpperCase();
                    output += _strings[j].substring(1).toLowerCase();
                }
            }
        }

        return output;
    }

    private static String hexLattice(int n) {
        int i = 0;
        boolean isHex = false;
        while (3 * i * (i + 1) + 1 <= n) {
            if (3 * i * (i + 1) + 1 == n)
                isHex = true;
            i++;
        }
        String str = "";
        if (isHex) {
            int l = i;
            int m = i;
            String str2;
            for (int j = 0; j < 2 * i - 1; j++) {
                str += "\n";
                str2 = "";
                for (int k = 1; k < m; k++) {
                    str2 += " ";
                }
                str += str2;
                for (int k = 0; k < l; k++) {
                    str += " o";
                }
                str += str2 + " ";
                l += (j < i - 1) ? 1 : -1;
                m += (j < i - 1) ? -1 : 1;
            }
            str = str.replaceFirst("\n", "");
            return str;
        } else
            return "Invalid";
    }

    private static boolean isVowel(char ch) {
        return (ch == 'A' || ch == 'a' || ch == 'E' || ch == 'e' || ch == 'I' || ch == 'i' || ch == 'O' || ch == 'o'
                || ch == 'U' || ch == 'u');
    }

    private static String translateWord(String string) {
        int stringlength = string.length();
        int index = -1;
        if (isVowel(string.charAt(0)))
            return string + "yay";
        for (int i = 0; i < stringlength; i++) {
            if (isVowel(string.charAt(i))) {
                index = i;
                break;
            }
        }
        if (index == -1)
            return "-1";
        return string.substring(index) + string.substring(0, index) + "ay";
    }

    private static String translateSentence(String string) {
        String[] words = string.split(" ");
        String newSentence = "";
        boolean isCapitalFlag;
        boolean isDotFlag;
        for (String string2 : words) {
            isCapitalFlag = false;
            isDotFlag = false;
            if (Character.isUpperCase(string2.charAt(0))) {
                isCapitalFlag = true;
                string2 = string2.toLowerCase();
            }
            if (string2.charAt(string2.length() - 1) == '.') {
                string2 = string2.substring(0, string2.length() - 1);
                isDotFlag = true;
            }
            String translated = translateWord(string2);
            if (isCapitalFlag)
                translated = translated.substring(0, 1).toUpperCase() + translated.substring(1);
            if (isDotFlag)
                translated = translated + ".";
            newSentence += translated + " ";
        }
        return newSentence;
    }

    private static boolean validColor(String str) {
        Pattern pattern;
        String rgb_color_regex = "^rgb\\(\\s*(0|[1-9]\\d?|1\\d\\d?|2[0-4]\\d|25[0-5])%?\\s*,\\s*(0|[1-9]\\d?|1\\d\\d?|2[0-4]\\d|25[0-5])%?\\s*,\\s*(0|[1-9]\\d?|1\\d\\d?|2[0-4]\\d|25[0-5])%?\\s*\\)$";
        String rgba_color_regex = "^rgba\\(\\s*(0|[1-9]\\d?|1\\d\\d?|2[0-4]\\d|25[0-5])%?\\s*,\\s*(0|[1-9]\\d?|1\\d\\d?|2[0-4]\\d|25[0-5])%?\\s*,\\s*(0|[1-9]\\d?|1\\d\\d?|2[0-4]\\d|25[0-5])%?\\s*,\\s*((0.[1-9])|[01])\\s*\\)$";
        if (str.contains("rgba"))
            pattern = Pattern.compile(rgba_color_regex);
        else
            pattern = Pattern.compile(rgb_color_regex);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }

    private static String stripUrlParams(String url, String[] paramsToStrip) {
        if (!url.contains("?"))
            return url;
        String[] parts = url.split("\\?");
        StringBuilder sb = new StringBuilder(parts[0]);
        String[] params = parts[1].split("&");
        HashMap<String, String> map = new HashMap();
        for (String param : params) {
            String[] parm = param.split("=");
            map.put(parm[0], parm[1]);
        }

        LinkedHashSet<String> strip = new LinkedHashSet<>();

        if (paramsToStrip != null)
            strip.addAll(Arrays.asList(paramsToStrip));

        sb.append("?");
        int k = 1;

        for (String key : map.keySet()) {
            if (!strip.contains(key)) {
                if (k > 1)
                    sb.append("&");
                sb.append(key).append("=").append(map.get(key));
                k++;
            }
        }
        return sb.toString();
    }

    private static String[] getHashtags(String str) {
        int count = 3;
        while (str.indexOf(",") != -1)
            str = str.replace(",", "");
        if (str.split(" ").length < 3)
            count = str.split(" ").length;
        String[] toReturn = new String[count];
        for (int i = 0; i < count; i++) {
            String longest = Arrays.stream(str.split(" "))
                    .max(Comparator.comparingInt(String::length))
                    .orElse(null);
            str = str.replace(longest, "");
            toReturn[i] = "#" + longest.toLowerCase();
        }
        return toReturn;
    }

    private static int ulam(int n) {
        Vector<Integer> arr = new Vector<Integer>();

        arr.add(1);

        arr.add(2);

        for (int i = 3; i < 10000; i++) {

            int count = 0;

            for (int j = 0; j < arr.size() - 1; j++) {

                for (int k = j + 1; k < arr.size(); k++) {

                    if (arr.get(j) + arr.get(k) == i) {

                        count++;
                    }
                    if (count > 1)
                        break;
                }
                if (count > 1)
                    break;
            }

            if (count == 1) {
                arr.add(i);
            }
        }
        return arr.get(n) - 2;
    }

    private static String longestNonRepeatingString(String input) {
        Map<Character, Integer> visited = new HashMap<>();
        String output = "";
        for (int start = 0, end = 0; end < input.length(); end++) {
            char currChar = input.charAt(end);
            if (visited.containsKey(currChar)) {
                start = Math.max(visited.get(currChar) + 1, start);
            }
            if (output.length() < end - start + 1) {
                output = input.substring(start, end + 1);
            }
            visited.put(currChar, end);
        }
        return output;
    }

    private final static TreeMap<Integer, String> map = new TreeMap<Integer, String>();
    static {
        map.put(1000, "M");
        map.put(900, "CM");
        map.put(500, "D");
        map.put(400, "CD");
        map.put(100, "C");
        map.put(90, "XC");
        map.put(50, "L");
        map.put(40, "XL");
        map.put(10, "X");
        map.put(9, "IX");
        map.put(5, "V");
        map.put(4, "IV");
        map.put(1, "I");
    }

    private static String convertToRoman(int number) {
        int l = map.floorKey(number);
        if (number == l) {
            return map.get(number);
        }
        return map.get(l) + convertToRoman(number - l);
    }

    private static boolean formula(String str) {
        Vector<Integer> toCheck = new Vector<Integer>();
        String[] array = str.split("=");
        ScriptEngineManager mgr = new ScriptEngineManager();
        ScriptEngine engine = mgr.getEngineByExtension("js");
        for (String string : array) {
            try {
                toCheck.add((int) engine.eval(string));
            } catch (ScriptException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        for (int i = 0; i < toCheck.size() - 1; i++) {
            if (toCheck.get(i) != toCheck.get(i + 1))
                return false;
        }
        return true;
    }

    private static boolean palindromeDescendant(int num) {
        String ns = Integer.toString(num);
        String rs = "";
        for (int i = 0; i < ns.length(); i++)
            rs = ns.charAt(i) + rs;

        for (int i = 0; ns.length() >= 2; i++) {
            if (ns.equals(rs))
                return true;
            ns = "";
            for (int y = rs.length() - 1; y > 0; y = y - 2)
                ns += Character.getNumericValue(rs.charAt(y)) + Character.getNumericValue(rs.charAt(y - 1));
            rs = "";
            for (int x = 0; x < ns.length(); x++)
                rs = ns.charAt(x) + rs;
        }
        return false;
    }
}