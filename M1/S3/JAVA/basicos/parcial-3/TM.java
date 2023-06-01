//TM3
import java.io.*;
class TablasdeMultiplicar
{
 public static void main (String[]args)
  {
    //1.-DECLARAR VARIABLES E INTRODUCIR IMFORMACION.
    int TM[][]={{3,1,0},{3,2,0},{3,3,0},{3,4,0},{3,5,0}};
    
    //2.-PROCESAR IMFORMACION,ES DECIR,BAMOS A REALIZAR LA TABLA DE MULTIPLICACION.
    for(int i=0;i<5;i++)
    TM[i][2]=TM[i][0]*TM[0][i];

    //3.-MOSTRAR LA MATRIZ COMPLETA.
    System.out.println("TM[i][0]*TM[0][i]")
  }
}
    