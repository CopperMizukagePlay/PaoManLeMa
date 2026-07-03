package p145t0;

import p085l0.AbstractC2397p1;
import p085l0.InterfaceC2402q2;
import p123q0.C2967b;
import p123q0.C2969d;
import p123q0.C2976k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t0.g */
/* loaded from: classes.dex */
public final class C3176g extends C2969d {

    /* renamed from: k */
    public C3177h f15888k;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [s0.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [q0.b] */
    @Override // p123q0.C2969d, p108o0.InterfaceC2793c
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final C3177h build() {
        C2976k c2976k = this.f15379g;
        C3177h c3177h = this.f15888k;
        C2976k c2976k2 = c3177h.f15372e;
        C3177h c3177h2 = c3177h;
        if (c2976k != c2976k2) {
            this.f15378f = new Object();
            c3177h2 = new C2967b(this.f15379g, this.f15382j);
        }
        this.f15888k = c3177h2;
        return c3177h2;
    }

    @Override // p123q0.C2969d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof AbstractC2397p1)) {
            return false;
        }
        return super.containsKey((AbstractC2397p1) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof InterfaceC2402q2)) {
            return false;
        }
        return super.containsValue((InterfaceC2402q2) obj);
    }

    @Override // p123q0.C2969d, java.util.AbstractMap, java.util.Map
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

    @Override // p123q0.C2969d, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof AbstractC2397p1)) {
            return null;
        }
        return (InterfaceC2402q2) super.remove((AbstractC2397p1) obj);
    }
}
