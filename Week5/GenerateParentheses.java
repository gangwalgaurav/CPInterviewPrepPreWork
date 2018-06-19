public class Solution {
    public String[] generateParenthesis(int A) {
        ArrayList<String> list = new ArrayList<String>();
        generate(list,"",0,0,A);
        String res[] = new String[list.size()];
        for(int i=0;i<list.size();i++)
            res[i]=list.get(i);
        return res;
    }
    
    public void generate(ArrayList<String> list,String str, int open, int close,int max){
        if(str.length() == 2*max)
            list.add(str);
        if(open<max)
            generate(list,str+"(",open+1,close,max);
        if(close<max)
           generate(list,str+")",open,close+1,max);
        // if(open < max)
        //     backtrack(list, str+"(", open+1, close, max);
        // if(close < open)
        //     backtrack(list, str+")", open, close+1, max);

    }
}

