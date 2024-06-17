package io.coolshit.encrosync.core;
import java.util.HashMap;
import java.util.UUID;
import java.net.Inet4Address;

public class Network implements NetworkComponent {
    HashMap<UUID, Peer> peerMap = new HashMap<UUID, Peer>();


    @Override
    public Inet4Address getCidrRange() {
        return null;
    }

    @Override
    public void setCidrRange(Inet4Address cidrRange) {

    }
    // WANT TO CHAIN A RANDOMIZED SEQUENCE OF BINARY OPERATORS TO A PEER MANIPULATE ROUTE WHICH THE KEY WRAPPING ALGO TAKES
    // ACCORDING TO (1) NETWORK TOPOLOGY / WHAT IT NEEDS TO DO, (2) RANDOMNESS (3) INCREASED DISTRIBUTION
}
