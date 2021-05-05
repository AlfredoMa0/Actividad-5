/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad.pkg5;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Actividad5 {
   
    
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                                                     
    
        DiasDelaSemana();
        PersonajesStarWar();
        AlfabetoMorse();
        Aski();
        EjeRCICIO5();
        Ejercicio6();

    }
   public static void DiasDelaSemana(){
       
        //ARREGLO
        System.out.println("-------EJERCICIO 1--------");
        String num[]=new String[7];
        num[0]="DOMINGO";
        num[1]="LUNES";
        num[2]="MARTES";
        num[3]="MIERCOLES";
        num[4]="JUEVES";
        num[5]="VIERNES";
        num[6]="SABADO";
        for (int i = 0; i < 7; i++) {
            System.out.println(num[i]);
            
        }
    }
   public static void PersonajesStarWar(){
       
     System.out.println("------EJERCICIO 2-------");
        String[][] Personajes;
        Personajes = new String[16][3];
    Personajes[0][0]="Luke Skywalker";
    Personajes[0][1]="172";
    Personajes[0][2]="male";
    
    Personajes[1][0]="R2-D2";
    Personajes[1][1]="96";
    Personajes[1][2]="n/a";
    
    Personajes[2][0]="C-3PO";
    Personajes[2][1]="167";
    Personajes[2][2]="n/a";
    
    Personajes[3][0]="Drath vader";
    Personajes[3][1]="202";
    Personajes[3][2]="male";
    
    Personajes[4][0]="Laia Organa";
    Personajes[4][1]="150";
    Personajes[4][2]="female";
    
    Personajes[5][0]="Owen Lars";
    Personajes[5][1]="178";
    Personajes[5][2]="male";
    
    Personajes[6][0]="Beru Whitesun";
    Personajes[6][1]="165";
    Personajes[6][2]="Female";
    
    Personajes[7][0]="R5-D4";
    Personajes[7][1]="97";
    Personajes[7][2]="n/a";
    
    Personajes[8][0]="Bigga Darkiighter";
    Personajes[8][1]="182";
    Personajes[8][2]="male";
    
    Personajes[9][0]="Obi-Wan ";
    Personajes[9][1]="Obi-Wan Kenobi";
    Personajes[9][2]="Anakin Skywaler";
    
    Personajes[10][0]="Yoda";
    Personajes[10][1]="66";
    Personajes[10][2]="male";
    
    Personajes[11][0]="Jek Tono Pokins";
    Personajes[11][1]="180";
    Personajes[11][2]="male";
    
    Personajes[12][0]="Jabba Tiure";
    Personajes[12][1]="175";
    Personajes[12][2]="Hermaphrodite";
    
    Personajes[13][0]="Han solo";
    Personajes[13][1]="160";
    Personajes[13][2]="male";
    
    Personajes[14][0]="Chewbacca";
    Personajes[14][1]="228";
    Personajes[14][2]="male";
    
    Personajes[15][0]="Anakin Skywalker";
    Personajes[15][1]="188";
    Personajes[15][2]="";
    
     for (int i = 0; i < 16; i++) {
         for (int j = 0; j < 3; j++) {
          System.out.println("PERSONAJE: ["+ i +"][" +j+ "]: " 
                  + Personajes[i][j]);       
         }  
   
   
     }
  }
   public static void AlfabetoMorse(){
       
       System.out.println("---------EJERCICIO 3--------");
        String[][] Codigo;
    Codigo= new String[26][2];
        Codigo[0][0] = "A";
        Codigo[1][0] = "B";
        Codigo[2][0] = "C";
        Codigo[3][0] = "D";
        Codigo[4][0] = "E";
        Codigo[5][0] = "F";
        Codigo[6][0] = "G";
        Codigo[7][0] = "H";
        Codigo[8][0] = "I";
        Codigo[9][0] = "J";
        Codigo[10][0] = "K";
        Codigo[11][0] = "L";
        Codigo[12][0] = "M";
        Codigo[13][0] = "N";
        Codigo[14][0] = "O";
        Codigo[15][0] = "P";
        Codigo[16][0] = "Q";
        Codigo[17][0] = "R";
        Codigo[18][0] = "S";
        Codigo[19][0] = "T";
        Codigo[20][0] = "U";
        Codigo[21][0] = "V";
        Codigo[22][0] = "W";
        Codigo[23][0] = "X";
        Codigo[24][0] = "Y";
        Codigo[25][0] = "Z";

        Codigo[0][1] = ".-";
        Codigo[1][1] = "-...";
        Codigo[2][1] = "-.-.";
        Codigo[3][1] = "-..";
        Codigo[4][1] = ".";
        Codigo[5][1] = "..-.";
        Codigo[6][1] = "--.";
        Codigo[7][1] = "...";
        Codigo[8][1] = "..";
        Codigo[9][1] = ".---";
        Codigo[10][1] = "-.-";
        Codigo[11][1] = ".-..";
        Codigo[12][1] = "--";
        Codigo[13][1] = "-.";
        Codigo[14][1] = "---";
        Codigo[15][1] = ".--.";
        Codigo[16][1] = "--.-";
        Codigo[17][1] = ".-.";
        Codigo[18][1] = "...";
        Codigo[19][1] = "-";
        Codigo[20][1] = "..-";
        Codigo[21][1] = "...-";
        Codigo[22][1] = ".--";
        Codigo[23][1] = "-..-";
        Codigo[24][1] = "-.--";
        Codigo[25][1] = "--..";
        for (int i = 0; i < 26; i++) {
         for (int j = 0; j < 2; j++) {
          System.out.println("CODIGO: ["+ i +"][" +j+ "]: " 
                  + Codigo[i][j]);       
         }  
       }
  }
   public static void Aski(){
       System.out.println("-------EJERCICIO 4---------");
       int asciiValue;
        char cChar;
        String sFrase = "ALFREDO";
        char[]  aChar = sFrase.toCharArray();
        for (int i = 0; i < aChar.length; i++) {
            System.out.println(aChar[i]);
            cChar = aChar[i]; // 72 -65 = 7
            asciiValue = (int) cChar;
            System.out.println("["+ asciiValue +"]");
          
        }
   }
   
    public static void EjeRCICIO5(){
        
        System.out.println("---------EJERCICIO 5--------");  
           
        Scanner sc = new Scanner(System.in);
        String frase;
     
        int suma = 0;
        int extra = 0;
        System.out.print("INGRESE UNA PALABRA: ");
        frase = sc.nextLine();
        StringTokenizer st = new StringTokenizer(frase);
        System.out.println("NUMERO DE PALABRAS: " + st.countTokens());
        suma += 10 ;
        extra =3 + suma ;
        if (st.countTokens() <=5) {
            System.out.println("COBRAR SI SON MENOS DE 5 PALABRAS: " + suma + " Pesos");
        }else if (st.countTokens() >=5) {
            
            System.out.println("COBRAR UN EXTRA DE 3 PESOS SI SON MAS DE 5 PALABRAS: " + extra + " Pesos");  
        }
        
  }
    public static void Ejercicio6(){
        
        System.out.println("-----EJERCICIO 6-------");
        Scanner Leer = new Scanner(System.in);
        System.out.println("INGRESA UN NOMBRE DE STAR WARS : ");
        String Cadena= Leer.next();
        switch (Cadena) {
            case "Luke": System.out.println("ES HOMBRE");break;
            case "Chewbacca":System.out.println(" ES HOMBRE");break;  
            case "mala": System.out.println("ES MUJER");break;
            case "Anakin":System.out.println("ES HOMBRE");break;
            case " Han": System.out.println("ES HOMBRE");break;
            case "Female": System.out.println("ES MUJER");break;
            case "n/a": System.out.println("ES MUJER");break;
            case "Hermaphrodite": System.out.println("ES MUJER");break;
            case "Jek": System.out.println("ES HOMBRE");break;
            case "Jabba": System.out.println("ES UN MOUSTRO");break;
            case "Obi-Wan": System.out.println("ES HOMBRE");break;
            case "Bigga Darkiighter": System.out.println("ES HOMBRE");break;
            case "Yoda": System.out.println("DUENTE VERDE");break;
            case "Laia Organa": System.out.println("ES MUJER");break;
            case "202": System.out.println("ROBOT");break;
            case "182": System.out.println("CAPITAN REX");break;
            case "R2-D2": System.out.println("DROIDE");break;
            case "Beru": System.out.println("ES MUJER");break;
            case"C-3PO":System.out.println("HOMBRE DE PLATA");break;
            case"228": System.out.println("PRINCESA");break;
            case"160": System.out.println("MAX REBO - ELEFANTE AZUL");break;
            default:
                System.out.println("PERSONAJE INDEFINIDO");
        }
    }
  } 