public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Matroskin",4,"White-Black");
        Cat cat2 = new Cat("Monya",14,"White");
        Cat cat3 = new Cat("Matroskin",4,"White-Black");
        Cat cat4 = new Cat("Matroskin",4,"White-Black");

        Dog dog1 = new Dog("Sharik",5,"Black");
        Dog dog2 = new Dog("Goofy",3,"Red");
        Dog dog3 = new Dog("Sharik",5,"Black");
        Dog dog4 = new Dog("Sharik",5,"Black");

        //test for diff objects
        System.out.println(cat1.equals(cat2)+"  "+cat1.hashCode()+"  "+cat2.hashCode());
        //test for same objects
        System.out.println(cat1.equals(cat3)+"  "+cat1.hashCode()+"  "+cat3.hashCode());
        //test for symmetry
        System.out.println(cat3.equals(cat1)+"  "+cat3.hashCode()+"  "+cat1.hashCode());
        //test for transitivity
        System.out.println(cat3.equals(cat4)+"  "+cat3.hashCode()+"  "+cat4.hashCode());
        //test for revlexity
        System.out.println(cat1.equals(cat1));
        //test for consistency
        System.out.println(cat1.equals(cat3)+"  "+cat1.hashCode()+"  "+cat3.hashCode());
        System.out.println();

        //test for diff objects
        System.out.println(dog1.equals(dog2)+"  "+dog1.hashCode()+"  "+dog2.hashCode());
        //test for same objects
        System.out.println(dog1.equals(dog3)+"  "+dog1.hashCode()+"  "+dog3.hashCode());
        //test for symmetry
        System.out.println(dog3.equals(dog1)+"  "+dog3.hashCode()+"  "+dog1.hashCode());
        //test for transitivity
        System.out.println(dog3.equals(dog4)+"  "+dog3.hashCode()+"  "+dog4.hashCode());
        //test for revlexity
        System.out.println(dog1.equals(dog1));
        //test for consistency
        System.out.println(dog1.equals(dog3)+"  "+dog1.hashCode()+"  "+dog3.hashCode());
        System.out.println();

        //test for diff classes
        System.out.println(cat1.equals(dog1));
        //tests for null
        System.out.println(cat1.equals(null));
        System.out.println(dog1.equals(null));


    }
}