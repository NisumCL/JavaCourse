import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int variable = 3;
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[0]);
                       // 0xaa01
        exampleMethod(arr);
                           // 0xab11
        //System.out.println(variable);
        //exampleMethod2(variable);
        //System.out.println(variable);
        System.out.println(arr[0]);
        //System.out.println(arr[1]);
        //System.out.println(arr[2]);
        //System.out.println(arr[3]);
        //System.out.println(arr[4]);
    }

                                    // 0xaa01
    public static void exampleMethod(int[] arr) {
        // 0xaa01
        // int[] arr2 = arr;
        // 0xabc01
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        arr2[0]++;
        //int[] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println(arr2[0] + arr2[1] + arr2[2]);
    }

                                      // 0xdf015
    public static void exampleMethod2(int variable) {
        variable = 25;
        System.out.println(variable);
        variable = 80;
        System.out.println(variable);
    }
}