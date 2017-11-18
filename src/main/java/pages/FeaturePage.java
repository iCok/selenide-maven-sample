package pages;

import io.qameta.allure.Step;

/**
 * @Author Nikita Salomatin
 * @Date 18.11.2017
 * @contact nsalomatin@hotmail.com
 */
public class FeaturePage {

    @Step(value = "login with {login} {password}")
    public FeaturePage login(String login, String password) {
        return this;
    }

    @Step(value = "add account")
    public FeaturePage addAccount() {
        return this;
    };
}
