import javax.swing.JOptionPane;

/*                              Ejercicio Nº 4
 *              Mostrando un menú, con opciones numeradas, 
 *              y pidiendo al operador que elija una opción del mismo, 
 *              asigne los ejercicios 1, 2 y 3, a cada opción del menú, 
 *              utilizando la estructura SEGÚN CASO. (switch case)
*/


public class C5_Ejercicio_4 {
    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog(
        "***************************\n"
        +"* ESCRIBA UN NUMERO *\n"
        +"***************************\n"
        +"|      .: 1 :.  Ejercicio 1      |\n"
        +"|      .: 2 :.  Ejercicio 2      |\n"
        +"|      .: 3 :.  Ejercicio 3      |\n"
        +"___________________");
        switch(opcion){
            case "1":{
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
                break; 
            }
            case "2":{
                String palabra = JOptionPane.showInputDialog("Ingrese letras, mostraré solo las mayusculas");
                for (int i=0;i<palabra.length();i++){
                    if (palabra.charAt(i)< 97 ){
                    System.out.print("Usted ingresó "+palabra+" sus mayusculas son "+String.valueOf(palabra.charAt(i))+"     ¬(^.^)¬");
                    }
                }
                break;
            }
            case "3":{
                int precio = Integer.parseInt(JOptionPane.showInputDialog("ingrese el precio por hora de trabajo"));
                int horas = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de horas trabajadas"));
                int extra = 0, sueldo = 0;
        
                if (horas<=40){
                    sueldo = horas*precio;
                    System.out.println("el sueldo es: $"+sueldo+"     ¬(^.^)¬");
        
                } else if (horas>48){
                    extra = horas - 48;
                    extra += extra * 3 * precio;
                    extra += 8 * precio * 2;
                    sueldo = (horas * precio) + extra;
                    System.out.println("el sueldo es: $"+sueldo+"     ¬(^.^)¬");
        
                } else {
                    extra = horas - 40;
                    sueldo = (horas * precio) + (extra*precio*2);
                    System.out.println("el sueldo es: $"+sueldo+"     ¬(^.^)¬");
                }
                break;
            }
            default: System.out.println("el valor ingresado no es correcto    ¬(^.^)¬");
        }
    }
}
