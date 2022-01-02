package org.screamingsandals.bedwars.api.boss;

import java.util.List;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.lib.utils.Wrapper;

/**
 * @author Bedwars Team
 *
 */
@ApiStatus.NonExtendable
public interface StatusBar {
	
	/**
	 * @param player
	 */
	void addPlayer(Object player);
	
	/**
	 * @param player
	 */
	void removePlayer(Object player);
	
	/**
	 * @param progress
	 */
	void setProgress(float progress);
	
	/**
	 * @return list of all viewers
	 */
	List<? extends Wrapper> getViewers();
	
	/**
	 * @return progress of status bar
	 */
	float getProgress();
	
	/**
	 * @return visibility of status bar
	 */
	boolean isVisible();
	
	/**
	 * @param visible
	 */
	void setVisible(boolean visible);
}
