public class test {
    public static void main(String[] args) {
        System.out.println(consonantCounter("hatdog"));
        
    }

    public static int consonantCounter(String word2){
        int numOfConsonants = 0;
        char consonantChars[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','y','z'};
        char b;

        for(char a : consonantChars){
            for(int i = 0; i < word2.length(); i++){
                b = word2.charAt(i);
                if(a == b){
                    numOfConsonants++;
                }
            }

        }
        return numOfConsonants;
    }
}
