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
            System.out.println("isMaleGender = false, !isMaleGender = true, "
                + " условие true = true выполняется");
        } else {
            System.out.println("isMaleGender = true, !isMaleGender = false, "
                + " условие true = true не выполняется");
        }
        float humanHeight = 1.5f;
        if (humanHeight < 1.8) {
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
            System.out.println("Из двух чисел " + num1 + " и " + num2 + ", минимальное = "
                + num1 + ", максимальное = " + num2);
        } else if (num1 > num2) {
            System.out.println("Из двух чисел " + num1 + " и " + num2 + ", минимальное = "
                + num2 + ", максимальное = " + num1);
        } else {
            System.out.println("Числа " + num1 + " и " + num2 + " равны");
        }

        System.out.println("\n3. Работа с числом");
        int num3 = 16;
        boolean isEvenNumber = num3 % 2 == 0;
        if (num3 != 0) {
            if (isEvenNumber && num3 > 0) {
                System.out.println("Число " + num3 + " - положительное, четное");
            } else if (isEvenNumber && num3 < 0) {
                System.out.println("Число " + num3 + " - отрицательное, четное");
            } else if (!isEvenNumber && num3 > 0) {
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
            System.out.println("В первом разряде чисел " + num4 + " и " + num5
                + " находятся одинаковые цифры: " + num4 / 100);
            isEqualNumber = true;
        }
        if (num4 / 10 % 10 == num5 / 10 % 10) {
            System.out.println("Во втором разряде чисел " + num4 + " и " + num5
                + " находятся одинаковые цифры: " + num4 / 10 % 10);
            isEqualNumber = true;
        }
        if (num4 % 10 == num5 % 10) {
            System.out.println("В третьем разряде чисел " + num4 + " и " + num5
                + " находятся одинаковые цифры: " + num4 % 10);
            isEqualNumber = true;
        }
        if (!isEqualNumber) {
            System.out.println("Одинаковых цифр в соответствующих разрядах чисел "
                + num4 + " и " + num5 + " нет");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");
        char codeChar = '\u0057';
        if (codeChar > 'A' && codeChar < 'Z') {
            System.out.println(codeChar + " - большая буква");
        } else if (codeChar > 'a' && codeChar < 'z') {
            System.out.println(codeChar + " - маленькая буква");
        } else if (codeChar > '0' && codeChar < '9') {
            System.out.println(codeChar + " - цифра");
        } else {
            System.out.println(codeChar + " - специальный символ");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");
        int deposit = 300000;
        int percent = 0;
        if (deposit < 100000) {
            percent = 5;
        }        
        if (deposit > 100000 && deposit < 300000) {
            percent = 7;
        }
        if (deposit >= 300000) {
            percent = 10;
        }
        System.out.println("Сумма вклада = " + deposit + ", начисленный процент = "
                + deposit * percent / 100 + ", итоговая сумма = " + (deposit + (deposit * percent / 100)));

        System.out.println("\n7. Определение оценки по предметам");
        int percentHistory = 59;
        int percentProg = 91;
        int gradeHisory = 0;
        int gradeProg = 0;
        if (percentHistory <= 60) {
            gradeHisory = 2;
        }
        if (percentHistory > 60 && percentHistory < 74) {
            gradeHisory = 3;
        }
        if (percentHistory > 73 && percentHistory < 92) {
            gradeHisory = 4;
        }
        if (percentHistory > 91) {
            gradeHisory = 5;
        }
        if (percentProg <= 60) {
            gradeProg = 2;
        }
        if (percentProg > 60 && percentProg < 74) {
            gradeProg = 3;
        }
        if (percentProg > 73 && percentProg < 92) {
            gradeProg = 4;
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

        System.out.println("\n9. Подсчет количества банкнот");
        int money = 567;
        int amountBanknotesInStock10 = 5;
        int amountBanknotes100 = money / 100;
        int amountBanknotes10 = money - amountBanknotes100 * 100;
        int amountBanknotes1 = money - amountBanknotes100 * 100 - amountBanknotes10 * 10;
        if (amountBanknotes10 > amountBanknotesInStock10) {
            amountBanknotes1 += (amountBanknotes10 - amountBanknotesInStock10) * 10;
            amountBanknotes10 = amountBanknotesInStock10;
        }
        System.out.println("Количество банкнот номиналом 100 USD: " + amountBanknotes100);
        System.out.println("Количество банкнот номиналом 10 USD: " + amountBanknotes10);
        System.out.println("Количество банкнот номиналом 1 USD: " + amountBanknotes1);
        System.out.println("Исходная сумма: " 
            + (amountBanknotes100 * 100 + amountBanknotes10 * 10 + amountBanknotes1));
    }
}