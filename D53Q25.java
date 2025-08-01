public class D53Q25 {
    public static void main(String[] args) {
        char[] ch = {'A','B','C'};
        String s1 = new String("ABC");
        String s2 = new String(ch);
        boolean b1 = s1 != s2;
        boolean b2 = s1.equals(s2);
        System.out.println(b1 + " " + b2);
    }
}
