package org.screamingsandals.bedwars.api.game;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.lib.utils.Wrapper;

/**
 * @author Bedwars Team
 */
@ApiStatus.NonExtendable
public interface ItemSpawnerType {
    /**
     * @return
     */
    String getConfigKey();

    /**
     * @return
     */
    int getInterval();

    /**
     * @return
     */
    double getSpread();

    /**
     * @return
     */
    String getName();

    /**
     * @return
     */
    Wrapper getItemType();

    /**
     * @return
     */
    Wrapper getTranslatableKey();

    /**
     * @return
     */
    Wrapper getItemName();

    /**
     * @return
     */
    Wrapper getItemBoldName();

    /**
     * @return
     */
    int getDamage();

    /**
     * @return
     */
    Wrapper getItem();

    /**
     * @param amount
     * @return
     */
    Wrapper getItem(int amount);
}
