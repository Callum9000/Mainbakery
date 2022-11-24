public class PriceChecker {

    public static int getSmallest(int[] a) {
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }

    public static void main(String[] args) {
        int checker[] = { 1, 2, 3 };
        System.out.println("Smallest: " + getSmallest(checker));
    }

}
