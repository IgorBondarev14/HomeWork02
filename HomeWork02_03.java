public class HomeWork02_03 {
    public static void main(String[] args) {
        // *Напишите программу, чтобы перевернуть строку с помощью рекурсии.

        String str1 = "Разворот";
        System.out.println(reverseString(str1));
    }
    public static String reverseString(String str) {
        if (str.length() <= 1) {
            return str;
        }
        return reverseString(str.substring(1)) + str.charAt(0);
    }
//    public static String Reverse() {
//        if ()
//    }
}