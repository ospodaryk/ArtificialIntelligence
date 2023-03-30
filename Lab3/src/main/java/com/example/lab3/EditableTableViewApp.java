package com.example.lab3;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;


import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;


public class EditableTableViewApp extends Application {


    private final ObservableList<Person> people = FXCollections.observableArrayList();
    private final ObservableList<Skill> people2 = FXCollections.observableArrayList();
    private final ObservableList<Skill> people3 = FXCollections.observableArrayList();


    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        TableView<Person> tableView = new TableView<>();
        tableView.setEditable(true);


        TableColumn<Person, String> firstNameColumn = new TableColumn<>("          ");
        firstNameColumn.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        firstNameColumn.setCellFactory(TextFieldTableCell.forTableColumn());


        TableColumn<Person, Double> speed_brain = new TableColumn<>("Чисельні методи");
        speed_brain.setCellValueFactory(cellData -> cellData.getValue().speed_brainProperty().asObject());
        speed_brain.setCellFactory(TextFieldTableCell.<Person, Double>forTableColumn(new DoubleStringConverter()));
        speed_brain.setId("2");
        TableColumn<Person, Double> speed_move = new TableColumn<>("Об’єктно-орієнтоване програмування");
        speed_move.setCellValueFactory(cellData -> cellData.getValue().speed_moveProperty().asObject());
        speed_move.setCellFactory(TextFieldTableCell.<Person, Double>forTableColumn(new DoubleStringConverter()));




        TableColumn<Person, Double> concentration = new TableColumn<>("Програмування в Інтернет");
        concentration.setCellValueFactory(cellData -> cellData.getValue().concentrationProperty().asObject());
        concentration.setCellFactory(TextFieldTableCell.<Person, Double>forTableColumn(new DoubleStringConverter()));


        TableColumn<Person, Double> eye_memory = new TableColumn<>("Бази даних");
        eye_memory.setCellValueFactory(cellData -> cellData.getValue().eye_memoryProperty().asObject());
        eye_memory.setCellFactory(TextFieldTableCell.<Person, Double>forTableColumn(new DoubleStringConverter()));




        TableColumn<Person, Double> reaction = new TableColumn<>("Конструювання програмного забезпечення");
        reaction.setCellValueFactory(cellData -> cellData.getValue().responsProperty().asObject());
        reaction.setCellFactory(TextFieldTableCell.<Person, Double>forTableColumn(new DoubleStringConverter()));




        TableColumn<Person, Double> move_memory = new TableColumn<>("Хмарні обчислення");
        move_memory.setCellValueFactory(cellData -> cellData.getValue().move_memoryProperty().asObject());
        move_memory.setCellFactory(TextFieldTableCell.<Person, Double>forTableColumn(new DoubleStringConverter()));





        tableView.getColumns().addAll(firstNameColumn, speed_brain, speed_move, concentration, eye_memory, reaction, move_memory);
        tableView.setItems(people);
        people.add(new Person("Java-developer", 0.9, 0.9, 0.8, 0.4, 0.5, 0.3, 0.6, 0.2, 0.9, 0.8));
        people.add(new Person("Web-developer", 0.8, 0.5, 0.9, 0.3, 0.1, 0.2, 0.2, 0.2, 0.5, 0.5));
        people.add(new Person("Software engineer", 0.3, 0.9, 0.6, 0.5, 0.9, 0.8, 0.9, 0.8, 0.6, 0.3));
        people.add(new Person("DevOps", 0.5, 0.4, 0.5, 0.5, 0.2, 0.2, 0.3, 0.3, 0.9, 0.8));
        people.add(new Person("UI/UX designer", 0.7, 0.8, 0.8, 0.2, 0.6, 0.2, 0.2, 0.3, 0.3, 0.2));




//---------------------------------------------------------------
        TableView<Skill> tableView2 = new TableView<>();
        tableView2.setEditable(true);


        TableColumn<Skill, String> firstNameColumn2 = new TableColumn<>("          ");
        firstNameColumn2.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        firstNameColumn2.setCellFactory(TextFieldTableCell.forTableColumn());


