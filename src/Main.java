import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<Student, List<Subject>> studentSubjects = new HashMap<>();

        Student student1 = new Student("John", "Smith");
        Student student2 = new Student("Alice", "Monroe");
        Student student3 = new Student("Adam", "Monroe");

        Subject subject1Student3 = new Subject("Math", 4.0f);
        Subject subject2Student3 = new Subject("English", 4.5f);
        Subject subject3Student3 = new Subject("Biology", 3.0f);

        Subject subject1Student1 = new Subject("Math", 4.0f);
        Subject subject2Student1 = new Subject("English", 5.5f);
        Subject subject3Student1 = new Subject("Biology", 3.0f);

        Subject subject1Student2 = new Subject("Math", 1.0f);
        Subject subject2Student2 = new Subject("English", 2.0f);
        Subject subject3Student2 = new Subject("Biology", 1.0f);


        List<Subject> student1Subjects = new ArrayList<>();
        student1Subjects.add(subject1Student1);
        student1Subjects.add(subject2Student1);
        student1Subjects.add(subject3Student1);

        List<Subject> student2Subjects = new ArrayList<>();
        student2Subjects.add(subject1Student2);
        student2Subjects.add(subject2Student2);
        student2Subjects.add(subject3Student2);

        List<Subject> student3Subjects = new ArrayList<>();
        student3Subjects.add(subject1Student3);
        student3Subjects.add(subject2Student3);
        student3Subjects.add(subject3Student3);

        studentSubjects.put(student1, student1Subjects);
        studentSubjects.put(student2, student2Subjects);
        studentSubjects.put(student3, student3Subjects);

        for (Map.Entry<Student, List<Subject>> entry : studentSubjects.entrySet()) {
            checkIfSudentHasGoddOrBadGrades(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Student, List<Subject>> entry : studentSubjects.entrySet()) {
            checkIfSudentHasGoddGrades(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<Student, List<Subject>> entry : studentSubjects.entrySet()) {
            countAverage(entry.getKey(), entry.getValue());}

    }



    private static void checkIfSudentHasGoddOrBadGrades(Student student, List<Subject> subjects) {
        int badGrade = 0;
        int goodGrade = 0;
        for (Subject subject : subjects) {
            if (subject.getGrade() == 1) {

                badGrade++;
            }
        }           if(badGrade>=1) System.out.println("Student " + student + "has " + badGrade+ " bad grades");


    }
    private static void checkIfSudentHasGoddGrades(Student student, List<Subject> subjects) {
        int goodGrade = 0;
        for (Subject subject : subjects) {
            if (subject.getGrade() >= 5) {

                goodGrade++;
            }
        }          if (goodGrade>=1) System.out.println("Student " + student + "has " + goodGrade+ " good grades");


    }
    private static void countAverage(Student student, List<Subject> subjects) {
        float studentAvg=0.0f;
        float gradesSum = 0.0f;
        for (Subject subject : subjects) {

                gradesSum += subject.getGrade();
                studentAvg = gradesSum / subjects.size();

            }

if (studentAvg>=2.0f) System.out.println("Student: " + student.toString() + " has avarage: " + studentAvg);


    }


}














