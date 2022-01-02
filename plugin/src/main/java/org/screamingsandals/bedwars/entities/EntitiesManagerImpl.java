package org.screamingsandals.bedwars.entities;

import org.screamingsandals.bedwars.api.entities.EntitiesManager;
import org.screamingsandals.bedwars.api.entities.GameEntity;
import org.screamingsandals.bedwars.api.game.Game;
import org.screamingsandals.bedwars.game.GameImpl;
import org.screamingsandals.lib.entity.EntityBasic;
import org.screamingsandals.lib.entity.EntityMapper;
import org.screamingsandals.lib.plugin.ServiceManager;
import org.screamingsandals.lib.utils.annotations.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EntitiesManagerImpl implements EntitiesManager {
    private final List<GameEntityImpl> entities = new ArrayList<>();

    public static EntitiesManagerImpl getInstance() {
        return ServiceManager.get(EntitiesManagerImpl.class);
    }

    @Override
    public List<GameEntity> getEntities(Game game) {
        return entities.stream().filter(gameEntity -> gameEntity.getGame() == game).collect(Collectors.toList());
    }

    @Override
    public Optional<Game> getGameOfEntity(Object entity) {
        return getGameOfEntity(EntityMapper.wrapEntity(entity).orElseThrow());
    }

    public Optional<Game> getGameOfEntity(EntityBasic entityBasic) {
        return entities.stream().filter(gameEntity -> gameEntity.getEntity().equals(entityBasic)).findFirst().map(GameEntityImpl::getGame);
    }

    @Override
    public GameEntity addEntityToGame(Object entity, Game game) {
        return addEntityToGame(EntityMapper.wrapEntity(entity).orElseThrow(), game);
    }

    public GameEntity addEntityToGame(EntityBasic entityBasic, GameImpl game) {
        var gameEntity = new GameEntityImpl(game, entityBasic);
        entities.add(gameEntity);
        return gameEntity;
    }

    @Override
    public void removeEntityFromGame(Object entity) {
        removeEntityFromGame(EntityMapper.wrapEntity(entity).orElseThrow());
    }

    public void removeEntityFromGame(EntityBasic entityBasic) {
        entities.stream()
                .filter(gameEntity -> gameEntity.getEntity().equals(entityBasic))
                .findFirst()
                .ifPresent(this::removeEntityFromGame);
    }

    @Override
    public void removeEntityFromGame(GameEntity entityObject) {
        entities.remove((GameEntityImpl) entityObject);
    }
}
