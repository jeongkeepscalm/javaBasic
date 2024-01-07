package staticProblem;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MathArrayUtils {

    private MathArrayUtils() {} // MathArrayUtils 의 인스턴스를 생성하지 못하게 막는다.

    public static int sum(int[] nums) {
        int sum = IntStream.of(nums).sum();
        System.out.println("sum : " + sum);
        return sum;
    }

    public static double average(int[] nums) {
        int average = IntStream.of(nums).sum() / nums.length;
        System.out.println("average : " + average);
        return average;
    }

    public static int min(int[] nums) {
        int min = Arrays.stream(nums).min().orElse(Integer.MIN_VALUE);
        System.out.println("min : " + min);
        return min;
    }

    public static int max(int[] nums) {
        int max = Arrays.stream(nums).max().orElse(Integer.MAX_VALUE);
        System.out.println("max : " + max);
        return max;
    }
}
