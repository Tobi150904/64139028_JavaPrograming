package com.example.api;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class ApiController {
    @FXML
    private TextField txtUrl;
    @FXML
    private TextArea txtResponse;
    @FXML
    private void sendRequest() {
        String apiUrl = txtUrl.getText();
        try {
            String response = sendRequest(apiUrl);
            txtResponse.setText(response);
        }catch (Exception e) {
            txtResponse.setText("Error: " + e.getMessage());
        }
    }
    private String sendRequest(String apiUrl) throws Exception {
        URL url = new URL(apiUrl);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder content = new StringBuilder();
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();
        return content.toString();
    }
}