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
public class Client {
    private String CIF;
    private String Nom;
    private String Direcció;

    public Client(String CIF, String Nom, String Direcció) {
        this.CIF = CIF;
        this.Nom = Nom;
        this.Direcció = Direcció;
    }

    public String getCIF() {
        return CIF;
    }
  
}
