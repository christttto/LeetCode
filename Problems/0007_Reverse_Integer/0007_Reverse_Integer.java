class Solution {
    public int reverse(int x) {
        StringBuilder stringX = new StringBuilder();
        int result;
        if(x<0){
            stringX.append(String.valueOf(Math.abs(x)));
            stringX.reverse();
            try {
                result = Integer.parseInt(stringX.toString())*-1;
            }
            catch (NumberFormatException e) {
                return 0;
            }
            return result;
        }
        stringX.append(String.valueOf(x));
        stringX.reverse();
        try {
            result = Integer.parseInt(stringX.toString());
        }
        catch (NumberFormatException e) {
            return 0;
        }
        return result;
        
    }
}