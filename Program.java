
public class Program {
    
    public static void main(String[] args) {
        
        // ЗАДАЧА 1: Работа с числами
        System.out.println("ЗАДАЧА 1: Сравнение и вычисления с числами");
        
        int a = 10;    // первое число
        int b = 5;     // второе число
        
        // Сравниваем числа
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
        
        // Выполняем математические операции
        int sum = a + b;           // сложение
        int difference = a - b;    // вычитание
        int multiplication = a * b; // умножение
        int division = a / b;      // деление
        
        System.out.println("Сложение: " + a + " + " + b + " = " + sum);
        System.out.println("Вычитание: " + a + " - " + b + " = " + difference);
        System.out.println("Умножение: " + a + " * " + b + " = " + multiplication);
        System.out.println("Деление: " + a + " / " + b + " = " + division);
        
        System.out.println(); // пустая строка для красоты
        
        
        // ЗАДАЧА 2: Сравнение строк
        System.out.println("ЗАДАЧА 2: Сравнение строк");
        
        String str1 = "Привет";
        String str2 = "Привет";
        
        // Сравниваем строки
        if (str1.equals(str2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        
        System.out.println(); // пустая строка для красоты
        
        
        // ЗАДАЧА 3: Поиск четных чисел в массиве
        System.out.println("ЗАДАЧА 3: Четные числа в массиве");
        
        // Создаем массив чисел
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        System.out.print("Четные числа: ");
        
        // Перебираем все числа в массиве
        for (int i = 0; i < numbers.length; i++) {
            int currentNumber = numbers[i];
            
            // Проверяем, четное ли число (делится на 2 без остатка)
            if (currentNumber % 2 == 0) {
                System.out.print(currentNumber + " ");
            }
        }
        
    }
}