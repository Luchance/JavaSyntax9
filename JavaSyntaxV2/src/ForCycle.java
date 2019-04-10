public class ForCycle {
    public static void main(String[] args) {

//        Su FOR

        for (int x=0;x<11;x++){
            int y = 3 * x;
            System.out.println(y);
        }


//        Su WHILE

        int x = 0;
        while(x<11){
            int y = 3 * x;
            System.out.println(y);
            x++;
        }

//        for sum

        int sum = 0;

        for (int i=1;i<101;i++){
            sum += i;
        }
        System.out.println(sum);

//        while sum

        int g = 1;
        int sum1 = 0;
        while (g < 101){
            sum1 += g;
            g++;
        }
        System.out.println(sum1);

//        do whiel sum

        int h = 1;
        int sum2 = 0;
        do {
            sum2 += h;
            h++;
        } while (h<101);
        System.out.println(sum2);



    }
}
