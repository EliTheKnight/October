public class Loops {

    public void whileDemo(){
        int n = 0;
        while(n < 5){
            System.out.println(n);
            n++;
        }
        System.out.println("Loop Done!");
    }

    public void forDemo(){
//        for(int n = 0; n < 5; n++){
//            System.out.println(n);
//        }
        //sum all even numbers from 2 to 100
//        int sum = 0;
//        for (int i = 2; i <= 100 ; i+=2) {
//            sum += i;
//            System.out.println(sum);
//        }
//        System.out.println(sum);

//        for (int i = 10; i > 0 ; i--) {
//            System.out.println(i);
//        }
//        System.out.println("blast off!");

        //print all numbers starting with 1, less than 200 that are divisible by 3 or 7, but not both.
        for (int i = 1; i < 200; i++) {
            if(i % 3 == 0){
                if(i % 7 != 0){
                    System.out.println(i);
                }
            }else if(i % 7 == 0){
                System.out.println(i);
            }
        }

    }

}
