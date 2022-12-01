public class HomeWork02_04 {
    static StringBuilder strBuild1 = new StringBuilder();
    static StringBuilder strBuild2 = new StringBuilder();
    static StringBuilder strBuild3 = new StringBuilder();
    static long start;
    static long finish;

    public static void main(String[] args) {
        append();
        System.out.println();
        insert();
        System.out.println();
        replace();
    }
    public static void append() {
        //Дано два числа, например 3 и 56, необходимо составить следующие строки:
        // 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

        String str1 = "3";
        String str2 = "56";


        strBuild1.append(str1 + " + " + str2 + " = " + "59");
        strBuild2.append(str1 + " - " + str2 + " = " + "-53");
        strBuild3.append(str1 + " * " + str2 + " = " + "168");
        System.out.println(strBuild1);
        System.out.println(strBuild2);
        System.out.println(strBuild3);
    }
    public static void insert() {
        //Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
        start = System.nanoTime();
        strBuild1.deleteCharAt(7);
        strBuild2.deleteCharAt(7);
        strBuild3.deleteCharAt(7);
        strBuild1.insert(7, "равно");
        strBuild2.insert(7, "равно");
        strBuild3.insert(7, "равно");
        finish = System.nanoTime();

        System.out.println(strBuild1);
        System.out.println(strBuild2);
        System.out.println(strBuild3);
        long workTime = finish - start;
        System.out.println("Время работы по замене методом insert составило: " + workTime);
    }
    public static void replace() {
        // Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
        start = System.nanoTime();
        strBuild1.replace(7, 12,"равно");
        strBuild2.replace(7, 12,"равно");
        strBuild3.replace(7, 12,"равно");
        finish = System.nanoTime();

        System.out.println(strBuild1);
        System.out.println(strBuild2);
        System.out.println(strBuild3);
        long workTime = finish - start;
        System.out.println("Время работы по замене методом replace составило: " + workTime);
    }
}