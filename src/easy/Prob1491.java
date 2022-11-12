package easy;

import java.text.DecimalFormat;

public class Prob1491 {

    public double average(int[] salary) {

        DecimalFormat df = new DecimalFormat("#.####");
        double sum =0;
        double max = Integer.MIN_VALUE;
        double min =  Integer.MAX_VALUE;
        for(int s :salary){
            sum+=s;
            if(s<min){
                min = s;
            }
            if( s> max){
                max =s;
            }
        }
        sum -= (max+min);
        String str = String.format("%1.5f", sum/(salary.length-2));
        return Double.parseDouble(str);

    }
}
