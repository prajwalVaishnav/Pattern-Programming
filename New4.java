class New4{
    public static void main(String args[]){
        int n=4;
        int count=1;
       
        
       
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
                
                if(j%2!=0){
                    System.out.print(count);
                    count++;
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }

        

        for(int i=n;i>=1;i--){
            for(int j=1;j<=2*i-1;j++){
                
                if(j%2!=0){
                    System.out.print(count);
                    count--;
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println();
        }
    }
}