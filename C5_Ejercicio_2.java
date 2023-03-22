import javax.swing.JOptionPane;

/*                                  Ejercicio Nº 2
 *
 *              Pedir al usuario que ingrese tres letras diferentes. 
 *              Mostrar en pantalla sólo la que esté en mayúscula. 
 *              Para lograr esto puede recurrir a los códigos ASCII.
 */

public class C5_Ejercicio_2 {
    public static void main(String[] args) {
        String palabra = JOptionPane.showInputDialog("Ingrese letras, mostraré solo las mayusculas");
        for (int i=0;i<palabra.length();i++){
            if (palabra.charAt(i)< 97 ){
                System.out.print("Usted ingresó "+palabra+" sus mayusculas son "+String.valueOf(palabra.charAt(i))+"     ¬(^.^)¬");
            }
        }


    }
}
