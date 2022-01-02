package org.screamingsandals.bedwars.api.special;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.bedwars.api.Team;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.api.player.BWPlayer;
import org.screamingsandals.lib.utils.Wrapper;

/**
 * @author Bedwars Team
 */
@ApiStatus.NonExtendable
public interface WarpPowder extends SpecialItem {
    /**
     * @param unregisterSpecial
     * @param showMessage
     */
    void cancelTeleport(boolean unregisterSpecial, boolean showMessage);

    /**
     * @return
     */
    Wrapper getItem();

    /**
     *
     */
    void runTask();
}
