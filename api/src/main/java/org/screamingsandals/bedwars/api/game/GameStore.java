package org.screamingsandals.bedwars.api.game;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.lib.utils.Wrapper;

/**
 * @author Bedwars Team
 */
@ApiStatus.NonExtendable
public interface GameStore {
    /**
     * @return shop entity
     */
    Wrapper getEntity();

    /**
     * @return entity type used for the shop
     */
    Wrapper getEntityType();

    /**
     * @return location of this store
     */
    Wrapper getStoreLocation();

    /**
     * @return shop file
     */
    String getShopFile();

    /**
     * @return shopkeeper's name
     */
    String getShopCustomName();

    /**
     * @return true if shop file should be merged with custom shop file
     */
    boolean isUseParent();

    /**
     * @return true if shopkeeper has name
     */
    boolean isEnabledCustomName();

    /**
     * @return true if shopkeeper is baby
     */
    boolean isBaby();

    /**
     * @return if type is PLAYER, than returns skin, otherwise null
     */
    String getSkinName();
}
