package com.jaguar.enderdragonfix;

import com.comphenix.protocol.Packets;
import com.comphenix.protocol.ProtocolLibrary;
import com.comphenix.protocol.events.ConnectionSide;
import com.comphenix.protocol.events.PacketAdapter;
import com.comphenix.protocol.events.PacketEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class EnderDragonSound extends JavaPlugin {
    @SuppressWarnings( "deprecation" )
    @Override
    public void onEnable() {
        getLogger().info("Plugin fix for the EnderDragon noise. Fixed by Jaggz");
        ProtocolLibrary.getProtocolManager().addPacketListener(new PacketAdapter(this, ConnectionSide.SERVER_SIDE, Packets.Server.WORLD_EVENT) {
            @Override
            public void onPacketSending(PacketEvent event) {
                String worldName = event.getPlayer().getWorld().getName();
                int effectId = event.getPacket().getIntegers().read(0);

                if (effectId == 1018) {
                    if ("world_the_end".equals(worldName)) {
                        event.setCancelled(true);
                    }
                }
            }
        });
    }
}

