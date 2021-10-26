package org.natan.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

public class myproject implements EntryPoint {
	
	private Label lbAbout = new Label("After studying about GWT, I developed this interface in order to create a portal for user login control.");
	private Label lbTitle = new Label("Welcome to Portal");
	private Label lbUsername= new Label("Username: ");
	private Label lbPassword = new Label("Password: ");
	private TextBox txtUsername = new TextBox();
	private PasswordTextBox txtPassword = new PasswordTextBox();
	private Button btSubmit = new Button("Submit");
	private Label lbLoggedUser = new Label("Logged user: ");
	private Label lbUser = new Label("");

	public void onModuleLoad() {
		
		RootPanel.get().add(lbAbout);
		RootPanel.get().add(new Label("-"));
		RootPanel.get().add(lbTitle);
		RootPanel.get().add(new Label("-"));
		RootPanel.get().add(lbUsername);
		RootPanel.get().add(txtUsername);
		RootPanel.get().add(lbPassword);
		RootPanel.get().add(txtPassword);
		RootPanel.get().add(btSubmit);
		RootPanel.get().add(new Label("-"));
		RootPanel.get().add(lbLoggedUser);
		RootPanel.get().add(lbUser);
		
		btSubmit.addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				if (txtUsername.getText().isEmpty() || txtPassword.getText().isEmpty()) {
					Window.alert("Empty username or password!");
				} else if (!lbUser.getText().equals("")) {
					Window.alert("Hi " + txtUsername.getText() + ", user " + lbUser.getText() + " was logged before, but now you are!");
					lbUser.setText(txtUsername.getText());
				} else {
					Window.alert("Hi " + txtUsername.getText() + ", first login successful!");
					lbUser.setText(txtUsername.getText());
				}
			}
			
		});

	}
}