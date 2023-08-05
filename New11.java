class New11{
    public static void main(String args[]){
        int n=3;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j%2==0){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(number+++" ");
                }
                
            }
            System.out.println();
        }

        for(int i=n;i>=1;i--){
            for(int j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(int j=1;j<=2*i-1;j++){
                if(j%2==0){
                    System.out.print("*"+" ");
                }
                else{
                    System.out.print(number++ +" ");
                }
                
            }
            System.out.println();
        }
    }
}