package p063i0;

import p035e1.C0677s;
import p035e1.InterfaceC0678t;
import p053g5.InterfaceC1684c;
import p158u5.InterfaceC3363f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.x6 */
/* loaded from: classes.dex */
public final /* synthetic */ class C2041x6 implements InterfaceC0678t, InterfaceC3363f {

    /* renamed from: a */
    public final /* synthetic */ C1990r3 f12157a;

    public C2041x6(C1990r3 c1990r3) {
        this.f12157a = c1990r3;
    }

    @Override // p035e1.InterfaceC0678t
    /* renamed from: a */
    public final long mo1461a() {
        return ((C0677s) this.f12157a.get()).f2211a;
    }

    @Override // p158u5.InterfaceC3363f
    /* renamed from: b */
    public final InterfaceC1684c mo3206b() {
        return this.f12157a;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0678t) && (obj instanceof InterfaceC3363f)) {
            return this.f12157a.equals(((InterfaceC3363f) obj).mo3206b());
        }
        return false;
    }

    public final int hashCode() {
        return this.f12157a.hashCode();
    }
}
