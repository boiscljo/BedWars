package org.screamingsandals.bedwars.api.special;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.bedwars.api.Team;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.api.player.BWPlayer;
import org.screamingsandals.lib.utils.Wrapper;

import java.util.List;

/**
 * @author Bedwars Team
 */
@ApiStatus.NonExtendable
public interface RescuePlatform extends SpecialItem {
    /**
     * @return
     */
    int getBreakingTime();

    /**
     * @return
     */
    boolean isBreakable();

    /**
     * @return
     */
    Wrapper getMaterial();

    /**
     * @return
     */
    Wrapper getItem();

    /**
     *
     */
    void runTask();

    /**
     * @return
     */
    List<? extends Wrapper> getPlatformBlocks();
}
