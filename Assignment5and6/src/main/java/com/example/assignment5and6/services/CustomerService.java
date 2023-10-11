package com.example.assignment5and6.services;

import com.example.assignment5and6.models.Customer;
import com.example.assignment5and6.models.Customer;

import java.util.List;

public interface CustomerService {
    Customer saveCustomer(Customer customer);

    Customer getCustomerById(Long id);
    List<Customer> findAllCustomer();

    List<Customer> findByFirstName(String FirstName);
    List<Customer> findByLastName(String LastName);
    List<Customer> findByFirstNameSearch(String FirstName);
    Customer findUserByLastNameAndFirstName(String firstname, String lastname);
    void deleteUser(Long customerId) throws Exception;

}
