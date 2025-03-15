package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase llamada Contacto que contiene dos atributos: el nombre del contacto y un listado de teléfonos asociados a dicho contacto.
 */
class Persona {
    private String name;
    private List<String> phones;

    /**
     * Constructor con dos parámetros.
     * @param name nombre del contacto.
     * @param phone teléfono del contacto.
     */
    public Persona(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    /**
     * Getters.
     * @return
     */
    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }
}