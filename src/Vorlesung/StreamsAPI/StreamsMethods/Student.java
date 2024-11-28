package Vorlesung.StreamsAPI.StreamsMethods;


class Student {
    String name;
    int age;


    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}