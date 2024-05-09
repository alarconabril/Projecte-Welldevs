/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author eleme
 */
public class Producte {
   private  String codi;
   private  String nom;
   private  double preu;
   private String descripcio;
   private int quantitat;

    public Producte(String codi, String nom, double preu, String descripcio, int quantitat) {
        this.codi = codi;
        this.nom = nom;
        this.preu = preu;
        this.descripcio = descripcio;
        this.quantitat = quantitat;
    }

    public String getCodi() {
        return codi;
    }
   
}
