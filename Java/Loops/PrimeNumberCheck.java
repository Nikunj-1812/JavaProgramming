package Loops;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        int n =21;
        int i = 2;
        do { 
            
            if(n%i == 0){
                System.out.println("Not prime");
                break;
            }   
            i++;
        }
         while (i*i<=n);
            if(i*i>n){
                System.out.println("Prime");
            }else{
                System.out.println("Not prime");
            }
        }


    }

