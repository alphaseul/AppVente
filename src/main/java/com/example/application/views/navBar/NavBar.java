package com.example.application.views.navBar;

import com.example.application.views.announce.Announce;
import com.example.application.views.home.Home;
import com.example.application.views.login.Login;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.bootstrapcss.components.BsNavBar;
import org.vaadin.bootstrapcss.enums.BsColor;



@Route("navBar")

public class NavBar extends Div {
    public NavBar(){
        addDependencies();
        BsNavBar navBar = new BsNavBar("navBar").withNavBarDark().withBgColor(BsColor.DARK);
        navBar.addNavLink( new RouterLink("Home", Home.class));
        navBar.addNavLink( new RouterLink("Login", Login.class));
        add(navBar);
    }
    private void addDependencies(){
        UI.getCurrent().getPage()
                .addJavaScript("https://code.jquery.com/jquery-3.5.1.slim.min.js");
        UI.getCurrent().getPage()
                .addJavaScript("https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js");
        UI.getCurrent().getPage()
                .addJavaScript("https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js");
        UI.getCurrent().getPage()
                .addStyleSheet("https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css");

    }
}
