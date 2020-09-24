package com.example.application.views.announce;

import com.example.application.views.main.MainView;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route(value = "announce", layout = MainView.class)
@PageTitle("announce")
@CssImport("./styles/views/announce/announce.css")
public class Announce extends Div {
    private H1 listing;
    private TextField title;
    private TextField category;
    private TextField condition;
    private Upload images;

    public Announce(){
        VerticalLayout layout = new VerticalLayout();
        layout.setAlignItems(FlexComponent.Alignment.CENTER);
        listing = new H1("Create your listing");
        title = new TextField("Title");
        category = new TextField("Category");
        condition = new TextField("Condition");
        images.setAcceptedFileTypes("image/jpeg", "image/png", "image/gif");
        images.addSucceededListener(e -> {
            //Component component = createComponent(e.getMIMEType(),
                    //e.getFileName(),
                    //buffer.getInputStream(e.getFileName()));
            //showOutput(e.getFileName(), component, output);
        });
        layout.add(listing, title);
        add(layout);
    }
}
