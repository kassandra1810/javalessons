package javalessons.algorithms.frogjump;

public class Task2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 85;
        int d = 30;
        int result = Task2.solution(x, y, d);
        System.out.print(result);

    }
    public static int solution(int x, int y, int d) {
        int result;
        if ((y-x)%d != 0) {
            result = (y-x)/d+1;
        } else {
            result = (y-x)/d;
        }
        return result;
    }
}
