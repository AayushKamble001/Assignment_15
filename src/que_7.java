public class que_7 {
    static boolean vowels(char ch){
        if (ch =='a' || ch =='e' || ch=='i' || ch=='o' || ch=='u'){
            return true;
        }
        return false;
    }
    static String removeConsonants(String s){
        String ans="";
        for (int i=0;i<s.length();i++){
            if (!vowels(s.charAt(i))){
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "Hello, have a good day";
        String ans = removeConsonants(s);
        System.out.println(ans);
    }
}
