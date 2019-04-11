package test.dragStage;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class Main extends Application
{
	Stage primaryStage;
	MyWindow myWindow;
	
	@Override
	public void start(Stage primaryStage)
	{
		this.primaryStage = primaryStage;
		try
		{
			BorderPane root = new BorderPane();
			Scene scene = new Scene(root, 400, 400);
			primaryStage.setScene(scene);
			primaryStage.show();
			
			Button button = new Button("新窗口");
			root.setTop(button);
			Button button2 = new Button("新窗口2");
			root.setBottom(button2);

			// 点按钮时创建新窗口
			button.setOnAction( (e)-> openNewWindow());

			button2.setOnAction(ae -> {
				MyStage stage = new MyStage(primaryStage);
				stage.setStyleOfStage();
			});
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	private void openNewWindow()
	{
		myWindow = new MyWindow(primaryStage);
		myWindow.resize(300, 150);
		myWindow.show();
		myWindow.centerInParent();
	}
	
	public static void main(String[] args)
	{
		launch(args);
	}
}
