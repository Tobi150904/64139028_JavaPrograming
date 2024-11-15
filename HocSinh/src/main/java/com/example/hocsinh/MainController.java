package com.example.hocsinh;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.sql.*;

public class MainController {

    @FXML
    private TextField mssvField;
    @FXML
    private TextField nameField;
    @FXML
    private TextField classField;
    @FXML
    private TableView<HocSinh> studentTable;
    @FXML
    private TableColumn<HocSinh, Integer> mssvColumn;
    @FXML
    private TableColumn<HocSinh, String> nameColumn;
    @FXML
    private TableColumn<HocSinh, String> classColumn;

    private ObservableList<HocSinh> studentList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        mssvColumn.setCellValueFactory(new PropertyValueFactory<>("mssv"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("ten"));
        classColumn.setCellValueFactory(new PropertyValueFactory<>("lop"));
        studentTable.setItems(studentList);
        loadStudents();
    }

    @FXML
    protected void onAddButtonClick() {
        int id = Integer.parseInt(mssvField.getText());
        String name = nameField.getText();
        String className = classField.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
            String sql = "INSERT INTO hocsinh (`Id`, `Name`, `Class`) VALUES (?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, name);
            statement.setString(3, className);
            statement.executeUpdate();
            loadStudents();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onDeleteButtonClick() {
        HocSinh selectedStudent = studentTable.getSelectionModel().getSelectedItem();
        if (selectedStudent == null) {
            System.out.println("No student selected");
            return;
        }
        int mssv = selectedStudent.getMssv();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
            String sql = "DELETE FROM hocsinh WHERE `Id` = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, mssv);
            statement.executeUpdate();
            loadStudents();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    protected void onUpdateButtonClick() {
        String mssvText = mssvField.getText();
        if (mssvText.isEmpty()) {
            System.out.println("MSSV là rỗng");
            return;
        }
        int mssv = Integer.parseInt(mssvText);
        String name = nameField.getText();
        String className = classField.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
            String sql = "UPDATE hocsinh SET `Name` = ?, `Class` = ? WHERE `Id` = ?";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setString(1, name);
            statement.setString(2, className);
            statement.setInt(3, mssv);
            statement.executeUpdate();
            loadStudents();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void loadStudents() {
        studentList.clear();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "");
            String sql = "SELECT * FROM hocsinh";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                studentList.add(new HocSinh(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}