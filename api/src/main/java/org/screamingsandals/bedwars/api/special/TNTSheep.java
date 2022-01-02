package org.screamingsandals.bedwars.api.special;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.bedwars.api.Team;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.api.player.BWPlayer;
import org.screamingsandals.lib.utils.Wrapper;

/**
 * @author Bedwars Team
 *
 */
@ApiStatus.NonExtendable
public interface TNTSheep extends SpecialItem {
	/**
	 * @return
	 */
	Wrapper getEntity();

	/**
	 * @return
	 */
	Wrapper getInitialLocation();
	
	/**
	 * @return
	 */
	Wrapper getTnt();
	
	/**
	 * @return
	 */
	double getSpeed();
	
	/**
	 * @return
	 */
	double getFollowRange();
}
