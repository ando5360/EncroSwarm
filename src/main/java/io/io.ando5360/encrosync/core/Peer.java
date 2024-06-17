package io.coolshit.encrosync.core;

import io.smallrye.config.ConfigMapping;

import java.net.Inet4Address;
import java.util.UUID;

@ConfigMapping(prefix = "peers")
public final class Peer implements NetworkComponent{
    UUID uuid;
    @Override
    public Inet4Address getCidrRange() {
        return null;
    }

    @Override
    public void setCidrRange(Inet4Address cidrRange) {

    }
}
