package LeetCode.LinesrSearch.SeptThirdTwentySix;

public class SearchString {
    public static void main(String[] args) {
        /*Q1 : Search in String*/

        String name ="Snagram";
        char target='s';
        System.out.println(SearchCharacter2(name,target));
    }

     static boolean SearchCharacter(String name, char target) {
        for(char ch : name.toCharArray()){
            if(ch==target){
                return  true;
            }
        }
        return false;
    }
    static boolean SearchCharacter2(String name, char target) {
        for(int i=0; i<name.length(); i++){
            if(target==name.charAt(i)){
                return  true;
            }
        }
        return false;
    }
}
