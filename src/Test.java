public class Test {
    public static void main(String[] args) {
        int value = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                value += i;
        }
        System.out.println(value);
    }
}
