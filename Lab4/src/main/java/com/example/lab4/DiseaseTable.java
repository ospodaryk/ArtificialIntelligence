package com.example.lab4;

import com.example.lab4.Disease;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.DoubleStringConverter;
import javafx.util.converter.IntegerStringConverter;

import java.util.List;

public class DiseaseTable extends Application {
    private ObservableList<Disease> diseases;
    private ObservableList<User> users;

    public void init() {
        // Initialize the list of diseases with sample data
        users = FXCollections.observableArrayList(new User("Anastasia"), new User("Roma", true));

        diseases = FXCollections.observableArrayList(new Disease("Кір", 20, 10, 10, 0, 0, 0, 30, 0, 0, 0, 0, 0, 0, 0, 30), new Disease("Грип", 20, 10, 10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 30, 30, 0), new Disease("Запалення легень", 20, 0, 20, 0, 0, 30, 0, 0, 0, 0, 0, 0, 15, 15, 0), new Disease("Ангіна", 20, 0, 0, 20, 30, 0, 0, 0, 0, 0, 0, 0, 15, 15, 0), new Disease("Скарлатина", 15, 0, 0, 15, 10, 0, 30, 0, 0, 0, 0, 0, 0, 0, 0), new Disease("Свинка", 30, 0, 0, 0, 30, 0, 30, 0, 40, 0, 0, 0, 0, 0, 0), new Disease("Дизентерія", 20, 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 0, 0, 0, 0), new Disease("Гепатит", 0, 0, 0, 0, 0, 0, 0, 0, 0, 40, 0, 60, 0, 0, 0));
    }

