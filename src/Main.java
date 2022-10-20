public class Main {
    public static void main(String[] args) {
        // Домашнее задание 1
        // Задача 1
        int[] w = new int[3];
        w[0] = 1;
        w[1] = 2;
        w[2] = 3;
        System.out.println(w[0]);
        System.out.println(w[1]);
        System.out.println(w[2]);

        float[] y = {1.57F, 7.654F, 9.986F};
        System.out.println(y[0]);
        System.out.println(y[1]);
        System.out.println(y[2]);

        int[] x = {678, -467896, 98642};
        int i;
        for (i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        // Задача 2
        System.out.println(w[0] + ", " + w[1] + ", " + w[2]);
        System.out.println(y[0] + ", " + y[1] + ", " + y[2]);
        System.out.println(x[0] + ", " + x[1] + ", " + x[2]);

        // Задача 3
        System.out.println(w[2] + ", " + w[1] + ", " + w[0]);
        System.out.println(y[2] + ", " + y[1] + ", " + y[0]);
        System.out.println(x[2] + ", " + x[1] + ", " + x[0]);

        // Задача 4
        for (int s = 0; s < w.length; s++) {
            if (w[s] % 2 != 0) {
                System.out.println(w[s] + 1);
            } else {
                System.out.println(w[s]);
            }
        }
    }
}

