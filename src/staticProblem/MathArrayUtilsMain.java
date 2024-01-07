package staticProblem;


// 1. MathArrayUtils 객체를 사용하지 않고 사용해라.
// 2. MathArrayUtils 의 인스턴스를 생성하지 못하게 막아라. == 생성자를 private 으로 설정.
public class MathArrayUtilsMain {

    public static void main(String[] args) {

//      new MathArrayUtils();

        int[] nums = {1, 2, 3, 4, 5};
        MathArrayUtils.sum(nums);
        MathArrayUtils.average(nums);
        MathArrayUtils.min(nums);
        MathArrayUtils.max(nums);

    }
}
