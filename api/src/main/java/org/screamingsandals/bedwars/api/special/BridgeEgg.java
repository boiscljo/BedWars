package org.screamingsandals.bedwars.api.special;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.bedwars.api.Team;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.api.player.BWPlayer;
import org.screamingsandals.lib.utils.Wrapper;

@ApiStatus.NonExtendable
public interface BridgeEgg extends SpecialItem {
    /**
     * <p>Gets the bridge egg projectile.</p>
     *
     * @return the bridge egg projectile
     */
    Wrapper getProjectile();

    /**
     * <p>Gets the bridge material.</p>
     *
     * @return the bridge material
     */
    Wrapper getMaterial();

    /**
     * <p>Gets the bridge's max distance.</p>
     *
     * @return the bridge max distance
     */
    double getDistance();

    /**
     * <p>Runs the placing task.</p>
     */
    void runTask();
}
