class Solution {
    public int addDigits(int num) {
        if(num/10==0) return num;
        int myNum=0;
        while(num>0){
            myNum+=num%10;
            num=num/10;
        }
        return addDigits(myNum);
    }
}
