import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person[] names = {new Person("David"),new Person("Erek"),new Person("Amanda")};

        for (Person per : names){
            System.out.println(per.getName());
        }

        addPerson(names, new Person("Jake"));
    }

    public static Person[] addPerson(Person[] array, Person newPerson){
        Person[] array2 = Arrays.copyOf(array, array.length+1);
        array2[array2.length-1] = newPerson;

        return array2;
    }
}
