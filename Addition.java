class Addition
{

 public static void main(String args[])
 {
  
   Addition.sum(7,3);
   Addition.diff(10,3);

 }

 public static void sum(int num1,int num2)
 {

  int sum1=num1+num2;
  System.out.println("sum is: " +sum1);

 }
 
 public static void diff(int num1,int num2)
 {

  int diff1=num1-num2;
  System.out.println("difference is: " +diff1);

 }


}