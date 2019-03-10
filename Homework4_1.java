package classwork4;

public class Homework4_1 {
    public static String uniqueСhar() {
        String l = "";
        String str = "Beautiful world";
        int count = 0;
        char chars[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++){
            for (int j = 0; j < str.length(); j++){
                if (chars[i] == chars[j] && i != j){
                    count++;
                }
            }
            if (count < 1){
                l += str.charAt(i);
            } else {
                count = 0;
            }
        }
        return l;
    }
    public static void main(String[] args) {
        System.out.println("Unique chars ->" + uniqueСhar());
    }
}
