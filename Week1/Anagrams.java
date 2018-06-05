import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<ArrayList<Integer>> anagrams(final List<String> A) {
        HashMap<String,ArrayList<Integer>> map = new HashMap<String,ArrayList<Integer>> ();
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        if(A == null || A.isEmpty()) {
            return result;
        }
        
        for(int i=0;i<A.size();i++){
            String word = A.get(i);
            ArrayList<Integer> list;
            char [] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sortedWord = String.valueOf(charArray);
            //.toString();
            if(map.containsKey(sortedWord)){
                list = map.get(sortedWord);
            } else {
                list = new ArrayList<Integer>();
            }
            list.add(i+1);
            map.put(sortedWord, list);
        }
        for(Map.Entry<String, ArrayList<Integer>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }
}
