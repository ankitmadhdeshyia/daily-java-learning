public class MaxAndMin {
    public static void main(String[] args) {
        // int [] ankit={1,2,3,4,6,12,8,9};
        // // int max=Integer.MIN_VALUE;
        // for(int i=ankit.length-1;i>=0;i--){
        //     System.out.print(ankit[i]);
        //     System.out.print(",");
        // }
        String name="ankitmadhdeshyiaisgoodboy";
        int countVowel=0;
        int consonent=0;
        char result;
        for(int i=0;i<name.length();i++){
            result=name.charAt(i);
            if(result=='a' || result=='e'|| result=='i'|| result=='o'|| result=='u'){
                countVowel++;

            }else{
           consonent++;
            }
            
        }
        System.out.println("No Of Consonent"+" "+consonent);
        System.out.println("No Of Vowel"+","+""+countVowel);
    }
}
