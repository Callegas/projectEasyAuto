package controller;

import DAO.DAOCustomerImplements;
import model.Address;
import model.Customer;

import java.util.Scanner;

public class CustomerController {

    public void registerNewCustomer() {
        System.out.println("R E G I S T E R  N E W  C U S T O M E R");

        Customer customer = new Customer();
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the name: ");
        customer.setName(input.next());
        System.out.print("Enter the cpf: ");
        customer.setCpf(input.next());
        System.out.print("Enter the email: ");
        customer.setEmail(input.next());
        System.out.print("Enter the telephone: ");
        customer.setTelephone(input.next());

        Address address = new Address();
        System.out.print("Enter your zip code: ");
        address.setZip(input.next());
        System.out.print("Enter the State: ");
        address.setState(input.next());
        System.out.print("Enter the City: ");
        address.setCity(input.next());
        System.out.print("Enter the street: ");
        address.setStreet(input.next());
        System.out.print("Enter the number: ");
        address.setNumber(input.nextInt());
        customer.setAddress(address);


        DAOCustomerImplements daoCustomerImplements = new DAOCustomerImplements();
        daoCustomerImplements.save(customer);
    }

}