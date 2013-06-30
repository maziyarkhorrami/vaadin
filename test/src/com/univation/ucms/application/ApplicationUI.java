package com.univation.ucms.application;

import javax.servlet.http.HttpServletRequest;

import com.univation.ucms.forms.*;
import com.vaadin.server.BrowserWindowOpener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;

/**
 * Main UI class
 */



@SuppressWarnings("serial")
public class ApplicationUI extends UI {

	
	@Override
	protected void init(VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		
		LoginForm login = new LoginForm();
		layout.addComponent(login);
        
	}
	
	
}