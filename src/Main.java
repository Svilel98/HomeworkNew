import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
        task12();
        task13();
        task14();
        task15();
        task16();
        task17();
        task18();
        task19();
        task20();
        task21();
        task22();
        task23();
        task24();
        task25();
        task26();
        task27();
        task28();
        task29();
        task30();
        task31();
        task32();
        task33();
        task34();
        task35();
        task36();
        task37();
        task38();
        task39();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int number1 = 47;
        int number2 = 13;
        int division = number1 / number2;
        int divisionWithRemainder = number1 % number2;
        System.out.println(division + " " + divisionWithRemainder);
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number1 = 47;
        int number2 = number1 / 10;
        int number3 = number1 % 10;
        int sum = number2 + number3;
        System.out.println(sum);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int number1 = 345;
        int number2 = number1 / 100;
        int number3 = number1 / 10 % 10;
        int number4 = number1 % 100 % 10;
        ;
        int sum = number2 + number3 + number4;
        System.out.println(sum);
    }

    public static void task4() {
        System.out.println("Задача 4");
        int priceChamomile = 4899;
        int pricePostcard = 157;
        int percent = 10;
        int buy = priceChamomile + pricePostcard;
        float saleBuy = buy - (buy / 100f * percent);
        System.out.printf("Всего потратили %d , скидка была %.2f", buy, saleBuy);
        System.out.println();
    }

    public static void task5() {
        System.out.println("Задача 5");
        int priceOrangeKilogramms = 73;
        int priceBananaKilogramms = 95;
        int saleOrangePercent = 15;
        int weightOrange = 2;
        int priceOrange2 = priceOrangeKilogramms * weightOrange;
        priceOrange2 -= priceOrange2 / 100 * saleOrangePercent;
        int sum = priceBananaKilogramms + priceOrange2;
        System.out.println(sum);
        int priceChampagne = 2870;
        int priceBread = 27;
        int saleChampangePercent = 50;
        int amountChampange = 7;
        int priceChampange2 = priceChampagne * amountChampange;
        priceChampange2 -= priceChampange2 / 100 * saleChampangePercent;
        int sum2 = priceChampange2 + priceBread;
        System.out.println(sum2);
        float priceChampignon = 436;
        float priceWhiteMushroom = 578;
        int saleWhiteMushroomPercent = 5;
        float weightChampignon = 2.5f;
        float weightWhiteMushroom = 3.75f;
        priceChampignon *= weightChampignon;
        System.out.println(priceChampignon);
        float priceWhiteMushroomK = priceWhiteMushroom * weightWhiteMushroom;
        System.out.println(priceWhiteMushroomK);
        priceWhiteMushroomK -= priceWhiteMushroomK / 100 * saleWhiteMushroomPercent;
        System.out.println(priceWhiteMushroomK);
        float sum3 = priceChampignon + priceWhiteMushroomK;
        System.out.printf("Сумма со скидкой равна %.2f", sum3);
        System.out.println();
    }

    public static void task6() {
        System.out.println("Задача 6");
        double a = 0.40;
        double b = 0.87;
        double c = 11f * a + b;
        double d = (a + 10f * b) - 15f * (a / b);
        System.out.printf("%.2f", c);
        System.out.println();
        System.out.printf("%.2f", d);
    }

    public static void task7() {
        System.out.println("Задача 7");
        int a = 2;
        if (a % 2 == 0 && a != 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        float p = 7.13f;
        float d = 11.33f;
        int ten = 10;
        if (p < 10) {
            p = ten - p;
        } else {
            p = p - ten;
        }
        if (d < 10) {
            d = ten - d;
        } else {
            d = d - ten;
        }
        if (p > d) {
            System.out.println(p);
        } else {
            System.out.println(d);
        }
    }

    public static void task9() {
        System.out.println("Задача 9");
        int a = ThreadLocalRandom.current().nextInt(3, 156);
        if (a >= 22 && a <= 99) {
            System.out.println("Число " + a + " попало в интервал (22;99).");
        } else {
            System.out.println("Число " + a + " не попало в интервал (22;99).");
        }
    }
    //        int min = 3;
//        int max = 158;
//        int difference = max - min;
//        for (int i = 0; i <= 10; i++) {
//            Random random = new Random(min);
//            int a = random.nextInt(difference + i);
//            if (a > 22 && a < 99)
//            System.out.println(a);
//        }

    public static void task10() {
        System.out.println("Задача 10");
        int a = ThreadLocalRandom.current().nextInt(0, 999);
        System.out.println(a);
        int b = a / 100;
        int c = a / 10 / 10;
        int d = a / 10 % 9;
        if (b > c && b > d) {
            System.out.println(b);
        } else if (c > d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
    }

    public static void task11() {
        System.out.println("Задача 11");
        int a = 351;
        int b = -4214;
        int c = -1001;
        if (a > b && a > c) {
            if (b > c) {
                System.out.printf("%d, %d, %d", c, b, a);
            } else {
                System.out.printf("%d, %d, %d", b, c, a);
            }
        } else if (b > a && b > c) {
            if (a > c) {
                System.out.printf("%d, %d, %d", c, a, b);
            } else {
                System.out.printf("%d, %d, %d", a, c, b);
            }
        } else {
            if (b > a) {
                System.out.printf("%d, %d, %d", a, b, c);
            } else {
                System.out.printf("%d, %d, %d", b, a, c);
            }
        }
        System.out.println();
    }

    public static void task12() {
        System.out.println("Задача 12");
        int currentTime = ThreadLocalRandom.current().nextInt(28001);
        int secondAll = 28800;
        int secondEnd = secondAll - currentTime;
        int hoursEnd = Math.round(secondEnd / (60 * 60));
        System.out.println(secondEnd);
        System.out.println(hoursEnd);
    }
    //        int startWorkDay = 8;
//        int endWorkDay = 16;
//        int differnceWorkDay = endWorkDay - startWorkDay;
//        int totalSec = 28800;
//        int secHour = 60 * 60;
//        int total = 0;
//        if (total > 0 && total <= 28800) {
//            int timeHour = total / secHour;
//            int endTime = differnceWorkDay - timeHour;
//            System.out.println(endTime);
//            int endSec = totalSec - total;
//            System.out.println(endSec);
//        }
//        System.out.println("-");

    public static void task13() {
        System.out.println("Задача 13");
        int number = 1000;
        int divider = 4;
        int quantity = 5;
        while (quantity > 0) {
            if (number % divider == 0) {
                System.out.println(number);
                quantity--;
            }
            number++;
        }
    }

    //        int a = 0;
//        int c = 0;
//        for (int i = 0; i < 100; i++) {
//            a = i + 1000;
//            int b = a % 4;
//            if (b == 0){
//                c += 1;
//                System.out.println(a);
//            }
//            if (c == 5) {
//                break;
//            }
//        }
    public static void task14() {
        System.out.println("Задача 14");
        int a = 1;
        int i = 10;
        do {
            System.out.println(a);
            a += 2;
            i--;
        } while (i > 0);
    }

    public static void task15() {
        System.out.println("Задача 15");
        int number = 90;
        int step = 5;
        do {
            System.out.println(number);
            number -= step;
        } while (number >= 0);
    }

    public static void task16() {
        System.out.println("Задача 16");
        int number = 2;
        int step = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(number);
            number *= step;
        }
    }

    public static void task17() {
        System.out.println("Задача 17");
        int saturday = 1;
        int sunday = saturday + 1;
        int month = 30;
        int week = 7;
        for (int i = 0; i <= month; i++) {
            if ((i + week) % week == saturday || (i + week) % week == sunday) {
                System.out.println(i);
            }
        }
    }

    public static void task18() {
        System.out.println("Задача 18");
        int start = 1;
        int end = 999999;
        int amount = 0;
        for (int i = start; i <= end; i++) {
            int sum1 = 0;
            int sum2 = 0;
            int number1 = i / 1000;
            int number2 = i % 1000;
            while (number1 != 0) {
                sum1 += number1 % 10;
                number1 /= 10;
            }
            while (number2 != 0) {
                sum2 += number2 % 10;
                number2 /= 10;
            }
            if (sum1 == sum2) {
                amount++;
            }
        }
        System.out.println(amount);
    }

    public static void task19() {
        System.out.println("Задача 19");
        int[] rack = {12, 9, 11, 10};
        int sum = 0;
        for (int element : rack) {
            sum = sum + element;
            System.out.println(sum);
        }
    }

    public static void task20() {
        System.out.println("Задача 20");
        int[] arr = generateRandomArray(0, 99, 15);
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                a += 1;
            }
        }
        System.out.print(Arrays.toString(arr));
        System.out.println();
        System.out.println(a);
    }

    public static void task21() {
        System.out.println("Задача 21");
        int[] nums = generateRandomArray(1, 10, 8);
        System.out.print(Arrays.toString(nums));
        for (int num = 0; num < nums.length; num++) {
            if (nums[num] % 2 != 0) {
                nums[num] = 0;
            }
        }
        System.out.println();
        System.out.print(Arrays.toString(nums));
        System.out.println();
    }

    public static void task22() {
        System.out.println("Задача 22");
        int[] nums = generateRandomArray(0, 5, 5);
        int[] nums1 = generateRandomArray(0, 5, 5);
        System.out.print(Arrays.toString(nums));
        System.out.println();
        System.out.print(Arrays.toString(nums1));
        System.out.println();
        float numsSum = 0;
        float numSum1 = 0;
        for (int i = 0; i < nums.length; i++) {
            numsSum += nums[i];
        }
        for (int i = 0; i < nums1.length; i++) {
            numSum1 += nums1[i];
        }
        float numsAverageValue = numsSum / nums.length;
        float numsAverageValue1 = numSum1 / nums1.length;
        System.out.println(numsAverageValue);
        System.out.println(numsAverageValue1);
        if (numsAverageValue > numsAverageValue1) {
            System.out.println("Массив номер 1 больше и равен " + numsAverageValue);
        } else if (numsAverageValue == numsAverageValue1) {
            System.out.println("Массивы равны");
        } else {
            System.out.println("Массив номер 2 больше и равен " + numsAverageValue1);
        }
    }

    public static void task23() {
        System.out.println("Задача 23");
        int[] nums = generateRandomArray(10, 99, 4);
        System.out.println(Arrays.toString(nums));
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                System.out.println("Не строгое");
                return;
            }
        }
        System.out.println("Cтрогое " + Arrays.toString(nums));
    }

    public static void task24() {
        System.out.println("Задача 24");
        int[] nums = new int[20];
        nums[0] = 0;
        nums[1] = 1;
        for (int i = 2; i < nums.length; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void task25() {
        System.out.println("Задача 25");
        int[] num1 = new int[10];
        for (int i = 0; i < num1.length; i++) {
            num1[i] = i + 1;
            num1[i] *= i + 1;
        }
        System.out.println(Arrays.toString(num1));
        for (int i = 0; i < num1.length; i++) {
            num1[i] = i + 1;
            if (num1[i] % 2 != 0) {
                num1[i] *= i + 1;
            } else {
                num1[i] *= -(i + 1);
            }
        }
        System.out.println(Arrays.toString(num1));
        for (int i = 0; i < num1.length; i++) {
            if (i % 2 == 0) {
                num1[i] = 1;
            } else {
                num1[i] = -1;
            }
        }
        System.out.println(Arrays.toString(num1));
        for (int i = 1; i < num1.length; i++) {
            if (i % 2 == 0) {
                num1[i] += i;
            } else {
                num1[i] = 0;
            }
        }
        System.out.println(Arrays.toString(num1));
    }

    public static void task26() {
        System.out.println("Задача 26");
        int[] nums = generateRandomArray(-15, 15, 10);
        System.out.println(Arrays.toString(nums));
        int max = -16;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                max = nums[i];
                index = i;
            }
        }
        System.out.println(max + " " + index);
    }

    public static void task27() {
        System.out.println("Задача 27");
        int[] nums = generateRandomArray(0, 1, 11);
        System.out.println(Arrays.toString(nums));
        int num0 = 0;
        int num1 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                num0++;
            } else {
                num1++;
            }
        }
        if (num0 > num1) {
            System.out.println("Элемент 0 встречается чаще.");
        } else if (num0 < num1) {
            System.out.println("Элемент 1 встречается чаще.");
        } else {
            System.out.println("-1");
        }
    }

    public static void task28() {
        System.out.println("Задача 28");
        int[][] matrix = new int[8][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = generateRandomArray(0, 99, 5);
        }
        for (int[] columnMatrix : matrix) {
            System.out.println(Arrays.toString(columnMatrix));
        }
        //        int[] nums = generateRandomArray(0, 99, 8);
//        int column = 5;
//        int nextColumn = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (i == nums.length - 1 && nextColumn < column) {
//                i = 0;
//                nextColumn++;
//                System.out.println(Arrays.toString(nums));
//            } else if (nextColumn >= column) {
//                break;
//            } else {
//            }
//        }
    }

    public static void task29() {

        System.out.println("Задача 29");
        int[][] matrix = new int[5][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = generateRandomArray(-99, 99, 8);
        }
        int max = matrix[0][0];
        for (int[] subArr : matrix) {
            for (int num : subArr) {
                max = Math.max(max, num);
            }
            System.out.println(Arrays.toString(subArr));
        }
        System.out.println(max);
    }

    public static void task30() {

        System.out.println("Задача 30");
        int[][] matrix = new int[4][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = generateRandomArray(-5, 5, 7);
        }
        int muliplyString = Integer.MIN_VALUE;
        int rowTheBest = 0;
        for (int subArr = 0; subArr < matrix.length; subArr++) {
            int multiply = 1;
            for (int num : matrix[subArr]) {
                multiply *= num;
            }
            if (multiply >= muliplyString) {
                muliplyString = multiply;
                rowTheBest = subArr;
            }
            System.out.println(Arrays.toString(matrix[subArr]));
        }
        System.out.println(muliplyString);
        System.out.println(rowTheBest);
    }

    public static void task31() {

        System.out.println("Задача 31");
        int[][] matrix = new int[6][];
        for (int i = 0; i < matrix.length; i++) {
            matrix[i] = generateRandomArray(0, 9, 7);
        }
        for (int[] subArr : matrix) {
            int max = Integer.MIN_VALUE;
            int indexMax = 0;
            for (int num = 0; num < subArr.length; num++) {
                if (max < subArr[num]) {
                    max = subArr[num];
                    indexMax = num;
                }
            }
            System.out.println(Arrays.toString(subArr));
            System.out.println();
            if (max > subArr[0]) {
                int newSubArr0 = subArr[0];
                subArr[0] = max;
                subArr[indexMax] = newSubArr0;
            }
            System.out.println(Arrays.toString(subArr));
            System.out.println();
        }
    }

    public static void task32() {

        System.out.println("Задача 32");
        String text1 = "The";
        String text2 = "AAbb";
        String text3 = "Hi-There";
        System.out.println(string1(text1));
        System.out.println(string1(text2));
        System.out.println(string1(text3));
    }

    public static void task33() {

        System.out.println("Задача 33");
        String text1 = "<<>>";
        String text2 = "Yay";
        int mid = text1.length() / 2;
        String sumString = text1.substring(0, mid) + text2 + text1.substring(mid);
        System.out.println(sumString);
    }

    public static void task34() {

        System.out.println("Задача 34");
        String text1 = "";
        String text2 = "a";
        if (text1.length() > 0 && text2.length() > 0) {
            System.out.println(text1.charAt(0) + text2.substring(text2.length() - 1));
        } else if (text1.length() == 0 && text2.length() > 0) {
            System.out.println("@" + text2.substring(text2.length() - 1));
        } else if (text1.length() > 0 && text2.length() == 0) {
            System.out.println("@" + text2.substring(text2.length() - 1));
        } else {
            System.out.println("@@");
        }
    }

    public static void task35() {

        System.out.println("Задача 35");
        String coding = "Jewish";
        char[] word = coding.toCharArray();
        char symbol = word[word.length - 2];
        word[word.length - 2] = word[word.length - 1];
        word[word.length - 1] = symbol;
        String result = new String(word);
        System.out.println(result);
    }

    public static void task36() {

        System.out.println("Задача 36");
        String firstWord = "Hello";
        String secondWord = "Hisassad";
        int differnceString = 0;
        String sumString = "";
        if (firstWord.length() > secondWord.length()) {
            differnceString = firstWord.length() - secondWord.length();
            sumString = firstWord.substring(differnceString) + secondWord;
        } else if (firstWord.length() < secondWord.length()) {
            differnceString = secondWord.length() - firstWord.length();
            sumString = firstWord + secondWord.substring(differnceString);
        } else {
            sumString = firstWord + secondWord;
        }
        System.out.println(sumString);
    }

    public static void task37() {

        System.out.println("Задача 37");
        String origin = "hi hi ascahi";
        String secondString = "hi";
        int count = 0;
        for (int i = 0; i < origin.length(); i++) {
            int i2 = i;
            for (int index = 0; index < secondString.length(); index++) {
                if (origin.charAt(i2) != secondString.charAt(index)) {
                    break;
                } else if (index == secondString.length() - 1) {
                    count++;
                }
                i2++;
            }
        }
        System.out.println(count);
    }
    public static void task38() {

        System.out.println("Задача 38");
        String origin = "hi hi ascahi";
        String secondString = "hi";
        int originSize = origin.length();
        String newString = origin.replaceAll(secondString, "");
        System.out.println((originSize - newString.length())/secondString.length());
    }
    public static void task39() {

        System.out.println("Задача 39");
        String origin = "Hello";
        int num = 3;
        String newString = "";
        int originSize = origin.length() - num;
        newString = origin.substring(originSize);
        newString = newString.repeat(num);
        System.out.println(newString);
    }


    public static int[] generateRandomArray(int a, int b, int arraysize) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[arraysize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = a + random.nextInt(b - a + 1);
        }
        return arr;
    }

    public static String string1(String string) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            sb.append(string.charAt(i));
            sb.append(string.charAt(i));
        }
        String sbResult = sb.toString();
        return sbResult;
    }
}
