package com.example.application.views.home;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@Route(value ="home",layout = MainView.class)
@PageTitle("Home")
@RouteAlias(value = "", layout= MainView.class)
public class Home extends VerticalLayout {

    public Home(){

    }
}
