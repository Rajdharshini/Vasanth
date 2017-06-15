import java.util.*;
  class Bhuone {
        public static void main(String args[])
        {
           Scanner s=new Scanner(System.in);
           String s1=s.next();
           int k=s.nextInt();
           char ch[]=s1.toCharArray();
           Arrays.sort(ch);
           
           int l=ch.length-k;
           for(int i=0;i<l;i++)
           {
               System.out.print(ch[i]);
           }
        }
   }
