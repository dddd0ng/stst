package chap2T;

public class Product {
    public static void main(String[] args) {
        // productName이름, price가격, quantity수량
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = createOrder("두부", 2000, 2);
        orders[1] = createOrder("김치", 5000, 1);
        orders[2] = createOrder("콜라", 1500, 2);

        printOrder(orders);
        int sum = getSum(orders);
        System.out.println("총 결제 금액 : "+ sum);
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




//        /* 설명. chap1T ProductOrderMain */
//        ProductOrder[] product = new ProductOrder[3];
//        // productName이름, price가격, quantity수량
//
//        ProductOrder product1 = new ProductOrder();
//        product1.productName = "두부";
//        product1.price = 2000;
//        product1.quantity = 2;
//        product[0]=product1;
//
//        ProductOrder product2 = new ProductOrder();
//        product2.productName = "김치";
//        product2.price = 5000;
//        product2.quantity = 1;
//        product[1]=product2;
//
//        ProductOrder product3 = new ProductOrder();
//        product3.productName = "콜라";
//        product3.price = 1500;
//        product3.quantity = 2;
//        product[2]=product3;
//
//        int sum = 0;
//        for (ProductOrder pd : product) {
//            System.out.println("상품명 : " + pd.productName + ", 가격 : " + pd.price + " , 수량 : " + pd.quantity);
//            sum += pd.price * pd.quantity;
//        }
//        System.out.println("총 결제 금액 : " + sum);
//        }
