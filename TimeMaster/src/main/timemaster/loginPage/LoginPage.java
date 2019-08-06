package timemaster.loginPage;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Selenide.$;

@Slf4j
public class LoginPage {
    SelenideElement input_email;
    SelenideElement input_password;
    SelenideElement button_submit;

    public LoginPage() {
        button_submit = $("input[type = \"submit\"]");
        input_email = $("input[type = 'email']");
        input_password = $("input[name='passwd']");
    }

    public void setEmail(String email){
        log.info("set email: " + email);
        input_email.setValue(email);
    }

    public void setPassword(String password){
        log.info("set password");
        input_password.setValue(password);
    }

    public void submit(){
        log.info("click on the button \"Submit\"");
        button_submit.click();
    }
}