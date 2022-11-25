package org.XChangeIt;

import org.XChangeIt.controller.Controller;
import org.XChangeIt.model.MainModel;
import org.XChangeIt.model.Transaction;
import org.XChangeIt.view.AppView;

import java.awt.*;

public class Run {
    public static void main(String[] args) {
        Controller controller = new Controller(new AppView(), new MainModel());
    }
}
