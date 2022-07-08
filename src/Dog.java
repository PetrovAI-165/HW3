import java.util.Objects;

public class Dog implements Animal{

    String name;
    int age;
    String color;

    public Dog(String name,int age, String color){
        this.age = age;
        this.name = name;
        this.color = color;
    }

    @Override
    public boolean setName(String name) {
        return true;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getColor() {
        return this.color;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && name.equals(dog.name) && color.equals(dog.color);
    }

    @Override
    public int hashCode() {
        int result = this.color == null ? 0 : color.hashCode();
        result = result + this.age;
        result = result + this.name == null ? 0 : name.hashCode();
        return result;
    }

    @Override
    public void voice(){
        System.out.println("Woof");
    }
}
