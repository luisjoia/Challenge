public class TextAnalyser {
    
    private static final TextAnalyser textAnalyser = new TextAnalyser();
    
    private TextAnalyser(){};

    public static TextAnalyser getTextAnalyser(){
        return textAnalyser;
    }

    public String getUppercase(String text, int nthChar) {
        String uppercaseLetters = "";

        if(text.length() < nthChar || nthChar <= 0) return uppercaseLetters;

        for(int i = nthChar ; i <= text.length(); i+=nthChar){

            if (Character.isUpperCase(text.charAt(i - 1))){

                uppercaseLetters += text.charAt( i - 1);
            }
        }

        return uppercaseLetters;
    }

    public String getNonLowercase(String text, int nthChar) {
        String nonLowerCases = "";

        if(text.length()<nthChar || nthChar<=0) return nonLowerCases;

        for(int i = nthChar ; i <= text.length() - 1; i+=nthChar){

            if (!Character.isLowerCase(text.charAt(i - 1)) || Character.isDigit(text.charAt(i - 1)) || !Character.isAlphabetic(text.charAt(i - 1))){

                nonLowerCases += text.charAt(i - 1);
            }
        }


        return nonLowerCases;
    }

    public String countUppercaseChars(String text, int nthChar) {
        return null;
    }
}
