package p114o6;

import p099m6.AbstractC2602f0;
import p099m6.C2596c0;
import p099m6.C2598d0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o6.a */
/* loaded from: classes.dex */
public final class C2819a {
    /* renamed from: a */
    public static final C2598d0 m4444a(C2598d0 c2598d0) {
        AbstractC2602f0 abstractC2602f0;
        if (c2598d0 != null) {
            abstractC2602f0 = c2598d0.f14062k;
        } else {
            abstractC2602f0 = null;
        }
        if (abstractC2602f0 != null) {
            C2596c0 m4143d = c2598d0.m4143d();
            m4143d.f14035g = null;
            return m4143d.m4140a();
        }
        return c2598d0;
    }

    /* renamed from: b */
    public static boolean m4445b(String str) {
        if (!"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }
}
