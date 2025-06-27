public class D50Q5kadai {
    public static void main(String[] args) {
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;

                    printArray(num, "ソート途中:");
                }
            }
        }
        printArray(num, "-------------------\nソート結果:");
    }

    public static void printArray(int[] array, String message) {
        System.out.print(message + " ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