        TableColumn<Skill, Double> c1 = new TableColumn<>("Оксана");
        c1.setCellValueFactory(cellData -> cellData.getValue().k1Property().asObject());
        c1.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));


        TableColumn<Skill, Double> c2 = new TableColumn<>("Едуард");
        c2.setCellValueFactory(cellData -> cellData.getValue().k2Property().asObject());
        c2.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));




        TableColumn<Skill, Double> c3 = new TableColumn<>("Олег");
        c3.setCellValueFactory(cellData -> cellData.getValue().k3Property().asObject());
        c3.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));


        TableColumn<Skill, Double> c4 = new TableColumn<>("Дарія");
        c4.setCellValueFactory(cellData -> cellData.getValue().k4Property().asObject());
        c4.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));




        TableColumn<Skill, Double> c5 = new TableColumn<>("Роман");
        c5.setCellValueFactory(cellData -> cellData.getValue().k5Property().asObject());
        c5.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));




        tableView2.getColumns().addAll(firstNameColumn2, c1, c2, c3, c4, c5);
        tableView2.setItems(people2);
        people2.add(new Skill("Чисельні методи", 0.9, 0.8, 0.7, 0.9, 1));
        people2.add(new Skill("Об’єктно-орієнтоване програмування", 0.6, 0.4, 0.8, 0.5, 0.6));
        people2.add(new Skill("Програмування в Інтернет", 0.5, 0.2, 0.3, 0.5, 0.9));
        people2.add(new Skill("Бази даних", 0.5, 0.9, 0.5, 0.5, 0.2));
        people2.add(new Skill("Конструювання програмного забезпечення", 1, 0.6, 0.5, 0.7, 0.4));
        people2.add(new Skill("Хмарні обчислення", 0.4, 0.5, 1, 0.7, 0.8));
        //------------------------------------------------------------------------------------------------------------------------------------------------------------




        TableView<Skill> tableView3 = new TableView<>();
        tableView3.setEditable(false);


        TableColumn<Skill, String> firstNameColumn3 = new TableColumn<>("          ");
        firstNameColumn3.setCellValueFactory(cellData -> cellData.getValue().firstNameProperty());
        firstNameColumn3.setCellFactory(TextFieldTableCell.forTableColumn());


        TableColumn<Skill, Double> r1 = new TableColumn<>("Оксана");
        r1.setCellValueFactory(cellData -> cellData.getValue().k1Property().asObject());
        r1.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));


        TableColumn<Skill, Double> r2 = new TableColumn<>("Едуард");
        r2.setCellValueFactory(cellData -> cellData.getValue().k2Property().asObject());
        r2.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));




        TableColumn<Skill, Double> r3 = new TableColumn<>("Олег");
        r3.setCellValueFactory(cellData -> cellData.getValue().k3Property().asObject());
        r3.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));


        TableColumn<Skill, Double> r4 = new TableColumn<>("Дарія");
        r4.setCellValueFactory(cellData -> cellData.getValue().k4Property().asObject());
        r4.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));




        TableColumn<Skill, Double> r5 = new TableColumn<>("Роман");
        r5.setCellValueFactory(cellData -> cellData.getValue().k5Property().asObject());
        r5.setCellFactory(TextFieldTableCell.<Skill, Double>forTableColumn(new DoubleStringConverter()));




        tableView3.getColumns().addAll(firstNameColumn3, r1, r2, r3, r4, r5);
        tableView3.setItems(people3);
        List<Double> res = findRes();
        people3.add(new Skill("Java-developer", res.get(0), res.get(1), res.get(2), res.get(3), res.get(4)));
        people3.add(new Skill("Web-developer", res.get(5), res.get(6), res.get(7), res.get(8), res.get(9)));
        people3.add(new Skill("Software engineer", res.get(10), res.get(11), res.get(12), res.get(13), res.get(14)));
        people3.add(new Skill("DevOps", res.get(15), res.get(16), res.get(17), res.get(18), res.get(19)));
        people3.add(new Skill("UI/UX designer", res.get(20), res.get(21), res.get(22), res.get(23), res.get(24)));
