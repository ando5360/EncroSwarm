package io.coolshit.encrosync.core;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import org.apache.commons.net.util.SubnetUtils;

public interface NetworkComponent {

    Inet4Address getCidrRange();
    void setCidrRange(Inet4Address cidrRange);

    default Inet4Address strToInet4(String resolvme)
            throws UnknownHostException{
                return (Inet4Address) InetAddress.getByName(resolvme);
    }

    default Inet4Address coerceIpv4(){
        String lower = new SubnetUtils(this.getCidrRange().toString())
                .getInfo()
                .getLowAddress();
        String upper = new SubnetUtils(this.getCidrRange().toString())
                .getInfo()
                .getLowAddress();
    }

    default HashSet<Inet4Address> getAvailableIps(){
        // Build stream map str -> inet4 .filter ips present in meta.db = whats left
        new SubnetUtils(this.getCidrRange().toString())
                .getInfo()
                .getAllAddresses();
    }

}