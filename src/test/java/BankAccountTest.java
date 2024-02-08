import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BankAccountTest {

    @Test
    public void testGettersAndSetters() {
        BankAccount account = new BankAccount();

        account.setFirstName("Jean");
        assertThat().isEqualTo("Jean");
    }
}
