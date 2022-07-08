import java.util.Objects;

public class Cat implements Animal {

    String name = null;
    int age = 0;
    String color = null;

    public Cat(String name,int age, String color){
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
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name) && color.equals(cat.color);
    }

    @Override
    public int hashCode() {
        int result =42 * (this.color == null ? 0 : color.hashCode());
        result = 42 * (result + this.age);
        result = 42 * result + this.name == null ? 0 : name.hashCode();
        return result;
    }

    @Override
    public void voice(){
        System.out.println("Meow");
    }
}
