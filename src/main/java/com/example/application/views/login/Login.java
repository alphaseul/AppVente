package com.example.application.views.login;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route("login")
@PageTitle("Login")
public class Login extends Div {
    private LoginForm loginForm ;
    public Login(){
        loginForm = new LoginForm();
        loginForm.addLoginListener(e -> {
            if(e.getPassword().toString().equals("alpha")){
                navigateToMainPage();
            } else {
                loginForm.setError(true);
            }
        });
        add(loginForm);
    }
    public void navigateToMainPage(){
        UI.getCurrent().navigate(" ");
    }

}
