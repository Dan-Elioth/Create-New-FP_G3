#include <iostream>
int main() {
    // Definir Variables y otros
    printf("Ejercicio 01: Area de un triangunlo\n");
    int b=0, h=0, area=0;
    //Datos de entrada 
    printf("Ingrese Base:");
    scanf("%i", &b);
    printf("Ingrese Altura:");
    scanf("%i", &h);
    //Proceso
    area=(b*h)/2;
    //Datos de Salida
    printf("Ingrese Base: %i \n", area);
    return 0;
}