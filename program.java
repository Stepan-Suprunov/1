/**
 * program
 */                              // так обозначается комментарий

 // Структура простой программы
public class program {
    public static void main(String[] args) {
        System.out.println("bye world");
    }
    
}


// типы данных делятся на ссылочные и примитивные
// примитивные: boolean, int, short, long, float, double, Char и так далее


// создание переменной
String s = "rhjgfb";
String s = null;


// МАССИВЫ

//одномерные

int[] arr = new int[10];
System.out.println(arr.length);  // 10

arr = new int[] {1, 2, 3, 4, 5};
System.out.println(arr.length);  // 15

//многомерные

int[] arr[] = new int[3][5];


// Получение данных из терминала

import java.until.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner  iScanner = new Scanner(System.in);
        System.out.printf("name ");
        String name = iScanner.nextLine();
        System.out.printf("Привет, %s!", name);

        // Ввод примитивов
        java.util.Scanner  iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        int y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f", x, y, x + y);

        iScanner.close();
    }
}