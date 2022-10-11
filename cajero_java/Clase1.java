package pack;
import java.util.Scanner;


public class Clase1{
	public static void main(String []args){
		int pin = 1235;
		int password;
		int opcion = 0;
		int errorPin = 0;
		String nombre = "SHARENI VARGAS PERALES";
		int saldo = 1000;
		int retirar = 0;
		int menu = 0;
		
		Scanner leer = new Scanner (System.in);
		

		while (errorPin != 3){
		
			System.out.println("Digite su pin de cajero: ");
			password = leer.nextInt();
			
			if(password == pin){
				while (menu !=1){
					System.out.println("\t.:BIENVENIDO "+nombre+":.");
					System.out.println("1. Consultar saldo");
					System.out.println("2. Retirar saldo");
					System.out.println("3. Historico de Movimientos");
					System.out.println("4. Salir");
					System.out.println("Ingrese la opcion que desee realizar: ");
					opcion = leer.nextInt();
					if (opcion == 1){
						System.out.println("Tu saldo es: "+saldo+".00");
						System.out.println("Desea Salir\n1.Si\n2.No \n");
						menu = leer.nextInt();
						 if (menu == 1){
							errorPin = 3;
						 }
					}
					else if (opcion == 2){
						if(saldo == 0){
							System.out.println("Fondos insuficientes.");
							System.out.println("Desea Salir\n1.Si\n2.No \n");
							menu = leer.nextInt();
							 if (menu == 1){
								errorPin = 3;
							}
						}
						else {
							System.out.println("Cuanto dinero desea retirar");
							retirar = leer.nextInt();
							if(retirar <= saldo){
								saldo = saldo - retirar;
								System.out.println("Tu saldo actual es: $"+saldo+".00");
								System.out.println("Desea Salir\n1.Si\n2.No \n");
								menu = leer.nextInt();
								 if (menu == 1){
									errorPin = 3;
								}
							}
							else{
								System.out.println("Fondos insuficientes.");
								System.out.println("Desea Salir\n1.Si\n2.No \n");
								menu = leer.nextInt();
								if (menu == 1){
									errorPin = 3;
								}
							}
						}
					}
					else if (opcion == 3){
						System.out.println("Historico de movimientos");
						System.out.println("Desea Salir\n1.Si\n2.No \n");
						menu = leer.nextInt();
						 if (menu == 1){
							errorPin = 3;
						}
					}
					else if (opcion == 4){
						System.out.println("Vuelva pronto");
						errorPin = 3;
						break; 
					}
					else {
						System.out.println("La opcion no existe.");
						System.out.println("Desea Salir\n1.Si\n2.No \n");
						menu = leer.nextInt();
						if (menu == 1){
							errorPin = 3;
						}
					}
				}
			}
			else{
				errorPin = errorPin + 1;
				if (errorPin == 3){
					System.out.println("Intentos maximos utilizados");
				}
				else{
					System.out.println("Pin erroneo digitelo de nuevo");
				}         
			}
		}
	}
}