public class reverse_word {

    public String reverse_word(String s) {

        s = s.trim();

        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]);

            if (i != 0) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {

        reverse_word obj = new reverse_word();

        String result = obj.reverse_word("the sky is blue");

        System.out.println(result);
    }
}