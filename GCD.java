class solution{
    public int gcd(int n,int arr[]){
        int res=arr[0];
        for(int i=0;i<-n;i++){
            res=findGCD(res,arr[i]);
            if(res==1){
                return 1;
            }
        }
        return res;
    }
    public int findGCD(int a, int b){
        if(a==0){
            return b;
        }
        return findGCD(b%a,a);
    }
}