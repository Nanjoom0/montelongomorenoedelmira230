//TABLAS MULTIPLICACION
import java.io.*;
class TablasdeMultiplicar
{
 public static void main (String[]args)
  {
    int A[][]={{5,1,0},{5,2,0},{5,3,0}};
    int B[][]={{0,0,0},{0,0,0},{0,0,0}};
    for(int f=0; f<A.length; f++)
    {
     for(intc=0;c<A[f].length;c++)
      {
      B[f][c]=(A[f][c]);
      }
    }
     System.out.println("B[f][c]");
   }
}