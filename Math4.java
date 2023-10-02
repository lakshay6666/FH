public class Math4 {
    public static void main(String[] args){
        
        String text = "To be or not to be, that is the question; "
                + "Whether `tis nobler in the mind to suffer "
                + "the slings and arrows of outrageous fortune, "
                + "or to take arms against a sea of troubles, "
                + "and by opposing end them?";

        String[] words = text.split("[\\s\\p{Punct}]+");
        
        for (int i = 0; i < words.length - 1; i++) {
            
            for (int j = 0; j < words.length - i - 1; j++) {
                
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0) {
                    
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted words:");
        
        for (String word : words) {
            System.out.println(word);
        }


    }
    
}
