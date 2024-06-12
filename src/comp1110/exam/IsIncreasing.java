package comp1110.exam;

public class IsIncreasing<T extends Comparable<T>> {

    /**
     * Check if the given sequence is sorted in (non-strictly) increasing
     * order, as determined by the natural order of the type T. That is,
     *
     * sequence[i].compareTo(sequence[j]) <= 0
     *
     * for every pair of indices i and j such that i < j,
     *
     * An empty sequence is defined to be increasing.
     *
     * @param sequence An array of objects.
     * @return true if the sequence is increasing, false otherwise.
     */
    public boolean isIncreasing(T[] sequence) {
	// Note: this is not a correct implementation of the method.
            if (sequence == null || sequence.length == 0) {
                return true; // An empty sequence is defined to be increasing
            }

            for (int i = 0; i < sequence.length - 1; i++) {
                if (sequence[i].compareTo(sequence[i + 1]) > 0) {
                    return false;
                }
            }
            return true;
        }
    }