/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.infomatica.sii.ejemploee.backing;

import es.uma.informatica.sii.ejemploee.ejb.MiListaDeIdiomas;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author francis
 */
@Named(value = "prueba")
@RequestScoped
public class Prueba {
    
    private String idiomaSleeccionado;
    @EJB
    private MiListaDeIdiomas miEjb;

    /**
     * Creates a new instance of Prueba
     */
    public Prueba() {
    }
    
    public List<String> getIdiomas() {
        return miEjb.obtenerListaIdiomas();
    }

    public String getIdiomaSleeccionado() {
        return idiomaSleeccionado;
    }

    public void setIdiomaSleeccionado(String idiomaSleeccionado) {
        this.idiomaSleeccionado = idiomaSleeccionado;
    }
    
}
