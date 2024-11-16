import java.util.Random;
import java.util.Scanner;

public class LogicOperations{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = scanner.nextInt();
        // int[] array = new int[lenght];
        // System.out.println("Введите элементы массива");
        // for(int i = 0; i< lenght;i++){
        //     array[i] = scanner.nextInt();
        // }
        // Random random = new Random();

        // for(int i = 0; i<lenght; i++){
        //     array[i] = random.nextInt(100);
        // }

        // for(int i =0; i < lenght;i++){
        //     System.out.println("array[" +i+ "]=" +array[i]);
        // }
        // for(int arr : array){
        //     System.out.println(arr);
        // }
        // System.out.println(array[0]);
        // --1--
        // switch (a) {
        //     case 1:
        //         System.out.println("Не удов - депорт");
        //         break;
        //     case 2:
        //         System.out.println("Удов - не депорт");
        //         break;
        //     case 3:
        //         System.out.println("Удовлетворительно");
        //         break;
        //     case 4:
        //         System.out.println("Хорошо");
        //         break;
        //     case 5:
        //         System.out.println("Отлично");
        //         break;
        //     case 6:
        //         System.out.println("Динаху"); 
        //         break;
        //     default:

        //         break;
        // }

        // --2--

        // switch (a) {
        //     case 1,2,3,4,5:
        //         System.out.println("Доброй ночи");
        //         break;
        //     case 6,7,8,9,10,11:
        //         System.out.println("Доброй утра");
        //     case 12,13,14,15,16,17,18:
        //         System.out.println("Доброй обед");
        //         break;
        //     case 19,20,21,22,23,24:
        //         System.out.println("Добрый вечер");
        //     default:
        //         System.out.println("Число больше 24");
        //         break;
        // }

        // --3--
        // System.out.println("Выберите номер действия: \n 1)Возвести в квадрат \n 2) Вычислить корень \n 3) Вычислить синус числа \n 4) Вычислить косинус");
        // int x = scanner.nextInt();
        // int qvadrat = a*a;
        // double qoren = (Math.sqrt(a));
        // double sin = (Math.sin(a));
        // double cos = (Math.cos(a));

        // switch (x) {
        //     case 1:
        //         System.out.println("Квадрат числа: " + a + " Будет " + qvadrat);
        //         break;
        //     case 2:
        //         System.out.println("Корень числа: " + a + " Будет " + qoren);
        //         break;
        //     case 3:
        //         System.out.println("Синус числа: " + a + " Будет " + sin);
        //         break;
        //     case 4:
        //         System.out.println("Синус числа: " + a + " Будет " + cos);
        //         break;
        //     default:
        //         System.out.println("Число больше 4");
        //         break;
        // }

        // --4--
        // System.out.println("Введите букву в нижнем регистре: ");
        // char text = scanner.next().charAt(0);
        // {
        //     System.out.println(Character.toUpperCase(text));
        // }

        // --5--
        // int monthNumber = scanner.nextInt();        
        // if (monthNumber >= 1 && monthNumber <= 12) {
        //     int monthsLeft = 12 - monthNumber;
        //     System.out.println("Количество месяцев до конца года: " + monthsLeft);
        // } else {
        //     System.out.println("Некорректный номер месяца.");
        
        // }

        // --6--
        // System.out.println("Введите число: ");
        // int b = scanner.nextInt();
        // for (int i = 0; i < a; i++) {
        //     for (int j = 0; j < b; j++) {
        //         System.out.print("1 ");
        //     }
        //     System.out.println();
        // }

        // --7--
        // System.out.println("Введите целое число b:");
        // int b = scanner.nextInt();

        // System.out.println("Введите действительное число z:");
        // double z = scanner.nextDouble();
        // int x = a%b;
        // if (x == 0) {
        //     System.out.println(0);
        // } else {
        //     System.out.println(z/x);
        // }

        // --8--
        // int[] arr = {1, 3, 2, 6, 4, 8, 7};

        // boolean localmax = false;

        // for (int i = 1; i < arr.length - 1; i++) {
        //     if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && arr[i] % 2 == 0) {
        //         localmax = true;
        //         break;
        //     }
        // }

        // if (localmax) {
        //     System.out.println("Четный локальный максимум найден.");
        // } else {
        //     System.out.println("Четного локального максимума нет.");
        // }

        // --9--
        // int k = 0; 
        // int s = 0; 

        // for (int i = 0; i < a; i++) {
        //     int ai = scanner.nextInt(); 
        //     if (ai % 5 == 0 && ai % 7 != 0) { 
        //         k++; 
        //         s += ai;
        //     }
        // }

        // scanner.close();

        // System.out.println("Количество элементов, делящихся на 5 и не делящихся на 7: " + k);
        // System.out.println("Сумма таких элементов: " + s);

        // --10--
        // int s = 0;
        // for (int i = 0; i <= a; i++){
        //     s = (a + i)*2;

        //     if(a<0){
        //         System.out.println("Ошипка");
        //     }
        //     System.out.println(s);
        // }

        // --11--
        // int p = 0;
        // System.out.println("Второе число");
        // int b = scanner.nextInt();
        //     for (int i = 0; i <= a; i++){
        //         if(a%7==0){
        //         p = i * a;
        //         }
        //     }
        //     System.out.println(p);

        // --13--
        // System.out.print("Введите значение n: ");
        // int n = scanner.nextInt();

        // double power = Math.pow(a, n);
        // System.out.println("(a) a^n = " + power);

        // // (б) a(a+1)(a+2)...(a+n-1)
        // double product = 1;
        // for (int i = 0; i < n; i++) {
        //     product *= (a + i);
        // }
        // System.out.println("(б) a(a+1)...(a+n-1) = " + product);

        // // (в) 1/a + 1/(a(a+1)) + ... + 1/(a(a+1)...(a+n))
        // double sum = 0;
        // double denominator = 1;
        // for (int i = 0; i < n; i++) {
        //     denominator *= (a + i);
        //     sum += 1 / denominator;
        // }
        // System.out.println("(в) Сумма = " + sum);


        // --12--
        // double resultA;
        // if (a >= -2 && a < 2) {
        //     resultA = Math.pow(a, 2);
        // } else {
        //     resultA = 4;
        // }

        // double resultB;
        // if (a <= 2) {
        //     resultB = Math.pow(a, 2) + 4 * a + 5;
        // } else {
        //     resultB = 1.0 / (Math.pow(a, 2) + 4 * a + 5);
        // }

        // System.out.println("Результат f(a) для а): " + resultA);
        // System.out.println("Результат f(a) для б): " + resultB);

    }
        // -14--
        // System.out.println("Введите i: ");
        // int i = scanner.nextInt();

        // System.out.println("Введите n: ");
        // int n = scanner.nextInt();
        
        // double sum = 0;
        // for (int j = 1; j < i; j++) {
        //     System.out.println("Введите число: ");
        //     double number = scanner.nextDouble();
        //     sum += number;
        // }

        // double average = sum / (n - 1);

        // System.out.println("Среднее арифметическое всех чисел кроме последнего:" + average);

    }
