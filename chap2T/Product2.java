package chap2T;

import java.util.Scanner;

public class Product2 {
    public static void main(String[] args) {
        // productName이름, price가격, quantity수량
        Scanner sc = new Scanner(System.in);
        System.out.print("입력한 주문의 개수를 입력하세요 : ");
        int n = sc.nextInt();
        sc.nextLine();

        ProductOrder[] orders = new ProductOrder[n];
//        ProductOrder[] orders = new ProductOrder[3];

        for (int i = 0; i < orders.length; i++) {
            System.out.println((i+1)+ " 번째 주문 정보를 입력하세요");

            System.out.print("상품명 : ");
            String ProductName = sc.nextLine();

            System.out.print("상품가격 : ");
            int price = sc.nextInt();

            System.out.print("상품갯수 : ");
            int quantity = sc.nextInt();
            sc.nextLine();// 입력 버퍼 지우는 코드
            //nextInt() 다음에는 항상 nextLine()을 추가해서 엔터버 퍼를 제거, 반복 입력할때 에러안남

            orders[i] = createOrder(ProductName, price, quantity);
        }
//        orders[0] = createOrder("두부", 2000, 2);
//        orders[1] = createOrder("김치", 5000, 1);
//        orders[2] = createOrder("콜라", 1500, 2);

        printOrder(orders);
        int sum = getSum(orders);
        System.out.println("총 결제 금액 : " + sum);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrder(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + " , 수량 : " + order.quantity);
        }
    }

    static int getSum(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += order.price * order.quantity;
        }
        return sum;
    }
}
