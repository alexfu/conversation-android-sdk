/*
 * Copyright (c) 2016 Nexmo Inc
 * All rights reserved.
 *
 */
package com.nexmo.sdk.conversation.client.event;

import java.io.IOException;

/**
 * Generic network exception.
 * Caused due to either UnknownHostException or SocketTimeoutException while
 * processing requests.
 */
public class InternalNetworkException extends IOException {

    /**
     * Constructs a new InternalNetworkException that includes the current stack trace.
     */
    public InternalNetworkException() {
    }

    /**
     * Constructs a new InternalNetworkException with the current stack trace and the specified detail message.
     *
     * @param message The detail message for this exception. Accepts null.
     */
    public InternalNetworkException(final String message) {
        super(message);
    }

    /**
     * Constructs a new InternalNetworkException with the current stack trace, the specified detail message and the specified cause.
     *
     * @param message   The detail message for this exception. Accepts null.
     * @param throwable The cause of this exception.
     */
    public InternalNetworkException(final String message, final Throwable throwable) {
        super(message, throwable);
    }

    /**
     * Constructs a new InternalNetworkException with the current stack trace and the specified cause.
     *
     * @param throwable The cause of this exception.
     */
    public InternalNetworkException(final Throwable throwable) {
        super(throwable);
    }

}