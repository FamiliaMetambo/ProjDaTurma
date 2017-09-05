package Ficha5;

import javax.swing.JOptionPane;

/**
 *
 * @author Aceer
 */
public class nrBinario {
   
    
  
    private static int nrBinario(int nr){
     
         if ( nr < 2 ) // Condicao de Paragem
         return nr;
 
          // Iniciando a multiplicação pelo valor que não pode mais ser dividido por 2 
         //e somando com a sobra da divisão.
         return ( 10 * nrBinario( nr / 2 ) ) + nr % 2; 
         
    }
    
    
    
    public static void main(String [] args){
    
    
        int nr=Integer.parseInt(JOptionPane.showInputDialog("Introduz o numero Natural a converter"));
        
         System.out.println(nrBinario(nr)); 
          
       
    }
}