    @Override
    public void start(Stage stage) {

        // create a label for the table
        Label tableLabel = new Label("Хвороби");

        // create a table view for displaying the data
        TableView<Disease> table = new TableView<>();
        table.setEditable(true);

        // create columns for the table
        TableColumn<Disease, String> nameCol = new TableColumn<>("Симптоми  ↓");
        TableColumn<Disease, Integer> tempCol = new TableColumn<>("Температура");
        TableColumn<Disease, Integer> coldCol = new TableColumn<>("Нежить");
        TableColumn<Disease, Integer> coughCol = new TableColumn<>("Кашель");
        TableColumn<Disease, Integer> soreCol = new TableColumn<>("Біль горла");
        TableColumn<Disease, Integer> bigCol = new TableColumn<>("Збільшення підчелюсних залоз");
        TableColumn<Disease, Integer> restCol = new TableColumn<>("Віддих");
        TableColumn<Disease, Integer> rashCol = new TableColumn<>("Різна висипка");
        TableColumn<Disease, Integer> vomitingCol = new TableColumn<>("Тошнота рвота");
        TableColumn<Disease, Integer> swellingCol = new TableColumn<>("Опухлість завушних залоз");
        TableColumn<Disease, Integer> painsCol = new TableColumn<>("Болі в животі");
        TableColumn<Disease, Integer> disordersCol = new TableColumn<>("Розлади кишківника");
        TableColumn<Disease, Integer> yellowingCol = new TableColumn<>("Пожовтіння шкіри");
        TableColumn<Disease, Integer> headacheCol = new TableColumn<>("Головний біль");
        TableColumn<Disease, Integer> chillsCol = new TableColumn<>("Озноб");
        TableColumn<Disease, Integer> photophobiaCol = new TableColumn<>("Світлобоязнь");

        // set the cell value factories for each column
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        tempCol.setCellValueFactory(new PropertyValueFactory<>("temp1"));
        coldCol.setCellValueFactory(new PropertyValueFactory<>("cold2"));
        coughCol.setCellValueFactory(new PropertyValueFactory<>("cough3"));
        soreCol.setCellValueFactory(new PropertyValueFactory<>("sore4"));
        bigCol.setCellValueFactory(new PropertyValueFactory<>("big5"));
        restCol.setCellValueFactory(new PropertyValueFactory<>("rest6"));
        rashCol.setCellValueFactory(new PropertyValueFactory<>("rash7"));
        vomitingCol.setCellValueFactory(new PropertyValueFactory<>("vomiting8"));
        swellingCol.setCellValueFactory(new PropertyValueFactory<>("swelling9"));
        painsCol.setCellValueFactory(new PropertyValueFactory<>("pains10"));
        disordersCol.setCellValueFactory(new PropertyValueFactory<>("disorders11"));
        yellowingCol.setCellValueFactory(new PropertyValueFactory<>("yellowing12"));
        headacheCol.setCellValueFactory(new PropertyValueFactory<>("headache13"));
        chillsCol.setCellValueFactory(new PropertyValueFactory<>("chills14"));
        photophobiaCol.setCellValueFactory(new PropertyValueFactory<>("photophobia15"));


        // ---------------
        nameCol.setCellFactory(TextFieldTableCell.forTableColumn());
        tempCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        coldCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        coughCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        soreCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        bigCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        restCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        rashCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        vomitingCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        swellingCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        painsCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        disordersCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        yellowingCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        headacheCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        chillsCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));
        photophobiaCol.setCellFactory(TextFieldTableCell.<Disease, Integer>forTableColumn(new IntegerStringConverter()));


        // add the columns to the table
        table.getColumns().addAll(nameCol, tempCol, coldCol, coughCol, soreCol, bigCol, restCol, rashCol, vomitingCol, swellingCol, painsCol, disordersCol, yellowingCol, headacheCol, chillsCol, photophobiaCol);
        table.setItems(diseases);


        //=
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Add name label and text field to grid pane
        Label nameLabel = new Label("ПІБ:");
        TextField nameTextField = new TextField();
        gridPane.add(nameLabel, 0, 0);
        gridPane.add(nameTextField, 1, 0);

        // Add checkboxes to grid pane
        CheckBox checkBox1 = new CheckBox("Температура");
        CheckBox checkBox2 = new CheckBox("Нежить");
        CheckBox checkBox3 = new CheckBox("Кашель");
        CheckBox checkBox4 = new CheckBox("Біль горла");
        CheckBox checkBox5 = new CheckBox("Збільшення підчелюсних залоз");
        CheckBox checkBox6 = new CheckBox("Віддих");
        CheckBox checkBox7 = new CheckBox("Різна висипка");
        CheckBox checkBox8 = new CheckBox("Тошнота рвота");
        CheckBox checkBox9 = new CheckBox("Опухлість завушних залоз");
        CheckBox checkBox10 = new CheckBox("Болі в животі");
        CheckBox checkBox11 = new CheckBox("Розлади кишківника");
        CheckBox checkBox12 = new CheckBox("Пожовтіння шкіри");
        CheckBox checkBox13 = new CheckBox("Головний біль");
        CheckBox checkBox14 = new CheckBox("Озноб");
        CheckBox checkBox15 = new CheckBox("Світлобоязнь");

        gridPane.add(checkBox1, 0, 1);
        gridPane.add(checkBox2, 1, 1);
        gridPane.add(checkBox3, 2, 1);
        gridPane.add(checkBox4, 3, 1);
        gridPane.add(checkBox5, 4, 1);

        gridPane.add(checkBox6, 0, 2);
        gridPane.add(checkBox7, 1, 2);
        gridPane.add(checkBox8, 2, 2);
        gridPane.add(checkBox9, 3, 2);
        gridPane.add(checkBox10, 4, 2);

        gridPane.add(checkBox11, 0, 3);
        gridPane.add(checkBox12, 1, 3);
        gridPane.add(checkBox13, 2, 3);
        gridPane.add(checkBox14, 3, 3);
        gridPane.add(checkBox15, 4, 3);


        //------------------------------------------------------------------------------

        TableView<User> tableresults = new TableView<>();
        table.setEditable(false);

        // create columns for the table
        TableColumn<User, String> nc = new TableColumn<>("Імя");
        TableColumn<User, Integer> c1 = new TableColumn<>("Кір");
        TableColumn<User, Integer> c2 = new TableColumn<>("Грип");
        TableColumn<User, Integer> c3 = new TableColumn<>("Запалення легень");
        TableColumn<User, Integer> c4 = new TableColumn<>("Ангіна");
        TableColumn<User, Integer> c5 = new TableColumn<>("Скарлатина");
        TableColumn<User, Integer> c6 = new TableColumn<>("Свинка");
        TableColumn<User, Integer> c7 = new TableColumn<>("Дизентерія");
        TableColumn<User, Integer> c8 = new TableColumn<>("Гепатит");
