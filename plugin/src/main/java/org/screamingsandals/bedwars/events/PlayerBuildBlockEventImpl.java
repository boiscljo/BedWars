package org.screamingsandals.bedwars.events;

import lombok.Data;
import org.screamingsandals.bedwars.api.events.PlayerBuildBlockEvent;
import org.screamingsandals.bedwars.game.GameImpl;
import org.screamingsandals.bedwars.game.TeamImpl;
import org.screamingsandals.bedwars.player.BedWarsPlayer;
import org.screamingsandals.lib.event.SCancellableEvent;
import org.screamingsandals.lib.item.Item;
import org.screamingsandals.lib.block.BlockHolder;
import org.screamingsandals.lib.block.state.BlockStateHolder;

@Data
public class PlayerBuildBlockEventImpl implements PlayerBuildBlockEvent<GameImpl, BedWarsPlayer, TeamImpl, BlockHolder, BlockStateHolder, Item>, SCancellableEvent {
    private final GameImpl game;
    private final BedWarsPlayer player;
    private final TeamImpl team;
    private final BlockHolder block;
    private final BlockStateHolder replaced;
    private final Item itemInHand;
    private boolean cancelled;
}
