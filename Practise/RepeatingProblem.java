package Practise;

import java.util.LinkedHashMap;
import java.util.Map;

public class RepeatingProblem {
     static char firstUnique(String s){
        Map<Character,Integer> count=new LinkedHashMap<>();
        for(char ch:s.toCharArray()) {
            count.put(ch, count.getOrDefault(ch,0)+1);
        }  
        for(Map.Entry<Character,Integer>e:count.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        } 
        return '-';
        }
    public static void main(String[] args) {
       System.out.println("AnkitMadhdeshyia");
       System.out.println("AnkitMadhdeshyia");
       System.out.println("AnkitMadhdeshyia");
       System.out.println( RepeatingProblem.firstUnique("ankitMadhdeshyia"));;
       

    }
}
