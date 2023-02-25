package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int sum  =0;

        if (lengthOfLastNumber >= 1) {
            String nines = "9".repeat(lengthOfLastNumber);

            for (int digit = 0; digit < nines.length(); digit++)
                sum += Integer.parseInt(nines.substring(digit));

        }
        System.out.println(sum);




    }
}
