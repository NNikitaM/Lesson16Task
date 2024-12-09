public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        int count = 0;
        String temp = text;
        while (temp.contains(substring)) {
            count++;
            temp = temp.substring(temp.indexOf(substring) + substring.length());
        }
        return count;
    }
}