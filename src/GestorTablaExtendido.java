import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Clase que amplia la funcionalidad del GestorTabla basico, incorporando el listado de todos los registros de la tabla de datos 
 * ordenados por el campo numReg, asi como un listado acotado de los registros de la tabla de datos ordenados por el 
 * campo numReg
 * @version 1.0, (c)2014
 * @author TGI-BBDD
 */

public class GestorTablaExtendido extends GestorTabla{
	
	
  /** 
    * Crea un nuevo archivo de datos  en disco, de nombre "nombre.dat", y un nuevo archivo de tipo arbol B, de nombre
    * "nombre.btree", asociado al archivo de datos , cuyo orden sera el indicado en <code>orden</code>. 
    * Ambos ficheros quedaran abiertos para lectura/escritura. Si alguno de los dos ficheros (o los dos) existe, este metodo 
    * borrara su contenido.
    * @param nombre Nombre (sin extension) que se le va a dar al fichero de registros de datos y al fichero de indices (arbol B) asociado al mismo.
    * @param orden Orden del arbol B a crear.
    * @param registro Objeto de tipo RegistroNumReg que se desea manejar en el archivo de datos 
    * @throws FileNotFoundException Si no se puede crear alguno de los dos ficheros.
    * @throws IOException Si durante la creacion de alguno de los dos ficheros se produce un error de entrada/salida.
    */		
	public GestorTablaExtendido(String nombre, int orden, RegistroNumReg registro) throws FileNotFoundException, IOException{
        super(nombre, orden, registro);
	 }
	
  /** 
    * Abre un archivo de datos existente en disco, de nombre "nombre.dat", y un archivo de tipo arbol B, de nombre 
    * "nombre.btree", asociado al archivo de datos. Ambos ficheros deben existir y quedaran abiertos en el modo que 
    * se indique en el parametro modo ("r" o "rw"). 
    * @param nombre Nombre (sin extension) del fichero de registros de datos y del fichero de indices (arbol B) asociado al mismo.
    * @param modo Modo de apertura de ambos ficheros (lectura - "r" - o lectura/escritura -"rw").
    * @param registro Objeto de tipo RegistroNumReg que se desea manejar en el archivo de datos 
    * @throws FileNotFoundException Si no se puede abrir alguno de los dos ficheros.
    * @throws IOException Si durante la apertura de alguno de los dos ficheros se produce un error de entrada/salida.
    */			
	public GestorTablaExtendido(String nombre, String modo, RegistroNumReg registro) throws FileNotFoundException, IOException{
        super(nombre,modo,registro);
	 }	
	
	
  /** Vuelca por salida estandar el contenido completo del archivo de registros de datos ordenados por el campo
    * numReg.
    * @throws IOException Si durante la ejecucion del metodo se produce un error de entrada/salida.
    */	
	public void listar()throws IOException{
        listar(super.getArbolB().getPosicionRaiz());

	}

    private void listar (int posicion)throws IOException{
        if (posicion!=-1){
            Pagina p = super.getArbolB().leerRegistroLH(posicion);
            for ( int i = 0; i< p.getNumeroDeClaves();i++){
                listar(p.getHijo(i));
                int j = p.getClave(i).getValor();
                System.out.println(super.buscar(j).toString());
            }
            listar ( p.getHijo(p.getNumeroDeClaves()));
        }
    }


