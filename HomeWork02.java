import java.util.Arrays;

public class HomeWork02 {
    public static void main(String[] args) {
        String sourceString = "Привет, Абвгдейка! а было ли у вас такое? абавага";
        String searchString = "абв";

        window(sourceString, searchString);
    }
    public static void window(String str1, String str2){
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char[] searchChar = new char[str2.length()];
        for (int i = 0; i < str2.length(); i ++) {
            searchChar[i] = str2.charAt(i);
        }
        char[] sourceChar = new char[str1.length()];
        for (int i = 0; i < str1.length(); i ++) {
            sourceChar[i] = str1.charAt(i);
        }

        int startIndex = 0;
        int secondStartIndex = 0;
        int endIndex = 0;

        for (int j = 0; j < str2.length(); j ++)
        {
            for (int i = secondStartIndex; i < str1.length(); i ++)
            {
                if (Character.toString(searchChar[j]).equals(Character.toString(sourceChar[i])))
                {
                    if (j == 0)
                    {
                        startIndex = i;
                    }
                    if (j == str2.length() - 1)
                    {
                        endIndex = i;
                        break;
                    }
                    secondStartIndex = i + 1;
                    j++;

                }
            }
        }
        if (endIndex == 0)
        {
            System.out.println("В исходной строке нет искомой.");
        }
        else
        {
            System.out.println("Самое маленькое окно: " + str1.substring(startIndex, endIndex + 1));
        }
    }
    public static void result() {

    }
}