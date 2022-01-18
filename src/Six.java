public class Six {
    public static void main(String[] args) {
        for(int i = 1; i % 2 == 0 || i < 101; i = i+1){
            if (i % 2 != 0){
                continue;}
            System.out.println(i);
        }
    }
}
/* Можно проще: сделать шаг +2, а не +1. Но тогда проверке подвергаются не все целые числа от 1 до 100*/
