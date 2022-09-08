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
        double penPrice = 100;
        double bookPrice = 200;
        double percentDiscount = 0.11f;
        double discount = (penPrice + bookPrice) * percentDiscount;
        double discountPrice = penPrice + bookPrice - discount;
        System.out.println("11% скидка при покупке ручки за " + penPrice + " руб и книги за " + bookPrice + " руб");
        System.out.println("Сумма скидки = " + discount + " руб");
        System.out.println("Стоимость товаров со скидкой = " + discountPrice + " руб");

        System.out.println("\n3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a      ");
        System.out.println("   J   a a  v   v  a a     ");
        System.out.println("J  J  aaaaa  V V  aaaaa    ");
        System.out.println(" JJ  a     a  V  a     a   ");

        System.out.println("\n4. Отображение min и max значений числовых типов данных");
        byte maxByte = 127;
        System.out.println("Первоначальное значение переменной типа Byte = " + maxByte);
        System.out.println("Значение переменной типа Byte после инкремента = " + ++maxByte);
        System.out.println("Значение переменной типа Byte после декремента = " + --maxByte);
        short maxShort = 32767;
        System.out.println("\nПервоначальное значение переменной типа Short = " + maxShort);
        System.out.println("Значение переменной типа Short после инкремента = " + ++maxShort);
        System.out.println("Значение переменной типа Short после декремента = " + --maxShort);
        int maxInt = 2147483647;
        System.out.println("\nПервоначальное значение переменной типа Int = " + maxInt);
        System.out.println("Значение переменной типа Int после инкремента = " + ++maxInt);
        System.out.println("Значение переменной типа Int после декремента = " + --maxInt);
        long maxLong = 9223372036854775807L;
        System.out.println("\nПервоначальное значение переменной типа Long = " + maxLong);
        System.out.println("Значение переменной типа Long после инкремента = " + ++maxLong);
        System.out.println("Значение переменной типа Long после декремента = " + --maxLong);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        System.out.println("Изменение значений переменных с помощью третьей переменной");
        System.out.println("num1 = " + num1 + "; \nnum2 = " + num2);
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Значения переменных после перестановки");
        System.out.println("num1 = " + num1 + "; \nnum2 = " + num2);
        System.out.println("\nИзменение значений переменных с помощью арифметических операций");
        System.out.println("num1 = " + num1 + "; \nnum2 = " + num2);
        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;
        System.out.println("Значения переменных после перестановки");
        System.out.println("num1 = " + num1 + "; \nnum2 = " + num2);
        System.out.println("\nИзменение значений переменных с помощью побитовой операции");
        System.out.println("num1 = " + num1 + "; \nnum2 = " + num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("Значения переменных после перестановки");
        System.out.println("num1 = " + num1 + "; \nnum2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char codeChar1 = 35;
        char codeChar2 = 38;
        char codeChar3 = 64;
        char codeChar4 = 94;
        char codeChar5 = 95;
        System.out.println("Коду " + (int) codeChar1 + " в таблице ASCII соответствует символ " + codeChar1);
        System.out.println("Коду " + (int) codeChar2 + " в таблице ASCII соответствует символ " + codeChar2);
        System.out.println("Коду " + (int) codeChar3 + " в таблице ASCII соответствует символ " + codeChar3);
        System.out.println("Коду " + (int) codeChar4 + " в таблице ASCII соответствует символ " + codeChar4);
        System.out.println("Коду " + (int) codeChar5 + " в таблице ASCII соответствует символ " + codeChar5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");
        int num = 123;
        System.out.println("Число " + num + " содержит:");
        System.out.println(num / 100 + " сотен");
        System.out.println(num / 10 % 10 + " десятков");
        System.out.println(num % 10 + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");
        char space = ' ';
        char slash = '/';
        char backSlash = '\\';
        char underlining = '_';
        char lBkt = '(';
        char rBkt = ')';
        System.out.println("" + space + space + space + space + slash + backSlash + space + space + space + space);
        System.out.println("" + space + space + space + slash + space + space + backSlash + space + space + space);
        System.out.println("" + space + space + slash + underlining + lBkt + space + rBkt + backSlash + space + space);
        System.out.println("" + space + slash + space + space + space + space + space + space + backSlash + space);
        System.out.println("" + slash + underlining + underlining + underlining + underlining + slash + backSlash + underlining + underlining + backSlash);
        
        System.out.println("\n9. Произведение и сумма цифр числа");
        num = 345;
        System.out.println("Сумма цифр числа " + num + " = " + (num / 100 + num / 10 % 10 + num % 10));
        System.out.println("Произведение цифр числа " + num + " = " + ((num / 100) * (num / 10 % 10) * (num % 10)));

        System.out.println("\n10. Преобразование секунд");
        int second = 86399;
        System.out.println(second / 3600 + ":" + (second % 3600) / 60 + ":" + (second % 60));
    }
}