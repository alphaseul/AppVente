package com.example.application.views.account;


import com.example.application.views.main.MainView;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "Account", layout = MainView.class)
@PageTitle("My Account")

public class Account extends Div {
    public Account(){


    }
}
