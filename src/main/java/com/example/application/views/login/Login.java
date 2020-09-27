package com.example.application.views.login;


import com.example.application.views.navBar.NavBar;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.login.AbstractLogin;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;


@Route("login")
@PageTitle("login")
@CssImport("./styles/views/login/login.css")
public class Login extends NavBar {
    private final LoginForm loginForm ;
    public Login(){
        Div container = new Div();
        container.setId("login");
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
        container.add(loginForm);
        layout.add(container);
        add(layout);
    }

    private boolean authenticate(AbstractLogin.LoginEvent event){
        String password = "alpha";
        return event.getPassword().equals(password);
    }
    private void navigateToMainPage(){
        UI.getCurrent().navigate("home");
    }

}
