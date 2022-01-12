import java.io.*;
import java.util.Random;

public class Bingo{

	private int[][] tablero = new int[5][5];
	private int aux, numero;


	private void ganador(){

		if (tablero[0][0] == -1 && tablero[0][1] == -1 && tablero[0][2] == -1 && tablero[0][3] == -1 && tablero[0][4] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[1][0] == -1 && tablero[1][1] == -1 && tablero[1][2] == -1 && tablero[1][3] == -1 && tablero[1][4] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;

		} else if(tablero[2][0] == -1 && tablero[2][1] == -1 && tablero[2][2] == -1 && tablero[2][3] == -1 && tablero[2][4] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[3][0] == -1 && tablero[3][1] == -1 && tablero[3][2] == -1 && tablero[3][3] == -1 && tablero[3][4] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[4][0] == -1 && tablero[4][1] == -1 && tablero[4][2] == -1 && tablero[4][3] == -1 && tablero[4][4] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[0][0] == -1 && tablero[1][0] == -1 && tablero[2][0] == -1 && tablero[3][0] == -1 && tablero[4][0] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[0][1] == -1 && tablero[1][1] == -1 && tablero[2][1] == -1 && tablero[3][1] == -1 && tablero[4][1] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[0][2] == -1 && tablero[1][2] == -1 && tablero[2][2] == -1 && tablero[3][2] == -1 && tablero[4][2] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[0][3] == -1 && tablero[1][3] == -1 && tablero[2][3] == -1 && tablero[3][3] == -1 && tablero[4][3] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[0][4] == -1 && tablero[1][4] == -1 && tablero[2][4] == -1 && tablero[3][4] == -1 && tablero[4][4] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[0][0] == -1 && tablero[1][1] == -1 && tablero[2][2] == -1 && tablero[3][3] == -1 && tablero[4][4] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		} else if(tablero[0][4] == -1 && tablero[1][3] == -1 && tablero[2][2] == -1 && tablero[3][1] == -1 && tablero[4][0] == -1){

			System.out.println("\n| ---- Has Ganado ---- |\n" + " ---- BINGO---- ");
			return;
		
		}
	}

	private void ingresarNumero(int num){

		do{

			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);

			try{
				
				System.out.println("\nEl numero que salio fue: " +  num + "\n\n");
				System.out.print("Ingrese el numero de la posicion que desea: ");
				aux = Integer.parseInt(br.readLine());		
		
			}catch(IOException e){

				System.out.println("Ha ocurirdo un error de entrada y salida");
			}

		}while(aux < 1 && aux > 25);

