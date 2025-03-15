package org.example;

import java.util.*;

/**
 * Clase llamada Agenda, que contiene una lista de contactos.
 */
public class Agenda {
    private List<Persona> contacts; // Lista de Contacto

    /**
     * Constructor.
     */
    public Agenda() {
        this.contacts = new ArrayList<>();
    }

    /**
     * Método para añadir nuevos contactos.
     * @param name nombre del contacto.
     * @param phone teléfono del contacto.
     */
    public void addContact(String name, String phone) {
        boolean exists = false;
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                exists = true;
                c.getPhones().add(phone);
                break;
            }
        }

        if (!exists) {
            Persona newContact = new Persona(name, phone);
            contacts.add(newContact);
        }
    }

    /**
     * Método para eliminar contactos existentes dentro de la lista de contactos.
     * @param name nombre del contacto.
     */
    public void removeContact(String name) {
        Iterator<Persona> it = contacts.iterator();

        while (it.hasNext()) {
            Persona c = it.next();

            if (c.getName().equalsIgnoreCase(name)) {
                it.remove();
            }
        }
    }

    /**
     * Método para modificar el número de teléfono de un contacto concreto.
     * @param name nombre del contacto.
     * @param oldPhone teléfono antiguo.
     * @param newPhone teléfono nuevo.
     */
    public void modifyPhoneNumber(String name, String oldPhone, String newPhone) {
        for (Persona c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                List<String> phones = c.getPhones();

                int index = phones.indexOf(oldPhone);

                if (index != -1) {
                    phones.set(index, newPhone);
                }
            }
        }
    }

    /**
     * Getter.
     * @return
     */
    public List<Persona> getContacts() {
        return this.contacts;
    }
}