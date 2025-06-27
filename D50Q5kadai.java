public class D50Q5kadai {
    public static void main(String[] args) {
        int[] num = new int[args.length];

        // コマンドライン引数を整数型配列に変換
        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp;
        // ソート処理
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] > num[j]) {
                    // スワップ処理
                    tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;

                    // スワップ後に状態を出力
                    printArray(num, "ソート途中:");
                }
            }
        }

        // 最終結果を出力
        printArray(num, "-------------------\nソート結果:");
    }

    // 配列の内容をフォーマットして出力するヘルパーメソッド
    public static void printArray(int[] array, String message) {
        System.out.print(message + " ");
        for (int val : array) {
            System.out.print(val + " ");
        }
        System.out.println();
    }
}
