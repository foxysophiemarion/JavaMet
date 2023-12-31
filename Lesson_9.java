/*ЦИКЛЫ */
//Еще одним видом управляющих конструкций являются циклы. Циклы позволяют в зависимости от определенных условий выполнять определенное действие множество раз. В языке Java есть следующие виды циклов:

//for

//while

//do...while

//Цикл for
//Цикл for имеет следующее формальное определение:
//for ([инициализация счетчика]; [условие]; [изменение счетчика])
//{
//    // действия
//}

public class Lesson_9 {
	public static void main(String[] args) {
		// for (int i = 1; i < 9; i++) {
		// System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
		// }
		// Первая часть объявления цикла - int i = 1 создает и инициализирует счетчик i.
		// Счетчик необязательно должен представлять тип int. Это может быть и любой
		// другой числовой тип, например, float. Перед выполнением цикла значение
		// счетчика будет равно 1. В данном случае это то же самое, что и объявление
		// переменной.

		// Вторая часть - условие, при котором будет выполняться цикл. В данном случае
		// цикл будет выполняться, пока i не достигнет 9.

		// И третья часть - приращение счетчика на единицу. Опять же нам необязательно
		// увеличивать на единицу. Можно уменьшать: i--.

		// В итоге блок цикла сработает 8 раз, пока значение i не станет равным 9. И
		// каждый раз это значение будет увеличиваться на 1.

		// Нам необязательно указывать все условия при объявлении цикла. Например, мы
		// можем написать так:
		// int i = 1;
		// for (;;) {
		// System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
		// }
		// Определение цикла осталось тем же, только теперь блоки в определении у нас
		// пустые: for (; ;). Теперь нет инициализированной переменной-счетчика, нет
		// условия, поэтому цикл будет работать вечно - бесконечный цикл.

		// Либо можно опустить ряд блоков:
		// int i = 1;
		// for (; i < 9;) {
		// System.out.printf("Квадрат числа %d равен %d \n", i, i * i);
		// i++;
		// }
		// Этот пример эквивалентен первому примеру: у нас также есть счетчик, только
		// создан он вне цикла. У нас есть условие выполнения цикла. И есть приращение
		// счетчика уже в самом блоке for.

		// Цикл for может определять сразу несколько переменных и управлять ими:
		// int n = 30;
		// for (int i = 0, j = n - 1; i < j; i++, j--) {
		// System.out.println(i * j);
		// }

		/* Цикл do */
		// Цикл do сначала выполняет код цикла, а потом проверяет условие в инструкции
		// while. И пока это условие истинно, цикл повторяется.
		// Например:
		// int j = 7;
		// do {
		// System.out.println(j);
		// j--;
		// } while (j > 0);
		// В данном случае код цикла сработает 7 раз, пока j не окажется равным нулю.
		// Важно отметить, что цикл do гарантирует хотя бы однократное выполнение
		// действий, даже если условие в инструкции while не будет истинно. Так, мы
		// можем написать:
		// int j = -1;
		// do {
		// System.out.println(j);
		// j--;
		// } while (j > 0);
		// Хотя переменная j изначально меньше 0, цикл все равно один раз выполнится.

		/* Цикл while */
		// Цикл while сразу проверяет истинность некоторого условия, и если условие
		// истинно, то код цикла выполняется:
		// int j = 6;
		// while (j > 0) {
		// System.out.println(j);
		// j--;
		// }

		/* Операторы continue и break */
		// Оператор break позволяет выйти из цикла в любой его момент, даже если цикл не
		// закончил свою работу:

		// Например:
		// for (int i = 0; i < 10; i++) {
		// if (i == 5)
		// break;
		// System.out.println(i);
		// }
		// Когда счетчик станет равным 5, сработает оператор break, и цикл завершится.

		// Теперь сделаем так, чтобы если число равно 5, цикл не завершался, а просто
		// переходил к следующей итерации. Для этого используем оператор continue:

		// for (int i = 0; i < 10; i++) {
		// if (i == 5)
		// continue;
		// System.out.println(i);
		// }
		// Теперь сделаем так, чтобы если число равно 5, цикл не завершался, а просто
		// переходил к следующей итерации. Для этого используем оператор continue:
	}
}
