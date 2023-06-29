#include<stdio.h>
#include<stdlib.h>

struct Fecha{
	int dd;
	int mm;
	int aa;
};

void menu();
Fecha captura();
void mostrar(Fecha dato);
void modificar(Fecha dato);

int main(){
	menu();
}

void menu(){
	int op;
	Fecha hoy;
	
	do{
		printf("***MANEJO DE FECHAS***");
		printf("\n1....Captura");
		printf("\n2....Mostrar");
		printf("\n3....Modificar");
		printf("\n4....Salir\n");
		printf("\nEscribe la opcion: ");
		scanf("%d",&op);
		
		switch(op){
			case 1:
				hoy = captura();
				
				printf("\n");
				system("pause");
				system("cls");
				break;
				
			case 2:
				mostrar(hoy);
				
				printf("\n");
				system("pause");
				system("cls");
				break;
		    
		    case 3:
		    	modificar(hoy);
		    	
		    	printf("\n");
				system("pause");
				system("cls");
				break;
		}
		
	}while(op!=4);
}

Fecha captura(){
	Fecha aux;
	printf("\nEscribe el dia: ");
	scanf("%d",&aux.dd);
	printf("\nEscribe el mes: ");
	scanf("%d",&aux.mm);
	printf("\nEscribe el anio: ");
	scanf("%d",&aux.aa);
	
	return aux;
}

void mostrar(Fecha dato){
	printf("%d/%d/%d\n",dato.dd,dato.mm,dato.aa);
}

void modificar(Fecha dato){
	printf("\nEscribe un nuevo anio: ");
	scanf("%d",&dato.aa);
	mostrar(dato);

}
