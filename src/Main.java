public class Main {
    public static void main(String[] args) {
        double[] numbers = {-1.1, 2.3, 5.1, 2.2, -5.1, -1.9, 1.2, 4.5, -9.9, 1.3, -5.5, 4.6, 9.5, -2.2, -3.3};

        int i = 0;
        double result = 0;
        boolean check = false;
        for (double d : numbers) {
            if (d < 0) {
                check = true;}
            if (d > 0 && check) {
                result = d + result;
                i++;
            }
        }
        double average = result / i;
        System.out.println("arithmetic average" + average);
    }
    }
