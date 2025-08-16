class ABCDpattern{
    public static void main(String args[])
    {
        int i; int j;
        for(i=1; i<=1; i++){
        for(j=1; j <=5; j++)
        {
            System.out.print("*");
        }System.out.println(" ");
    }
    int n, m;
    int size = 5;
    for(n=1; n<=size; n++)
    {
        for(m=1; m<=size; m++){
            if(n==1 || n==size || m==1 || m==size){
                System.out.print("*");
            }else{System.out.print(" ");}
        }System.out.println(" ");
    }
    int rows= 6;
    for(int a=1; a<=rows; a++){
        for(int b=1; b<=a; b++){
            if( b==1 || a==rows || b==a){
            System.out.print("*");}
            else{
            System.out.print(" ");}
        }System.out.println();
    }
    int u,v;
    int f=5;
    for(u=1; u<=f; u++){
        for(v=f;v>=u; v--){
            System.out.print("*");
            System.out.print(" ");
        }System.out.println();

    }
    int fibe=5;
    for(int x=1; x<=fibe; x++){
        for(int y=1; y<=fibe-x; y++){
            System.out.print("@");
        }
        for(int y=1; y<=x; y++)
        {
            System.out.print("*");
        }
            System.out.println();
    }
    }
}