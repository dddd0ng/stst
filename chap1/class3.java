package chap1;

public class class3 {
    public static void main(String[] args) {

        Student student1 = new Student();
        student1.name = "학생1";
        student1.age = 18;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 19;
        student2.grade = 95;

        Student student3 = new Student();
        student3.name = "학생3";
        student3.age = 17;
        student3.grade = 88;

        Student student4 = new Student();
        student4.name = "학생4";
        student4.age = 18;
        student4.grade = 97;

//

//        Student[] students = new Student[]{student1,student2,student3,student4};
        Student[] students = {student1, student2, student3, student4};
//
//
//        for (int i = 0; i < students.length; i++) {
//            System.out.println("이름" + students[i].name + "나이: " + students[i].age + "점수: " + students[i].grade);
//        }
//        for (int i = 0; i < students.length; i++) {
//            Student s = students[i];
//            System.out.println("이름" + s.name + "나이: " + s.age + "점수: " + s.grade);
//        }
        for (Student s : students) {
            System.out.println("이름" + s.name + "나이: " + s.age + "점수: " + s.grade);


//        System.out.println("이름" + students[0].name + "나이: " + students[0].age + "점수: " + students[0].grade);
//        System.out.println("이름" + students[1].name + "나이: " + students[1].age + "점수: " + students[1].grade);
//        System.out.println("이름" + students[2].name + "나이: " + students[2].age + "점수: " + students[2].grade);
//        System.out.println("이름" + students[3].name + "나이: " + students[3].age + "점수: " + students[3].grade);

        }
    }
}
