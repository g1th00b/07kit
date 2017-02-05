package com.kit.game.exception;

/**
 */
public final class ClientOutdatedException extends RuntimeException {

    public ClientOutdatedException(int expectedVersion, int actualVersion) {
        super(String.format("Client is outdated - [local:%d,actual:%d]", expectedVersion, actualVersion));
    }

}
