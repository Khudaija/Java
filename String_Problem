//String Pangram

public class string_pangram {

    public static void allLetter(String str) {
        str = str.toLowerCase();
        boolean allLetterPresent = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!str.contains(String.valueOf(ch))) {
                allLetterPresent = false;
                break;
            }
        }

        if (allLetterPresent)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static void main(String args[]) {
        String str = "Abcdefghijklmnopqrstuvwxyz12";

        allLetter(str);
    }
}

-----------X-----------------------------X-----------

// Extra caracter in one string - sample code

public class string_extra_character {

    private static char findExtraCharacter(String s1, String s2) {
        String smallStr;
        String largeStr;

        if (s1.length() > s2.length()) {
            smallStr = s2;
            largeStr = s1;
        } else {
            smallStr = s1;
            largeStr = s2;
        }
        int smallStrCodeTotal = 0;
        int largeStrCodeTotal = 0;
        int i = 0;

        for (i = 0; i < smallStr.length(); i++) {
            smallStrCodeTotal += smallStr.charAt(i);
            largeStrCodeTotal += largeStr.charAt(i);
        }
        largeStrCodeTotal += largeStr.charAt(i);

        int intChar = largeStrCodeTotal - smallStrCodeTotal;
        return (char) intChar;
    }

    public static void main(String args[]) {
        String s1 = "abcd";
        String s2 = "cbdea";

        char extraChar = findExtraCharacter(s1, s2);
        System.out.println("Extra Character : " + extraChar);
    }
}
