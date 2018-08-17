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
     *冒泡排序
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

    /**
     * Get insert sort int [ ].
     *插入排序  从小到大
     *
     * @param a the a
     * @return the int [ ]
     */
    public static int[] getInsertSort(int[] a) {
        if(a == null || a.length == 0) {//判断数组是否为空
            System.out.println("该数组为空！");
            return a;
        }
        int n = a.length;//将数组的长度赋给n是为了防止每次for循环中判断时都调用length方法影响性能
        int temp;//放于for循环外面是为了防止重复创建变量
        int j;
        for(int i = 1; i < n;i++){//排序的趟数
            temp = a[i];//赋给temp是为了防止索引i之前的元素向后移动覆盖了索引i的元素
            j = i-1;
            for(; j>=0&&a[j]>temp; --j) {//将大于i位置元素的元素向后移
                a[j+1] = a[j];
            }
            a[j+1]= temp;//找到i应该在的位置，将值放置此处
        }
        return a;
    }
    public static void main(String[] args) {
        int[] a = {3, 5, 1, 2, 6, 4, 7, 11, 23, 44, 3, 34};
        getInsertSort(a);
        System.out.print("直接插入排序：");
        for(int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
