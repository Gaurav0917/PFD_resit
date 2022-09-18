public class week2 {
    public static int findPairs(int[] a) {
        int count = 0;
        int valid = 0;
        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) { // loop to compare x from the pair
            for (int j = 1; j < a.length; j++) { // loop to compare y from the pair
                if (a[i] < a[j] && a[i] * a[i] == a[j]) { // checks y is greater than x and x=y
                    for (int k = 0; k < b.length; k++) { // loop to check the duplicate pairs
                        if (b[k] == a[j]) {
                            valid++; // increase the counter if y is already counted
                        }
                    }
                    if (valid == 0) { // if the pair is not duplicate
                        count++;
                    }
                    b[i] = a[j]; // add the counted value of y in the array
                    valid=0; // reset the value of valid
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = { 2, 4, 16, 3, 16, 4, 2 };
        System.out.println(findPairs(a));
    }
}