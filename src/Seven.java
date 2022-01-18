public class Seven {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i % 2 != 0 || i < 100; i = i+1){
            if (i % 2 == 0){
                continue;}
            sum = sum + i;
        }
        System.out.println(sum);
        }
    }
/* Можно проще: сделать шаг +2, а не +1. Но тогда проверке подвергаются не все целые числа от 1 до 100*/