//
//        // set the cell value factories for each column
        nc.setCellValueFactory(new PropertyValueFactory<>("name"));
        c1.setCellValueFactory(new PropertyValueFactory<>("c1"));
        c2.setCellValueFactory(new PropertyValueFactory<>("c2"));
        c3.setCellValueFactory(new PropertyValueFactory<>("c3"));
        c4.setCellValueFactory(new PropertyValueFactory<>("c4"));
        c5.setCellValueFactory(new PropertyValueFactory<>("c5"));
        c6.setCellValueFactory(new PropertyValueFactory<>("c6"));
        c7.setCellValueFactory(new PropertyValueFactory<>("c7"));
        c8.setCellValueFactory(new PropertyValueFactory<>("c8"));

        tableresults.getColumns().addAll(nc, c1, c2, c3, c4, c5, c6, c7, c8);
        tableresults.setItems(users);
        tableresults.setItems(users);
        BarChart<String, Number> chart = CHARTS(new User(""));
        Button button = new Button("Обчислити");
        button.setOnAction(event -> {
            chart.getData().clear();
            User user = new User(nameTextField.getCharacters().toString());
            users.add(user);

            if (checkBox1.isSelected()) {
                user.setC1(user.getC1() + diseases.get(0).getTemp1());
                user.setC2(user.getC2() + diseases.get(1).getTemp1());
                user.setC3(user.getC3() + diseases.get(2).getTemp1());
                user.setC4(user.getC4() + diseases.get(3).getTemp1());
                user.setC5(user.getC5() + diseases.get(4).getTemp1());
                user.setC6(user.getC6() + diseases.get(5).getTemp1());
                user.setC7(user.getC7() + diseases.get(6).getTemp1());
                user.setC8(user.getC8() + diseases.get(7).getTemp1());

            }
            if (checkBox2.isSelected()) {
                user.setC1(user.getC1() + diseases.get(0).getCold2());
                user.setC2(user.getC2() + diseases.get(1).getCold2());
                user.setC3(user.getC3() + diseases.get(2).getCold2());
                user.setC4(user.getC4() + diseases.get(3).getCold2());
                user.setC5(user.getC5() + diseases.get(4).getCold2());
                user.setC6(user.getC6() + diseases.get(5).getCold2());
                user.setC7(user.getC7() + diseases.get(6).getCold2());
                user.setC8(user.getC8() + diseases.get(7).getCold2());
            }
            if (checkBox3.isSelected()) {
                user.setC1(user.getC1() + diseases.get(0).getCough3());
                user.setC2(user.getC2() + diseases.get(1).getCough3());
                user.setC3(user.getC3() + diseases.get(2).getCough3());
                user.setC4(user.getC4() + diseases.get(3).getCough3());
                user.setC5(user.getC5() + diseases.get(4).getCough3());
                user.setC6(user.getC6() + diseases.get(5).getCough3());
                user.setC7(user.getC7() + diseases.get(6).getCough3());
                user.setC8(user.getC8() + diseases.get(7).getCough3());
            }
            if (checkBox4.isSelected()) {
                user.setC1(user.getC1() + diseases.get(0).getSore4());
                user.setC2(user.getC2() + diseases.get(1).getSore4());
                user.setC3(user.getC3() + diseases.get(2).getSore4());
                user.setC4(user.getC4() + diseases.get(3).getSore4());
                user.setC5(user.getC5() + diseases.get(4).getSore4());
                user.setC6(user.getC6() + diseases.get(5).getSore4());
                user.setC7(user.getC7() + diseases.get(6).getSore4());
                user.setC8(user.getC8() + diseases.get(7).getSore4());
            }


            if (checkBox5.isSelected()) {
                user.setC1(user.getC1() + diseases.get(0).getBig5());
                user.setC2(user.getC2() + diseases.get(1).getBig5());
                user.setC3(user.getC3() + diseases.get(2).getBig5());
                user.setC4(user.getC4() + diseases.get(3).getBig5());
                user.setC5(user.getC5() + diseases.get(4).getBig5());
                user.setC6(user.getC6() + diseases.get(5).getBig5());
                user.setC7(user.getC7() + diseases.get(6).getBig5());
                user.setC8(user.getC8() + diseases.get(7).getBig5());
            }


            if (checkBox6.isSelected()) {
                user.setC1(user.getC1() + diseases.get(0).getRest6());
                user.setC2(user.getC2() + diseases.get(1).getRest6());
                user.setC3(user.getC3() + diseases.get(2).getRest6());
                user.setC4(user.getC4() + diseases.get(3).getRest6());
                user.setC5(user.getC5() + diseases.get(4).getRest6());
                user.setC6(user.getC6() + diseases.get(5).getRest6());
                user.setC7(user.getC7() + diseases.get(6).getRest6());
                user.setC8(user.getC8() + diseases.get(7).getRest6());
            }


            if (checkBox7.isSelected()) {
                user.setC1(user.getC1() + diseases.get(0).getRash7());
                user.setC2(user.getC2() + diseases.get(1).getRash7());
                user.setC3(user.getC3() + diseases.get(2).getRash7());
                user.setC4(user.getC4() + diseases.get(3).getRash7());
                user.setC5(user.getC5() + diseases.get(4).getRash7());
                user.setC6(user.getC6() + diseases.get(5).getRash7());
                user.setC7(user.getC7() + diseases.get(6).getRash7());
                user.setC8(user.getC8() + diseases.get(7).getRash7());


            }


            if (checkBox8.isSelected()) {
                user.setC1(user.getC1() + diseases.get(0).getVomiting8());
                user.setC2(user.getC2() + diseases.get(1).getVomiting8());
                user.setC3(user.getC3() + diseases.get(2).getVomiting8());
                user.setC4(user.getC4() + diseases.get(3).getVomiting8());
                user.setC5(user.getC5() + diseases.get(4).getVomiting8());
                user.setC6(user.getC6() + diseases.get(5).getVomiting8());
                user.setC7(user.getC7() + diseases.get(6).getVomiting8());
                user.setC8(user.getC8() + diseases.get(7).getVomiting8());


            }


            if (checkBox9.isSelected()) {
                user.setC2(user.getC2() + diseases.get(1).getSwelling9());
                user.setC3(user.getC3() + diseases.get(2).getSwelling9());
                user.setC4(user.getC4() + diseases.get(3).getSwelling9());
                user.setC5(user.getC5() + diseases.get(4).getSwelling9());
                user.setC6(user.getC6() + diseases.get(5).getSwelling9());
                user.setC7(user.getC7() + diseases.get(6).getSwelling9());
                user.setC8(user.getC8() + diseases.get(7).getSwelling9());


            }


            if (checkBox10.isSelected()) {
                user.setC1(user.getC1() + diseases.get(0).getPains10());
                user.setC2(user.getC2() + diseases.get(1).getPains10());
                user.setC3(user.getC3() + diseases.get(2).getPains10());
                user.setC4(user.getC4() + diseases.get(3).getPains10());
                user.setC5(user.getC5() + diseases.get(4).getPains10());
                user.setC6(user.getC6() + diseases.get(5).getPains10());
                user.setC7(user.getC7() + diseases.get(6).getPains10());
                user.setC8(user.getC8() + diseases.get(7).getPains10());
            }


            if (checkBox11.isSelected()) {


                user.setC1(user.getC1() + diseases.get(0).getDisorders11());
                user.setC2(user.getC2() + diseases.get(1).getDisorders11());
                user.setC3(user.getC3() + diseases.get(2).getDisorders11());
                user.setC4(user.getC4() + diseases.get(3).getDisorders11());
                user.setC5(user.getC5() + diseases.get(4).getDisorders11());
                user.setC6(user.getC6() + diseases.get(5).getDisorders11());
                user.setC7(user.getC7() + diseases.get(6).getDisorders11());
                user.setC8(user.getC8() + diseases.get(7).getDisorders11());


            }


            if (checkBox12.isSelected()) {


                user.setC1(user.getC1() + diseases.get(0).getYellowing12());
                user.setC2(user.getC2() + diseases.get(1).getYellowing12());
                user.setC3(user.getC3() + diseases.get(2).getYellowing12());
                user.setC4(user.getC4() + diseases.get(3).getYellowing12());
                user.setC5(user.getC5() + diseases.get(4).getYellowing12());
                user.setC6(user.getC6() + diseases.get(5).getYellowing12());
                user.setC7(user.getC7() + diseases.get(6).getYellowing12());
                user.setC8(user.getC8() + diseases.get(7).getYellowing12());
            }


            if (checkBox13.isSelected()) {


                user.setC1(user.getC1() + diseases.get(0).getHeadache13());
                user.setC2(user.getC2() + diseases.get(1).getHeadache13());
                user.setC3(user.getC3() + diseases.get(2).getHeadache13());
                user.setC4(user.getC4() + diseases.get(3).getHeadache13());
                user.setC5(user.getC5() + diseases.get(4).getHeadache13());
                user.setC6(user.getC6() + diseases.get(5).getHeadache13());
                user.setC7(user.getC7() + diseases.get(6).getHeadache13());
                user.setC8(user.getC8() + diseases.get(7).getHeadache13());
            }


            if (checkBox14.isSelected()) {


                user.setC1(user.getC1() + diseases.get(0).getChills14());
                user.setC2(user.getC2() + diseases.get(1).getChills14());
                user.setC3(user.getC3() + diseases.get(2).getChills14());
                user.setC4(user.getC4() + diseases.get(3).getChills14());
                user.setC5(user.getC5() + diseases.get(4).getChills14());
                user.setC6(user.getC6() + diseases.get(5).getChills14());
                user.setC7(user.getC7() + diseases.get(6).getChills14());
                user.setC8(user.getC8() + diseases.get(7).getChills14());


            }
            if (checkBox15.isSelected()) {


                user.setC1(user.getC1() + diseases.get(0).getPhotophobia15());
                user.setC2(user.getC2() + diseases.get(1).getPhotophobia15());
                user.setC3(user.getC3() + diseases.get(2).getPhotophobia15());
                user.setC4(user.getC4() + diseases.get(3).getPhotophobia15());
                user.setC5(user.getC5() + diseases.get(4).getPhotophobia15());
                user.setC6(user.getC6() + diseases.get(5).getPhotophobia15());
                user.setC7(user.getC7() + diseases.get(6).getPhotophobia15());
                user.setC8(user.getC8() + diseases.get(7).getPhotophobia15());


            }
            users.forEach(System.out::println);
            tableresults.setItems(users);

            // Create the bar chart
            chart.setTitle("Ймовірність захворювання для " + user.Name);


            // Create the series for each group
            XYChart.Series<String, Number> series1 = new XYChart.Series<>();
            series1.getData().add(new XYChart.Data<>("Кір", user.getC1()));
            series1.getData().add(new XYChart.Data<>("Грип", user.getC2()));
            series1.getData().add(new XYChart.Data<>("Запалення легень", user.getC3()));
            series1.getData().add(new XYChart.Data<>("Ангіна", user.getC4()));
            series1.getData().add(new XYChart.Data<>("Скарлатина", user.getC5()));
            series1.getData().add(new XYChart.Data<>("Свинка", user.getC6()));
            series1.getData().add(new XYChart.Data<>("Дизентерія", user.getC7()));
            series1.getData().add(new XYChart.Data<>("Гепатит", user.getC8()));


            // Add the series to the chart
            chart.getData().add(series1);
            checkBox1.setSelected(false);
            checkBox2.setSelected(false);
            checkBox3.setSelected(false);
            checkBox4.setSelected(false);
            checkBox5.setSelected(false);
            checkBox6.setSelected(false);
            checkBox7.setSelected(false);
            checkBox8.setSelected(false);
            checkBox9.setSelected(false);
            checkBox10.setSelected(false);
            checkBox11.setSelected(false);
            checkBox12.setSelected(false);
            checkBox13.setSelected(false);
            checkBox14.setSelected(false);
            nameTextField.setText("");
            checkBox15.setSelected(false);

        });


        Button openWindowButton = new Button("Табличне представлення\n моделі  знань\nдля задачі\nмедичної діагностики");
        openWindowButton.setOnAction(e -> {
            BorderPane root = new BorderPane(table, tableresults, null, null, null);
            Scene scene = new Scene(root, 600, 400);
            // Create and show the second window
            Stage secondStage = new Stage();
            secondStage.setScene(scene);
            secondStage.show();
        });

        // Create the first window with the button
        StackPane root = new StackPane(openWindowButton);
        gridPane.add(root, 1, 4);
        gridPane.add(button, 2, 4);
        gridPane.add(chart, 5, 5);
