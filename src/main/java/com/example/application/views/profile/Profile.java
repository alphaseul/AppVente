package com.example.application.views.profile;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("profile")
@PageTitle("profile")
public class Profile extends Div {
    public void Profile(){
        TextField text = new TextField("My profile");
        add(text);
    }
}
