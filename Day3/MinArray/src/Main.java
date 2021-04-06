public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -22, 0, -1, -15};
        System.out.println(getMinValue(arr));
    }

    static String getMinValue(int[] arr) {
        int minValue = arr[0];
        int index = 0 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                index = i;
            }
        }
        return "Gia tri nho nhat cua mang la " + minValue + ",nam o vi tri thu " + index;
    }
}
