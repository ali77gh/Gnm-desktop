package com.gnm.desktop.ui.layout;

import com.gnm.desktop.res.Color;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;

public class SettingsLayout extends VBox {

    public SettingsLayout() {

        Label test = new Label();
        test.setTextFill(Paint.valueOf(Color.white));
        test.setText("تنظیمات");
        test.setAlignment(Pos.BASELINE_CENTER);
        getChildren().add(test);
    }
}