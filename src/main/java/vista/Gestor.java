/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.HashMap;
import models.Client;
import models.Producte;

/**
 *
 * @author eleme
 */
public class Gestor {
    HashMap<String, Client> llistaClients = new HashMap <>();
    HashMap<String, Producte> llistaProductes = new HashMap<>();
    
    public void afegirClient(String cifClient, String nom, String direccio) {
        Client c = new Client(cifClient, nom, direccio);
        llistaClients.put(c.getCIF(), c);
    }
    public void afegirProducte(String codi, String nom, String descripcio, double preu, int quantitat ) {
        Producte p = new Producte(codi, nom, preu, descripcio, quantitat);
        llistaProductes.put(p.getCodi(), p);
    }
}
