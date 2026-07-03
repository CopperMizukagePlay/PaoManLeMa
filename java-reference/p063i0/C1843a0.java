package p063i0;

import p053g5.C1694m;
import p054g6.InterfaceC1704e;
import p082k5.InterfaceC2313c;
import p137s.C3072a;
import p137s.C3073b;
import p137s.C3074c;
import p137s.C3075d;
import p137s.C3076e;
import p137s.C3077f;
import p137s.C3078g;
import p137s.C3082k;
import p137s.C3083l;
import p137s.C3084m;
import p137s.InterfaceC3079h;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.a0 */
/* loaded from: classes.dex */
public final class C1843a0 implements InterfaceC1704e {

    /* renamed from: e */
    public final /* synthetic */ int f10911e;

    /* renamed from: f */
    public final /* synthetic */ C3469p f10912f;

    public /* synthetic */ C1843a0(C3469p c3469p, int i7) {
        this.f10911e = i7;
        this.f10912f = c3469p;
    }

    @Override // p054g6.InterfaceC1704e
    /* renamed from: h */
    public final Object mo160h(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f10911e) {
            case 0:
                InterfaceC3079h interfaceC3079h = (InterfaceC3079h) obj;
                boolean z7 = interfaceC3079h instanceof C3077f;
                C3469p c3469p = this.f10912f;
                if (z7) {
                    c3469p.add(interfaceC3079h);
                } else if (interfaceC3079h instanceof C3078g) {
                    c3469p.remove(((C3078g) interfaceC3079h).f15678a);
                } else if (interfaceC3079h instanceof C3075d) {
                    c3469p.add(interfaceC3079h);
                } else if (interfaceC3079h instanceof C3076e) {
                    c3469p.remove(((C3076e) interfaceC3079h).f15677a);
                } else if (interfaceC3079h instanceof C3083l) {
                    c3469p.add(interfaceC3079h);
                } else if (interfaceC3079h instanceof C3084m) {
                    c3469p.remove(((C3084m) interfaceC3079h).f15682a);
                } else if (interfaceC3079h instanceof C3082k) {
                    c3469p.remove(((C3082k) interfaceC3079h).f15680a);
                }
                return C1694m.f10482a;
            default:
                InterfaceC3079h interfaceC3079h2 = (InterfaceC3079h) obj;
                boolean z8 = interfaceC3079h2 instanceof C3083l;
                C3469p c3469p2 = this.f10912f;
                if (z8) {
                    c3469p2.add(interfaceC3079h2);
                } else if (interfaceC3079h2 instanceof C3084m) {
                    c3469p2.remove(((C3084m) interfaceC3079h2).f15682a);
                } else if (interfaceC3079h2 instanceof C3082k) {
                    c3469p2.remove(((C3082k) interfaceC3079h2).f15680a);
                } else if (interfaceC3079h2 instanceof C3073b) {
                    c3469p2.add(interfaceC3079h2);
                } else if (interfaceC3079h2 instanceof C3074c) {
                    c3469p2.remove(((C3074c) interfaceC3079h2).f15676a);
                } else if (interfaceC3079h2 instanceof C3072a) {
                    c3469p2.remove(((C3072a) interfaceC3079h2).f15675a);
                }
                return C1694m.f10482a;
        }
    }
}
