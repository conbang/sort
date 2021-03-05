public class Buble {
    public static void main(String[] args) {
        int[] list = {1,3,5,7,2,5,7,2};
        sort(list);

    }
    public static void sort(int[] list){
        boolean needNextPass = true;
        for (int i = 1; i < list.length && needNextPass; i++) {
            needNextPass = false;
            for (int j = 0; j < list.length - i; j++) {
                if (list[j] > list[j + 1]) {
                    System.out.println("swap" + list[j] + "with" + list[j + 1]);
                    int temp = list[j];
                    list[j] = list[j];
                    list[j + 1] = temp;
                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("array's sorted");
                break;
            }

            System.out.println("list after the" + i + "sort:");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
