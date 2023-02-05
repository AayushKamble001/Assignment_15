public class que_6 {
    static boolean checkCharacter(String s){

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='e'){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "Umbrella";
        System.out.println(checkCharacter(s));

    }
}
