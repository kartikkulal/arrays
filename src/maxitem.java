public class maxitem {
    public static void main(String[] args) {
        int[] arr = {
                1,5,6,8
        };
        int large = max(arr);
        System.out.println(large);

    }
    static int max(int[] arr ) {
        int max = arr[0];
        for (int i = 1; i<3 ; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }


        }
        return max;
    };
}
