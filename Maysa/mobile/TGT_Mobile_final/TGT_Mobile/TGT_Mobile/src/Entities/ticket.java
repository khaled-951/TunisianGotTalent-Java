/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;
import java.util.Date;
import java.util.Objects;
/**
 *
 * @author maysa1998
 */
public class ticket {
    int id_ticket;
    int evenement_id;
   
    Date dateemission ;
    int iduser;

    public int getId_ticket() {
        return id_ticket;
    }

    @Override
    public String toString() {
        return "ticket{" + "id_ticket=" + id_ticket + ", evenement_id=" + evenement_id + ", dateemission=" + dateemission + ", iduser=" + iduser + '}';
    }

    public ticket(int id_ticket, int evenement_id, Date dateemission, int iduser) {
        this.id_ticket = id_ticket;
        this.evenement_id = evenement_id;
        this.dateemission = dateemission;
        this.iduser = iduser;
    }

    public ticket(int evenement_id, Date dateemission, int iduser) {
        this.evenement_id = evenement_id;
        this.dateemission = dateemission;
        this.iduser = iduser;
    }

    public ticket(int evenement_id, int iduser) {
        this.evenement_id = evenement_id;
        this.iduser = iduser;
    }
    

    public void setId_ticket(int id_ticket) {
        this.id_ticket = id_ticket;
    }

    public int getEvenement_id() {
        return evenement_id;
    }

    public void setEvenement_id(int evenement_id) {
        this.evenement_id = evenement_id;
    }

    public Date getDateemission() {
        return dateemission;
    }

    public void setDateemission(Date dateemission) {
        this.dateemission = dateemission;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public ticket() {
    }

    
    
   
    }


    
    
    

