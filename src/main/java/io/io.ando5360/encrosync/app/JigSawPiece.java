package io.coolshit.encrosync.app;

import java.lang.ref.Cleaner.Cleanable;

public class JigSawPiece implements Runnable{
    boolean isWrapped;


    public void destroy() {

    }

    @Override
    public void run() {
        //TODO: logic to unwrap the piece
        this.destroy();
    }

    public void unwrap(){
        //TODO: TLS Key Unwrapping Logic here
    }
}
