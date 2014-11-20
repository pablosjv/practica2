import java.io.IOException;


public class PruebasGestorTablaExtendido extends Object{
	/**
	 * Permite probar la funcionalidad de la clase GestorTablaExtendido.
	 */
	
	
	public PruebasGestorTablaExtendido(){

		try{
		
			
		    // pruebas de listados
			RegistroLibro registro = new RegistroLibro();
			GestorTablaExtendido gestor = new GestorTablaExtendido("TablaExamen", 2, registro);

			
			// insertamos un registro en el GestorTablaExtendido
            registro = new RegistroLibro(90, "I", "I", 120);
		    gestor.insertar(registro);
			
			// insertamos 25 registros mas en el GestorTablaExtendido	    
		    registro = new RegistroLibro(180, "R", "R", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(30, "C", "C", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(120, "L", "L", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(210, "U", "U", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(60, "F", "F", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(150, "O", "O", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(240, "X", "X", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(10, "A", "A", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(20, "B", "B", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(40, "D", "D", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(70, "G", "G", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(50, "E", "E", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(80, "H", "H", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(100, "J", "J", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(190, "S", "S", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(130, "M", "M", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(160, "P", "P", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(230, "W", "W", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(260, "Z", "Z", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(110, "K", "K", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(140, "N", "N", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(170, "Q", "Q", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(200, "T", "T", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(220, "V", "V", 120);
		    gestor.insertar(registro);
            registro = new RegistroLibro(250, "Y", "Y", 120);
		    gestor.insertar(registro);
		    
			   
			 // PRUEBA DEL LISTADO COMPLETO EN ORDEN CENTRAL
			    System.out.println();
				System.out.println("******** VOLCADO DEL ARBOL B DESPUES DE ANIANIR 26 REGISTROS*********");
				gestor.getArbolB().volcar();
				System.out.println();		    
				System.out.println("******** VOLCADO DEL ARCHIVO DE DATOS DESPUES DE ANIANIR 26 REGISTROS*********");
				gestor.getArchivoDatos().volcar();
				System.out.println();		    

				
				 System.out.println("******** LISTADO DE TODOS LOS REGISTROS DEL ARCHIVO DE DATOS ORDENADOS POR numReg  (2 puntos)*********");
				 System.out.println("****  ----> VALIDAR QUE EN EL LISTADO APARECEN LOS 26 REGISTROS ORDENADOS POR NumReg. Debe aparecer la informacion completa de cada registro");
				 System.out.println();
				 gestor.listar();


				 
			// PRUEBAS DE LISTADOS ACOTADOS	 
				 System.out.println();
				 System.out.println("****** EVALUACION DE LAS 16 PRUEBAS DE LISTADO ACOTADO  (0.5 puntos cada prueba)  *******");
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("1. Listar acotado entre 50 y 60");
				 System.out.println("   Deben aparecer los datos de los registros 50 y 60");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(50,60);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("2. Listar acotado entre 1 y 20");
				 System.out.println("   Deben aparecer los datos de los registros 10 y 20");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(1,20);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("3. Listar acotado entre 40 y 49");
				 System.out.println("   Deben aparecer los datos del registro 40");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(40,49);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("4. Listar acotado entre 50 y 30");
				 System.out.println("   No debe aparecer ningun registro");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(50,30);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("5. Listar acotado entre 90 y 90");
				 System.out.println("   Deben aparecer los datos del registro 90");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(90,90);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("6. Listar acotado entre 120 y 190");
				 System.out.println("   Deben aparecer los datos de los registros 120, 130, 140, 150, 160, 170, 180 y 190");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(120,190);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("7. Listar acotado entre 30 y 60");
				 System.out.println("   Deben aparecer los datos de los registros 30, 40, 50 y 60");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(30,60);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("8. Listar acotado entre 151 y 172");
				 System.out.println("   Deben aparecer los datos de los registros 160 y 170");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(151,172);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("9. Listar acotado entre 110 y 245");
				 System.out.println("   Deben aparecer los datos de los registros 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230 y 240");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(110,245);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("10. Listar acotado entre 120 y 215");
				 System.out.println("   Deben aparecer los datos de los registros 120, 130, 140, 150, 160, 170, 180, 190, 200 y 210");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(120,215);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("11. Listar acotado entre 30 y 45");
				 System.out.println("   Deben aparecer los datos de los registros 30 y 40");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(30,45);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("12. Listar acotado entre 150 y 215");
				 System.out.println("   Deben aparecer los datos de los registros 150, 160, 170, 180, 190, 200 y 210");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(150,215);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("13. Listar acotado entre 150 y 285");
				 System.out.println("   Deben aparecer los datos de los registros 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250 y 260");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(150,285);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("14. Listar acotado entre 110 y 230");
				 System.out.println("   Deben aparecer los datos de los registros 110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220 y 230");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(110,230);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("15. Listar acotado entre 140 y 190");
				 System.out.println("   Deben aparecer los datos de los registros 120, 130, 140, 150, 160, 170, 180 y 190");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(140,190);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println("16. Listar acotado entre 95 y 95");
				 System.out.println("   No debe aparecer ningun registro");
				 System.out.println("--------------------------------------------------------------------");
				 gestor.listar(95,95);
				 System.out.println("--------------------------------------------------------------------");
				 System.out.println();
				 				 
			 gestor.cerrar();	
			 

			
		}catch (IOException ioe){
			System.out.println("Error de entrada/salida sobre PruebasGestorTablaExtendido: "+ioe.getMessage());
			ioe.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		new PruebasGestorTablaExtendido();
	}
}
