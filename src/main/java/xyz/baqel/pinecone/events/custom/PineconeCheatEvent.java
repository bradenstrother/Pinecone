package xyz.baqel.pinecone.events.custom;

import lombok.Getter;
import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import xyz.baqel.pinecone.detections.Detection;

import javax.annotation.Nullable;

@Getter
public class PineconeCheatEvent extends Event implements Cancellable {

    private static HandlerList handlers = new HandlerList();
    private Player player;
    private String info;
    private float violations;
    private boolean cancelled;
    private Detection detection;

    public PineconeCheatEvent(Player player, Detection detection, @Nullable String info, float violations) {
        this.player = player;
        this.info = info;
        this.violations = violations;
        this.detection = detection;

        cancelled = false;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getPlayer() {
        return player;
    }

    public Detection getDetection() {
        return detection;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }
}