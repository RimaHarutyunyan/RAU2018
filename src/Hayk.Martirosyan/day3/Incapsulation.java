package day3;

public class Incapsulation {



    public static void main(String[] args) {
//        Incapsulation test = new Incapsulation();
//        System.out.println(test.age);
        Person person = new Person();
//        person.name = "Narek";
//        System.out.println(person.name);
          person.a="a";

    }
}

class Person {
    private String name;
    protected String a;
    //    public boolean equals(Incapsulation that) {
//        return this.age.equals(that.age);
//    }

    public void copyTo(Person other){
//        other.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
