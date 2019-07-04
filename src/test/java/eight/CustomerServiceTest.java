package eight;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;
import seven.customer_example_test.Customer;
import seven.customer_example_test.CustomerDao;
import seven.customer_example_test.CustomerService;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

    @Spy
    private CustomerDao daoSpy;

    @InjectMocks
    private CustomerService service;

    @Test
    public void testAddCustomerWithCustomerVerify(){
        Customer customer = new Customer();
        service.addCustomer(customer);
        verify(daoSpy).save(any(Customer.class));
        verify(daoSpy, never()).updateEmail(any(Customer.class), any(String.class));
    }

    @Test
    public void testRegisterWithCustomerVerify(){
        Customer customer = new Customer();
        service.register(customer);
        verify(daoSpy).save(any(Customer.class));
        verify(daoSpy, never()).updateEmail(any(Customer.class), any(String.class));
    }

    @Test
    public void testChangeEmail(){
        service.changeEmail(any(Customer.class), anyString());
        verify(daoSpy).updateEmail(any(Customer.class),anyString());
        verify(daoSpy, never()).save(any(Customer.class));
    }
}
