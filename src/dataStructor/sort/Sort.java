package dataStructor.sort;

public class Sort {
    /**
     * Select sort.
     *
     * 选择排序  从大到小
     * @param a   目标数组
     */
    public static int[] selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            int k = i;
            // 找出最小值的小标
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[k]) {
                    k = j;
                }
            }
            // 将最小值放到排序序列末尾
            if (k > i) {
                int tmp = a[i];
                a[i] = a[k];
                a[k] = tmp;
            }
        }
        return a;
    }

    /**
     * Pop sort int [ ].
     *
     * 从大到小
     * @param a the a
     * @return the int [ ]
     */
    public static int[] popSort(int[] a){
        int n=a.length;
        for(int j=n;n>0;n--) {
            for (int i = 0; i < j - 1; i++) {
                if (a[i] < a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                }
            }
        }
        return a;
    }
}
