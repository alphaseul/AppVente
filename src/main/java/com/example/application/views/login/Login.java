package com.example.application.views.login;

import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.login.AbstractLogin;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route("login")
@PageTitle("login")
public class Login extends Div {

    private final LoginForm loginForm ;
    public Login(){
        VerticalLayout layout = new VerticalLayout();
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        loginForm = new LoginForm();
        loginForm.addLoginListener(e -> {
            boolean isAuthenticated = authenticate(e);
            if(isAuthenticated)
                navigateToMainPage();
            else
                loginForm.setError(true);
        });
        layout.add(loginForm);
        add(layout);
    }

    private boolean authenticate(AbstractLogin.LoginEvent event){
        String password = "alpha";
        return event.getPassword().equals(password);
    }
    private void navigateToMainPage(){
        UI.getCurrent().navigate("Account");
    }

}
