package GUI;

import GUI.InfoMenu.OperaInformation;
import GUI.Submenu.Information;
import GUI.Submenu.DepartureTime;
import GUI.Submenu.ChangeLanguage;
import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContainerPanel extends JFrame {

    //General GUI
    public static final String Menu = "Menu";
    public static final String Welcome = "Welcome";
    public static final String Information = "Information";
    public static final String Map = "Map";
    public static final String OperaInformation = "OperaInformation";
    public static final String Language = "Language";
    public static final String Departure = "Departure";

    private static JPanel contentPane;
    CardLayout c;

    private WelcomeScreen WS;
    private Menu UM;
    private Information Info;
    private Map map;
    private OperaInformation OI;
    private ChangeLanguage Lan;
    private DepartureTime DT;

    public ContainerPanel() {
        setResizable(false);
        setTitle("Jeg hader NETBEANS");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(500, 100, 450, 700);

        contentPane = new JPanel();

        setContentPane(contentPane);
        contentPane.setLayout(new CardLayout(0, 0));

        c = (CardLayout) getContentPane().getLayout();

        // Main menu
        WS = new WelcomeScreen();
        contentPane.add(WS, Welcome);
        
        UM = new Menu();
        contentPane.add(UM, Menu);
        
        Info = new Information();
        contentPane.add(Info, Information);
        
        map = new Map();
        contentPane.add(map, Map);
        
        Lan = new ChangeLanguage();
        contentPane.add(Lan, Language);
        
        DT = new DepartureTime();
        contentPane.add(DT, Departure);
        // Information menu
        
        OI = new OperaInformation();
        contentPane.add(OI, OperaInformation);
        

    }

    //Getters
    public Menu getUM() {
        return UM;
    }

    public WelcomeScreen getWS() {
        return WS;
    }

    public Information getInfo() {
        return Info;
    }

    public Map getMap() {
        return map;
    }

    public OperaInformation getOI() {
        return OI;
    }

    public ChangeLanguage getLan() {
        return Lan;
    }

    public DepartureTime getDT() {
        return DT;
    }
    
    public void show(String card) {
        c.show(getContentPane(), card);
    }

    
    
}
