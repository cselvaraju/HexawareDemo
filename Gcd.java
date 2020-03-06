import java.io.*;
public  class Gcd { 
    public int gcd(int a, int b) {
        if(a < 0) a = -a;
        if(b < 0) b = -b;
        int n = (a > b) ? b : a;
        while((a % n != 0) || (b % n != 0))
        --n;
        return n;
    }

    public static void main(String[] args) throws Exception {
        int num1, num2;
        // int GCD =1;
        DataInputStream  ds;
        ds = new DataInputStream(System.in);
        System.out.print("The value of num1: ");
        num1 = Integer.parseInt(ds.readLine());

        System.out.print("The value of num2: ");
        num2 = Integer.parseInt(ds.readLine());

        // for(int i = 1; i <= num1 && i <= num2; i++)
        // {
        //     if(num1%i==0 && num2%i==0)
        //         i=GCD;
        //         //break;
        // }
        
        // System.out.println (GCD); 

         

        }
        }
    

