package org.XChangeIt;

import org.XChangeIt.controller.Controller;
import org.XChangeIt.model.AppModel;
import org.XChangeIt.view.AppView;

public class Run {
    public static void main(String[] args) {
        Controller controller = new Controller(new AppView(), new AppModel());
    }
}