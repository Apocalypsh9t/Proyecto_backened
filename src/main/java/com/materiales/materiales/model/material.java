package com.materiales.materiales.model;

import jakarta.persistence.Entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;






@AllArgsConstructor
@NoArgsConstructor



@Entity
@Table (name = "Material")
public class material {
   
@Id
     @Column(name = "id", nullable = false)
    private int id;

     @Column(name = "name", nullable = false, length= 100)
    private String name;

     @Column(name = "condicion", nullable = false , length= 125)
    private String condition;

     @Column (name = "BorrowDate", nullable = false)
    private LocalDateTime date;

     @Column (name = "ReturnDate", nullable = false)
    private LocalDateTime returndate;

     @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

     public int getId() {
         return id;
     }

     public void setId(int id) { if (id <= 0) 
        {throw new IllegalArgumentException("Pero papehhhhh como va a ser el ID del material vacio");}
         this.id = id;
     }

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getCondition() {
         return condition;
     }

     public void setCondition(String condition) {
         this.condition = condition;
     }

     public String getDate() {
         return date;
     }

     public void setDate(String date) {
         this.date = date;
     }

     public String getReturndate() {
         return returndate;
     }

     public void setReturndate(String returndate) {
         this.returndate = returndate;
     }
        







 
}