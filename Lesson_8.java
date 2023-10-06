
/*
 * УСЛОВНЫЕ КОНСТРУКЦИИ
 */

//В языке Java используются следующие условные конструкции: if..else и switch..case
import java.util.Scanner;

public class Lesson_8 {
	public static void main(String[] args) {
		// Выражение if/else проверяет истинность некоторого условия и в зависимости от
		// результатов проверки выполняет определенный код:
		// при сравнении чисел мы можем насчитать три состояния: первое число больше
		// второго, первое число меньше второго и числа равны. С помощью выражения else
		// if, мы можем обрабатывать дополнительные условия:
		// try (
		// Scanner in = new Scanner(System.in)) {
		// System.out.print("Введите первое число: ");
		// int num1 = in.nextInt();
		// System.out.print("Введите второе число: ");
		// int num2 = in.nextInt();
		// if (num1 > num2) {
		// System.out.println("Первое число больше второго");
		// } else if (num1 < num2) {
		// System.out.println("Первое число меньше второго");
		// } else {
		// System.out.println("Числа равны");
		// }
		// }

		// Также мы можем соединить сразу несколько условий, используя логические
		// операторы:
		// int num1 = 8;
		// int num2 = 6;
		// if (num1 > num2 && num1 > 7) {
		// System.out.println("Первое число больше второго и больше 7");
		// }

		/*
		 * Конструкция switch
		 */
		// Конструкция switch/case аналогична конструкции if/else, так как позволяет
		// обработать сразу несколько условий:

		// Scanner in = new Scanner(System.in);
		// System.out.print("Введите число: ");
		// int num = in.nextInt();
		// switch (num) {
		// case 1:
		// System.out.println("Число " + num + " равно 1");
		// break;
		// case 8:
		// System.out.println("Число " + num + " равно 8");
		// break;
		// case 9:
		// System.out.println("Число " + num + " равно 9");
		// break;
		// default:
		// System.out.println("Число " + num + " не равно 1, 8, 9");
		// }
		// После ключевого слова switch в скобках идет сравниваемое выражение. Значение
		// этого выражения последовательно сравнивается со значениями, помещенными после
		// операторов сase. И если совпадение найдено, то будет выполняет
		// соответствующий блок сase.

		// Также мы можем определить одно действие сразу для нескольких блоков case
		// подряд:
		// int num = 5;
		// int output = 0;
		// switch (num) {
		// case 1:
		// output = 3;
		// break;
		// case 2:
		// case 3:
		// case 4:
		// output = 6;
		// break;
		// case 5:
		// output = 12;
		// break;
		// default:
		// output = 24;
		// }
		// System.out.println(output);

		/* Тернарная операция */
		// Тернарную операция имеет следующий синтаксис: [первый операнд - условие] ?
		// [второй операнд] : [третий операнд]. Таким образом, в этой операции участвуют
		// сразу три операнда. В зависимости от условия тернарная операция возвращает
		// второй или третий операнд: если условие равно true, то возвращается второй
		// операнд; если условие равно false, то третий. Например:
		// int x = 3;
		// int y = 2;
		// int z = x < y ? (x + y) : (x - y);
		// System.out.println(z);
		// Здесь результатом тернарной операции является переменная z. Сначала
		// проверяется условие x<y. И если оно соблюдается, то z будет равно второму
		// операнду - (x+y), иначе z будет равно третьему операнду.

		// Scanner in = new Scanner(System.in);
		// System.out.print("Введите сумму вклада: ");
		// float sum = in.nextInt();
		// if (sum < 100) {
		// sum += sum * 0.05;
		// } else if (sum >= 100 && sum <= 200) {
		// sum += sum * 0.07;
		// } else {
		// sum += sum * 0.1;
		// }
		// System.out.printf("Сумму вклада после начисления процентов: %f", sum);
		// in.close();

		Scanner in = new Scanner(System.in);
		System.out.println("Введите первое число: ");
		int num1 = in.nextInt();
		System.out.println("Введите второе число: ");
		int num2 = in.nextInt();
		System.out.println("Введите номер операции: 1.Сложение 2.Вычитание 3.Умножение");
		int operation = in.nextInt();
		int result = 0;
		switch (operation) {
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			default:
				System.out.println("Неизвестная операция");
		}
		if (operation >= 1 && operation <= 3) {
			System.out.printf("Результат операции: %d", result);
		}
		in.close();

		// int a = 5;
		// switch (a) {
		// case 4:
		// a++;
		// case 5:
		// a++;
		// case 6:
		// case 7:
		// case 8:
		// a++;
		// break;
		// case 9:
		// a++;
		// break;
		// default:
		// a++;
		// }
		// System.out.println(a);
	}
}
