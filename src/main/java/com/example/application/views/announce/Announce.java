package com.example.application.views.announce;


import com.example.application.views.navBar.NavBar;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "announce")
@PageTitle("announce")
@CssImport("./styles/views/announce/announce.css")
public class Announce extends NavBar {

    public Announce(){

    }
}
