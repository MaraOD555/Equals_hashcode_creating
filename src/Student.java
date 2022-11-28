
import java.util.Objects;

public class Student {
    //Напишите методы Equals and HashCode для класса Student, который состоит из полей String name и int age.

    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }
    @Override
    public boolean equals(Object o){
        if(this == o){ // проверка ссылок на равенство
            return true;
        }
        if(o == null || getClass() != o.getClass()){ // проверка на null и принадлежность к одному классу
            return false;
        }
        Student student = (Student) o;
        return age == student.age && name.equals(name); // проверка содержание переменных класса одинаковых значений
    }
    @Override
    public int hashCode(){
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
