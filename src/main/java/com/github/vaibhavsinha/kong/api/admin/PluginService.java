package com.github.vaibhavsinha.kong.api.admin;

import com.github.vaibhavsinha.kong.model.admin.plugin.EnabledPlugins;
import com.github.vaibhavsinha.kong.model.admin.plugin.Plugin;
import com.github.vaibhavsinha.kong.model.admin.plugin.PluginList;

/**
 * Created by vaibhav on 13/06/17.
 *
 * You can add a plugin in four different ways:
 *  For every API and Consumer. Don't set api_id and consumer_id.
 *  For every API and a specific Consumer. Only set consumer_id.
 *  For every Consumer and a specific API. Only set api_id.
 *  For a specific Consumer and API. Set both api_id and consumer_id.
 * Note that not all plugins allow to specify consumer_id. Check the plugin documentation.
 */
public interface PluginService {

    // --------------------------------------------------------------

    Plugin addPluginForApi(String apiNameOrId, Plugin plugin);

    Plugin getPluginForApi(String apiNameOrId, String pluginId);

    Plugin updatePluginForApi(String apiNameOrId, String pluginNameOrId, Plugin request);

    @Deprecated
    Plugin createOrUpdatePluginForApi(String apiNameOrId, Plugin plugin);

    void deletePluginForApi(String apiNameOrId, String pluginNameOrId);

    PluginList listPluginsForApi(String apiNameOrId, String pluginNameOrId, String apiId, String consumerId, String name, Long size, String offset);


    // --------------------------------------------------------------

    Plugin addPlugin(Plugin request);

    Plugin getPlugin(String nameOrId);

    Plugin updatePlugin(String nameOrId, Plugin request);

    @Deprecated
    Plugin createOrUpdatePlugin(Plugin request);

    void deletePlugin(String nameOrId);

    PluginList listPlugins(String id, String apiId, String consumerId, String name, Long size, String offset);
}
