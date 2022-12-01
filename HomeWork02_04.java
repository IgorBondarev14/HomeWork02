public class HomeWork02_04 {
    public static void main(String[] args) {
        //Дано два числа, например 3 и 56, необходимо составить следующие строки:
        // 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 Используем метод StringBuilder.append().

        String str1 = "3";
        String str2 = "56";

        StringBuilder strBuild1 = new StringBuilder();
        StringBuilder strBuild2 = new StringBuilder();
        StringBuilder strBuild3 = new StringBuilder();
        strBuild1.append(str1 + " + " + str2 + " = " + "59");
        strBuild2.append(str1 + " - " + str2 + " = " + "-53");
        strBuild3.append(str1 + " * " + str2 + " = " + "168");
        System.out.println(strBuild1);
        System.out.println(strBuild2);
        System.out.println(strBuild3);

    }
}