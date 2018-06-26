import java.util.*;

public class Solution {
    public int ladderLength(String start, String end, ArrayList<String> dictV) {
    

        
        Queue<String> queue = (Queue<String>) new ArrayDeque<String>();
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        // int res = 1;
        if(start.equals(end))
            return 1;
        queue.add(start);
        String current;
        boolean found = false;
        map.put(start, 1);
        while(!queue.isEmpty()){
            current = queue.remove();
            for(int i=0;i<dictV.size();i++){
                if(isAdjacent(current,dictV.get(i))){
//                    found = true;
                    queue.add(dictV.get(i));
                    if(dictV.get(i).equals(end)){
                        return map.get(current)+1;
                    }
                    // res++;
                    map.put(dictV.get(i), map.get(current)+1);
                    dictV.remove(i);
                }
            }
//            if(found){
//                res++;
//                found = !found;
//            }
        }
        return 0;

    

    }
    
    
    
    /*
    *return true if their is exactly one change in the string.
    */
    public boolean isAdjacent(String start, String end){
        int count = 0;
        for(int i=0;i<start.length();i++) {
            if(start.charAt(i)!=end.charAt(i))
                count++;
            if(count>1)
                return false;
        }
        return (count==1?true:false);
    }
}

