# AXE Paper Android

AXE Paper Android is John's private e-ink display app for Boox/Android devices.

It is a local fork of the MIT-licensed `usetrmnl/trmnl-android` app, renamed and preconfigured to use AXE Paper served from Otium over Tailscale.

## Default server

```text
https://jps-macbook-pro.tail362d50.ts.net/otium/
```

Compatibility endpoints in Otium:

```text
/api/display
/api/current_screen
```

Both return TRMNL-compatible display JSON pointing at:

```text
/api/axe-paper/dashboard.svg
```

## Current fork changes

- App name: `AXE Paper`
- Application ID: `ai.openclaw.axepaper`
- Default device mode: BYOS
- Default access token: `axe-paper` (Otium currently ignores the token for this private tailnet endpoint)
- Default server URL: John's Otium/Tailscale URL
- Project name: `AXE Paper`
- Upstream source package names intentionally left as `ink.trmnl.android` for now to avoid broad churn.

## Build

Requires a Java 21 runtime and Android build tooling.

```bash
./gradlew assembleDebug
```

Current Mac blocker: no Java runtime is installed or discoverable by `/usr/libexec/java_home`.

## Upstream attribution

Forked from:

```text
https://github.com/usetrmnl/trmnl-android
```

Original project is MIT licensed. Keep `LICENSE` and upstream attribution intact.
