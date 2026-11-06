public class Vowel{
    public static void main(String[] args) {
        String str="Ankit Madhdeshyia";
        String name=str.toLowerCase();
          int count=0;
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
              count++;
            }
        }
        System.out.println(count);
    }
}