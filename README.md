Sodium/Rubidium Occlusion Culling Fix
=====

🎉 **The issue has been fixed officially in Sodium 0.5.0. You will no longer need this mod.**

[Download me on Modrinth](https://modrinth.com/mod/occlusion-culling-fix-sodium)

> [Sponsor](https://afdian.net/a/yezhiyi9670) if you like this project.

This is a mod which "fixes" MC-70850 for MC1.18+ by ~~disabling Occlusion Culling~~ properly fixing it.

It should have been already fixed since it is resolved by Mojang in 1.17. However, [Sodium](https://modrinth.com/mod/sodium)/[Rubidium]() brought it back so we need to fix it again.

⚠️ Keep in mind that the fix is somehow breaking and will impact FPS. If you encounter performance issues, try removing this fix mod before blaming Sodium.

Relations
-----

### Forge

**Requires** [Rubidium](https://modrinth.com/mod/rubidium): The issue does not exist without Rubidium. In that case, you won't need the mod.

### Fabric

**Requires** [Sodium](https://modrinth.com/mod/sodium): The issue does not exist without Sodium. In that case, you won't need the mod.

Effect
-----

![](logo-standard.png)

The chunk with letters "VISIBLE" in it was hidden in vanilla because of [MC-70850](https://bugs.mojang.com/browse/MC-70850). Mojang fixed that in 1.17, Sodium brought it back, and this mod fixed that again. You can get the test save for the bug on Mojira.

Side Effects
-----

Though being an almost-proper fix, this fix does not completely match the intention of the original code. This might result in minor performance loss. However, we did not find significant performance drops.

Related Information
-----

This fixes MC-70850 only. Another issue, [MC-63020](https://bugs.mojang.com/browse/MC-63020) causes a similar issue, and was fixed in 1.16.

If you wonder how the issue could occur and how we fixed it, read this [analysis](./_analysis/analysis.md).

Incompatibilities
-----

Not found so far.

Plans
-----

New features will not be added to the mod in order to keep the name descriptive. Please use [Github Issue Tracker](https://github.com/yezhiyi9670/occlusion-culling-fix-sodium/issues) to report bugs.

This mod will not be backported.

- If you play 1.15/1.16 Forge and is having the issue, fix it with [this mod](https://www.curseforge.com/minecraft/mc-mods/occlusion-culling-temp-fix).
- If you are the lucky one who is playing MC1.12.2, use [EigenCraft Unofficial Patches](https://github.com/mrgrim/MUP) instead.
