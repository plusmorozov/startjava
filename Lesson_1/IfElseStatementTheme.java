public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        int age = 35;
        if (age > 20) {
            System.out.println("Возраст больше 20 лет");
        } else {
            System.out.println("Возраст меньше, либо равен 20 годам");
        }

        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("isMaleGender = false, !isMaleGender = true, условие true = true выполняется");
        } else {
            System.out.println("isMaleGender = true, !isMaleGender = false, условие true = true не выполняется");
        }
        float growth = 1.5f;
        if (growth < 1.8) {
            System.out.println("Рост меньше 180 см");
        } else {
            System.out.println("Рост больше или равен 180 см");
        }
        char firstLetterName = "Maxim".charAt(0);
        if (firstLetterName == 'M') {
            System.out.println ("Первая буква имени - M");
        } else if (firstLetterName == 'I') {
            System.out.println ("Первая буква имени - I");
        } else {
            System.out.println ("Первая буква имени не M и не I");
        }

        System.out.println("\n2. Поиск max и min числа");
        int num1 = 10;
        int num2 = 20;
        if (num1 < num2) {
            System.out.println("Из двух чисел " + num1 + " и " + num2 + ", минимальное = " + num1 + ", максимальное = " + num2);
        } else if (num1 > num2) {
            System.out.println("Из двух чисел " + num1 + " и " + num2 + ", минимальное = " + num2 + ", максимальное = " + num1);
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        }

        System.out.println("\n3. Работа с числом");
        int num3 = 16;
        if (num3 != 0) {
            if ((num3 % 2 == 0) & (num3 > 0)) {
                System.out.println("Число " + num3 + " - положительное, четное");
            } else if ((num3 % 2 == 0) & (num3 < 0)) {
                System.out.println("Число " + num3 + " - отрицательное, четное");
            } else if ((num3 % 2 != 0) & (num3 > 0)) {
                System.out.println("Число " + num3 + " - положительное, нечетное");
            } else {
                System.out.println("Число " + num3 + " - отрицательное, нечетное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 273;
        int num5 = 175;
        boolean isEqualNumber = false;
        if (num4 / 100 == num5 / 100) {
            System.out.println("В первом разряде чисел " + num4 + " и " + num5 + " находятся одинаковые цифры: " + num4 / 100);
            isEqualNumber = true;
        }
        if (num4 / 10 % 10 == num5 / 10 % 10) {
            System.out.println("Во втором разряде чисел " + num4 + " и " + num5 + " находятся одинаковые цифры: " + num4 / 10 % 10);
            isEqualNumber = true;
        }
        if (num4 % 10 == num5 % 10) {
            System.out.println("В третьем разряде чисел " + num4 + " и " + num5 + " находятся одинаковые цифры: " + num4 % 10);
            isEqualNumber = true;
        }
        if (!isEqualNumber) {
            System.out.println("Одинаковых цифр в соответствующих разрядах чисел " + num4 + " и " + num5 + " нет");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char codeChar = '\u0057';
        boolean isSpecChar = true;
        if ((codeChar > '\u0040') & (codeChar < '\u005B')) {
            System.out.println(codeChar + " - большая буква");
            isSpecChar = false;
        }
        if ((codeChar > '\u0060') & (codeChar < '\u007B')) {
            System.out.println(codeChar + " - маленькая буква");
            isSpecChar = false;
        }
        if ((codeChar > '\u002F') & (codeChar < '\u003A')) {
            System.out.println(codeChar + " - цифра");
            isSpecChar = false;
        }
        if (isSpecChar) {
            System.out.println(codeChar + " - специальный символ");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        if (deposit < 100000) {
            System.out.println("Сумма вклада = " + deposit + ", начисленный процент = " + deposit * 0.05 + ", итоговая сумма = " + deposit * 1.05);
        }        
        if ((deposit > 100000) & (deposit < 300000)) {
            System.out.println("Сумма вклада = " + deposit + ", начисленный процент = " + deposit * 0.07 + ", итоговая сумма = " + deposit * 1.07);
        }
        if (deposit >= 300000) {
            System.out.println("Сумма вклада = " + deposit + ", начисленный процент = " + deposit * 0.1 + ", итоговая сумма = " + deposit * 1.1);
        }

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProg = 91;
        int gradeHisory = 0;
        int gradeProg = 0;
        if (percentHistory <= 60) {
            gradeHisory = 2;
        }
        if (percentProg <= 60) {
            gradeProg = 2;
        }
        if (percentHistory > 60 && percentHistory < 74) {
            gradeHisory = 3;
        }
        if (percentProg > 60 && percentProg < 74) {
            gradeProg = 3;
        }
        if (percentHistory > 73 && percentHistory < 92) {
            gradeHisory = 4;
        }
        if (percentProg > 73 && percentProg < 92) {
            gradeProg = 4;
        }
        if (percentHistory > 91) {
            gradeHisory = 5;
        }
        if (percentProg > 91) {
            gradeProg = 5;
        }
        System.out.println(gradeHisory + " История" + "\n" + gradeProg + " Программирование");
        System.out.println("Средний бал оценок по предметам " + (gradeHisory + gradeProg) / 2);
        System.out.println("Средний процент по предметам " + (percentHistory + percentProg) / 2);

        System.out.println("\n8. Расчет прибыли");
        int rentPrice = 5000;
        int proceed = 13000;
        int costPrice = 9000;
        int profit = (proceed - costPrice - rentPrice) * 12;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profit + " руб.");
        }

        /*
        Это задание я, видимо, не правильно понял, т.к. тема - ветвление, а решение получилось без него.
        Напишите, пожалуйста, более подробно, что требуется сделать.
        */
        System.out.println("\n9. Подсчет количества банкнот");
        int money = 567;
        int amountBanknotes100 = 567 / 100;
        int amountBanknotes10 = 5;
        int amountBanknotes1 = money - amountBanknotes100 * 100 - amountBanknotes10 * 10;
        System.out.println("Количество банкнот номиналом 100 USD: " + amountBanknotes100);
        System.out.println("Количество банкнот номиналом 10 USD: " + amountBanknotes10);
        System.out.println("Количество банкнот номиналом 1 USD: " + amountBanknotes1);
        System.out.println("Исходная сумма: " + (amountBanknotes100 * 100 + amountBanknotes10 * 10 + amountBanknotes1));
    }
}