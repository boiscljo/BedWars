# Troubleshooting and FAQ

## Non-OP players can't use signs
Move the sign out of vanilla spawn protection (for example, if you have the spawn protection in server.properties set to 16, move 34 blocks away from spawn location) or change spawn protection to zero. Non-OP players can't do some things in spawn protection.

## Bed can't be destroyed
BedWars allows you to use any block as the target block, so you won't see any error when you set it to, for example, floor. So check it, and make you sure you're looking at the bed head when setting the team target block.

## Adding a sign
Place a sign and write `[BedWars]` or `[BWGame]` (case-sensitive) as the first line, and the name of your arena as the second line. Make sure that your sign is not in range of vanilla's spawn protection.

## Automatically coloring a shop item
Use the `applycolorbyteam` property, for example:
```yaml
- price: 1
  price-type: bronze
  properties:
    - name: "applycolorbyteam"
  stack:
    ==: org.bukkit.inventory.ItemStack
    v: 1519
    type: WHITE_WOOL
    amount: 2
```

## Upgrades
Check the BedWars wiki [here](https://github.com/ScreamingSandals/BedWars/wiki/Upgrades).

## Language file
Check the BedWars wiki [here](https://github.com/ScreamingSandals/BedWars/wiki/Languages) (make sure to get the right language file).

## PlaceholderAPI placeholders
Check the BedWars wiki [here](https://github.com/ScreamingSandals/BedWars/wiki/PlaceholderAPI-placeholders).

## Changing the message prefix
Prefix is changeable globally in the language file or per arena with this command: `/bw admin <arena> customprefix &6My Awesome Prefix `.

## Editing resources
See the [Configuration](config.md) article.

## Broken shop
Make sure your shop is YAML valid with [yamlchecker](https://yamlchecker.com/), has proper [materials](https://hub.spigotmc.org/javadocs/spigot/org/bukkit/Material.html) and [format](https://github.com/ScreamingSandals/SimpleInventories/wiki).

## Compass teleports the player
Well, you probably have WorldEdit or FastAsyncWorldEdit. The compass is used to teleport through walls. However it works only for people with permission or with OP. You can disable this tool or bound it to another item in WorldEdit configuration. You can also change the team selection item to another one in BedWars configuration.

## Permissions
* bw.admin
* bw.vip.startitem
* bw.vip.forcejoin
* bw.otherstats
* bw.admin.alljoin
* bw.disable.joinall
* bw.cmd.join
* bw.cmd.leave
* bw.cmd.stats
* bw.cmd.rejoin
* bw.cmd.autojoin
* bw.cmd.list
* bw.cmd.leaderboard