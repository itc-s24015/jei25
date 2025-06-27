public class D51Q20kadai {
    /*public static void main(String[] args) {
    boolean flg = true;
    int n = 6;
    char c = (flg = n > 8) ? 'Y' : 'N';
    System.out.println(c);
}

     */

    public static void main(String[] args) {
        boolean flg = true;
        int score = 85;
        String c = (flg == score >= 70) ?  "合格" :  "不合格";
        System.out.println(c);
    }

}
