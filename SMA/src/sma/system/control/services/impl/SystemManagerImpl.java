package sma.system.control.services.impl;

import sma.system.control.services.interfaces.IUserOperations;
import components.control.SystemManager;
import components.control.Visualisation;

/**
 * Implémentation du SystemManager
 */
public class SystemManagerImpl extends SystemManager {

    @Override
    protected IUserOperations make_userService() {
        return new IUserOperations() {
            
            @Override
            public void saveSystemState() {
//                EnvironmentState test = new EnvironmentState(15, 20);
//                try {
//                    test.putBox(ColorBox.RED, new Position(5,5));
//                } catch (NonEmptyGridBoxException | InvalidPositionException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
//                requires().persistenceService().saveObject(test, "test");
//                
            }

            @Override
            public void loadSystemState() {
//                EnvironmentState object;
//                try {
//                    object = (EnvironmentState) requires().persistenceService().loadObject("test");
//                    System.out.println(object.getGridHeight());
//                } catch (PersistedObjectNotFoundException e) {
//                    // TODO Auto-generated catch block
//                    e.printStackTrace();
//                }
            }

            @Override
            public void startSystem() {
                requires().environmentManagementService().startEnvironmentExecution();
                // TODO Start agents
            }

            @Override
            public void stopSystem() {
                // TODO Auto-generated method stub
                requires().environmentManagementService().stopEnvironmentExecution();
            }
        };
    }

	@Override
	protected Visualisation make_display() {
		// TODO Auto-generated method stub
		return new VisualisationImpl();
	}

}