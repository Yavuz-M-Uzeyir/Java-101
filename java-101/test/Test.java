package patikaProjeler.test;

public class Test {

    static void toString(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] fill(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = val;
        }
        return arr;
    }

    static int search(int[] arr, int num) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    static int[] copyOf(int[] arr, int newLenght) {
        int[] copyList = new int[newLenght];
        for (int i = 0; i < newLenght && i < arr.length; i++) {
            copyList[i] = arr[i];
        }
        return copyList;
    }

    static int[] copyOfRange(int[] arr, int from, int to) {
        int[] rangeList = new int[to - from];
        for (int i = from; i < to && i < arr.length; i++) {
            rangeList[i - from] = arr[i];
        }
        return rangeList;
    }

    static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

    static double signum(double d) {
        if (d >= 0) {
            return 1.0;
        }
        return -1.0;
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    static int min(int a, int b) {
        if (a < b) {
            return a;
        }
        return b;
    }

    static double pow(int a, int b) {
        int c = 1;
        for (int i = 1; i <= b; i++) {
            c *= a;
        }
        return c;
    }
}
