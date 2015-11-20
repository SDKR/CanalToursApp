package GUI;

import GUI.InfoMenu.AboutUs;
import GUI.InfoMenu.OperaInformation;
import GUI.Submenu.Information;
import GUI.InfoMenu.DepartureTime;
import GUI.InfoMenu.RouteInformation;
import GUI.InfoMenu.TheLittleMermaidInformation;
import GUI.InfoMenu.TicketInformation;
import GUI.InfoMenu.TrekronerFortressInformation;
import GUI.Submenu.ChangeLanguage;
import GUI.Submenu.InformationOnSights;
import java.awt.CardLayout;
import GUI.*;
import GUI.InfoMenu.ChristiansborgPalaceInformation;
import GUI.InfoMenu.KastelletInformation;
import GUI.InfoMenu.OurSavioursChurchInformation;
import GUI.InfoMenu.TheBlackDiamondInformation;
import GUI.InfoMenu.TheOldStockExchangeInformation;

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
    public static final String TicketInformation = "TicketInformation";
    public static final String RouteInformation = "RouteInformation";
    public static final String AboutUs = "AboutUs";
    public static final String InformationOnSights = "InformationOnSights";
    public static final String TheLittleMermaidInformation = "TheLitteMermaidInformation";
    public static final String TrekronerFortressInformation = "TrekronerFortressInformation";
    public static final String TheBlackDiamondInformation = "TheBlackDiamondInformation";
    public static final String KastelletInformation = "KastelletInformation";
    public static final String OurSavioursChurchInformation = "OurSavioursChurchInformation";
    public static final String TheOldStockExchangeInformation = "TheOldStockExchangeInformation";
    public static final String ChristiansborgPalaceInformation = "ChristiansborgPalaceInformation";

    private static JPanel contentPane;
    CardLayout c;

    private WelcomeScreen WS;
    private Menu UM;
    private Information Info;
    private Map map;
    private OperaInformation OI;
    private ChangeLanguage Lan;
    private DepartureTime DT;
    private TicketInformation TI;
    private RouteInformation RI;
    private AboutUs AU;
    private InformationOnSights IOS;
    private TheLittleMermaidInformation TLMI;
    private TrekronerFortressInformation TFI;
    private TheBlackDiamondInformation TBDI;
    private KastelletInformation KI;
    private OurSavioursChurchInformation OSCI;
    private TheOldStockExchangeInformation TOSEI;
    private ChristiansborgPalaceInformation CPI;

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

        // Information menu
        OI = new OperaInformation();
        contentPane.add(OI, OperaInformation);

        TI = new TicketInformation();
        contentPane.add(TI, TicketInformation);

        DT = new DepartureTime();
        contentPane.add(DT, Departure);

        RI = new RouteInformation();
        contentPane.add(RI, RouteInformation);

        AU = new AboutUs();
        contentPane.add(AU, AboutUs);

        IOS = new InformationOnSights();
        contentPane.add(IOS, InformationOnSights);

        TLMI = new TheLittleMermaidInformation();
        contentPane.add(TLMI, TheLittleMermaidInformation);

        TFI = new TrekronerFortressInformation();
        contentPane.add(TFI, TrekronerFortressInformation);

        TBDI = new TheBlackDiamondInformation();
        contentPane.add(TBDI, TheBlackDiamondInformation);

        KI = new KastelletInformation();
        contentPane.add(KI, KastelletInformation);

        OSCI = new OurSavioursChurchInformation();
        contentPane.add(OSCI, OurSavioursChurchInformation);

        TOSEI = new TheOldStockExchangeInformation();
        contentPane.add(TOSEI, TheOldStockExchangeInformation);

        CPI = new ChristiansborgPalaceInformation();
        contentPane.add(CPI, ChristiansborgPalaceInformation);
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

    public TicketInformation getTI() {
        return TI;
    }

    public RouteInformation getRI() {
        return RI;
    }

    public AboutUs getAU() {
        return AU;
    }

    public InformationOnSights getIOS() {
        return IOS;
    }

    public TheLittleMermaidInformation getTLMI() {
        return TLMI;
    }

    public TrekronerFortressInformation getTFI() {
        return TFI;
    }

    public ChristiansborgPalaceInformation getCPI() {
        return CPI;
    }

    public TheBlackDiamondInformation getTBDI() {
        return TBDI;
    }

    public KastelletInformation getKI() {
        return KI;
    }

    public TheOldStockExchangeInformation getTOSEI() {
        return TOSEI;
    }

    public OurSavioursChurchInformation getOSCI() {
        return OSCI;
    }

    public void show(String card) {
        c.show(getContentPane(), card);
    }
}
