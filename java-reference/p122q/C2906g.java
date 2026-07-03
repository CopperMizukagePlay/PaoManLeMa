package p122q;

import p100n.AbstractC2638e;
import p100n.C2661l1;
import p100n.C2686u;
import p100n.InterfaceC2656k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.g */
/* loaded from: classes.dex */
public final class C2906g implements InterfaceC2900e {

    /* renamed from: b */
    public final C2661l1 f15147b = AbstractC2638e.m4232r(125, 2, new C2686u(0.25f, 0.1f, 0.25f, 1.0f));

    @Override // p122q.InterfaceC2900e
    /* renamed from: a */
    public final float mo4570a(float f7, float f8, float f9) {
        boolean z7;
        float abs = Math.abs((f8 + f7) - f7);
        if (abs <= f9) {
            z7 = true;
        } else {
            z7 = false;
        }
        float f10 = (0.3f * f9) - (0.0f * abs);
        float f11 = f9 - f10;
        if (z7 && f11 < abs) {
            f10 = f9 - abs;
        }
        return f7 - f10;
    }

    @Override // p122q.InterfaceC2900e
    /* renamed from: b */
    public final InterfaceC2656k mo4571b() {
        return this.f15147b;
    }
}
