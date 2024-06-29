class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 8, 3, 1};

        for (int i = 1; i < arr.length; i++) {
            int curridx = i - 1;
            int ele = arr[i];

            while (curridx >= 0 && ele < arr[curridx]) {
                arr[curridx + 1] = arr[curridx];
                curridx--;
            }
            arr[curridx + 1] = ele;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
