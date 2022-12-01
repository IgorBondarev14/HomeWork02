public class HomeWork02_02 {


    public static void main(String[] args) {
        // Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга.
        String str1= "Спел";
        String str2 = "Лепс";

        StringBuilder strBuild1 = new StringBuilder(str1.toLowerCase());
        StringBuilder strBuild2 = new StringBuilder(str2.toLowerCase());

        strBuild2.reverse();

        System.out.println(strBuild1);
        System.out.println(strBuild2);

        if (strBuild1.toString().equals(strBuild2.toString())) {
            System.out.println("Строка 2 является вращением строки 1.");
        }
        else {
            System.out.println("Строка 2 НЕ является вращением строки 1.");

        }
    }
}