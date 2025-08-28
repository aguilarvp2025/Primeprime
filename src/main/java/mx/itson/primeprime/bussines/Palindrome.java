/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.primeprime.bussines;

/**
 *
 * @author alumnog
 */
public class Palindrome {
    
    public static boolean isPalindrome(String value){
        // Limpia la cadena de texto y le quita espacios 
        String text = value.replaceAll("\\s","").toLowerCase();
        // convierte el texto a un array de char
        char[]letras = text.toCharArray();
        // determina la longitud del array
        int count = letras.length;
        
        for(char l : letras){
            if (l != letras [count - 1]){
                return false;
            } else{
                count -= 1;
                //count = count - 1;
                if (count < 0){
                    return true;
                }
            }
        }
        return true;
    }
}

    