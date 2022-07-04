package com.javafx.login.loginform;

import java.io.IOException;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class JavaFxApplication extends Application {

	private ConfigurableApplicationContext applicationContext;
	
	@Override
	public void init() throws Exception{
		applicationContext = new SpringApplicationBuilder(JavaFxApplication.class).run();
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		applicationContext.publishEvent(new StageReadyEvent(primaryStage));
	}
	
	static class StageReadyEvent extends ApplicationEvent{
		public StageReadyEvent(Stage primaryStage) throws IOException {
			super(primaryStage);
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("fxml/login_form.fxml"));
			primaryStage.setTitle("User Login");
			primaryStage.setScene(new Scene(root, 800, 500));
			primaryStage.show();
			
		}
		public Stage getStage() {
			return ((Stage)getSource());
		}
	}
	
	@Override
	public void stop() throws Exception{
		applicationContext.close();
		Platform.exit();
	}
}
