package com.example.application.views.home;

import com.example.application.views.navBar.NavBar;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import org.vaadin.bootstrapcss.components.BsBadge;
import org.vaadin.bootstrapcss.components.BsButton;
import org.vaadin.bootstrapcss.enums.BsColor;


@Route(value ="home")
@PageTitle("Home")
@RouteAlias(value = "")
@CssImport("./styles/views/home/home.css")

public class Home extends NavBar {

    public Home(){
        Div container = new Div();
        container.setId("container");
        container.setWidth("288px");
        container.setHeight("475px");

        Div info = new Div();
        info.setId("info");

        Div textDescription = new Div();

        VerticalLayout button = new VerticalLayout();
        button.setAlignItems(FlexComponent.Alignment.CENTER);


        VerticalLayout LayoutCenter = new VerticalLayout();
        LayoutCenter.setAlignItems(FlexComponent.Alignment.CENTER);

        Image image = new Image("http://www.hyperlinkcode.com/images/sample-image.jpg","girl");
        image.setId("image");
        image.setWidth("178px");
        LayoutCenter.add(image);

        BsBadge badge =  new BsBadge("OFFRE DU JOUR").withColor(BsColor.PRIMARY).withPill();

        BsButton btnVoirOffre = new BsButton("Voir l'offre").withColor(BsColor.PRIMARY);
        btnVoirOffre.setId("btnVoirOffre");
        btnVoirOffre.setWidth("210px");

        Text descrption = new Text("Information sur le produit");
        textDescription.add(descrption);
        info.add(badge, textDescription);

        LayoutCenter.add(image);

        button.add(btnVoirOffre);

        container.add(LayoutCenter, info,  button);
        add(container);
    }

}
