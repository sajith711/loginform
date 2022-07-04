package com.javafx.login.loginform;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.javafx.login.loginform.JavaFxApplication.StageReadyEvent;

import javafx.stage.Stage;

@Component
public class StageInitializer implements ApplicationListener<StageReadyEvent>{

	@Override
	public void onApplicationEvent(StageReadyEvent event) {
		// TODO Auto-generated method stub
		Stage stage = event.getStage();
	}

}