		switch (aux){

			case 1:

				if (tablero[0][0] != -1 && tablero[0][0] == num)
					tablero[0][0] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 2:

				if (tablero[0][1] != -1 && tablero[0][1] == num)
					tablero[0][1] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 3:

				if (tablero[0][2] != -1 && tablero[0][2] == num)
					tablero[0][2] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 4:

				if (tablero[0][3] != -1 && tablero[0][3] == num)
					tablero[0][3] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 5:

				if (tablero[0][4] != -1 && tablero[0][4] == num)
					tablero[0][4] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 6:

				if (tablero[1][0] != -1 && tablero[1][0] == num)
					tablero[1][0] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 7:

				if (tablero[1][1] != -1 && tablero[1][1] == num)
					tablero[1][1] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");
			
			break;

			case 8:

				if (tablero[1][2] != -1 && tablero[1][2] == num)
					tablero[1][2] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 9:

				if (tablero[1][3] != -1 && tablero[1][3] == num)
					tablero[1][3] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");				

			break;

			case 10:

				if (tablero[1][4] != -1 && tablero[1][4] == num)
					tablero[1][4] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 11:

				if (tablero[2][0] != -1 && tablero[2][0] == num)
					tablero[2][0] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 12:

				if (tablero[2][1] != -1 && tablero[2][1] == num)
					tablero[2][1] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 13:

				if (tablero[2][2] != -1 && tablero[2][2] == num)
					tablero[2][2] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 14:

				if (tablero[2][3] != -1 && tablero[2][3] == num)
					tablero[2][3] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 15:

				if (tablero[2][4] != -1 && tablero[2][4] == num)
					tablero[2][4] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 16:

				if (tablero[3][0] != -1 && tablero[3][0] == num)
					tablero[3][0] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 17:

				if (tablero[3][1] != -1 && tablero[3][1] == num)
					tablero[3][1] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 18:

				if (tablero[3][2] != -1 && tablero[3][2] == num)
					tablero[3][2] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 19:

				if (tablero[3][3] != -1 && tablero[3][3] == num)
					tablero[3][3] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 20:

				if (tablero[3][4] != -1 && tablero[3][4] == num)
					tablero[3][4] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 21:

				if (tablero[4][0] != -1 && tablero[4][0] == num)
					tablero[4][0] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 22:

				if (tablero[4][1] != -1 && tablero[4][1] == num)
					tablero[4][1] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 23:

				if (tablero[4][2] != -1 && tablero[4][2] == num)
					tablero[4][2] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 24:

				if (tablero[4][3] != -1 && tablero[4][3] == num)
					tablero[4][3] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			case 25:

				if (tablero[4][4] != -1 && tablero[4][4] == num)
					tablero[4][4] = -1;
				else
					System.out.println("Este numero esta ocupado o el numero no corresponde....");

			break;

			default:
				tablero[2][2] = -1;
			break;

		}
	}

	private int numeroRandom(){

		numero = (int) Math.round(Math.random() * 75);

		return numero;
	}

	private void llenarTablero(){

		Random r = new Random();


		tablero[0][0] = (int) (Math.random() * (15 - 1 + 1) + 1);

		for (int i = 1; i < 5; i++){

			tablero[i][0] = (int) (Math.random() * (15 - 1 + 1) + 1);
			
			for(int j = 0; j < 1; j++){
				
				if (tablero[i][0] == tablero[j][0])
					i--;
			
			}

		}

		
		tablero[0][1] = (int) (Math.random() * (30 - 16 + 1) + 16);

		for (int i = 1; i < 5; i++){

			tablero[i][1] = (int) (Math.random() * (30 - 16 + 1) + 16);
			
			for(int j = 0; j < 1; j++){

				if (tablero[i][1] == tablero[j][1])
					i--;
			
			}
			
		}


		tablero[0][2] = (int) (Math.random() * (45 - 31 + 1) + 31);

		for (int i = 1; i < 5; i++){

			tablero[i][2] = (int) (Math.random() * (45 - 31 + 1) + 31);
			
			for(int j = 0; j < 1; j++){

				if (tablero[i][2] == tablero[j][2])
					i--;
			
			}
			
		}


		tablero[0][3] = (int) (Math.random() * (60 - 46 + 1) + 46);

		for (int i = 1; i < 5; i++){

			tablero[i][3] = (int) (Math.random() * (60 - 46 + 1) + 46);
			
			for(int j = 0; j < 1; j++){

				if (tablero[i][3] == tablero[j][3])
					i--;
			
			}

		}


		tablero[0][4] = (int) (Math.random() * (75 - 60 + 1) + 60);

		for (int i = 1; i < 5; i++){

			tablero[i][4] = (int) (Math.random() * (75 - 60 + 1) + 60);
			
			for(int j = 0; j < 1; j++){

				if (tablero[i][4] == tablero[j][4])
					i--;
			
			}			

		}
	}

	private void imprimirTablero(){

		System.out.println("\n ---- BINGO ---- \n");

		for (int i = 0; i < 5; i++){

			for (int j = 0; j < 5; j++){

				if (i == 2 && j == 2){
					tablero[i][j] = -1;
				}

				if (j < 4){
					System.out.print(" " + tablero[i][j] + " | " );
				}
				else{
					System.out.print(" " + tablero[i][j]);
				}

			}

			System.out.println("\n----------------------------\n" );
		}
	}

	public void bucle(){

		int i = 0;

		llenarTablero();
		imprimirTablero();

		do{

			ingresarNumero(numeroRandom());
			imprimirTablero();
			ganador();

			i++;

		}while (i < 25);
	}

}