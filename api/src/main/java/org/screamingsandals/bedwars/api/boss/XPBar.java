package org.screamingsandals.bedwars.api.boss;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.lib.utils.Wrapper;

/**
 * @author Bedwars Team
 */
@ApiStatus.NonExtendable
public interface XPBar extends StatusBar {
    /**
     * @param seconds
     */
    void setSeconds(int seconds);

    /**
     * @return seconds
     */
    int getSeconds();

}
