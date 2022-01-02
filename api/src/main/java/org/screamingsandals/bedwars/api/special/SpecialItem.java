package org.screamingsandals.bedwars.api.special;

import org.screamingsandals.bedwars.api.Team;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.api.player.BWPlayer;

/**
 * @author ScreamingSandals
 */
public interface SpecialItem {
    /**
     * @return game where this special item is used
     */
    Game getGame();

    /**
     * @return the player who activated this special item
     */
    BWPlayer getPlayer();

    /**
     * @return the team of player who activated this item
     */
    Team getTeam();
}
