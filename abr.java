import java.util.Scanner;

public class abr {
    public static void main(String[] args) {

        // --1--
        // int a = 5;
        // int b = 500;
        // System.out.println(a+b);

        // --2--
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите первое вещественное число: ");
        // double num1 = scanner.nextDouble();
        // System.out.println("Введите второе вещественное число: ");
        // double num2 = scanner.nextDouble();

        // if(num1 == num2) {
        //     System.out.println("Числа равны");
        // } else {
        //     System.out.println("Числа не равны");
        // }

        // --3--
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите первое вещественное число: ");
        // double num1 = scanner.nextDouble();
        // System.out.println("Введите второе вещественное число: ");
        // double num2 = scanner.nextDouble();

        // if (num1 <= num2) {
        //     num1 = 0;
        //     System.out.println("СтарыКОК" + num1);
        // }else {
        //     System.out.println("Cтарыбох");
        // }

        // --4--
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите первое число");
        // double num1 = scanner.nextDouble();
        // System.out.println("Введите второе число");
        // double num2 = scanner.nextDouble();  
        // System.out.println("Введите третье число");
        // double num3 = scanner.nextDouble();
        
        // if(num1>=0) {
        //     System.out.println(num1 + " В кв число будет - " + num1*num1);
        // } else {
        //     System.out.println(" Число отрицательное");
        // }
        // if(num2>=0) {
        //     System.out.println(num2 + " в кв число будет" +num2*num2);
        // } else {
        //     System.out.println(" Число отрицательное");
        // }
        // if(num3>=0) {
        //     System.out.println(num3 + "в кв число будет" + num3*num3);
        // } else {
        //     System.out.println(" Число отрицательное");
        // }


        // --5--
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите первое число");
        // int num = scanner.nextInt();
        // int sum = 0;
        // while (num != 0) {
        //     sum += num % 10;
        //     num = num /10;
        // }
        // System.out.println(sum);

        // --6--
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите первое число");
        // int num1 = scanner.nextInt();
        // System.out.println("Введите второе число");
        // int num2 = scanner.nextInt();  
        // System.out.println("Введите третье число");
        // int num3 = scanner.nextInt();
        
        // System.out.println("Цифры принадлежащие промежутку 1-3");

        // if (num1 >= 1 && num1 <=3){
        //     System.out.println(num1);
        // }
        // if (num2 >= 1 && num2 <=3){
        //     System.out.println(num2);
        // }
        // if (num3 >= 1 && num3 <=3){
        //     System.out.println(num3);
        // }


        // --7--
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Введите число");
        // int num1 = scanner.nextInt();
        
        // for (int i = 1; i <= 9; i++) {
        //     int result = i * num1;
        //     System.out.printf("%d x %d = %d%n", i, num1, result);
        // }

        // --8--

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Введите четыре действительных числа (a, b, c, d):");

        // System.out.println("Введите число 1 :");
        // int a = scanner.nextInt();
        // System.out.println("Введите число 2 :");
        // int b = scanner.nextInt();
        // System.out.println("Введите число 3 :");
        // int c = scanner.nextInt();
        // System.out.println("Введите число 4 :");
        // int d = scanner.nextInt();

        // if (a <= b && b <= c && c <= d) {
        //     int max = a;
        //     if (b > max) max = b;
        //     if (c > max) max = c;
        //     if (d > max) max = d;
        //     a = max;
        //     b = max;
        //     c = max;
        //     d = max;
        // } else if (a > b && b > c && c > d) {
        // } else {
        //     a = a * a;
        //     b = b * b;
        //     c = c * c;
        //     d = d * d;
        // }

        // System.out.println("Результаты:");
        // System.out.println("a = " + a);
        // System.out.println("b = " + b);
        // System.out.println("c = " + c);
        // System.out.println("d = " + d);

        // --9--
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Введите четыре действительных числа (a, b, c, d):");

        // System.out.println("Введите число 1 :");
        // int a = scanner.nextInt();
        // System.out.println("Введите число 2 :");
        // int b = scanner.nextInt();
        // System.out.println("Введите число 3 :");
        // int c = scanner.nextInt();

        // if (a+b>=c && a+c>=b && b+c>=a) {
        //     System.out.println("Треугольник правильный");
        //     if(a*a<(b*b + c*c)){
        //     System.out.println("Он остроугольный");
        //     }else{
        //         System.out.println("Он не остроугольный");
        //     }
        // } else {
        //     System.out.println("Треугольник неправильный");
        // }

        // --10--
        
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Введите четыре действительных числа (a, b, c, d):");

        // System.out.println("Введите число 1 :");
        // int x = scanner.nextInt();
        // System.out.println("Введите число 2 :");
        // int y = scanner.nextInt();
        // System.out.println("Введите число 3 :");
        // int z = scanner.nextInt();
        // if (x + y + z < 1) {
        //     if (x <= y && x <= z) {
        //         x = (y + z) / 2;
        //     } else if (y <= x && y <= z) {
        //         y = (x + z) / 2;
        //     } else {
        //         z = (x + y) / 2;
        //     }
        // } else {
        //     if (x <= y) {
        //         x = (y + z) / 2;
        //     } else {
        //         y = (x + z) / 2;
        //     }
        // }
        // System.out.println("Результат после замены:");
        // System.out.println("x = " + x);
        // System.out.println("y = " + y);
        // System.out.println("z = " + z);


        // --11--

        // skip



        // --12--
    
        // Scanner scanner = new Scanner(System.in);

        // // Просим пользователя ввести число
        // System.out.println("Введи любое целое положительное число:");
        // int number = scanner.nextInt();

        // if (number <= 0) {
        //     System.out.println("Попробуй снова!");
        //     return; 
        // }

        // String binary = ""; 

        // // Пока число больше 0
        // while (number > 0) {
        //     int qotaq = number % 2; 
        //     binary = qotaq + binary; 
        //     number = number / 2; 
        // }

        // // Выводим результат
        // System.out.println("Двоичное представление твоего числа: " + binary);

        // --13--
        Scanner scanner = new Scanner(System.in);

        System.out.println("Вводи целые числа");

        // Начинаем ввод
        System.out.print("Введите первое число: ");
        int previousNumber = scanner.nextInt(); 

        while (true) {
            System.out.print("Введите следующее число: ");
            int currentNumber = scanner.nextInt(); 

            if (currentNumber < previousNumber) {
                System.out.println("Ввод завершён, потому что " + currentNumber + " меньше " + previousNumber + ".");
                break;
            }

            previousNumber = currentNumber;
        }

        System.out.println("гыг");
    }   
}
