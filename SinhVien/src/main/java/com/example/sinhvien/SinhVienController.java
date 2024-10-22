package com.example.sinhvien;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class SinhVienController {

    @FXML
    private TextField txtMaSV;

    @FXML
    private TextField txtHoTen;

    @FXML
    private TextField txtNgaySinh;

    @FXML
    private TextArea txtThongTin;

    @FXML
    public void themSinhVien(ActionEvent actionEvent) {
        String maSV = txtMaSV.getText();
        String hoTen = txtHoTen.getText();
        String ngaySinh = txtNgaySinh.getText();
        txtThongTin.appendText("Ma SV: " + maSV + "\nHo Ten: " + hoTen + "\nNgay Sinh: " + ngaySinh + "\n\n");
    }

    @FXML
    public void lamMoi(ActionEvent actionEvent) {
        txtMaSV.clear();
        txtHoTen.clear();
        txtNgaySinh.clear();
        txtThongTin.clear();
    }

    @FXML
    public void luuFile(ActionEvent actionEvent) {
        String maSV = txtMaSV.getText();
        String hoTen = txtHoTen.getText();
        String ngaySinh = txtNgaySinh.getText();

        JSONObject sinhVien = new JSONObject();
        sinhVien.put("MaSV", maSV);
        sinhVien.put("HoTen", hoTen);
        sinhVien.put("NgaySinh", ngaySinh);

        try (FileWriter file = new FileWriter("sinhvien.json")) {
            file.write(sinhVien.toJSONString());
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}