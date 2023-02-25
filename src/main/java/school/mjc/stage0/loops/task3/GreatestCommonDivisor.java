package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        if (first > second)
            for (int dividor = 1; dividor < first; dividor++){
                if (first % dividor == 0 && second % dividor == 0 && dividor > 1)
                    System.out.println(dividor);
            }
        else{
            for (int dividor = 1; dividor < second; dividor++){
                if (first % dividor == 0 && second % dividor == 0 && dividor > 1)
                    System.out.println(dividor);
            }
        }
    }
}
