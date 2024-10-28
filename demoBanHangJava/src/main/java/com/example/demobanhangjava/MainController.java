package com.example.demobanhangjava;

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
    private TextField idField;
    @FXML
    private TextField nameField;
    @FXML
    private TableView<Product> productTable;
    @FXML
    private TableColumn<Product, Integer> idColumn;
    @FXML
    private TableColumn<Product, String> nameColumn;
    @FXML
    private TableColumn<Product, Float> priceColumn;
    @FXML
    private TableColumn<Product, String> descriptionColumn;

    private ObservableList<Product> productList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        productTable.setItems(productList);
        loadProducts();
    }

    @FXML
    protected void onRefreshButtonClick() {
        // làm mới trường nhập
        idField.clear();
        nameField.clear();
    }

    @FXML
    protected void onAddButtonClick() {
        // Implement the logic to add a new product to the database
    }

    @FXML
    protected void onSearchButtonClick() {
        // Implement the logic to search for products by id or name
    }

    private void loadProducts() {
        productList.clear();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/demobanhang";
            Connection con = DriverManager.getConnection(url, "root", "");
            String sqlSelect = "SELECT * FROM sanpham";
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sqlSelect);
            while (rs.next()) {
                productList.add(new Product(rs.getInt(1), rs.getString(2), rs.getFloat(3), rs.getString(4)));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}