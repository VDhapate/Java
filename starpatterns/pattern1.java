
class pattern1{
    public static void main(String args[]){
        int rows = 5;
       
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        /*--------------------------- */
        for (int i = rows; i >=1; i--) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        /*--------------------------- */
        for (int i = 1; i<=rows; i++) {
            for (int j = 1; j <= i ; j++) {
                if(i%2==0){
                System.out.print(1);}
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        /*--------------------------- */

        System.out.println();
        int a,b;
        for(a=1;a<=3;a++){
            for(b=1;b<=3;b++){
                System.out.print(b);
                System.out.print(a);
            }System.out.print(" ");
            System.out.println();
        }
        /*--------------------------- */
        for (int i = 1; i<=rows; i++) {
            for (int j = 1; j <= i ; j++) {
                if((i+j)%2==0){
                System.out.print(1);}
                else{
                    System.out.print(0);
                }
            }
            System.out.println();
        }

        
    }

    }

