package io.coolshit.encrosync.utils;

import java.net.Inet4Address;
import java.security.PrivateKey;

public record Wireguard(Inet4Address internalSubnet,
                         Inet4Address[] routableSubnets,
                         String psk,
                         String publicKey,
                         PrivateKey privateKey ) {

    //Wireguard(Inet4Address internalSubnet, Inet4Address[] routableSubnets) {
        //this( internalSubnet, routableSubnets, psk, publicKey, privateKey);
    //}
}