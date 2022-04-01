/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coe528project;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Citizen Kane
 */
public class CustomerStartScreenController implements Initializable {
    @FXML
    private TableView<Book> table;
    @FXML
    private TableColumn<Book, String> nameColumn;
    @FXML
    private TableColumn<User, Double> priceColumn;
    @FXML
    private TableColumn<User, Boolean> selectColumn;
    @FXML
    private Label customerGreeting;
    
    Main m = new Main();
    Book enter = new Book();
    User current = new User ();
    
    public void welcomeMessage (String username){
        current = current.findUser(username);
        customerGreeting.setText("Welcome " + current.getUsername() + ". You have " + current.getPoints() + " points. Your status is " + current.getStatus()+ ".");
    }
    
    public void clickLogout(ActionEvent e) throws IOException {
        m.changeScene("login.fxml");
    }
     public void clickBuy(ActionEvent e) throws IOException {
    }
    public void clickRedeem(ActionEvent e) throws IOException {
    }
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        nameColumn.setCellValueFactory(new PropertyValueFactory<> ("bookName"));
        priceColumn.setCellValueFactory(new PropertyValueFactory<> ("bookPrice"));
        selectColumn.setCellValueFactory(new PropertyValueFactory<> ("selected"));
        table.setItems(getBook());
    }    
    
    public ObservableList<Book> getBook(){
        ObservableList<Book> books = FXCollections.observableArrayList(enter.getList());
        return books;
    }
}
