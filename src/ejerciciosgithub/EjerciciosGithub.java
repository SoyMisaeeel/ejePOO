/*
 * Arturo Misael Álvarez Gutiérrez
 * Nro. Control: 20550369
 *
 */

package ejerciciosgithub;

import java.util.StringTokenizer;

public class EjerciciosGithub {

    public static void main(String[] args) {
        
        String iniciales;
        String strNombre = "Arturo Misael Alvarez Gutierrez";
        StringTokenizer strIniciales = new StringTokenizer(strNombre);
        
        System.out.println("Hola mundo.");
        System.out.println("Mi nombre es: " + strNombre);
        System.out.println("Mis iniciales son: " );
        
        while(strIniciales.hasMoreTokens()){
            iniciales = strIniciales.nextToken();
            System.out.println(iniciales.substring(0,1));
        }
    }
    
}
