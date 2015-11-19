package GUILogic;

import GUI.ContainerPanel;
import GUI.Submenu.DepartureTime;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiController {

    private ContainerPanel CP;

    public GuiController() {

        CP = new ContainerPanel();
        initializeListeners();

    }

    // shows welcome panel and sets Jframe to visible 
    public void go() {
        CP.show(ContainerPanel.Welcome);
        CP.setVisible(true);
    }

    //Creates a private innerclass, implementing actionlistener
    //Methods checking for button presses
    private class Menu implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Menu);
        }
    }

    private class WelcomeScreen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Welcome);
        }
    }

    private class Information implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Information);
        }
    }

    private class MapScreen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Map);
        }
    }

    private class OperaInformationScreen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.OperaInformation);
        }
    }

    private class LanguageScreen implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Language);
        }
    }
    
    private class DepartureTime implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.Departure);
        }
    }

    public void initializeListeners() {
        // add listeners to screens
        CP.getUM().addActionListenerWelcomeScreen(new WelcomeScreen());
        CP.getUM().addActionListenerInformationScreen(new Information());
        CP.getUM().addActionListenerMapScreen(new MapScreen());
        CP.getWS().addActionListenerMenu(new Menu());
        CP.getInfo().addActionListenerMenu(new Menu());
        CP.getMap().addActionListenerOperaInformation(new OperaInformationScreen());
        CP.getMap().addActionListenerMenu(new Menu());
        CP.getOI().addActionListenerMapScreen(new MapScreen());
        CP.getUM().addActionListenerChangeLanguage(new LanguageScreen());
        CP.getLan().addActionListenerMenu(new Menu());
        CP.getUM().addActionListenerDeparture(new DepartureTime());
        CP.getDT().addActionListenerMenu(new Menu());
    }
}
