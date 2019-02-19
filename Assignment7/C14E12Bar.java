import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.*;
import javafx.stage.Stage;

public class C14E12Bar extends Application {
	private TextField percent1 = new TextField();
	private TextField percent2 = new TextField();
	private TextField percent3 = new TextField();
	private TextField percent4 = new TextField();
	private Button getGraph = new Button("Bar Chart");
	
	@Override
	public void start(Stage primaryStage) {
		
		GridPane pane = new GridPane();
		pane.setPadding(new Insets(10, 10, 10, 10));
		pane.setVgap(20);
		
		ColumnConstraints column1 = new ColumnConstraints(120);
		ColumnConstraints column2 = new ColumnConstraints(120);
		ColumnConstraints column3 = new ColumnConstraints(120);
		ColumnConstraints column4 = new ColumnConstraints(120);
		pane.getColumnConstraints().addAll(column1, column2, column3, column4);
		
		refresh(pane);
		
		
		Text text5 = new Text(" Please enter the percentages of each part of overall grade: ");
		text5.setFont(Font.font("Times New Roman", FontWeight.BOLD, 18));
		pane.add(text5, 0, 0);

		
		Text text1 = new Text("   Project(%):  ");
		Text text2 = new Text("   Quiz(%):     ");
		Text text3 = new Text("   Midterm(%):  ");
		Text text4 = new Text("   Final(%):    ");
		text1.setFont(Font.font("Courier", FontWeight.BOLD, 15));
		text2.setFont(Font.font("Courier", FontWeight.BOLD, 15));
		text3.setFont(Font.font("Courier", FontWeight.BOLD, 15));
		text4.setFont(Font.font("Courier", FontWeight.BOLD, 15));
		
		pane.add(text1, 0, 1);
		pane.add(percent1, 0, 2);
		pane.add(text2, 1, 1);
		pane.add(percent2, 1, 2);
		pane.add(text3, 2, 1);
		pane.add(percent3, 2, 2);
		pane.add(text4, 3, 1);
		pane.add(percent4, 3, 2);
		pane.add(getGraph, 0, 12);
		
		GridPane.setHalignment(getGraph,HPos.CENTER);
		
		getGraph.setOnAction(e -> graph(pane));
		
		Scene scene = new Scene(pane, 500, 600);
		primaryStage.setTitle("Exercise14_12");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
		
	private void graph(GridPane pane) {
		refresh(pane);
		
		int p1 = Integer.parseInt(percent1.getText());
		int p2 = Integer.parseInt(percent2.getText());
		int p3 = Integer.parseInt(percent3.getText());
		int p4 = Integer.parseInt(percent4.getText());
		
		if (p1 + p2 + p3 + p4 == 100) {
			
			Rectangle r1 = new Rectangle(80, p1 * 2);
			r1.setFill(Color.RED);
			Rectangle r2 = new Rectangle(80, p2 * 2);
			r2.setFill(Color.BLUE);
			Rectangle r3 = new Rectangle(80, p3 * 2);
			r3.setFill(Color.GREEN);
			Rectangle r4 = new Rectangle(80, p4 * 2);
			r4.setFill(Color.ORANGE);
			pane.add(r1, 0, 5);
			pane.add(r2, 1, 5);
			pane.add(r3, 2, 5);
			pane.add(r4, 3, 5);
			GridPane.setValignment(r1,VPos.BOTTOM);
			GridPane.setValignment(r2,VPos.BOTTOM);
			GridPane.setValignment(r3,VPos.BOTTOM);
			GridPane.setValignment(r4,VPos.BOTTOM);
			GridPane.setHalignment(r1,HPos.CENTER);
			GridPane.setHalignment(r2,HPos.CENTER);
			GridPane.setHalignment(r3,HPos.CENTER);
			GridPane.setHalignment(r4,HPos.CENTER);
			
			Text t1 = new Text("Project    \n-- " + p1 + "%");
			Text t2 = new Text("Quiz       \n-- " + p2 + "%");
			Text t3 = new Text("Midterm    \n-- " + p3 + "%");
			Text t4 = new Text("Final      \n-- " + p4 + "%");
			t1.setFont(Font.font("Courier", FontWeight.BOLD, 15));
			t2.setFont(Font.font("Courier", FontWeight.BOLD, 15));
			t3.setFont(Font.font("Courier", FontWeight.BOLD, 15));
			t4.setFont(Font.font("Courier", FontWeight.BOLD, 15));
			pane.add(t1, 0, 6);
			pane.add(t2, 1, 6);
			pane.add(t3, 2, 6);
			pane.add(t4, 3, 6);
			GridPane.setHalignment(t1,HPos.CENTER);
			GridPane.setHalignment(t2,HPos.CENTER);
			GridPane.setHalignment(t3,HPos.CENTER);
			GridPane.setHalignment(t4,HPos.CENTER);
		}
		else {
			Text msg = new Text("The sum of percents\nmust be 100%.");
			pane.add(msg, 2, 12);
		}
	}
	
	private void refresh(GridPane pane) {
	
		Rectangle r5 = new Rectangle(120, 200);
		r5.setFill(Color.WHITESMOKE);
		Rectangle r6 = new Rectangle(120, 200);
		r6.setFill(Color.WHITESMOKE);
		Rectangle r7 = new Rectangle(120, 200);
		r7.setFill(Color.WHITESMOKE);
		Rectangle r8 = new Rectangle(120, 200);
		r8.setFill(Color.WHITESMOKE);
		Rectangle r9 = new Rectangle(120, 50);
		r9.setFill(Color.WHITESMOKE);
		Rectangle r10 = new Rectangle(120, 50);
		r10.setFill(Color.WHITESMOKE);
		Rectangle r11 = new Rectangle(120, 50);
		r11.setFill(Color.WHITESMOKE);
		Rectangle r12 = new Rectangle(120, 50);
		r12.setFill(Color.WHITESMOKE);
		Rectangle r13 = new Rectangle(120, 50);
		r13.setFill(Color.WHITESMOKE);
		pane.add(r5, 0, 5);
		pane.add(r6, 1, 5);
		pane.add(r7, 2, 5);
		pane.add(r8, 3, 5);
		pane.add(r9, 0, 6);
		pane.add(r10, 1, 6);
		pane.add(r11, 2, 6);
		pane.add(r12, 3, 6);
		pane.add(r13, 2, 12);
		GridPane.setValignment(r5,VPos.BOTTOM);
		GridPane.setValignment(r6,VPos.BOTTOM);
		GridPane.setValignment(r7,VPos.BOTTOM);
		GridPane.setValignment(r8,VPos.BOTTOM);
		GridPane.setHalignment(r5,HPos.CENTER);
		GridPane.setHalignment(r6,HPos.CENTER);
		GridPane.setHalignment(r7,HPos.CENTER);
		GridPane.setHalignment(r8,HPos.CENTER);
		GridPane.setHalignment(r9,HPos.CENTER);
		GridPane.setHalignment(r10,HPos.CENTER);
		GridPane.setHalignment(r11,HPos.CENTER);
		GridPane.setHalignment(r12,HPos.CENTER);
	}
	
	public static void main(String[] args) {
		System.out.println("This program is to display a bar chart.");
		Application.launch(args);
	}
}