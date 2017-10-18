import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



class Subject {

    private String name;
    private float grade;

    public Subject(String name, float grade) {
        this.grade = grade;
        this.name = name;

    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }
}

