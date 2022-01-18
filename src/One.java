public class One {
    public static void main(String[] args) {
        double sum = 10;
        double norma = 10;
        for(int i = 0; i < 7; i++){
            norma = norma + (norma * 0.1);
            sum = sum + norma;
        }
        System.out.println(sum);
    }
}
