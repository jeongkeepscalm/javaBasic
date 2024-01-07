package oop;

import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("상품 몇개를 주문하시겠어요? : ");
        int n = scanner.nextInt(); // 1 \n
        scanner.nextLine(); // 숫자 입력시, 입력 버퍼를 비우기 위한 코드.

        Product[] products = new Product[n];
        for (int i = 0; i < products.length; i++) {

            System.out.println(i + 1 + "번째 정보를 입력하세요. : )");

            System.out.println("상품명 : ");
            String name = scanner.nextLine();

            System.out.println("가격 : ");
            int price = scanner.nextInt();
            scanner.nextLine();

            System.out.println("수량  : ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            products[i] = produceProduct(name, price, quantity);

        }
        print(products);

    }

    public static Product produceProduct(String name, int price, int quantity) {
        Product p = new Product();
        p.name = name;
        p.price = price;
        p.quantity = quantity;
        return p;
    }

    public static int print(Product[] products) {
        int total = 0;
        for (Product p : products) {
            total += p.quantity * p.price;
            System.out.println(p.name + "/" + p.price + "/" +p.quantity);
        }
        System.out.println("total : "+total);
        return total;
    }


}
