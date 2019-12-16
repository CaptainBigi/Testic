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
 
public class Osoba {  private String ime;  private String datum;  private String adresa; 
 
 public Osoba()  {  } 
 
 public Osoba(String ime, String datum, String adresa)  {   
     this.ime = ime;   
     this.datum = datum;   
     this.adresa = adresa;  } 
 
 public Osoba(final Osoba o)  { 
  this(o.ime, o.datum, o.adresa);  } 
 
 public void markica()  {  } 
 
 public String getIme()  {  
     return ime;  } 
 
 public String getAdresa()  { 
     return adresa;  } 
 
 public String getDatum()  {  
     return datum;  } 
 
 public void setIme(String ime)  {  
     this.ime = ime; 
 } 
 
 public void setAdresa(String adresa)  {  
     this.adresa = adresa;  } 
 
 public void setDatum(String datum)  { 
     this.datum = datum;  } 
 
 
@Override
 public String toString()  {   return "Osoba " + ime + ", rodjena je: " + datum                    + ", stanuje u " + adresa; 
}
}

 
