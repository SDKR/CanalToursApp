
import GUILogic.GuiController;
import Logic.FileReader;


public class Main {


	public static void main(String[] args) {
                new FileReader().read();
                new FileReader().ReadFromFile();
		new GuiController().go();
	}

}
