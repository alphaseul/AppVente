package com.example.application.views.about;

import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.example.application.views.main.MainView;


@Route(value = "about", layout = MainView.class)
@PageTitle("about")
@CssImport("./styles/views/about/about-view.css")
public class AboutView extends Div {

    public AboutView() {
        VerticalLayout layout = new VerticalLayout();
        layout.setId("layout");
        TextField textField = new TextField();
        H1 text = new H1("hello");
        text.setId("text");
        textField.setId("text");
        layout.add(text,textField);
        add(layout);
    }

}
