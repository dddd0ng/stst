package chap3T;

public class Solution {
    public static void main(String[] args) {
        Rectangle re = new Rectangle();
        re.width = 5;
        re.height = 8;

        int area = re.area();
        System.out.println("넓이 : " + area);

        int perimeter = re.perimeter();
        System.out.println("둘레 길이 : "+perimeter);

        boolean square = re.square();
        System.out.println("정사각형 여부 : " + square);
    }
}
