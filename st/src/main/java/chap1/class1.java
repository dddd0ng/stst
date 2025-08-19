package chap1;

public class class1 {
    public static void main(String[] args) {
//        String[] studentNames = {"테스트1", "테스트2", "테스트3"};
//        int[] studentAge = {17,18,19};
//        int[] studentgrade = {90,85,88};
//
//        for(int i=0;i<studentNames.length;i++){
//            System.out.println("학생이름: "+studentNames[i]+" 학생나이: "+studentAge[i]+" 학생점수: "+studentgrade[
//                    i]);


//        }

        Student student1;
        student1 = new Student();
        student1.name="학생1";
        student1.age=17;
        student1.grade=80;

        Student student2 = new Student();
        student2.name="학생2";
        student2.age=18;
        student2.grade=80;

        System.out.println(" 학생이름: "+student1.name+" 학생나이: "+student1.age+" 학생점수: "+student1.grade);
        System.out.println(" 학생이름: "+student2.name+" 학생나이: "+student2.age+" 학생점수: "+student2.grade);
//        for(int i=0;i<student1.name.length();i++){
//        System.out.println(" 학생이름: "+student[i].name+" 학생나이: "+student[i].age+" 학생점수: "+student[i].grade);

    }
}
