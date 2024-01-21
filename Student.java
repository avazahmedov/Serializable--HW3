import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Random;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Student implements Serializable {
    private String name;
    private int age;

    @JsonIgnore
    transient double GPA;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.GPA = new Random().nextInt(3, 6);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
