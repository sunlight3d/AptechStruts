/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import model.Person;

public class EditServiceInMemory {
    private static Person person;
    
    static {
        person = new Person();
        String[] carModels = {"Mazda", "Ford", "Honda"};
        person.setCarModels(carModels);
        person.setOver18(true);
    }
    public Person getPerson() {
        return EditServiceInMemory.person;
    }
    public void savePerson(Person personBean) {
        Person selectedPerson = EditServiceInMemory.person;
        selectedPerson.setFirstName(selectedPerson.getFirstName());
        selectedPerson.setSport(selectedPerson.getSport());
        selectedPerson.setGender(selectedPerson.getGender());
        selectedPerson.setResidency(selectedPerson.getResidency());
        selectedPerson.setOver18(selectedPerson.isOver18());
        selectedPerson.setCarModels(selectedPerson.getCarModels());        
    }
}