	 /** Vuelca por salida estandar el contenido de los registros del archivo de datos cuyo campo numReg este entre clave1 y clave2 
     * (incluidos ambos), ordenados por el campo numReg. 
     * @param valorClave1 Valor menor del campo numReg a considerar en el listado ordenado
     * @param valorClave2 Valor mayor del campo numReg a considerar en el listado ordenado
     * @throws IOException Si durante la ejecucion del metodo se produce un error de entrada/salida.
     */	
        public void listar(int valorClave1, int valorClave2)throws IOException{

            if(!this.getArbolB().vacio()){
                Clave c1 = new Clave (valorClave1);
                Clave c2 = new Clave (valorClave2);
                int pos = this.getArbolB().getPosicionRaiz();
                listar(pos, c1, c2);
            }



        }
    //Hacer el metodo del ultimo antecesor comun para acotar en un subarbol
        /*
        private int ultimoAntecesorComun(Clave c1, Clave c2 )throws  IOException{
            int pos = 0;
            if(!this.getArbolB().vacio()){
                pos = this.getArbolB().getPosicionRaiz();
                Pagina p = this.getArbolB().leerRegistroLH(this.getArbolB().getPosicionRaiz());
                while (p.buscarDescendiente(c1)== p.buscarDescendiente(c2)) {
                    pos = p.getHijo(pos);
                    p = this.getArbolB().leerRegistroLH(p.getHijo(pos));
                }
            }
            System.out.print("HOLIIIIII " + pos);
            return pos;


        }
        */

        private void listar (int posicion, Clave c1,  Clave c2)throws IOException{

            if (posicion!=-1){
                Pagina p = super.getArbolB().leerRegistroLH(posicion);
                int posClave = p.buscarDescendiente(c1);
                if (posClave < p.getNumeroDeClaves()){
                    if(p.getClave(posClave).comparaCon(c1)!= 0)

                        listar(p.getHijo(posClave),c1,c2);
                }
                else listar(p.getHijo(posClave),c1,c2); //agrupar en un if?

                for (int i = 0; i <= p.getNumeroDeClaves(); i++){
                //no se si es asi el rango

                    if (p.getClave(i).comparaCon(c1)>=0 && p.getClave(i).comparaCon(c2)<=0){

                        if (p.getClave(i).comparaCon(c1) == 0) listar(i+1,c1,c2);
                        else listar(p.getHijo(i), c1, c2);

                        if (i < p.getNumeroDeClaves()){
                            System.out.print(p.getClave(i).getValor() + " ");
                        }
                    }
                }

                /*
                int posC1 = p.buscarDescendiente(c1);
                int posC2 = p.buscarDescendiente(c2);

                int esClave1 = p.getClave(posC1).comparaCon(c1);
                int esClave2 = p.getClave(posC2).comparaCon(c2);

                boolean estamosEnRangoClave1 = esClave1 >= 0;
                boolean estamosEnRangoClave2 = esClave2 <= 0;

                if (estamosEnRangoClave1 && estamosEnRangoClave2){
                    
                }
                for ( int i = 0; i< p.getNumeroDeClaves();i++){
                    listar(p.getHijo(i));
                    int j = p.getClave(i).getValor();
                    System.out.println(super.buscar(j).toString());
                }
                listar ( p.getHijo(p.getNumeroDeClaves()));
                */
            }
        }
    /*
    private void buscarC1 (int posicion, Clave c1, Clave c2)throws IOException{

        if (posicion!=-1){
            Pagina p = super.getArbolB().leerRegistroLH(posicion);
            int posC1 = p.buscarDescendiente(c1);

            boolean estamosEnRangoClave1 = p.getClave(posC1).comparaCon(c1) >= 0;


        }
        else listarHastaC2();
    }
    private void listarHastaC2 (int posicion, Clave c2)throws IOException{
        if (posicion!=-1){
            Pagina p = super.getArbolB().leerRegistroLH(posicion);
            int posC1 = p.buscarDescendiente(c1);
            int posC2 = p.buscarDescendiente(c2);

            int esClave1 = p.getClave(posC1).comparaCon(c1);
            int esClave2 = p.getClave(posC2).comparaCon(c2);

            boolean estamosEnRangoClave1 = esClave1 >= 0;
            boolean estamosEnRangoClave2 = esClave2 <= 0;

            if (estamosEnRangoClave1 && estamosEnRangoClave2){

            }
            for ( int i = 0; i< p.getNumeroDeClaves();i++){
                listar(p.getHijo(i));
                int j = p.getClave(i).getValor();
                System.out.println(super.buscar(j).toString());
            }
            listar ( p.getHijo(p.getNumeroDeClaves()));
        }
    }
    */
}
