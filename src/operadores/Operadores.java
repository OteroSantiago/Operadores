/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author Santiago
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Aritméticos +,-,*,/,%
        var a = 10;
        var b = 5;
        System.out.println("La suma de las dos variables es: "+(a+b));
        System.out.println("La resta de las dos variables es: "+(a-b));
        System.out.println("La multiplicaciones de las dos variables es: "+(a*b));
        System.out.println("La división de las dos variables es: "+(a/b));
        System.out.println("");
    //De asignación
        int x = 3, y = 2;
        int c = x + 3 -y;
        System.out.println(x);
        System.out.println(y);
        System.out.println(c);
        System.out.println("");
    //Unarios
        //De cambio de signo: -x
        var t = 5;
        var u = -x;
        System.out.println("t = " + t);
        System.out.println("u = " + u);
        //De negacion(invierte el valor): !
        boolean z = true;
        boolean w = !z;
        System.out.println("z ="+z);
        System.out.println("w ="+w);
        //De pre-incremento: ++x
            //Primero se pre-incrementa el valor y despues se asigna
        var n = 4;
        System.out.println("n = " + n);
        var i = ++n;
        System.out.println("z = " + z);
        //De pre-decremento: --x
        //De post-incremento: x++
            //Primero se asigna y después se incrementa
        var o = 3;
        var e = c++;
        System.out.println("c ="+c);
        System.out.println("e ="+e);
        //Operador de Post-decremento: x--
    //De igualdad y relaciones
        //Los de igualdad nos permiten comparar valores ==, !=
        //Lo mas recomendable para comprobar si el contenido de dos cadenas es igual, es usar el metodo cadena.equals(cadena2
        //Los Relacionales son <>,<=,>=
        System.out.println("Introduzca la nota del examen: ");
        Scanner ent = new Scanner(System.in);
        var nota = ent.nextInt();
        if(nota>=0 && nota<5){
            System.out.println("Estas suspendo");
        }else if(nota>=5 && nota<=6){
            System.out.println("Suficiente ");
        }else if(nota>=6 && nota<=7){
            System.out.println("Bien ");
        }else if(nota>=7 && nota<=9){
            System.out.println("Notable ");
        }else if(nota>=9 && nota<=10){
            System.out.println("Sobresaliente");
        }
    //Logicos && y ||
    var num = 15;
    if(num >= 10 && num <= 20 ){
        System.out.println("El numero esta en el rango de valores");
    }else{
        System.out.println("El numero no esta en el rango de valores");
    }
    
        
        
    
    
    }
    
}
