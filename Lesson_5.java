/*
 * УСЛОВНЫЕ ВЫРАЖЕНИЯ
 */
//Условные выражения представляют собой некоторое условие и возвращают значение типа boolean, то есть значение true (если условие истинно), или значение false (если условие ложно). К условным выражениям относятся операции сравнения и логические операции.

/*Операции сравнения */

//В операциях сравнения сравниваются два операнда, и возвращается значение типа boolean - true, если выражение верно, и false, если выражение неверно.

public class Lesson_5 {
	public static void main(String[] args) {
		// ==
		// сравнивает два операнда на равенство и возвращает true (если операнды равны)
		// и false (если операнды не равны)
		// int a = 10;
		// int b = 4;
		// boolean c = a == b; // false
		// boolean d = a == 10; // true
		// System.out.println(c);
		// System.out.println(d);

		// !=
		// сравнивает два операнда и возвращает true, если операнды НЕ равны, и false,
		// если операнды равны
		// int a = 10;
		// int b = 4;
		// boolean c = a != b;
		// boolean d = a != 10;
		// System.out.println(c); // true
		// System.out.println(d); // false

		// < (меньше чем)
		// Возвращает true, если первый операнд меньше второго, иначе возвращает false
		// int a = 10;
		// int b = 4;
		// boolean c = a < b;
		// System.out.println(c); //false

		// > (больше чем)
		// Возвращает true, если первый операнд больше второго, иначе возвращает false
		// int a = 10;
		// int b = 4;
		// boolean c = a > b;
		// System.out.println(c); // true

		// >= (больше или равно)
		// Возвращает true, если первый операнд больше второго или равен второму, иначе
		// возвращает false
		// boolean c = 10 >= 10; // true
		// boolean b = 10 >= 4; // true
		// boolean d = 10 >= 20; // false
		// System.out.println(c);
		// System.out.println(b);
		// System.out.println(d);

		// <= (меньше или равно)
		// Возвращает true, если первый операнд меньше второго или равен второму, иначе
		// возвращает false
		// boolean c = 10 <= 10; // true
		// boolean b = 10 <= 4; // false
		// boolean d = 10 <= 20; // true
		// System.out.println(c);
		// System.out.println(b);
		// System.out.println(d);

		/* Логические операции */
		// Также в Java есть логические операции, которые также представляют условие и
		// возвращают true или false и обычно объединяют несколько операций сравнения. К
		// логическим операциям относят следующие:

		// |
		// a1=a|b; (a1 равно true, если либо a, либо b (либо и a, и b) равны true, иначе
		// a3 будет равно false)
		// boolean a1 = (6 > 6) | (6 < 6);

		// ||
		// a2=a||b; (a2 равно true, если либо a, либо b (либо и a, и b) равны true,
		// иначе a3 будет равно false)
		// boolean a2 = (5 > 6) || (4 > 6);

		// &
		// a3=a&b; (a3 равно true, если и a, и b равны true, иначе a3 будет равно false)
		// boolean a3 = (5 > 6) & (4 < 6);

		// &&
		// a4=a&&b; (a4 равно true, если и a, и b равны true, иначе a4 будет равно
		// false)
		// boolean a4 = (50 > 6) && (4 / 2 < 3);

		// ^
		// a5{a6}=a^b; (a5{a6} равно true, если либо a, либо b (но не одновременно)
		// равны true,
		// иначе a5{a6} будет равно false)
		// boolean a5 = (5 < 6) ^ (4 > 6);
		// boolean a6 = (50 > 6) ^ (4 / 2 < 3);

		// !
		// c=!a4; (c равно true, если b равно false, иначе c будет равно false)
		// boolean c = !a4;
		// System.out.println(a1); // false
		// System.out.println(a2); // false
		// System.out.println(a3); // false
		// System.out.println(a4); // true
		// System.out.println(a5); // true
		// System.out.println(a6); // false
		// System.out.println(c); // false

		// Здесь у нас две пары операций | и || (а также & и &&) выполняют похожие
		// действия, однако же они не равнозначны.

		// Выражение c=a|b; будет вычислять сначала оба значения - a и b и на их основе
		// выводить результат.

		// В выражении же c=a||b; вначале будет вычисляться значение a, и если оно равно
		// true, то вычисление значения b уже смысла не имеет, так как у нас в любом
		// случае уже c будет равно true. Значение b будет вычисляться только в том
		// случае, если a равно false

		// То же самое касается пары операций &/&&. В выражении c=a&b; будут вычисляться
		// оба значения - a и b.

		// В выражении же c=a&&b; сначала будет вычисляться значение a, и если оно равно
		// false, то вычисление значения b уже не имеет смысла, так как значение c в
		// любом случае равно false. Значение b будет вычисляться только в том случае,
		// если a равно true

		// Таким образом, операции || и && более удобны в вычислениях, позволяя
		// сократить время на вычисление значения выражения и тем самым повышая
		// производительность. А операции | и & больше подходят для выполнения
		// поразрядных операций над числами.
	}
}
