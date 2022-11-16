import java.util.Random;

public class ServerNameGenerator {
    static String[] nouns = {"Tree","Kitten","Elephant","Otter","Lamp","DirtBike","Shrubbery","Sailboat","Airplane"};
    static String[] adjectives = {"Fiery","Illuminated","Chilly","Happy","Sleepy","Bouncy","Lost","Energetic","Athletic"};

    public static String getRandom(String[] array){
        Random rnd = new Random();
        return array[rnd.nextInt(0,array.length-1)];
    }

    public static void main(String[] args) {
        System.out.println(String.format("Here is your server name.\n%s-%s",getRandom(adjectives),getRandom(nouns)));
    }
}
