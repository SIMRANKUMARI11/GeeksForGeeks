class Solution {
    double power(double b, int e) {
        long exp=e;
        if(exp<0){
            b=1.0/b;
            exp=-exp;
        }
        double ans =1.0;
        while(exp>0){
            if(exp%2==1){
                ans*=b;
                
            }
            b*=b;
            exp/=2;
            
        }
        return ans; 
    }
}
// class Solution {
//     double power(double b, int e) {
//         // code here
//         double ans=1;
//         for(int i=1;i<=e;i++){
//             ans=ans*b;
//         }
//         return ans;
        
//     }
// }
