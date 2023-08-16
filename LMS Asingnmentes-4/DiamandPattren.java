/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/
public class DiamondPattern {

//Add main method here

//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)

//use for loop and if condition to print a,b,c 
    
  public static void main(String[] args)
  {
    int i=3,j =5;
    int ch=97;
    for(int k=1;k<=i;k++)
      {
        for(int m=1;m<=i-k;m++)
          {
            System.out.print(" ");
          }
        for(int m=1;m<=2*k-1;m++)
          {
            if(m<=k)
            {
              System.out.print((char)(m+96));
              System.out.print(" ");
              
            }
            else
            {
             System.out.print((char)(2*k-m+96));
              System.out.print(" ");
            }
          }
        System.out.println();
      }
    for(int k=i-1;k>=1;k--)
      {
        for(int m=1;m<=i-k;m++)
          {
            System.out.print(" ");
          }
        for(int m=1;m<=2*k-1;m++)
          {
            if(m<=k)
            {
              System.out.print((char)(m+96));
              System.out.print(" ");
            }
            else      
            {
               System.out.print((char)(2*k-m+96));
               System.out.print(" ");
            }
          }
         System.out.println();
      }
    

  }
}



//Add main method here

//Declare variables i,j,k,m and initialize ch=97(because we are printing alphabet a)

//use for loop and if condition to print a,b,c 
     
