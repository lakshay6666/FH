public class Math3 {
    public static void main(String[] args)
    {
        String text = "To be or not to be, that is the question;"
        + "Whether `tis nobler in the mind to suffer"
        + " the slings and arrows of outrageous fortune,"
        + " or to take arms against a sea of troubles,"
        + " and by opposing end them?";
        int spaces = 0,
        vowels = 0,
        letters = 0;
        for (int i = 0; i < text.length(); i++){
            char ch = text.charAt(i);

            if(Character.isWhitespace(ch)){
                spaces++;
            }
            else if (Character.isLetter(ch)) {
                letters++;
                if ("aeiouAEIOU".indexOf(ch) != -1) {
                    vowels++;}
                }

        }
        System.out.println("The text contained vowels: " + vowels + "\n"
                         + "consonants: " + (letters - vowels) + "\n"
                         + "spaces: " + spaces);   

    }
    
}
