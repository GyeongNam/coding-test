class Solution {
    public int solution(int a, int b) {
        
        String as = a+""+b;
        String bs = b+""+a;
        
        int av = Integer.parseInt(as);
        int bv = Integer.parseInt(bs);
  
        return av>bv ? av:bv;
    }
}