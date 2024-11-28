package Vorlesung.StreamsAPI.ExampleWithStreamAPI.Frontend;

public class StudentMappedAge {
    private int age;

    public StudentMappedAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MappedStudent{" +
                "age=" + age +
                '}';
    }
}
