package ink.trmnl.android.data

/**
 * Global application configuration.
 */
object AppConfig {
    /**
     * Number of HTTP request-response log entries to keep in the data store before they are pruned.
     * See [ink.trmnl.android.data.log.TrmnlRefreshLogManager].
     */
    const val MAX_LOG_ENTRIES = 100

    /**
     * Duration in milliseconds to wait before automatically hiding the app config window.
     */
    const val AUTO_HIDE_APP_CONFIG_WINDOW_MS: Long = 4_000L // 4 seconds

    /**
     * Default display refresh rate in case the server does not provide one.
     */
    const val DEFAULT_REFRESH_INTERVAL_SEC: Long = 7_200L // 2 hours

    /**
     * Legacy domain name for TRMNL API (deprecated, used for migration only).
     * Ref: https://github.com/usetrmnl/trmnl-android/issues/240
     */
    const val LEGACY_TRMNL_DOMAIN = "usetrmnl.com"

    /**
     * Current domain name for TRMNL API.
     * Ref: https://github.com/usetrmnl/trmnl-android/issues/240
     */
    const val TRMNL_DOMAIN = "trmnl.com"

    /**
     * Default AXE Paper API server.
     *
     * This points at John's Otium instance over Tailscale. The app still keeps custom server
     * URL support from the MIT TRMNL Android base, so this can be changed on-device.
     */
    const val TRMNL_API_SERVER_BASE_URL = "https://jps-macbook-pro.tail362d50.ts.net/otium/"

    /**
     * URL for the AXE Paper source/workspace note.
     */
    const val TRMNL_ANDROID_APP_GITHUB_URL = "https://github.com/hanstrategicintel-png/axe-paper-android"

    /**
     * URL for AXE Paper/Otium on John's tailnet.
     */
    const val TRMNL_SITE_URL = "https://jps-macbook-pro.tail362d50.ts.net/otium/api/axe-paper/view"
}
