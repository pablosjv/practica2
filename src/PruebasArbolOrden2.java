import java.io.IOException;

public class PruebasArbolOrden2 {


		public PruebasArbolOrden2(){
	      Clave clave1= null;
			try{
                
				ArbolB arbol = new ArbolB("arbolOrden2.txt", 2);
				System.out.println("**********************VAMOS A INSERTAR 3 4 12 13*********************");
				clave1 = new Clave(3, 1);
				arbol.insertar(clave1);
				clave1 = new Clave(4, 2);
				arbol.insertar(clave1);
				clave1 = new Clave(12, 3);
				arbol.insertar(clave1);
				clave1 = new Clave(13, 4);
				arbol.insertar(clave1);
				arbol.volcar();

			System.out.println("******** buscamos la clave 11*********");
			if (arbol.buscar(new Clave(11))==-1) System.out.println("registro con clave 11 no encontrado");
			else System.out.println("registro 11 encontrado: ");

				
				System.out.println();
				System.out.println("**********************VAMOS A INSERTAR 25 28 34 36*********************");
				clave1 = new Clave(25, 5);
				arbol.insertar(clave1);
				clave1 = new Clave(28, 6);
				arbol.insertar(clave1);
				clave1 = new Clave(34, 7);
				arbol.insertar(clave1);
				clave1 = new Clave(36, 8);
				arbol.insertar(clave1);
				arbol.volcar();

				System.out.println();
				System.out.println("**********************VAMOS A INSERTAR 42 44 55 56*********************");
				clave1 = new Clave(42, 9);
				arbol.insertar(clave1);
				clave1 = new Clave(44, 10);
				arbol.insertar(clave1);
				clave1 = new Clave(55, 11);
				arbol.insertar(clave1);
				clave1 = new Clave(56, 12);
				arbol.insertar(clave1);
				arbol.volcar();

				System.out.println();
				System.out.println("**********************VAMOS A INSERTAR 61 64 65 66*********************");
				clave1 = new Clave(61, 13);
				arbol.insertar(clave1);
				clave1 = new Clave(64, 14);
				arbol.insertar(clave1);
				clave1 = new Clave(65, 15);
				arbol.insertar(clave1);
				clave1 = new Clave(66, 16);
				arbol.insertar(clave1);
				arbol.volcar();
				
				System.out.println();
				System.out.println("**********************VAMOS A INSERTAR 85 90 91 92*********************");
				clave1 = new Clave(85, 17);
				arbol.insertar(clave1);
				clave1 = new Clave(90, 18);
				arbol.insertar(clave1);
				clave1 = new Clave(91, 19);
				arbol.insertar(clave1);
				clave1 = new Clave(92, 20);
				arbol.insertar(clave1);				
				arbol.volcar();
				
				System.out.println();
				System.out.println("**********************VAMOS A INSERTAR 30 40 60 80*********************");
				clave1 = new Clave(30, 21);
				arbol.insertar(clave1);
				clave1 = new Clave(40, 22);
				arbol.insertar(clave1);
				clave1 = new Clave(60, 23);
				arbol.insertar(clave1);
				clave1 = new Clave(80, 24);
				arbol.insertar(clave1);
				arbol.volcar();
				
				System.out.println();
				System.out.println("**********************VAMOS A INSERTAR 86 87 *********************");
				clave1 = new Clave(86, 25);
				arbol.insertar(clave1);				
				clave1 = new Clave(87, 26);
				arbol.insertar(clave1);				
				arbol.volcar();
				
				System.out.println();
				System.out.println("**********************VAMOS A INSERTAR 88 93 94 95*********************");
				clave1 = new Clave(88, 27);
				arbol.insertar(clave1);				
				clave1 = new Clave(93, 28);
				arbol.insertar(clave1);				
				clave1 = new Clave(94, 29);
				arbol.insertar(clave1);				
				clave1 = new Clave(95, 30);
				arbol.insertar(clave1);				
				arbol.volcar();
				
				System.out.println();
				System.out.println("**********************VAMOS A INSERTAR 35 41*********************");
				clave1 = new Clave(35, 31);
				arbol.insertar(clave1);					
				clave1 = new Clave(41, 32);
				arbol.insertar(clave1);
				arbol.volcar();
				
				
				System.out.println();
				System.out.println("*****************VOLVADO DESPUES DE BORRAR LA CLAVE 95 *****************");
				clave1 = new Clave(95);
				arbol.borrar(clave1);
				arbol.volcar();

				arbol.cerrarArchivo();
				arbol = new ArbolB("arbolOrden2.txt", "r");
				arbol.volcar();
				arbol.cerrarArchivo();
				

			}
			catch (IOException e){
				e.printStackTrace();
			}
		}
		
		public static void main(String[] args) {
			new PruebasArbolOrden2();
		}

}