//     //------------------------------------------------------------------------------------------------------------------------------------------------------------


        //----------------------------------------------------------------------------------------------------------------------------------------------------------------
        BarChart<String, Number> chart = CHARTS(res);
        Button button = new Button("обчислити");
        BorderPane root = new BorderPane(tableView2, tableView, tableView3, chart, button);
        Scene scene = new Scene(root, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
        button.setOnAction(event -> {
            chart.getData().clear();
            List<Double> newv = findRes();
            people3.clear();
            people3.add(new Skill("Java-developer", newv.get(0), newv.get(1), newv.get(2), newv.get(3), newv.get(4)));
            people3.add(new Skill("Web-developer", newv.get(5), newv.get(6), newv.get(7), newv.get(8), newv.get(9)));
            people3.add(new Skill("Software engineer", newv.get(10), newv.get(11), newv.get(12), newv.get(13), newv.get(14)));
            people3.add(new Skill("DevOps", newv.get(15), newv.get(16), newv.get(17), newv.get(18), newv.get(19)));
            people3.add(new Skill("UI/UX designer", newv.get(20), newv.get(21), newv.get(22), newv.get(23), newv.get(24)));
            CategoryAxis xAxis = new CategoryAxis();
            NumberAxis yAxis = new NumberAxis();


            // Create the bar chart
            chart.setTitle("Матриця та графік результатів оцінювання за алгоритмом max-prod");


            // Create the series for each group
            XYChart.Series<String, Number> series1 = new XYChart.Series<>();
            series1.setName("Оксана");
            series1.getData().add(new XYChart.Data<>("Java-developer", newv.get(0)));
            series1.getData().add(new XYChart.Data<>("Web-developer", newv.get(5)));
            series1.getData().add(new XYChart.Data<>("Software engineer", newv.get(10)));
            series1.getData().add(new XYChart.Data<>("DevOps", newv.get(15)));
            series1.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(20)));


            XYChart.Series<String, Number> series2 = new XYChart.Series<>();
            series2.setName("Едуард");
            series2.getData().add(new XYChart.Data<>("Java-developer", newv.get(1)));
            series2.getData().add(new XYChart.Data<>("Web-developer", newv.get(6)));
            series2.getData().add(new XYChart.Data<>("Software engineer", newv.get(11)));
            series2.getData().add(new XYChart.Data<>("DevOps", newv.get(16)));
            series2.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(21)));




            XYChart.Series<String, Number> series3 = new XYChart.Series<>();
            series3.setName("Олег");
            series3.getData().add(new XYChart.Data<>("Java-developer", newv.get(2)));
            series3.getData().add(new XYChart.Data<>("Web-developer", newv.get(7)));
            series3.getData().add(new XYChart.Data<>("Software engineer", newv.get(12)));
            series3.getData().add(new XYChart.Data<>("DevOps", newv.get(17)));
            series3.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(22)));


            XYChart.Series<String, Number> series4 = new XYChart.Series<>();
            series4.setName("Дарія");
            series4.getData().add(new XYChart.Data<>("Java-developer", newv.get(3)));
            series4.getData().add(new XYChart.Data<>("Web-developer", newv.get(8)));
            series4.getData().add(new XYChart.Data<>("Software engineer", newv.get(13)));
            series4.getData().add(new XYChart.Data<>("DevOps", newv.get(18)));
            series4.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(23)));


            XYChart.Series<String, Number> series5 = new XYChart.Series<>();
            series5.setName("Роман");
            series5.getData().add(new XYChart.Data<>("Java-developer", newv.get(4)));
            series5.getData().add(new XYChart.Data<>("Web-developer", newv.get(9)));
            series5.getData().add(new XYChart.Data<>("Software engineer", newv.get(14)));
            series5.getData().add(new XYChart.Data<>("DevOps", newv.get(19)));
            series5.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(24)));
            // Add the series to the chart
            chart.getData().add(series1);
            chart.getData().add(series2);
            chart.getData().add(series3);
            chart.getData().add(series4);
            chart.getData().add(series5);
        });
