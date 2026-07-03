package p145t0;

import p037e3.C0691e;
import p085l0.AbstractC2397p1;
import p085l0.InterfaceC2385m1;
import p085l0.InterfaceC2402q2;
import p108o0.InterfaceC2793c;
import p123q0.C2967b;
import p123q0.C2969d;
import p123q0.C2976k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t0.h */
/* loaded from: classes.dex */
public final class C3177h extends C2967b implements InterfaceC2385m1 {

    /* renamed from: h */
    public static final C3177h f15889h = new C2967b(C2976k.f15392e, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.g, q0.d] */
    @Override // p123q0.C2967b
    /* renamed from: a */
    public final C2969d builder() {
        ?? c2969d = new C2969d(this);
        c2969d.f15888k = this;
        return c2969d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t0.g, q0.d, o0.c] */
    @Override // p123q0.C2967b, p108o0.InterfaceC2794d
    public final InterfaceC2793c builder() {
        ?? c2969d = new C2969d(this);
        c2969d.f15888k = this;
        return c2969d;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [t0.h, q0.b] */
    /* renamed from: c */
    public final C3177h m4869c(AbstractC2397p1 abstractC2397p1, InterfaceC2402q2 interfaceC2402q2) {
        C0691e m4634u = this.f15372e.m4634u(abstractC2397p1.hashCode(), 0, abstractC2397p1, interfaceC2402q2);
        if (m4634u == null) {
            return this;
        }
        return new C2967b((C2976k) m4634u.f2245b, this.f15373f + m4634u.f2244a);
    }

    @Override // p123q0.C2967b, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AbstractC2397p1)) {
            return false;
        }
        return super.containsKey((AbstractC2397p1) obj);
    }

    @Override // p060h5.AbstractC1798f, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof InterfaceC2402q2)) {
            return false;
        }
        return super.containsValue((InterfaceC2402q2) obj);
    }

    @Override // p123q0.C2967b, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof AbstractC2397p1)) {
            return null;
        }
        return (InterfaceC2402q2) super.get((AbstractC2397p1) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof AbstractC2397p1)) {
            return obj2;
        }
        return (InterfaceC2402q2) super.getOrDefault((AbstractC2397p1) obj, (InterfaceC2402q2) obj2);
    }
}
