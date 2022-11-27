package org.XChangeIt;

import org.XChangeIt.controller.Controller;
import org.XChangeIt.model.AppModel;
import org.XChangeIt.view.AppView;

public class Run {
    /**
     * Function to run the entire program
     * @param args command line arguments passed into the function
     */
    public static void main(String[] args)
    {
        //Creates a new variable of type Controller whose creation begins the program
        Controller controller = new Controller(new AppView(), new AppModel());
    }
}