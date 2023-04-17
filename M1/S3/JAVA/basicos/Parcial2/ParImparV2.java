import java.io.*;
class ParImpar
  {
   public static void main (String[] args)
     {
      int [] numeros = {3,9,4}
      int par = 0, impar = 0, parimpar = 0;
      int i = 0 ;
      while (i <= 2)
       { 
        parimpar = numeros[i] % 2;
        if (parimpar == 0)
          {
           par++;
          }
        el se
           {
            impar++;
           }
        i++;
       }
      System.out.println("Cantidad de numeros PARES:" +par");
      System.out.println("Cantidad de numeros IMPARES:" +impar");
    }
  }