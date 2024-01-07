package poly.test2;

public abstract class PayStore {

    // 변하는 부분
    public static Pay findPay(String option) {
        if (option.equals("naver")) {
            return new Naver();
        } else if (option.equals("kakao")) {
            return new Kakao();
        } else {
            return new DefaultPay();
        }

    }
}
