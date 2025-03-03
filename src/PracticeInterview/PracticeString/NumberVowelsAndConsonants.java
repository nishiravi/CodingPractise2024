package PracticeInterview.PracticeString;

public class NumberVowelsAndConsonants {
    public static void main(String[] args) {
        String data = "automation";
        int vowel = 0;
        int consonants = 0;
        for (int i = 0; i < data.length(); i++) {
            if (data.toLowerCase().charAt(i) == 'a' ||
                    data.toLowerCase().charAt(i) == 'e' ||
                    data.toLowerCase().charAt(i) == 'i' ||
                    data.toLowerCase().charAt(i) == 'o' ||
                    data.toLowerCase().charAt(i) == 'u') {
                vowel++;

            } else {
                consonants++;
            }
        }
        System.out.println("vowel count  is "+vowel);
        System.out.println("consonants count  is "+consonants);
    }
}

