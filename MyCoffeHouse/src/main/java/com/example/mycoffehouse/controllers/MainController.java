package com.example.mycoffehouse.controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.BorderPane;

public class MainController {
    @FXML private TabPane contentTabPane;

    public void showProductView() {
        addTab("Quản lý Sản phẩm", "/views/product.fxml");
    }

    public void showOrderView() {
        addTab("Quản lý Hóa đơn", "/views/order.fxml");
    }

    public void showEmployeeView() {
        addTab("Quản lý Nhân viên", "/views/employee.fxml");
    }

    public void showReportView() {
        addTab("Báo cáo Doanh thu", "/views/report.fxml");
    }

    private void addTab(String title, String resourcePath) {
        Tab tab = new Tab(title);
        tab.setClosable(true);
        tab.setContent(FXMLLoader.load(getClass().getResource(resourcePath)));
        contentTabPane.getTabs().add(tab);
    }

    public void logout() {
        // Xử lý đăng xuất
    }

    public void exit() {
        System.exit(0);
    }
}

