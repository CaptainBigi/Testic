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
public class Student extends Osoba {  
    private static final int TEKUCA_GODINA = 2008; 
 
 private static double zbirGodinaStudiranja = 0.0; 
 private static int brojac = 0; 
 
 private String fakultet; 
 private String smer;  
 private int godinaUpisa;  
 private int godinaStudija;     
 public Student(String ime, String datum, String adresa,           
         String fakultet, String smer,          
         int godinaUpisa, int godinaStudija)  {  
     super(ime, datum, adresa);   
     this.fakultet = fakultet;  
     this.smer = smer;  
     this.godinaUpisa = godinaUpisa;  
     this.godinaStudija = godinaStudija; 
 
  zbirGodinaStudiranja += TEKUCA_GODINA - godinaUpisa;   ++brojac;  } 
 
 public Student(final Student s)  {   this(s.getIme(), s.getDatum(), s.getAdresa(),        
         s.fakultet, s.smer, s.godinaUpisa, s.godinaStudija); 
 } 

    Student() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 public void setFakultet(String fakultet)  {   this.fakultet = fakultet;  } 
 
 public void setSmer(String smer)  {   this.smer = smer;  } 
 
 public void setGodinaUpisa(int godinaUpisa)  {   this.godinaUpisa = godinaUpisa;  } 
 
 public void setGodinaStudija(int godinaStudija)  {   this.godinaStudija = godinaStudija;  } 
 
 public String getFakultet()  {   
     return fakultet;  } 
 
 public String getSmer()  {   
     return smer;  } 
 
 public int getGodinaUpisa()  {  
     return godinaUpisa;  } 
 
 public int getGodinaStudija()  {  
     return godinaStudija;  } 
 
 public void markica()  {  
     System.out.println("zelena markica");  } 
 
 static public double prosek()  {  
     return zbirGodinaStudiranja / brojac; 
 
 } 
 
 public String toString()  {   return super.toString() + ", student je fakulteta " + fakultet       + " na smeru " + smer + " upisala je fakultet " + godinaUpisa       + ". godine i trenutno je na " + godinaStudija + ". godini studija"; 
    
}
}