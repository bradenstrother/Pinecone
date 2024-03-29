package xyz.baqel.pinecone.utils.blockbox;

import com.ngxdev.tinyprotocol.api.ProtocolVersion;
import com.ngxdev.tinyprotocol.reflection.Reflection;
import lombok.Getter;

@Getter
public class BlockBoxManager {
    private BlockBox blockBox;

    public BlockBoxManager() {
        try {
            blockBox = (BlockBox) Reflection.getClass("xyz.baqel.pinecone.utils.blockbox.boxes.BlockBox" + ProtocolVersion.getGameVersion().getServerVersion().replaceAll("v", "")).newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }}
