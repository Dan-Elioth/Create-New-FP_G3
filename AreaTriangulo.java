import java.util.Scanner;
class AreaTriangulo{
static Scanner teclado=new Scanner(System.in);
public static void main(String [] arg){
  //Definir variables y otros
    System.out.println("Hola Mundo");
    int b, h, area;
    //Datos de entrada
    System.out.println("Ingrese la base:");
    b=teclado.nextInt();
    System.out.println("Ingrese la base:");
    h=teclado.nextInt();
    //Proceso
    area=(b*h)/2;
    //Datos de Salida 
    System.out.println("Area de un Triangulo:"+area);
}
}