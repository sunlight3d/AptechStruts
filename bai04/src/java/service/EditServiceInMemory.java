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
        EditServiceInMemory.person.setFirstName(personBean.getFirstName());
        EditServiceInMemory.person.setSport(personBean.getSport());
        EditServiceInMemory.person.setGender(personBean.getGender());
        EditServiceInMemory.person.setResidency(personBean.getResidency());
        EditServiceInMemory.person.setOver18(personBean.isOver18());
        EditServiceInMemory.person.setCarModels(personBean.getCarModels());        
    }
}
