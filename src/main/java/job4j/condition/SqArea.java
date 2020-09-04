package job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        if (k <= 0) throw new ArithmeticException("Коэффициент K либо отрицателен, либо равен нулю");
        else if (p <= 0) throw new ArithmeticException("Периметр не может быть отрицательным или равным нулю");
        else {
            double h; // h - height
            h = (double) p / (2 * (k + 1));
            double L; // L - length
            L = h * k;
            double square = L * h;
            return square;
        }
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        double result2 = SqArea.square(6,2);
        System.out.println(" p = 4, k = 1, s = 1, real = " + result1);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result2);
    }
}