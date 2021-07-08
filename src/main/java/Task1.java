public class Task1 {
    /**
     * You might know some pretty large perfect squares. But what about the NEXT one?
     * <p>
     * Complete the findNextSquare method that finds the next integral perfect square after the one passed as a parameter. Recall that an integral perfect square is an integer n such that sqrt(n) is also an integer.
     * <p>
     * If the parameter is itself not a perfect square then -1 should be returned. You may assume the parameter is positive.
     * <p>
     * Examples:
     * <p>
     * findNextSquare(121) --> returns 144
     * findNextSquare(625) --> returns 676
     * findNextSquare(114) --> returns -1 since 114 is not a perfect
     */

    public static long findNextSquare(long sq) {
        if(sq != Math.floor(Math.sqrt(sq)) * Math.floor(Math.sqrt(sq))){
            return -1;
        }
        double x = Math.sqrt(sq);
        x++;
        return Math.round(x*x);
    }
    }
