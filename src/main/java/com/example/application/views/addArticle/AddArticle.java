package com.example.application.views.addArticle;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "AddArticle", layout = MainView.class)
@PageTitle("Add a Article")
//@CssImport("")
public class AddArticle extends Div {

    public AddArticle(){

    }
}
