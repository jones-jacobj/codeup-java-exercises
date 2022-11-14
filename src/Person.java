public class Person {
    private String name;

    public Person(String name){
        this.name=name;
    }

    public void setName(String name){
        this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public String sayHello(){
        return String.format("Hello, my name is %s!",this.getName());
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jake");
        System.out.println(p1.sayHello());
    }
}
