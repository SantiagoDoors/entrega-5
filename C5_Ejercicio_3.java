import javax.swing.JOptionPane;

/* 
 *                      Ejercicio Nº 3 
 *          Determinar la cantidad de dinero que recibirá un trabajador 
 *          por concepto de las horas extras trabajadas en una empresa
 *          sabiendo que cuando las horas de trabajo exceden de 40, 
 *          el resto se consideran horas extras y que estas se pagan 
 *          al doble de una hora normal cuando no exceden de 8; 
 *          si las horas extras exceden de 8 se pagan las primeras 8 
 *          al doble de lo que se pagan las horas normales y el resto al triple
*/

public class C5_Ejercicio_3 {
    public static void main(String[] args) {
        int precio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio por hora de trabajo"));
        int horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de horas trabajadas"));
        int extra = 0, sueldo = 0;

        if (horas<=40){
            sueldo = horas*precio;
            System.out.println("el sueldo es: $"+sueldo+"    ¬(^.^)¬");

        } else if (horas>48){
            extra = horas - 48;
            extra += extra * 3 * precio;
            extra += 8 * precio * 2;
            sueldo = (horas * precio) + extra;
            System.out.println("el sueldo es: $"+sueldo+"    ¬(^.^)¬");

        } else {
            extra = horas - 40;
            sueldo = (horas * precio) + (extra*precio*2);
            System.out.println("el sueldo es: $"+sueldo+"    ¬(^.^)¬");
        }
    }
}

