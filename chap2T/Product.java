package chap2T;

public class Product {
    public static void main(String[] args) {
        /* 설명. chap1T ProductOrderMain */
        ProductOrder[] product = new ProductOrder[3];
        // productName이름, price가격, quantity수량

        ProductOrder product1 = new ProductOrder();
        product1.productName = "두부";
        product1.price = 2000;
        product1.quantity = 2;
        product[0]=product1;

        ProductOrder product2 = new ProductOrder();
        product2.productName = "김치";
        product2.price = 5000;
        product2.quantity = 1;
        product[1]=product2;

        ProductOrder product3 = new ProductOrder();
        product3.productName = "콜라";
        product3.price = 1500;
        product3.quantity = 2;
        product[2]=product3;

        int sum = 0;
        for (ProductOrder pd : product) {
            System.out.println("상품명 : " + pd.productName + ", 가격 : " + pd.price + " , 수량 : " + pd.quantity);
            sum += pd.price * pd.quantity;
        }
        System.out.println("총 결제 금액 : " + sum);

//
//        ProductOrder[] product = new ProductOrder[3];
//        product[0] = CreateOrder("두부",2000,2);
//        product[1] = CreateOrder("김치",5000,1);
//        product[2] = CreateOrder("콜라",1500,2);
//
//        printOr
//
//        static ProductOrder CreateOrder(String productName, int price, int quantity){
//            ProductOrder order = new ProductOrder();
//        }
    }
}
