public class Review2 {
    public static void main(String[] args) {

        String str = "Welcome to Bridgelabz";

        // Count the characters in a string for the number of times they appeared.

        int [] charactersCount = new int[256];

        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            charactersCount[c]++;
        }

        for (int i = 0; i < charactersCount.length; i++){
            if (charactersCount[i] > 0){
                System.out.println("' " + (char) i + " appears " + charactersCount[i]);
            }
        }
    }
}
