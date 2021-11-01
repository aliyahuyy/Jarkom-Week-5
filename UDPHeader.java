/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jarkom.week.pkg5;
import java.util.Scanner;

/**
 *
 * @author alyaghaitsa
 */
public class UDPHeader {
     public static void main(String[] args) {  
          
        Scanner input = new Scanner(System.in);  
 
        System.out.print("Input UDP Header : ");            
        String UDPHeader = input.nextLine();
        System.out.println(" ");

        
        System.out.println("1. SOURCE PORT NUMBER: Hexadesimal "+ UDPHeader.substring(0, 4) + " atau Desimal " + konversiHexadecimal(UDPHeader.substring(0, 4)));
        System.out.println("2. DESTINATION PORT NUMBER: Hexadesimal "+ UDPHeader.substring(4, 8) + " atau Desimal " + konversiHexadecimal(UDPHeader.substring(4, 8)));
        System.out.println("3. TOTAL LENGHT OF THE USER DATAGRAM: Hexadesimal "+ UDPHeader.substring(8,12)+" atau total panjang UDP paket adalah " + konversiHexadecimal(UDPHeader.substring(8, 12)) +" bytes");
     }
     public static int konversiHexadecimal(String hex) {  
          
        int nilaiDesimal=0;  
          
        for (int i = 0; i < hex.length(); i++) {   
             char hexChar = hex.charAt(i);  
             nilaiDesimal = nilaiDesimal * 16 + hexCharKeDesimal(hexChar);  
             }  
        return nilaiDesimal;  
          
   }  
      
   public static int hexCharKeDesimal(char ch) {  
        if (ch >= 'A' && ch <= 'F')  
             return 10 + ch - 'A';  
        else 
             return ch - '0';  
        }  
}
     


