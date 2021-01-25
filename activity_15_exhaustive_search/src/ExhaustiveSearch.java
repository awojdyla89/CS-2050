public class ExhaustiveSearch {

    private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    static void search(int n) {
        DynamicStack<String> stack = new DynamicStack<>();
        for (int i = ALPHABET.length() - 1; i >= 0; i--) {
            char c = ALPHABET.charAt(i);
            stack.push(c + "");
        }
        while (!stack.isEmpty()) {
            String str = stack.pop();
            if (str.length() == n)
                System.out.println(str);
            else
                for (int i = ALPHABET.length() - 1; i >= 0; i--) {
                    char c = ALPHABET.charAt(i);
                    stack.push(str + c);
                }
        }
    }

    public static void main(String[] args) {
        search(1);
    }
}
