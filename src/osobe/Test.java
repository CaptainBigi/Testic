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
import java.util.Scanner; 
 
public class Test {  
    public static void main(String[] args)  
    {   Scanner sc = new Scanner(System.in);   
    System.out.print("Unesite broj objekata: ");   
    int n = sc.nextInt();   
    if (n <= 0)    
        System.exit(0); 
 
  Osoba[] osobe = new Osoba[n];   
  for (int i = 0; i < n; i++)   {    
      System.out.println((i + 1)        + ". Unesite \"djak\" ,\"student\" ili \"zaposleni\": ");   
      String izbor = sc.next();    if (izbor.equalsIgnoreCase("djak"))    { 
    System.out.print("ime djaka: ");     
    String ime = sc.next();    
    System.out.print("datum rodjenja: ");     
    String datum = sc.next();    
    System.out.print("adresa stanovanja: ");    
    String adresa = sc.next();    
    System.out.print("skola: ");     
    String skola = sc.next();     
    System.out.print("razred: ");   
    int razred = sc.nextInt();    
    System.out.print("prosecna ocena: ");  
    double prosecnaOcena = sc.nextDouble(); 
 
    osobe[i] = new Djak(ime, datum, adresa, skola, razred, prosecnaOcena); 
 
   } else if (izbor.equalsIgnoreCase("student"))    { 
       System.out.print("ime studenta: ");   
       String ime = sc.next();     
       System.out.print("datum rodjenja: ");     
       String datum = sc.next();    
       System.out.print("adresa stanovanja: ");     
       String adresa = sc.next();     
       System.out.print("fakultet: ");     
       String fakultet = sc.next();     
       System.out.print("smer: ");     
       String smer = sc.next();     
       System.out.print("godina upisa: ");     
       int godinaUpisa = sc.nextInt();     
       System.out.print("godina studija: ");     
       int godinaStudija = sc.nextInt(); 
 
       
    osobe[i] = new Student(ime, datum, adresa,  fakultet, smer, godinaUpisa, godinaStudija); 
 
   } else if (izbor.equalsIgnoreCase("zaposleni"))    {    
       System.out.print("ime zaposlenog: ");    
       String ime = sc.next();    
       System.out.print("datum rodjenja: ");     
       String datum = sc.next();   
       System.out.print("adresa stanovanja: ");  
       String adresa = sc.next();    
       System.out.print("ime firme: ");   
       String firma = sc.next();   
       System.out.print("ime odeljenja: ");  
       String odeljenje = sc.next();    
       System.out.print("plata: ");   
       double plata = sc.nextDouble(); 
 
    osobe[i] = new Zaposleni(ime, datum, adresa, firma, odeljenje, plata); 
 
   } else    {   
       System.out.println("Greska. Pokusajte ponovo.");     --i;    }   } 
 
  for (Osoba osoba : osobe)   { 
      System.out.print(osoba + " ");   
      osoba.markica();    
      if (osoba instanceof Djak)    
          System.out.println(" prosek svih djaka: " + Djak.prosek());  
      else if (osoba instanceof Student)    
          System.out.println(" prosek studiranja svih studenata: " 
        + Student.prosek());  
      else if (osoba instanceof Zaposleni)   
          System.out.println(" prosek plata zaposlenih: " + Zaposleni.prosek()); 
}
}
}