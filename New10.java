class New10{
    public static void main(String args[]){
        int n=6;
        int number=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=2*i-1;j++){
                if(j%2!=0){
                    System.out.print(number);
                    number++;
                }
                else{
                    System.out.print("*");
                }
               
            }
             System.out.println();
        }

         for(int i=n;i>=1;i--){
            int number1=(i*(i-1))/2 +1;
            for(int j=1;j<=2*i-1;j++){
                if(j%2!=0){
                    System.out.print(number1);
                    number1++;
                }
                else{
                    System.out.print("*");
                }
               
            }
             System.out.println();
        }
    }
}