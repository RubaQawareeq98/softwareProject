import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.Login;

import static org.junit.Assert.assertTrue;

public class LoginTest {
    Login login=new Login();
    @Given("the entered password={string}")
    public void the_entered_password(String pass) {
        login.setPassword("1234");
    }
    @Given("the entered userName={string}")
    public void theEnteredUserName(String userName) {

        login.setUserName(userName);
    }
    @Then("the message {string} will printed")
    public void the_message_will_printed(String msg) {
      assertTrue(login.isValidLogin());
      System.out.println((msg));
    }

}
