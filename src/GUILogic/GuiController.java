package GUILogic;

import GUI.ContainerPanel;
import GUI.InfoMenu.DepartureTime;
import GUI.InfoMenu.KastelletInformation;
import GUI.InfoMenu.*;
import Logic.FileReader;
import com.sun.webkit.ContextMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class GuiController {

    private FileReader fileReader;
    private ContainerPanel CP;

    //public ArrayList<String> array = new ArrayList<String>();

    public GuiController() {

        CP = new ContainerPanel();
        initializeListeners();

    }

    // shows welcome panel and sets Jframe to visible 
    public void go() {
        CP.show(ContainerPanel.Welcome);
        CP.setVisible(true);
        TextToGUI();
    }

    public void TextToGUI() {
        fileReader = new FileReader();
        ArrayList<String> array = fileReader.getArray();
        System.out.println(array.get(0));
        CP.getTLMI().TheLittleMermaidTextPane.setText(array.get(0));
        CP.getOI().setTextPane(array.get(1));
        /*CP.getTLMI().setTextPane(array.get(0));
         CP.getTLMI().setjLabel1("jdj");
         CP.getTLMI().jLabel1.setText("hhhh");
         System.out.println(array.get(0));*/
    }

    private class ChangeLanguageDanish implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            FileReader.setFilename("Danish.txt");
            new FileReader().read();
            new FileReader().ReadFromFile();
            TextToGUI();
            CP.show(ContainerPanel.Menu);
        }
    }
    private class ChangeLanguageEnglish implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            FileReader.setFilename("English.txt");
            new FileReader().read();
            new FileReader().ReadFromFile();
            TextToGUI();
            CP.show(ContainerPanel.Menu);
        }
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

    private class TicketInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TicketInformation);
        }
    }

    private class RouteInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.RouteInformation);
        }
    }

    private class AboutUs implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.AboutUs);
        }
    }

    private class InformationOnSights implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.InformationOnSights);
        }
    }

    private class TheLittleMermaidInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TheLittleMermaidInformation);
        }
    }

    private class TrekronerFortressInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TrekronerFortressInformation);
        }
    }

    private class ChristiansborgPalaceInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.ChristiansborgPalaceInformation);
        }
    }

    private class KastelletInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.KastelletInformation);
        }
    }

    private class TheBlackDiamondInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TheBlackDiamondInformation);
        }
    }

    private class OurSaviorusChurchInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.OurSavioursChurchInformation);
        }
    }

    private class TheOldStockExchangeInformation implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            CP.show(ContainerPanel.TheOldStockExchangeInformation);
        }
    }

    public void initializeListeners() {
        // add listeners to screens
        CP.getUM().addActionListenerWelcomeScreen(new WelcomeScreen());
        CP.getUM().addActionListenerInformationScreen(new Information());
        CP.getUM().addActionListenerChangeLanguage(new LanguageScreen());
        CP.getUM().addActionListenerInformationOnSights(new InformationOnSights());

        CP.getWS().addActionListenerMenu(new Menu());

        CP.getInfo().addActionListenerMenu(new Menu());
        CP.getInfo().addActionListenerDepartureTime(new DepartureTime());
        CP.getInfo().addActionListenerMenu(new TicketInformation());
        CP.getInfo().addActionListenerTicketInformation(new TicketInformation());
        CP.getInfo().addActionListenerRoutInformation(new RouteInformation());
        CP.getInfo().addActionListenerAboutUs(new AboutUs());

        CP.getMap().addActionListenerOperaInformation(new OperaInformationScreen());
        CP.getMap().addActionListenerBack(new InformationOnSights());

        CP.getOI().addActionListenerMenu(new InformationOnSights());
        CP.getOI().addActionListenerShowOnMap(new MapScreen());

        CP.getLan().addActionListenerChangeLanguage(new ChangeLanguageDanish());
        CP.getLan().addActionListenerChangeLanguageEng(new ChangeLanguageEnglish());
        CP.getLan().addActionListenerBackBtn(new Menu());

        CP.getDT().addActionListenerInformation(new Information());

        CP.getTI().addActionListenerInformation(new Information());

        CP.getRI().addActionListenerInformation(new Information());

        CP.getAU().addActionListenerInformation(new Information());

        CP.getIOS().addActionListenerMenu(new Menu());
        CP.getIOS().addActionListenerTheOpera(new OperaInformationScreen());
        CP.getIOS().addActionListenerTheLittleMermaid(new TheLittleMermaidInformation());
        CP.getIOS().addActionListenerTrekronerFortress(new TrekronerFortressInformation());
        CP.getIOS().addActionListenerChristiansborgPalace(new ChristiansborgPalaceInformation());
        CP.getIOS().addActionListenerKastellet(new KastelletInformation());
        CP.getIOS().addActionListenerOurSaviorsChurch(new OurSaviorusChurchInformation());
        CP.getIOS().addActionListenerTheBlackDiamond(new TheBlackDiamondInformation());
        CP.getIOS().addActionListenerTheOldStockExchange(new TheOldStockExchangeInformation());

        CP.getTLMI().addActionListenerMenu(new InformationOnSights());
        CP.getTLMI().addActionListenerShowOnMap(new MapScreen());

        CP.getTFI().addActionListenerMenu(new InformationOnSights());
        CP.getTFI().addActionListenerShowOnMap(new MapScreen());

        CP.getCPI().addActionListenerMenu(new InformationOnSights());
        CP.getCPI().addActionListenerShowOnMap(new MapScreen());

        CP.getTBDI().addActionListenerMenu(new InformationOnSights());
        CP.getTBDI().addActionListenerShowOnMap(new MapScreen());

        CP.getKI().addActionListenerMenu(new InformationOnSights());
        CP.getKI().addActionListenerShowOnMap(new MapScreen());

        CP.getOSCI().addActionListenerMenu(new InformationOnSights());
        CP.getOSCI().addActionListenerShowOnMap(new MapScreen());

    }
}
