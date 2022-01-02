package org.screamingsandals.bedwars.api.statistics;

import org.jetbrains.annotations.ApiStatus;
import org.screamingsandals.lib.utils.Wrapper;

import java.util.List;
import java.util.UUID;

@ApiStatus.NonExtendable
public interface PlayerStatisticsManager {

    List<LeaderboardEntry> getLeaderboard(int count);

    PlayerStatistic loadStatistic(UUID uuid);
}
