package dicomux;

/**
 * This is an adapter for IModel. This is used during initialization of Dicomux
 * @author heidi
 *
 */
public class ModelAdapter implements IModel {


	public void addWorkspace(TabObject tab) {
		// TODO Auto-generated method stub

	}


	public TabObject getWorkspace(int n) {
		return new TabObject();
	}


	public int getWorkspaceCount() {
		return 1;
	}


	public void initialize() {
		// TODO Auto-generated method stub

	}


	public void removeWorkspace(int wsId) {
		// TODO Auto-generated method stub

	}


	public void setActiveWorkspace(int wsId) {
		// TODO Auto-generated method stub

	}


	public void setWorkspace(int wsId, TabObject tab) {
		// TODO Auto-generated method stub

	}

}
