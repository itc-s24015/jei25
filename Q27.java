public class Q27 {
    public static void main(String[] args){
        int i ,j = 0;
        for(i = 0; i < 6; j = ++i){
            System.out.print(i++);
            System.out.print("," + j + " ");
        }
    }
}