//        tableView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
//            @Override
//            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
//                chart.getData().clear();
//                int row = tableView.getSelectionModel().getSelectedCells().get(0).getRow();
//                int column = tableView.getSelectionModel().getSelectedCells().get(0).getColumn();
//                switch (column) {
//                    case 1:
//                        System.out.println(people.get(row).getSpeed_brain());
//                        var selectedItem = tableView.getSelectionModel().getSelectedItem();
//
//                        double integ = Double.parseDouble(tableView.getColumns().get(column).getCellData(selectedItem).toString());
//                        System.out.println("INTEG"+integ);
//                        people.get(row).setSpeed_brain(integ);
//                        System.out.println(people.get(row).getSpeed_brain());
//                        break;
//                    case 2:
//                        break;
//                    case 3:
//                        break;
//                    case 4:
//                        break;
//                    case 5:
//                        break;
//                    case 6:
//                        break;
//                    case 7:
//                        break;
//                    default:
//                }
////                if (tableView.getSelectionModel().selectedItemProperty().getName()) {
////                    int index = change.getFrom();
////                    var updatedItem = tableView.getItems().get(index);
////                    // Do something with the updated item
////                }
//            }
//
//        });




    }
    public void clea(){


    }



    public List<Double> findRes() {
        List<Double> maxlist = new ArrayList<>();
        List<Double> minlist = new ArrayList<>();


        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people2.size(); j++) {
                System.out.println(people.get(i).getSpeed_brain() + "    =    " + people2.get(j).getK1());
                minlist.add(Math.min(people.get(i).getSpeed_brain(), people2.get(j).getK1()));
                minlist.add(Math.min(people.get(i).getSpeed_move(), people2.get(j).getK2()));
                minlist.add(Math.min(people.get(i).getConcentration(), people2.get(j).getK3()));
                minlist.add(Math.min(people.get(i).getEye_memory(), people2.get(j).getK4()));
                minlist.add(Math.min(people.get(i).getReaction(), people2.get(j).getK5()));
                maxlist.add(Collections.max(minlist));
                minlist.clear();
            }
        }
        return maxlist;
    }


    public BarChart<String, Number> CHARTS(List<Double> newv) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();

        BarChart<String, Number> chart = new BarChart<>(xAxis, yAxis);
        // Create the bar chart
        chart.setTitle("Матриця та графік результатів оцінювання за алгоритмом max-prod");


        // Create the series for each group
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Оксана");
        series1.getData().add(new XYChart.Data<>("Java-developer", newv.get(0)));
        series1.getData().add(new XYChart.Data<>("Web-developer", newv.get(5)));
        series1.getData().add(new XYChart.Data<>("Software engineer", newv.get(10)));
        series1.getData().add(new XYChart.Data<>("DevOps", newv.get(15)));
        series1.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(20)));


        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Едуард");
        series2.getData().add(new XYChart.Data<>("Java-developer", newv.get(1)));
        series2.getData().add(new XYChart.Data<>("Web-developer", newv.get(6)));
        series2.getData().add(new XYChart.Data<>("Software engineer", newv.get(11)));
        series2.getData().add(new XYChart.Data<>("DevOps", newv.get(16)));
        series2.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(21)));




        XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName("Олег");
        series3.getData().add(new XYChart.Data<>("Java-developer", newv.get(2)));
        series3.getData().add(new XYChart.Data<>("Web-developer", newv.get(7)));
        series3.getData().add(new XYChart.Data<>("Software engineer", newv.get(12)));
        series3.getData().add(new XYChart.Data<>("DevOps", newv.get(17)));
        series3.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(22)));


        XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series4.setName("Дарія");
        series4.getData().add(new XYChart.Data<>("Java-developer", newv.get(3)));
        series4.getData().add(new XYChart.Data<>("Web-developer", newv.get(8)));
        series4.getData().add(new XYChart.Data<>("Software engineer", newv.get(13)));
        series4.getData().add(new XYChart.Data<>("DevOps", newv.get(18)));
        series4.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(23)));


        XYChart.Series<String, Number> series5 = new XYChart.Series<>();
        series5.setName("Роман");
        series5.getData().add(new XYChart.Data<>("Java-developer", newv.get(4)));
        series5.getData().add(new XYChart.Data<>("Web-developer", newv.get(9)));
        series5.getData().add(new XYChart.Data<>("Software engineer", newv.get(14)));
        series5.getData().add(new XYChart.Data<>("DevOps", newv.get(19)));
        series5.getData().add(new XYChart.Data<>("UI/UX designer", newv.get(24)));
        // Add the series to the chart
        chart.getData().add(series1);
        chart.getData().add(series2);
        chart.getData().add(series3);
        chart.getData().add(series4);
        chart.getData().add(series5);
        return chart;


    }

}

