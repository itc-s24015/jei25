public class D51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";
        switch (n) {
            case 1:
                s += "one";
                break;
            case 2:
                s += "two";
            default:
                s += "?";
        }
        System.out.println(s);
    }
}
//case:  各条件にあった場合の処理を実行する
//break: case文の処理を終了してswitch文から抜け出すため
//fall-through:  break文を意図的に省略すること、次のcase文の処理も続けて実行されるため
//複数のcase文で同じ処理を共有したり段階的な処理を行うことができる
