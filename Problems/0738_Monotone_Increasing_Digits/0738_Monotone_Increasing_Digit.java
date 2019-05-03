class Solution {
    public boolean isPerfectSquare(int num) {
        System.out.println("testing"+num);
        if(num<0||num==2)return false;
        if(num<=1||num==4)return true;
        int left=0,right=num/2;
        while(left<=right){
            int middle=(right+left)/2;
            System.out.println(middle);
            if(Math.pow(middle,2)==num)return true;
            else if(Math.pow(middle,2)>num){
                right=middle-1;
            }
            else{//Math.pow(middle,2)<num
                left=middle+1;
            }
        }
        return false;
        
    }
}