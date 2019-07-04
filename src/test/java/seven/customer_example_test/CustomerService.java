package seven.customer_example_test;

import java.util.UUID;

public class CustomerService {
    private CustomerDao dao;

    public void register(Customer customer){
        customer.setToken(generateToken());
        dao.save(customer);
    }

    private String generateToken(){
        return UUID.randomUUID().toString();
    }

    public Customer addCustomer(Customer customer){
        try{
            return dao.save(customer);
        }catch (Exception e){
            throw new RuntimeException("something went wrong");
        }
    }

    public Customer changeEmail(Customer customer, String newEmail){
        dao.updateEmail(customer, newEmail);
        return customer;
    }
}