//        gridPane.add(tableresults, 5, 5);
        Scene scene = new Scene(gridPane, 300, 200);
        stage.setScene(scene);
        stage.setTitle("Сподарик");
        stage.show();
    }


    public BarChart<String, Number> CHARTS(User user) {
        CategoryAxis xAxis = new CategoryAxis();
        NumberAxis yAxis = new NumberAxis();


        // Create the bar chart
        BarChart<String, Number> chart = new BarChart<>(xAxis, yAxis);
        chart.setTitle("Ймовірність захворювання" );


        // Create the series for each group
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();

        series1.getData().add(new XYChart.Data<>("Кір", user.getC1()));
        series1.getData().add(new XYChart.Data<>("Грип", user.getC2()));
        series1.getData().add(new XYChart.Data<>("Запалення легень", user.getC3()));
        series1.getData().add(new XYChart.Data<>("Ангіна", user.getC4()));
        series1.getData().add(new XYChart.Data<>("Скарлатина", user.getC5()));
        series1.getData().add(new XYChart.Data<>("Свинка", user.getC6()));
        series1.getData().add(new XYChart.Data<>("Дизентерія", user.getC7()));
        series1.getData().add(new XYChart.Data<>("Гепатит", user.getC8()));

        // Add the series to the chart
        chart.getData().add(series1);
        return chart;


    }


}
