package com.example.calenderproject;

import java.time.Year;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class EthiopianCalenderController {
    @FXML
    private Label yearcounter, err;
    @FXML
    private ImageView monthimg;
    @FXML
    private ImageView month;
    Image m1 = new Image(getClass().getResource("/img/monthss/m1.png").toExternalForm());
    Image m2 = new Image(getClass().getResource("/img/monthss/m2.png").toExternalForm());
    Image m3 = new Image(getClass().getResource("/img/monthss/m3.png").toExternalForm());
    Image m4 = new Image(getClass().getResource("/img/monthss/m4.png").toExternalForm());
    Image m5 = new Image(getClass().getResource("/img/monthss/m5.png").toExternalForm());
    Image m6 = new Image(getClass().getResource("/img/monthss/m6.png").toExternalForm());
    Image m7 = new Image(getClass().getResource("/img/monthss/m7.png").toExternalForm());
    Image m8 = new Image(getClass().getResource("/img/monthss/m8.png").toExternalForm());
    Image m9 = new Image(getClass().getResource("/img/monthss/m9.png").toExternalForm());
    Image m10 = new Image(getClass().getResource("/img/monthss/m10.png").toExternalForm());
    Image m11 = new Image(getClass().getResource("/img/monthss/m11.png").toExternalForm());
    Image m12 = new Image(getClass().getResource("/img/monthss/m12.png").toExternalForm());
    Image m13 = new Image(getClass().getResource("/img/monthss/m13.png").toExternalForm());
    Image[] montharray={m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13};

    Image m1img = new Image(getClass().getResource("/img/m1img.png").toExternalForm());
    Image m2img = new Image(getClass().getResource("/img/m2img.png").toExternalForm());
    Image m3img = new Image(getClass().getResource("/img/m3img.png").toExternalForm());
    Image m4img = new Image(getClass().getResource("/img/m4img.png").toExternalForm());
    Image m5img = new Image(getClass().getResource("/img/m5img.png").toExternalForm());
    Image m6img = new Image(getClass().getResource("/img/m6img.png").toExternalForm());
    Image m7img = new Image(getClass().getResource("/img/m7img.png").toExternalForm());
    Image m8img = new Image(getClass().getResource("/img/m8img.png").toExternalForm());
    Image m9img = new Image(getClass().getResource("/img/m9img.png").toExternalForm());
    Image m10img = new Image(getClass().getResource("/img/m10img.png").toExternalForm());
    Image m11img = new Image(getClass().getResource("/img/m11img.png").toExternalForm());
    Image m12img = new Image(getClass().getResource("/img/m12img.png").toExternalForm());
    Image m13img = new Image(getClass().getResource("/img/m13img.png").toExternalForm());
    Image[] montharrayimg={m1img,m2img,m3img,m4img,m5img,m6img,m7img,m8img,m9img,m10img,m11img,m12img,m13img};
    int counter = 0;
    int year = 2016;
    @FXML
    TextField yearsetter, dd, mm, yyyy;
    @FXML
    AnchorPane popup;
    @FXML
    protected void done(){
        popup.setVisible(false);
    }
    @FXML
    protected void changemonthright(){       
        if (counter > 11) {
            counter = 0;
            year++;
            yearcounter.setText(year + "");
            month.setImage(montharray[counter]);
            monthimg.setImage(montharrayimg[counter]);
        }
        else {
            counter++;
            month.setImage(montharray[counter]);
            monthimg.setImage(montharrayimg[counter]);
        }
        
    }
    @FXML
    protected void gotoyear(){
        Scanner temp = new Scanner(yearcounter.getText());
        int x = temp.nextInt();
        temp.close();
        yearcounter.setText(x + "");
        yearsetter.setText("");
        popup.setVisible(true);
    }
    @FXML
    protected void setreminder(){
        dd.setText("");
        mm.setText("");
        yyyy.setText("");
        popup.setVisible(true);
    }
    @FXML
    protected void changemonthleft(){
        if (counter == 0) {
            counter = 12;
            year--;
            yearcounter.setText(year + "");
            month.setImage(montharray[counter]);
            monthimg.setImage(montharrayimg[counter]);
        }
        else {
            counter--;
            month.setImage(montharray[counter]);
            monthimg.setImage(montharrayimg[counter]);
        }
    
    }

}