import java.util.HashMap;

/**
 * Created by xianggao on 16/1/22.
 */
public class PalindromePermutation {
    //Given a string, determine if a permutation of the string could form a palindrome.
    public boolean canPermutePalindrome(String s) {
        /*
        use a hashmap to count how many time each character apperas
        care for the length of the String, even/odd
         */
        if(s==null||s.length()<1)//corner case
         {
             return false;
         }
        HashMap<Character,Integer> map=new HashMap<Character, Integer>();
        for(int i=0;i<s.length();i++){
            char letter=s.charAt(i);
            if(map.containsKey(letter)){
                map.remove(letter);
            }else{
                map.put(letter,1);
            }
        }
        if(map.size()>1){
            return false;
        }else{
            return true;
        }
    }
}
