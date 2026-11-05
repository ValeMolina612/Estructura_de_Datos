# Estructura_de_Datos

#EJERCICIO DE ORDENAMIENTO 

#Molina Rosas Maria Valeria 

<img width="1498" height="773" alt="Captura de pantalla 2026-11-05 150530" src="https://github.com/user-attachments/assets/58305a61-b125-4f2f-99ea-4177323c4030" />

#EJERCICIO EN PSInt
Proceso Burbuja
	
    Definir arreglo, i, j, aux Como Entero
    Dimension arreglo[5]
	
    arreglo[1] <- 6
    arreglo[2] <- 7
    arreglo[3] <- 3
    arreglo[4] <- 10
    arreglo[5] <- 17
	
    Para i <- 1 Hasta 4 Hacer
        Para j <- 1 Hasta 5 - i Hacer
            Si arreglo[j] > arreglo[j + 1] Entonces
                aux <- arreglo[j]
                arreglo[j] <- arreglo[j + 1]
                arreglo[j + 1] <- aux
            FinSi
        FinPara
        Escribir "Pasada ", i, ": "
        Para j <- 1 Hasta 5 Hacer
            Escribir Sin Saltar arreglo[j], " "
        FinPara
		
		Escribir ""
		
    FinPara
	
FinProceso

<img width="533" height="350" alt="image" src="https://github.com/user-attachments/assets/bd514162-f958-4051-a01f-19564f746309" />

   
