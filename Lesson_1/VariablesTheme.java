public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Создание переменных и вывод их значений на консоль");
        byte core = 2;
        System.out.println("Количество ядер процессора: " + core);
        short ram = 2;
        System.out.println("Объем оперативной памяти: " + ram + " Gb");
        int freeSpace = 9853;
        System.out.println("Свободного места на накопителе: " + freeSpace + " mb");
        long storageCapacity = 250;
        System.out.println("Объем накопителя: " + storageCapacity + " Gb");
        float freqCpu = 2.3f;
        System.out.println("Частота ядер процессора: " + freqCpu + " GHz");
        double freeRam = 0.5;
        System.out.println("Свободно оперативной памяти: " + freeRam + " Gb");
        char sysDisk = 'C';
        System.out.println("Системный диск: " + sysDisk + ":\\");

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        double pricePen = 100;
        double priceBook = 200;
        double pctSale = 0.11f;
        double discount = Math.round((pricePen + priceBook) * pctSale);
        double cost = pricePen + priceBook - discount;
        System.out.println("11% скидка при покупке ручки за " + pricePen + " руб и книги за " + priceBook + " руб");
        System.out.println("Сумма скидки = " + discount + " руб");
        System.out.println("Стоимость товаров со скидкой = " + cost + " руб");

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a      ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a   ");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        System.out.println("Первоначальное значение переменной типа Byte = " + maxByte);
        maxByte += 1;
        System.out.println("Значение переменной типа Byte после инкремента = " + maxByte);
        maxByte -= 1;
        System.out.println("Значение переменной типа Byte после декремента = " + maxByte);
        short maxShort = 32767;
        System.out.println("\nПервоначальное значение переменной типа Short = " + maxShort);
        maxShort += 1;
        System.out.println("Значение переменной типа Short после инкремента = " + maxShort);
        maxShort -= 1;
        System.out.println("Значение переменной типа Short после декремента = " + maxShort);
        int maxInt = 2147483647;
        System.out.println("\nПервоначальное значение переменной типа Int = " + maxInt);
        maxInt += 1;
        System.out.println("Значение переменной типа Int после инкремента = " + maxInt);
        maxInt -= 1;
        System.out.println("Значение переменной типа Int после декремента = " + maxInt);
        long maxLong = 9223372036854775807L;
        System.out.println("\nПервоначальное значение переменной типа Long = " + maxLong);
        maxLong += 1;
        System.out.println("Значение переменной типа Long после инкремента = " + maxLong);
        maxLong -= 1;
        System.out.println("Значение переменной типа Long после декремента = " + maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Изменение значений переменных с помощью третьей переменной");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Значения переменных после перестановки");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("\nИзменение значений переменных с помощью арифметических операций");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Значения переменных после перестановки");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("\nИзменение значений переменных с помощью побитовой операции");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Значения переменных после перестановки");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char char1 = 35;
        char char2 = 38;
        char char3 = 64;
        char char4 = 94;
        char char5 = 95;
        System.out.println("Коду " + (int) char1 + " в таблице ASCII соответствует символ " + char1);
        System.out.println("Коду " + (int) char2 + " в таблице ASCII соответствует символ " + char2);
        System.out.println("Коду " + (int) char3 + " в таблице ASCII соответствует символ " + char3);
        System.out.println("Коду " + (int) char4 + " в таблице ASCII соответствует символ " + char4);
        System.out.println("Коду " + (int) char5 + " в таблице ASCII соответствует символ " + char5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int num = 123;
        System.out.println("Число " + num + " содержит:");
        System.out.println( num/100 + " сотен");
        System.out.println( num/10%10 + " десятков");
        System.out.println( num%10 + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        /*
        Правильно ли я понимаю, что эту задачу нужно решить с использованием примитивного типа данных char, 
        а не строки? Если да, то, как реализовать вывод char в строку? А пока вариант с использованием типа string
        */
        String space = " ";
        String slash = "/";
        String backSlash = "\\";
        String underlining = "_";
        String lBkt = "(";
        String rBkt = ")";
        System.out.println(space+space+space+space+slash+backSlash+space+space+space+space);
        System.out.println(space+space+space+slash+space+space+backSlash+space+space+space);
        System.out.println(space+space+slash+underlining+lBkt+space+rBkt+backSlash+space+space);
        System.out.println(space+slash+space+space+space+space+space+space+backSlash+space);
        System.out.println(slash+underlining+underlining+underlining+underlining+slash+backSlash+underlining+underlining+backSlash);

        System.out.println("\n9. Произведение и сумма цифр числа");
        num = 345;
        System.out.println("Сумма цифр числа " + num + " = " + (num/100 + num/10%10 + num%10));
        System.out.println("Произведение цифр числа " + num + " = " + ((num/100) * (num/10%10) * (num%10)));

        System.out.println("\n10. Преобразование секунд");
        int second = 86399;
        System.out.println(second/3600 + ":" + (second%3600)/60 + ":" + (second%3600)%60);
    }
}