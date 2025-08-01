public class D51Q5kadai {
    public static void main(String[] args) {
        // 3つのコマンドライン引数をdouble型に変換
        double num1 = Double.parseDouble(args[0]);
        double num2 = Double.parseDouble(args[1]);
        double num3 = Double.parseDouble(args[2]);

        // 2番目の数字を切り上げ
        double result = Math.ceil(num2);

        // 結果を表示
        System.out.println(result);
    }
}