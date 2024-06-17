package io.coolshit.encrosync.app;
import java.util.Iterator;

public enum AppState{
    ESTABLISHING_NETWORK_PEERS,
    ROUTING,
    DECRYPTING,
    DONE;
}
