/**
 * Created by xianggao on 16/1/22.
 *243 find the min distance between two words ina list
 *
 */
public class ShortestWordDistance {
    public int shortestDistance(String[] words, String word1, String word2) {
        if(words==null){
            return 0;
        }
        int distance=words.length;
        int index1=-1;
        int index2=-1;
        for(int i=0;i<words.length;i++){
            if(word1.equals(words[i])){
                index1=i;
            }
            if(word2.equals(words[i])){
                index2=i;
            }
        }
        if(index1!=-1&&index2!=-1){
            distance=Math.min(distance,Math.abs(index1-index2));
        }
        return distance;
    }
}
