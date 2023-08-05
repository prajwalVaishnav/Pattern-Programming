class Example10{
    public static void main(String args[]){
        for(int i=1;i<=3;i++){
            for(int j=2;j>=i;j--){
                System.out.print(" ");
            }
            int m=1;
            for(int j=1;j<=3;j++){
                if(i%2!=0){
                    System.out.print(m++);
                }
                else{
                    System.out.print("*");
                }

            }
            for(int j=2;j<=i;j++){
                if(i%2!=0){
                    System.out.print(m++);
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}