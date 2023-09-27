
//		/*
//		 * КОНСОЛЬНЫЙ ВВОД/ВЫВОД в JAVA
//		 */
//		// Вывод в консоль
//		// Для создания потока вывода в класс System определен объект out. В этом
//		// объекте определен метод println, который позволяет вывести на консоль
//		// некоторое значение с последующим переводом курсора консоли на следующую
//		// строку. Например:
//		// System.out.println("Hi world");
//		// System.out.println("Bye world");
//		// В метод println передается любое значение, как правило, строка, которое надо
//		// вывести на консоль. И в данном случае мы получим следующий вывод:
//		// Hello world!
//		// Bye world...

//		// При необходимости можно и не переводить курсор на следующую строку. В этом
//		// случае можно использовать метод System.out.print(), который аналогичен
//		// println за тем исключением, что не осуществляет перевода на следующую строку.
//		// System.out.print("Hello world!");
//		// System.out.print("Bye world...");
//		// Консольный вывод данной программы:
//		// Hello world!Bye world...

//		// Нередко необходимо подставлять в строку какие-нибудь данные. Например, у нас
//		// есть два числа, и мы хотим вывести их значения на экран. В этом случае мы
//		// можем, например, написать так:
//		// int x = 5;
//		// int y = 6;
//		// System.out.println("x=" + x + "; y=" + y);
//		// Консольный вывод программы:
//		// x=5; y=6

//		// Но в Java есть также функция для форматированного вывода, унаследованная от
//		// языка С: System.out.printf(). С ее помощью мы можем переписать предыдущий
//		// пример следующим образом:
//		// int x = 5;
//		// int y = 6;
//		// System.out.printf("x=%d; y=%d", x, y);
//		// В данном случае символы %d обозначают спецификатор, вместо которого
//		// подставляет один из аргументов. Спецификаторов и соответствующих им
//		// аргументов может быть множество. В данном случае у нас только два аргумента,
//		// поэтому вместо первого %d подставляет значение переменной x, а вместо второго
//		// - значение переменной y. Сама буква d означает, что данный спецификатор будет
//		// использоваться для вывода целочисленных значений.

//		// Кроме спецификатора %d мы можем использовать еще ряд спецификаторов для
//		// других типов данных:

//		// %x: для вывода шестнадцатеричных чисел

//		// %f: для вывода чисел с плавающей точкой

//		// %e: для вывода чисел в экспоненциальной форме, например, 1.3e+01

//		// %c: для вывода одиночного символа

//		// %s: для вывода строковых значений

//		// Например:
//		// String name = "Fox";
//		// int age = 30;
//		// float height = 1.7f;
//		// System.out.printf("Name: %s Age: %d Height %2f \n", name, age, height);
//		// Вывод на консоль:
//		// Name: Tom Age: 30 Height: 1,70
//	}
//}

/*
 * Ввод с консоли
 */
// Для получения ввода с консоли в классе System определен объект in. Однако
// непосредственно через объект System.in не очень удобно работать, поэтому, как
// правило, используют класс Scanner, который, в свою очередь использует
// System.in. Например, напишем маленькую программу, которая осуществляет ввод
// чисел:
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// Scanner in = new Scanner(System.in);
		// System.out.print("Input a number: ");
		// int num = in.nextInt();
		// System.out.printf("Your number: %d \n", num);
		// in.close();
		// Так как класс Scanner находится в пакете java.util, то мы вначале его
		// импортируем с помощью инструкции import java.util.Scanner.

		// Для создания самого объекта Scanner в его конструктор передается объект
		// System.in. После этого мы можем получать вводимые значения. Например, в
		// данном случае вначале выводим приглашение к вводу и затем получаем вводимое
		// число в переменную num.

		// Чтобы получить введенное число, используется метод in.nextInt();, который
		// возвращает введенное с клавиатуры целочисленное значение.

		// Пример работы программы:

		// Input a number: 5
		// Your number: 5

		// Класс Scanner имеет еще ряд методов, которые позволяют получить введенные
		// пользователем значения:

		// next(): считывает введенную строку до первого пробела

		// nextLine(): считывает всю введенную строку

		// nextInt(): считывает введенное число int

		// nextDouble(): считывает введенное число double

		// nextBoolean(): считывает значение boolean

		// nextByte(): считывает введенное число byte

		// nextFloat(): считывает введенное число float

		// nextShort(): считывает введенное число short

		// То есть для ввода значений каждого примитивного типа в классе Scanner
		// определен свой метод.

		// Например, создадим программу для ввода информации о человеке:
		Scanner in = new Scanner(System.in);
		System.out.print("Input name: ");
		String name = in.nextLine();
		System.out.print("Input age: ");
		int age = in.nextInt();
		System.out.print("Input height: ");
		float height = in.nextFloat();
		System.out.printf("Name: %s Age: %d Height %2 \n", name, age, height);
	}
}
