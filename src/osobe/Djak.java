/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package osobe;

/**
 *
 * @author Nikol
 */
public class Djak extends Osoba {  
    private static double zbirOcena = 0.0;  
    private static int brojac = 0; 
 
 private String skola;  
 private int razred;  
 private double prosecnaOcena; 
    public Djak(String ime, String datum, String adresa,String skola, int razred, double prosecnaOcena)  {
   super(ime, datum, adresa);   
   this.skola = skola;   
   this.razred = razred;  
   this.prosecnaOcena = prosecnaOcena;   zbirOcena += prosecnaOcena;   ++brojac;  } 
 
 public Djak(final Djak djak)  {   
     this(djak.getIme(),djak.getDatum(), djak.getAdresa(),djak.skola, djak.razred, djak.prosecnaOcena); 
 
 } 
 
 public void setSkola(String skola)  {  
     this.skola = skola;  } 
 
 public void setRazred(int razred)  { 
     this.razred = razred;  } 
 
 public void setProsecnaOcena(double prosecnaOcena)  { 
     this.prosecnaOcena = prosecnaOcena;  } 
 
 public String getSkola() 
 {   return skola;  } 
 
 public int getRazred()  {  
     return razred;  } 
 
 public double getProsecnaOcena()  { 
     return prosecnaOcena;  } 
 
 public void markica()  {  
     System.out.println("plava markica");  } 
 
 static public double prosek()  { 
     return zbirOcena / brojac; 
 
 } 
 
 public String toString()  { 
     return super.toString() + ", djak je skole " + skola + ", ide u "       + razred + ". razred i ima prosecnu ocenu " + prosecnaOcena; 
}
}
