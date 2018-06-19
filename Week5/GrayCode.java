public class Solution {
    public ArrayList<Integer> grayCode(int a) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<a;i++){
            sb.append("0");
        }
        ArrayList<Integer> res = new ArrayList<Integer>();
        grayCodeUtil(res, sb,a);
        return res;
    }
    public StringBuilder grayCodeUtil(ArrayList<Integer> res, StringBuilder str,int index){
        if(index==0) {
            res.add(Integer.parseInt(str.toString(),2));
            return str;
        }
        str = grayCodeUtil(res,str,index-1);
        str = swap(str,index-1);
        str = grayCodeUtil(res,str,index-1);
        return str;
    }
    /**
     * Invert the bit at index
    */
    public StringBuilder swap(StringBuilder s, int index){
        char temp = (s.charAt(index)=='0')?'1':'0';
        s.setCharAt(index, temp);
        return s;
    }

}

