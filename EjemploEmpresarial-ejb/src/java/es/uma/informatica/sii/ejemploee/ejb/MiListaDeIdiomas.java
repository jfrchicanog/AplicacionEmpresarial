/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.uma.informatica.sii.ejemploee.ejb;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author francis
 */
@Stateless
@LocalBean
public class MiListaDeIdiomas {

    public List<String> obtenerListaIdiomas() {
        return Stream.of("Español", "Portugués", "Inglés", "Francés", "Polaco")
                .collect(Collectors.toList());
    }
 
}
