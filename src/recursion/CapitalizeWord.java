package recursion;

/**
 * <ul>
 *     <li>input: i love java</li>
 *     <li>output : I Love Java</li>
 * </ul>
 */
public class CapitalizeWord {
    public static void main(String[] args) {
        String capitalWord = capitalizeWord("i love java");
        System.out.println(capitalWord);
    }

    private static String capitalizeWord(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char chr = str.charAt(str.length()-1);
        if (str.length() == 1) {
            return Character.toString(Character.toUpperCase(chr));
        }

        if((str.charAt(str.length() - 2) == ' ')) {
            chr = Character.toUpperCase(chr);
        }
        return capitalizeWord(str.substring(0,str.length()-1)) + chr;
    }
}
