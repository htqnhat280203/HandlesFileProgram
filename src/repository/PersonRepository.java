package repository;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import dataAcess.PersonDAO;

public class PersonRepository implements IPersonRepository{
    @Override
    public void findPersonInfo() {
        PersonDAO.Instance().findPersonInfo();
    }

    @Override
    public void copyNewFile() {
        PersonDAO.Instance().copyNewFile();
    }
}