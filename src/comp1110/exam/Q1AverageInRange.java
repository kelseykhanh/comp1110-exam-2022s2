package comp1110.exam;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Q1AverageInRange {

    /**
     * Given an array of integers and a start and end value, return the
     * the average of the array elements that are within the range from
     * start to end, inclusive; that is, the average of all values v in
     * the array such that start <= v <= end.
     * <p>
     * Note that start and end are values, **not** array indices.
     * <p>
     * For example:
     * <p>
     * If the array contains {20,1,5,2,33}, start is 5 and end is 40, the
     * average is (5 + 20 + 33) / 3 = 19.33333.
     * <p>
     * If there are no values in the array that fall within the specified
     * range, the average is undefined; in this case the method should
     * return the end value.
     *
     * @param in    an array of integers.
     * @param start the start value of the range (inclusive).
     * @param end   the end value of the range (inclusive).
     * @return the average of the elements with value between start to end,
     * or end if the average is undefined (no values within range).
     */
    public static double averageInRange(int[] in, int start, int end) {
        List<Integer> valueInRange = new ArrayList<>();

        for (int value : in) {
            if (value <= end && value >= start) {
                valueInRange.add(value);
            }
        }

        if (valueInRange.isEmpty()) {
            return end;
        } else {
            double sum = 0;
            for (int value : valueInRange) {
                sum += value;
            }
            return sum / valueInRange.size();

        }

    }
}