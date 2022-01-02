package org.screamingsandals.bedwars.api.special;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.bedwars.api.Team;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.api.player.BWPlayer;

/**
 * @author Bedwars Team
 */
@ApiStatus.NonExtendable
public interface ArrowBlocker extends SpecialItem {
    /**
     * @return
     */
    int getProtectionTime();

    /**
     * @return
     */
    int getUsedTime();

    /**
     * @return
     */
    boolean isActivated();

    /**
     *
     */
    void runTask();
}
