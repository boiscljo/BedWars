package org.screamingsandals.bedwars.api.entities;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.bedwars.api.game.Game;
import java.util.List;
import java.util.Optional;

@ApiStatus.NonExtendable
public interface EntitiesManager {

    List<GameEntity> getEntities(Game game);

    default boolean isEntityInGame(Object entity) {
        return getGameOfEntity(entity).isPresent();
    }

    Optional<Game> getGameOfEntity(Object entity);

    GameEntity addEntityToGame(Object entity, Game game);

    void removeEntityFromGame(Object entity);

    void removeEntityFromGame(GameEntity entityObject);
}
