package com.example.application.views.login;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.login.AbstractLogin;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.apache.coyote.http11.Http11AprProtocol;


@Route("login")
@PageTitle("Login")
public class Login extends Div {

    private final LoginForm loginForm ;
    public Login(){
        loginForm = new LoginForm();
        loginForm.addLoginListener(e -> {
            boolean isAuthenticated = authenticate(e);
            if(isAuthenticated)
                navigateToMainPage();
            else
                loginForm.setError(true);
        });
        add(loginForm);
    }

    private boolean authenticate(AbstractLogin.LoginEvent event){
        String password = "alpha";
        if(event.getPassword().equals(password))
            return true;
        else
            return false ;
    }
    private void navigateToMainPage(){
        UI.getCurrent().navigate("Account");
    }

}
