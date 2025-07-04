public class D51kadai {
    public static void main(String[] args) {
        String s = String.valueOf(1.1);
        String s1 = String.valueOf(2.2);
        String s2 = String.valueOf(3.3);
        if (args.length >= 2) {
            double value = Double.parseDouble(args[1]);
            double result = Math.ceil(value);
            System.out.println(result);
        }
    }
}
