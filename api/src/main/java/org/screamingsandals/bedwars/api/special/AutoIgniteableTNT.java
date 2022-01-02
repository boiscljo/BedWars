package org.screamingsandals.bedwars.api.special;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.bedwars.api.Team;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.api.player.BWPlayer;

/**
 * @author Bedwars Team
 */
@ApiStatus.NonExtendable
public interface AutoIgniteableTNT extends SpecialItem {

    /**
     * @return explosion time in seconds
     */
    int getExplosionTime();

    /**
     * @return true - tnt will damage placer
     */
    boolean isAllowedDamagingPlacer();
    
    /**
     * spawn an entity tnt
     */
    void spawn(Object location);
    
}
