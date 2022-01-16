package Activities;

public class Activity2 {
    public static void main(String[] args) {
        System.out.println(sum());
    }

    public static boolean sum() {
        int[] Arr = {10, 77, 10, 54, -11, 10};
        int Total = 0;
        for (int i = 0; i <= 5; i++) {
            if (Arr[i] == 10)
                Total = Total + Arr[i];
        }
        System.out.println(Total);
        return Total == 30;
    }
}
