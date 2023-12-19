package com.example.learnspringframework;

import com.example.learnspringframework.Enterprice.MyWebController;
import com.example.learnspringframework.Game.GameRunner;
import com.example.learnspringframework.Game.GamingConsole;
import com.example.learnspringframework.Game.MarioGame;
import com.example.learnspringframework.Game.PacmanGame;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.learnspringframework") //--> it is used search the @component with in this package
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(LearnSpringFrameworkApplication.class, args);

//		MarioGame game = new MarioGame();
//		GamingConsole game = new MarioGame();
//		GameRunner runner = new GameRunner(game);


		GameRunner runner = context.getBean(GameRunner.class);
		runner.run();
		System.out.println();
		MyWebController controller = context.getBean(MyWebController.class);  // this will create a object of this class
		System.out.println(controller.returnValueFromBusinessService());
	}

}
