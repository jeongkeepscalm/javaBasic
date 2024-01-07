public class Main {
    public static void main(String[] args) {

        print("이름1", 17, 90);

    }

    public static void print(String name, int age, int score) {
        StringBuilder sb = new StringBuilder();
        sb.append("name : ");
        sb.append(name);
        sb.append("age : ");
        sb.append(age);
        sb.append("score : ");
        sb.append(score);
        System.out.println(sb);
    }

}
