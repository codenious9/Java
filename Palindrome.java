class Solution {
    public boolean isPalindrome(int x) {
        int org_num = x;
        int revNum=0;
        while(org_num>0){
            int pop = org_num%10;
            revNum= revNum*10 + pop;
            org_num=+org_num/10;
        }
        
        if(revNum==x) return true;
        else return false;
        
        
    }
}
