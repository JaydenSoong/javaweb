public class DebugDemo {
    public static void main(String[] args) {
        sumTo100();
    }

    public static void sumTo100() {
        int sum = 0;
        for (int i=0; i<=100; i++) {
            sum += i;
        }

        System.out.println("sum = " + sum);
    }
}

