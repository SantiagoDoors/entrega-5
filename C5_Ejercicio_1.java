/* 
 *              .: Ejercicios condicionales  if- switch :. 
 *                              Ejercicio Nº 1
 *  
 *                  Pedir al usuario que ingrese 2 números; 
 *                    si son iguales que los multiplique, 
 *          si el primero es mayor que el segundo que los reste 
 *                            y sino que los sume.
*/

import javax.swing.JOptionPane;

public class C5_Ejercicio_1 {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el primer numero"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("ingrese el segundo numero"));
        int resultado = 0;

        if (num1 == num2){
            System.out.println("Los numeros ingresados son iguales, estos se multiplicaran");
            resultado = num1 * num2;
        } else if (num1 > num2){
            System.out.println("El primer numero es mayor que el segundo, estos se restaran");
            resultado = num1 - num2;
        } else {
            System.out.println("El primer numero es menor al segundo, estos se sumaran");
            resultado = num1 + num2;
        }
        System.out.println("el resultado es: .: "+resultado+" :.   ¬(^.^)¬");
    }
}
