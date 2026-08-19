package july_2026;

public class ReverseTheWord {
    public static void main(String[] args) {
        String sentence = "I love india";
        String s2 = " ";
        String s3=" ";
        char[] ch = sentence.toCharArray();
        for (int i=0 ; i<ch.length; i++){
            if(ch[i]!=' '){
                s2=s2+ch[i];
            }else{
                s3=s2+s3;
                s2=" ";
            }
        }
        System.out.println(s2+s3);

        String [] st=sentence.split(" ");
        for (int i=st.length-1; i>=0; i--){
            System.out.print(st[i]+" ");
        }
    }
}
