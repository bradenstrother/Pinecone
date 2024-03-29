package xyz.baqel.pinecone.events.custom;

import org.bukkit.entity.Player;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import xyz.baqel.pinecone.detections.Check;
import xyz.baqel.pinecone.detections.CheckType;

public class PineconeCancelEvent extends Event implements Cancellable {
    private static HandlerList handlers = new HandlerList();
    private boolean cancelled;
    private Player player;
    private Check check;
    private CheckType type;

    public PineconeCancelEvent(Player player, Check check, CheckType type) {
        this.player = player;
        this.check = check;
        this.type = type;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public Player getPlayer() {
        return player;
    }

    public Check getCheck() {
        return check;
    }

    public CheckType getType() {
        return type;
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
