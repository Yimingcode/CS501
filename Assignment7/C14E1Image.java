import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class C14E1Image extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setAlignment(Pos.CENTER);
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setHgap(5);
		pane.setVgap(5);		
		
		Image image1 = new Image("UK.png");
		ImageView imageView1 = new ImageView(image1);
		imageView1.setFitWidth(400);
		imageView1.setFitHeight(200);	
		Image image2 = new Image("Canada.png");
		ImageView imageView2 = new ImageView(image2);
		imageView2.setFitWidth(400);
		imageView2.setFitHeight(200);
		Image image3 = new Image("China.png");
		ImageView imageView3 = new ImageView(image3);
		imageView3.setFitWidth(400);
		imageView3.setFitHeight(200);
		Image image4 = new Image("USA.png");
		ImageView imageView4 = new ImageView(image4);
		imageView4.setFitWidth(380);
		imageView4.setFitHeight(200);
		
		Label label1 = new Label("", imageView1);
		label1.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 10));
		label1.setContentDisplay(ContentDisplay.TOP);
		Label label2 = new Label("", imageView2);
		label2.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 10));
		label2.setContentDisplay(ContentDisplay.TOP);
		Label label3 = new Label("", imageView3);
		label3.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 10));
		label3.setContentDisplay(ContentDisplay.TOP);
		Label label4 = new Label("", imageView4);
		label4.setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 10));
		label4.setContentDisplay(ContentDisplay.TOP);
		
		pane.add(label1, 0, 1);
		pane.add(label2, 1, 1);
		pane.add(label3, 0, 2);
		pane.add(label4, 1, 2);
		GridPane.setHalignment(label1, HPos.CENTER);
		GridPane.setHalignment(label2, HPos.CENTER);
		GridPane.setHalignment(label3, HPos.CENTER);
		GridPane.setHalignment(label4, HPos.CENTER);
		
		Scene scene = new Scene(pane);
		primaryStage.setTitle("ShowFlags");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		System.out.println("This program is to displays four images in a grid pane.");
		Application.launch(args);
	}
}