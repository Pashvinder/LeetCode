class Solution {
    public double myPow(double x, int n) {
        long pw=n;
        if(pw<0){
            x=1/x;
            pw=-pw;
        }
        double ans=1;
        while(pw>0){
            if(pw%2==1){
                ans*=x;
            }
            x*=x;
            pw=pw/2;
        }
        return ans;
    }
}