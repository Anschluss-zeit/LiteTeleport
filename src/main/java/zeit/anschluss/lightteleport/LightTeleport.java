package zeit.anschluss.lightteleport;

import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class LightTeleport extends JavaPlugin {

    public Logger logger;

    @Override
    public void onEnable() {
        logger = getLogger();
        logger.info("===============================");
        logger.info("欢迎使用LiteTP！作者Anschluss_zeit");
        logger.info("项目使用GPLv3开源");
        logger.info("项目地址https://github.com/LW-GAME/LiteTeleport");
        
    }

    @Override
    public void onDisable() {

    }
}
