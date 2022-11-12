package easy;

public class Prob1523 {

    public int countOdds(int low, int high) {
        // 3 7
        if(low%2!=0 && high%2!=0){
            if(low == high){
                return 1;
            }
            return 2 + (high-low-1)/2;
        }

        // 3 8
        if(low%2!=0 || high%2!=0){
            return 1 + (high-low)/2;
        }
        return (high-low)/2;

    }
}
