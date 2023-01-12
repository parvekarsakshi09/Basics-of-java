public class practiceset6 {
    public static void main(String[] args) {
        //sum of all elements in an array
        float[] arr = {23.5f, 5.5f, 6.5f, 98.5f, 13.5f};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

        }
        System.out.println(sum);
        //element present in an array or not
        float[] ar = {23.5f, 5.5f, 6.5f, 98.5f, 13.5f};
        float el = 98.57f;
        boolean isinrr = false;
        for (int i = 0; i < arr.length; i++) {
            if (el == ar[i]) {
                isinrr = true;
                break;
            }


        }
        if (isinrr) {
            System.out.println("it is present");

        } else {
            System.out.println("not in arr");
        }
        //find sum and avg of array
        float[] array = {23.5f, 5.5f, 6.5f, 98.5f, 13.5f};
        float sumo = 0, avg = 0;
        for (float elem : array) {
            sumo = sumo + elem;
            avg = sumo / 5;

        }
        System.out.println(sumo);
        System.out.println(avg);
        //
        int[][] m = new int[2][2];
        int[][] m1 = new int[2][2];
        int[][] sumji = new int[2][2];
        m[0][0] = 1;
        m[0][1] = 2;
        m[1][0] = 3;
        m[1][1] = 4;
        m1[0][0] = 1;
        m1[0][1] = 2;
        m1[1][0] = 3;
        m1[1][1] = 4;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                sumji[i][j] = m[i][j] + m1[i][j];
            }

        }
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                System.out.print(sumji[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
        //reversing the array
        int[] arru = {23, 5, 6, 98, 13};
        int l = arru.length;
        int temp;
        int u = Math.floorDiv(l, 2);
        for (int h = 0; h < u; h++) {
            temp = arru[h];
            arru[h] = arru[l - h - 1];
            arru[l - h - 1] = temp;
        }
        for (int ele : arru) {
            System.out.println(ele + "");
        }
            //to check whether the array is sorted or not
            int[] arrayj = {26, 29, 75, 6, 99};
            boolean issorted = true;
            for (int i = 0; i < arrayj.length - 1; i++) {
                if (arrayj[i] > arrayj[i + 1]) {
                    issorted = false;
                    break;
                }
            }
            if (issorted) {
                System.out.println("yess sorted");
            } else {
                System.out.println("nott");
            }
            int[] aray = {26, 29, 75, 6, 99};
            int min = aray[0];
            for (int e : aray) {
                if (e < min) {
                    min = e;
                }
            }
            System.out.println("min" + min);

            int[] ary = {26, 29, 75, 6, 99};
            int max = Integer.MIN_VALUE;
            for (int e : ary) {
                if (e > max) {
                    max = e;
                }
            }
            System.out.println("mx" + max);
            System.out.println(Integer.MIN_VALUE);
            System.out.println(Integer.MAX_VALUE);
        }
    }
