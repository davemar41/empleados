import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[]args)throws IOException{
        int contador=0;
        File archivo=new File("D:/misficheros/empleados.txt");

            FileWriter escribo=new FileWriter(archivo);
            FileReader leer=new FileReader(archivo);
            BufferedReader b=new BufferedReader(leer);
            int a;
            String nombre;
            int numeroempleados;
            System.out.println("buenos dias, cuantos empleados desea ingresar");
            Scanner consultanumero=new Scanner(System.in);
            numeroempleados=consultanumero.nextInt();
            System.out.println("ahora ingrese los empleados, se le asignara un numero automático");
            Scanner entrada=new Scanner(System.in);
            String[]miarray=new String[numeroempleados];
            for(int i =0;i< miarray.length;i++) {
                miarray[i] = entrada.next();
                contador++;

                escribo.write(miarray[i]+"  numero de empleado "+contador+ "\n");


                System.out.println("hecho");

            }escribo.close();
            while((a=leer.read())!=-1){

            String lista=Character.toString((char)a);
            System.out.println(lista);
            }leer.close();

































    }
}
