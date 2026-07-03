package p098m5;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p032d6.C0548l;
import p069i6.AbstractC2088a;
import p069i6.C2093f;
import p082k5.C2314d;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2316f;
import p082k5.InterfaceC2318h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m5.c */
/* loaded from: classes.dex */
public abstract class AbstractC2583c extends AbstractC2581a {

    /* renamed from: f */
    public final InterfaceC2318h f13999f;

    /* renamed from: g */
    public transient InterfaceC2313c f14000g;

    public AbstractC2583c(InterfaceC2313c interfaceC2313c, InterfaceC2318h interfaceC2318h) {
        super(interfaceC2313c);
        this.f13999f = interfaceC2318h;
    }

    @Override // p082k5.InterfaceC2313c
    /* renamed from: j */
    public InterfaceC2318h mo662j() {
        InterfaceC2318h interfaceC2318h = this.f13999f;
        AbstractC3367j.m5097b(interfaceC2318h);
        return interfaceC2318h;
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: o */
    public void mo4113o() {
        C0548l c0548l;
        InterfaceC2313c interfaceC2313c = this.f14000g;
        if (interfaceC2313c != null && interfaceC2313c != this) {
            InterfaceC2316f mo853h = mo662j().mo853h(C2314d.f13272e);
            AbstractC3367j.m5097b(mo853h);
            C2093f c2093f = (C2093f) interfaceC2313c;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C2093f.f12352l;
            do {
            } while (atomicReferenceFieldUpdater.get(c2093f) == AbstractC2088a.f12342c);
            Object obj = atomicReferenceFieldUpdater.get(c2093f);
            if (obj instanceof C0548l) {
                c0548l = (C0548l) obj;
            } else {
                c0548l = null;
            }
            if (c0548l != null) {
                c0548l.m1219o();
            }
        }
        this.f14000g = C2582b.f13998e;
    }

    public AbstractC2583c(InterfaceC2313c interfaceC2313c) {
        this(interfaceC2313c, interfaceC2313c != null ? interfaceC2313c.mo662j() : null);
    }
}
