class Solution {
    public ArrayList<Integer> fibonacciNumbers(int n) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        int a=0;
        int b=1;
        while(n>0){
            ans.add(a);
            int next=a+b;
            a=b;
            b=next;
            n--;
        }
        return ans;
        
    }
}