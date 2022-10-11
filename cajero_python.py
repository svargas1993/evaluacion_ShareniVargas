'''Programa para crear un cajero automatico en python'''

pin = "1235"
opcion = 0
errorPin=0
nombre = "SHARENI VARGAS PERALES"
saldo = 1000
retirar = 0
menu=0

'''Comentario para agregar cambios de la seccion git de la evaluacion'''

print()

while errorPin != 3:
    password = input("Digite su pin de cajero: ")
    if password == pin :
        while menu != 1:
            print(f"\t.:BIENVENIDO {nombre}:.")
            print("1. Consultar saldo")
            print("2. Retirar saldo")
            print("3. Histórico de Movimientos")
            print("4. Salir")
            opcion = int(input("Ingrese la opción que desee realizar:"))
            if opcion == 1:
                print(f'tu saldo es: ${saldo}.00')
                menu = int(input("¿Desea Salir?\n1.Si\n2.No \n"))
                if menu == 1:
                    errorPin = 3
            elif opcion == 2:
                if saldo== 0:
                    print("Fondos insuficientes.")
                    menu = int(input("¿Desea Salir?\n1.Si\n2.No \n"))
                    if menu == 1:
                        errorPin = 3
                else:
                    retirar = int(input("¿Cuánto dinero desea retirar?"))
                    if retirar <= saldo:
                        saldo = saldo - retirar
                        print(f"Tu saldo actual es ${saldo}")
                        menu = int(input("¿Desea Salir?\n1.Si\n2.No \n"))
                        if menu == 1:
                            errorPin = 3
                    else:
                        print("Fondos insuficientes")
                        menu = int(input("¿Desea Salir?\n1.Si\n2.No \n"))
                        if menu == 1:
                            errorPin = 3
            elif opcion == 3:
                print('Historico de movimentos')
                menu = int(input("¿Desea Salir?\n1.Si\n2.No \n"))
                if menu == 1:
                    errorPin = 3
            elif opcion == 4:
                print('Vuelva pronto')
                errorPin = 3
                break
            else:
                print("La opcion no existe")
                menu = int(input("¿Desea Salir?\n1.Si\n2.No \n"))
                if menu == 1:
                    errorPin = 3
    else:
        errorPin = errorPin+1
        if errorPin == 3:
            print("Intentos maximos utilizados")
        else:
            print("Pin erroneo digitelo de nuevo")