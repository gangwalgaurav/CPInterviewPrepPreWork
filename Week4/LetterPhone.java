public class Solution {
    static HashMap<Character, char[]> map = new HashMap<Character, char[]>();

    
    public ArrayList<String> letterCombinations(String A) {
        map.put('0', new char[]{'0'});
        map.put('1', new char[]{'1'});
        map.put('2', new char[]{'a','b','c'});
        map.put('3', new char[]{'d','e','f'});
        map.put('4', new char[]{'g','h','i'});
        map.put('5', new char[]{'j','k','l'});
        map.put('6', new char[]{'m','n','o'});
        map.put('7', new char[]{'p','q','r','s'});
        map.put('8', new char[]{'t','u','v'});
        map.put('9', new char[]{'w','x','y','z'});
        
        if(A == null || A.isEmpty())
            return null;
        ArrayList<String> result = new ArrayList<String>();
        generateCombination(result,new StringBuilder(),A,0);
        return result;
    }
    
    public static void generateCombination(ArrayList<String> result, StringBuilder sb, String digits,int index) {
        if(index>=digits.length()){
            result.add(sb.toString());
            return;
        }
        char c = digits.charAt(index);
        char[] arr = map.get(c);
     
        for(int i=0; i<arr.length; i++){
            sb.append(arr[i]);
            generateCombination(result, sb, digits, index+1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}

