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
public class Zaposleni extends Osoba 
{  private static double zbirPlata = 0.0;  
private static int brojac = 0; 
 
 private String firma;  
 private String odeljenje;  
 private double plata; 
 
 public Zaposleni(String ime, String datum, String adresa, String firma, String odeljenje, double plata)  {  
     super(ime, datum, adresa);   
     this.firma = firma;   
     this.odeljenje = odeljenje;   
     this.plata = plata;   zbirPlata += plata;   ++brojac;  } 
 
 public Zaposleni(final Zaposleni z)  {  
     this(z.getIme(), z.getDatum(), z.getAdresa(),      z.firma, z.odeljenje, z.plata);  } 
 
 public void markica()  {   
     System.out.println("crvena markica");  } 
 
 static public double prosek()  { 
     return zbirPlata / brojac;  } 
 
 public String toString()  {   
     return super.toString() + ", zaposlena je u firmi " + firma       + " na odeljenju " + odeljenje + " i ima platu " + plata + " din."; 
    
}
}