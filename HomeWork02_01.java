public class HomeWork02_01 {
    static String sourceString = "Привет, Абвгдейка! А бывало ли такое Г? абавдага";
    static String searchString = "абг";
    static char[] sourceChar = new char[sourceString.length()];
    static char[] searchChar = new char[searchString.length()];
    static int countFirstChar = 0;
    static StringBuilder[] resultSearch = new StringBuilder[1];

    public static void main(String[] args) {
        prepare();
        search();
    }
    public static void prepare() {
        String str1 = sourceString.toLowerCase();
        String str2 = searchString.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            sourceChar[i] = str1.charAt(i);
        }
        for (int i = 0; i < str2.length(); i++) {
            searchChar[i] = str2.charAt(i);
        }

        for (int i = 0; i < str1.length(); i++) {
            if (Character.toString(searchChar[0]).equals(Character.toString(sourceChar[i]))) {
                countFirstChar ++;
            }
        }
        StringBuilder[] tmpResult = new StringBuilder[countFirstChar];
        resultSearch = tmpResult;
    }
    public static void search() {
        int startIndex = 0;
        int endIndex = 0;
        int startSelection = 0;
        int tmpStartSelection = 0;
        for (int k = 0; k < countFirstChar ; k ++) {
            int countCombination = 0;
            startSelection = tmpStartSelection;
            for (int i = 0; i < searchChar.length; i++) {
                for (int j = startSelection; j < sourceChar.length; j++) {
                    if (Character.toString(searchChar[i]).equals(Character.toString(sourceChar[j]))) {
                        if (i == 0) {
                            tmpStartSelection = j + 1;
                            startIndex = j;
                        }
                        if (i == searchChar.length - 1) {
                            endIndex = j;
                        }
                        startSelection = j + 1;
                        countCombination ++;
                        break;
                    }
                }
                if (i == searchChar.length - 1 && countCombination < searchChar.length) {
                    startSelection = tmpStartSelection;
                }
            }
            if (countCombination == searchChar.length) {
                StringBuilder tmpStr = new StringBuilder();
                for (int i = startIndex; i < endIndex + 1; i ++) {
                    tmpStr.append(sourceChar[i]);
                }
                resultSearch[k] = tmpStr;
            }
        }
        int minLen = 0;
        for (int i = 1; i < resultSearch.length; i++) {
            if (resultSearch[i] != null) {
                if (resultSearch[i].length() < resultSearch[minLen].length()) {
                    minLen = i;
                }
            }
        }
        System.out.println("Наименьшее окно вхождения второй строки в первую это - " + resultSearch[minLen]);
    }
}