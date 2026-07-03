package p160v;

import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.h */
/* loaded from: classes.dex */
public final class C3412h {

    /* renamed from: a */
    public final int f16551a;

    /* renamed from: b */
    public final int f16552b;

    /* renamed from: c */
    public final InterfaceC3438u f16553c;

    public C3412h(int i7, int i8, InterfaceC3438u interfaceC3438u) {
        this.f16551a = i7;
        this.f16552b = i8;
        this.f16553c = interfaceC3438u;
        if (i7 >= 0) {
            if (i8 > 0) {
                return;
            } else {
                throw new IllegalArgumentException(AbstractC2647h.m4256b("size should be >0, but was ", i8).toString());
            }
        }
        throw new IllegalArgumentException(AbstractC2647h.m4256b("startIndex should be >= 0, but was ", i7).toString());
    }
}
