package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String numAsStr = Integer.toString(Math.abs(t));
        int sum = 0;
        for(int i = 0; i < numAsStr.length(); i++)
            sum+= Integer.parseInt(String.valueOf(numAsStr.charAt(i)));
        System.out.println(sum);
    }

}
