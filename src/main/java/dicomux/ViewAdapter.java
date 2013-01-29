package dicomux;

import java.util.Locale;

/**
 * This is an adapter for IView. This is used during initialization of Dicomux
 * @author heidi
 *
 */
public class ViewAdapter implements IView {


	public int getActiveWorkspaceId() {
		// TODO Auto-generated method stub
		return 0;
	}


	public Locale getLanguage() {
		// TODO Auto-generated method stub
		return new Locale("en");
	}


	public void notifyView() {
		// TODO Auto-generated method stub

	}


	public void registerController(IController controller) {
		// TODO Auto-generated method stub

	}


	public void registerModel(IModel model) {
		// TODO Auto-generated method stub

	}


	public void setLanguage(Locale locale) {
		// TODO Auto-generated method stub

	}

}
