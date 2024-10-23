import java.util.Scanner;

public class functionsQuestions {

    // function to find the middle char from the array;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findMiddleChar(str));
    }

    // custom function;
    public static String findMiddleChar(String str) {
        // contains length of str;
        int length = str.length();
        // contains middle unit;
        int middleDigit = length / 2;

        // condition;
        if (length % 2 == 1) {
            // Character.toString converts char to string;
            // why we convert the char into string?
            // because return type of our array is string..
            return Character.toString(str.charAt(middleDigit));
        } else {
            return str.substring(middleDigit - 1, middleDigit + 1);
        }
    }

    // function to count all the vowels in the string;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(findVowels(str));
    }

    public static int findVowels(String str) {
        // converting the str into lowerCase;
        str = str.toLowerCase();

        // number of vowels;
        int vowelsNum = 0;

        // loop to check each value of the string;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a') || (str.charAt(i) == 'e') || (str.charAt(i) == 'i') || (str.charAt(i) == 'o')
                    || (str.charAt(i) == 'u')) {
                vowelsNum++;
            }
        }

        return vowelsNum;
    }

}