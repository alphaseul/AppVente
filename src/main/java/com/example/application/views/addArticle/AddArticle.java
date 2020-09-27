package com.example.application.views.addArticle;

import com.example.application.views.home.Home;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouterLink;
import org.vaadin.bootstrapcss.components.BsButton;
import org.vaadin.bootstrapcss.components.BsNavBar;
import org.vaadin.bootstrapcss.enums.BsColor;

@Route(value = "AddArticle")
@PageTitle("Add a Article")
@CssImport("./styles/views/bootstrap/css/bootstrap.min.css")
public class AddArticle extends Div {

    public AddArticle(){
        BsNavBar navBar = new BsNavBar("navBar").withNavBarDark().withBgColor(BsColor.DARK);
        navBar.addNavLink( new RouterLink("Home", Home.class));
        add(navBar, new BsButton("Primary").withColor(BsColor.PRIMARY));
    }
}
