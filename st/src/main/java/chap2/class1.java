package chap2;

public class class1 {
    public static void main(String[] args) {

        Studentt student1 = initStudentt("학생1", 15, 90);
        printStudentt(student1);

        Studentt student2 = initStudentt("학생2", 16, 85);
        printStudentt(student2);

        Studentt student3 = new Studentt(); // 값 대입x => null, 0 출력
        printStudentt(student3); // 값 대입x => null, 0 출력
    }
//        Studentt student1 = new Studentt();
//        student1.name = "학생1";
//        student1.age = 15;
//        student1.grade = 90;
//        Studentt student2 = new Studentt();
//        student2.name = "학생2";
//        student2.age = 16;
//        student2.grade = 85;


    static void printStudentt(Studentt student) {
        System.out.println("이름 : " + student.name + ", 나이 : " + student.age + ", 점수 : " + student.grade);
    }

    static Studentt initStudentt(String name, int age, int grade) {
        Studentt student = new Studentt();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    //        static void initStudentt(Studentt student,String name, int age, int grade){
//            student.name = name;
//            student.age = age;
//            student.grade = grade;
//        }
}





