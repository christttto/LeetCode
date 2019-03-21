class Solution {
    public int findContentChildren(int[] g, int[] s) {
        java.util.Arrays.sort(g);//spoiled kids
        java.util.Arrays.sort(s);//my cookies
        int happy=0;
        int i=g.length-1;//spoiled kids iterator
        int j=s.length-1;//cookie iterator
        while(i>=0&&j>=0){
            System.out.println(i+" "+j);
            if(g[i]<=s[j]){//my cookie is bigger or same
                happy++;
                i--;
                j--;
            }
            else{
                i--;
            }
        }
        return happy;
    }
}