package com.khorn.terraincontrol.bukkit;

public enum TCPerm
{
	CMD_TP("cmd.tp"),
    CMD_BIOME("cmd.biome"),
    CMD_CHECK("cmd.check"),
    CMD_HELP("cmd.help"),
    CMD_LIST("cmd.list"),
    CMD_MAP("cmd.map"),
    CMD_RELOAD("cmd.reload"),
    CMD_SPAWN("cmd.spawn");

    public final String node;

    TCPerm(final String permissionNode)
    {
        this.node = "otg." + permissionNode;
    }
}
