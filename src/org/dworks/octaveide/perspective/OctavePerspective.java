package org.dworks.octaveide.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

public class OctavePerspective implements IPerspectiveFactory {

	@Override
	public void createInitialLayout(IPageLayout layout) {
        layout.createFolder("left", IPageLayout.LEFT, 0.2f, IPageLayout.ID_EDITOR_AREA);;
        layout.createFolder("problem", IPageLayout.RIGHT, 0.8f, IPageLayout.ID_PROBLEM_VIEW);;
        layout.createFolder("top", IPageLayout.TOP, 0.5f, IPageLayout.ID_EDITOR_AREA);;
        IFolderLayout console = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.6f, IPageLayout.ID_EDITOR_AREA);
        console.addView(IConsoleConstants.ID_CONSOLE_VIEW);
        //layout.createFolder("right", IPageLayout.RIGHT, 0.6f, IPageLayout.ID_);;
    }

}
