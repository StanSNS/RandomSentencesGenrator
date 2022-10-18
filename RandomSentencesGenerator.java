package RandomSentencesGenerator;

import java.util.Random;
import java.util.Scanner;

public class RandomSentencesGenerator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] names = {"Peter", "Michell", "Jane", "Steve"};
        String[] places = {"Sofia", "Plovdiv", "Varna", "Burgas"};
        String[] verbs = {"eats", "holds", "sees", "plays with", "brings"};
        String[] nouns = {"stones", "cake", "apple", "laptop", "bikes"};
        String[] adverbs = {"slowly", "diligently", "warmly", "sadly", "rapidly"};
        String[] details = {"near the river", "at home", "in the park"};


        while (true) {
            System.out.println("Click [Enter] to generate a new one.");
            String input = scan.nextLine();
            if (input.equals("")) {
                String randomName = getRandomWord(names);
                String randomPlace = getRandomWord(places);
                String randomVerbs = getRandomWord(verbs);
                String randomNouns = getRandomWord(nouns);
                String randomAdverbs = getRandomWord(adverbs);
                String randomDetails = getRandomWord(details);
                System.out.printf("%s from %s %s %s %s %s.%n", randomName, randomPlace, randomAdverbs, randomVerbs, randomNouns,randomDetails);
            }


        }
    }
    public static String getRandomWord(String[]words){
        Random random = new Random();
        int randomIndex = random.nextInt(words.length);
        String word = words[randomIndex];
        return word;
    }
}
