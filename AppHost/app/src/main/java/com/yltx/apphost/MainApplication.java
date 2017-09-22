package com.yltx.apphost;

import com.qihoo360.replugin.RePluginApplication;
import com.qihoo360.replugin.RePluginConfig;

/**
 * 功能描述:
 * Created by ixzus on 2017/9/18.
 */

public class MainApplication extends RePluginApplication {
    @Override
    protected RePluginConfig createConfig() {
        RePluginConfig c = new RePluginConfig();
        c.setUseHostClassIfNotFound(true);
        c.setVerifySign(!BuildConfig.DEBUG);
        return c;
    }
}
