package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int prior = 0;
        int next = 1;
        System.out.println(prior);
        for(int i = 2; i <= lastFibonacci;i++){

            System.out.println(next);
//            System.out.println(next+"nx");
//            System.out.println(res);
//            res += next;
//            prior = next;
            next += prior;
            prior = next;

        }


    }
}
