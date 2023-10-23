/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.android.libraries.testing.deviceshadower.internal;

<<<<<<< HEAD:nearby/tests/robotests/src/com/android/libraries/testing/deviceshadower/internal/DeviceShadowException.java
/**
 * Internal exception to indicate error from DeviceShadower framework.
 */
public class DeviceShadowException extends Exception {

    public DeviceShadowException(Throwable e) {
        super(e);
    }

    public DeviceShadowException(String msg) {
        super(msg);
    }

    public DeviceShadowException(String msg, Throwable e) {
        super(msg, e);
    }

=======
import com.android.net.module.util.InetAddressUtils;
import com.android.net.module.util.Struct;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;

/** Key type for ingress discard map */
public class IngressDiscardKey extends Struct {
    // The destination ip of the incoming packet. IPv4 uses IPv4-mapped IPv6 address.
    @Field(order = 0, type = Type.Ipv6Address)
    public final Inet6Address dstAddr;

    public IngressDiscardKey(final Inet6Address dstAddr) {
        this.dstAddr = dstAddr;
    }

    private static Inet6Address getInet6Address(final InetAddress addr) {
        return (addr instanceof Inet4Address)
                ? InetAddressUtils.v4MappedV6Address((Inet4Address) addr)
                : (Inet6Address) addr;
    }

    public IngressDiscardKey(final InetAddress dstAddr) {
        this(getInet6Address(dstAddr));
    }
>>>>>>> 77b49996d2 (Add methods for updating ingressDiscardRule bpf map to BpfNetMaps):common/src/com/android/net/module/util/bpf/IngressDiscardKey.java
}
