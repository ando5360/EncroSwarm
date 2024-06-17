package io.coolshit.encrosync.app;


import io.reactivex.rxjava3.core.Observable;

import java.util.Arrays;
import java.util.stream.Stream;

public class JigSawPuzzle implements Runnable {
    int size; // amount of pieces (size of puzzle);
    int distribution;
    boolean isPuzzleSolved = false;
    double currentState = Math.clamp(0, 0, 1);
    double increment;
    JigSawPiece[] pieces;
    Observable<Double> progress;

    JigSawPuzzle(int amountOfPieces) {
        if(amountOfPieces < 10){
            throw new IllegalArgumentException("Swarm size must be less than 10");
        }
        this.size = Math.clamp(0, amountOfPieces, 10);
        this.pieces = new JigSawPiece[amountOfPieces];
        this.distribution = Math.clamp(1, size, 10);
        this.progress = Observable.just(currentState);
        this.increment = this.size / 10;

        progress.subscribe(current -> {
                    if (current == 1) {
                        isPuzzleSolved = true;
                        // action upon completion
                    } else {
                        this.run();
                        // resolve missing pieces
                    }
                }
        );
    }

    private boolean solve(){
        //TODO: BOUNCY CASTLE LOGIC TO UNWRAP KEYS THEN DELETE TRACES
        return false;
    }

    @Override
    public void run() {
        Stream<JigSawPiece> pieceStream
            = Arrays.stream(pieces).limit(this.size);
                pieceStream.forEach(piece -> {
                    if (piece.isWrapped) {
                        piece.run();
                    }
                });
    }
}
