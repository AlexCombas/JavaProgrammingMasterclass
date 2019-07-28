package section.six;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VipCustomerTest {

    @Test
    void testValidCustomer() {
        VipCustomer customer = new VipCustomer("Alex", 1000, "alex@flyingcastle.net");
        assertEquals("Alex", customer.getName());
    }

}