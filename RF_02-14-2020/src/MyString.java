public class MyString {
    private final char[] string;

    MyString(String s) {
        if (s == null) string = null;
        else {
            string = new char[s.length()];
            for (int i = 0; i < s.length(); i++) {
                string[i] = s.charAt(i);
            }
        }
    }

    // Checks if 2 String objects have the same content => deep comparison
    boolean compareEquals(String anotherString) {
        if (string == null && anotherString == null) return true;
        if (string == null || anotherString == null) return false;
        if (string.length != anotherString.length()) return false;

        for (int i = 0; i < string.length; i++) {
            if (string[i] != anotherString.charAt(i)) return false;

        }
        return true;
    }

    // This method modifies the existing String object
    void reverseInPlace() {

        int i = 0;
        int j = string.length - 1;

        while (i < j) {
            char temp = string[i];
            string[i] = string[j];
            string[j] = temp;

            i++;
            j--;
        }
    }

    // This method creates a new String object to store the reversed string
    String reverse() {
        if (string.length == 0) return "";

        StringBuffer sb = new StringBuffer();
        for (int i = string.length - 1; i >= 0; i--) {
            sb.append(string[i]);
        }

        return sb.toString();
    }

    String concatenate(String anotherString) {
        StringBuffer sb = new StringBuffer();

        if (string != null) {
            for (int i = 0; i < string.length; i++) {
                sb.append(string[i]);
            }
        }

        if (anotherString != null) {
            for (int i = 0; i < anotherString.length(); i++) {
                sb.append(anotherString.charAt(i));
            }
        }

        return sb.toString();
    }


}
