import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    private BankAccount bankAccount;

    @Test
    public void testGettersAndSetters() {


        BankAccount account = new BankAccount("Tim", "Smith" 2005-10-10, "15387654", 0);

//        Tests
        
        assertThat(bankAccount.getFirstName()).isEqualTo("Tim");



        assertThat(bankAccount.getLastName()).isEqualTo("Smith");



        assertThat(bankAccount.getDateOfBirth()).isEqualTo(2005-10-10);



        assertThat(bankAccount.getAccountNumber()).isEqualTo("15387654");



        assertThat(bankAccount.getBalance()).isEqualTo(0);

    }
}
