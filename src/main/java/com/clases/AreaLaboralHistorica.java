/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.clases;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="arealaboralhistorica")
public class AreaLaboralHistorica implements Serializable {
    
    @Id
    private int idAreaLaboralHistorica;
    @Column
    private String fechaComienzo;
    @Column
    private String fechaConclusion;
    @Column
    private int idEmpleados;
    @Column
    private int idAreaLaboral;

    public int getIdAreaLaboralHistorica() {
        return idAreaLaboralHistorica;
    }

    public void setIdAreaLaboralHistorica(int idAreaLaboralHistorica) {
        this.idAreaLaboralHistorica = idAreaLaboralHistorica;
    }

    public String getFechaComienzo() {
        return fechaComienzo;
    }

    public void setFechaComienzo(String fechaComienzo) {
        this.fechaComienzo = fechaComienzo;
    }

    public String getFechaConclusion() {
        return fechaConclusion;
    }

    public void setFechaConclusion(String fechaConclusion) {
        this.fechaConclusion = fechaConclusion;
    }

    public int getIdEmpleados() {
        return idEmpleados;
    }

    public void setIdEmpleados(int idEmpleados) {
        this.idEmpleados = idEmpleados;
    }

    public int getIdAreaLaboral() {
        return idAreaLaboral;
    }

    public void setIdAreaLaboral(int idAreaLaboral) {
        this.idAreaLaboral = idAreaLaboral;
    }
    
    
    
}
