package io.coolshit.encrosync.core;

import java.net.Inet4Address;
import java.util.HashSet;
import org.apache.commons.net.util.SubnetUtils;
import org.apache.commons.net.util.SubnetUtils.SubnetInfo;

public sealed class Subnet implements NetworkComponent {
    HashSet<Peer> tennants;
    HashSet<Inet4Address> availableIpv4 = super.getAvailableIps();

    SubnetUtils utils;
    SubnetInfo info;

    MultiValuedMap<Peer, Wireguard.Tunnel[]> subnetMap = ;


    Subnet(Inet4Address cidr){
        this.utils = new SubnetUtils(cidr.toString());
        this.info = utils.getInfo();
    }

    static Subnet createSubnet(Inet4Address cidr) {
        return new Subnet(cidr);
    }

    boolean join(){

    }
    boolean leave(){

    }

    @Override
    public Inet4Address getCidrRange() {
        return null;
    }

    @Override
    public void setCidrRange(Inet4Address cidrRange) {

    }
}
