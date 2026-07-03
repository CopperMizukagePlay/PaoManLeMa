package p122q;

import p100n.InterfaceC2656k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.e */
/* loaded from: classes.dex */
public interface InterfaceC2900e {

    /* renamed from: a */
    public static final C2897d f15123a = C2897d.f15110a;

    /* renamed from: a */
    default float mo4570a(float f7, float f8, float f9) {
        f15123a.getClass();
        float f10 = f8 + f7;
        if ((f7 >= 0.0f && f10 <= f9) || (f7 < 0.0f && f10 > f9)) {
            return 0.0f;
        }
        float f11 = f10 - f9;
        if (Math.abs(f7) < Math.abs(f11)) {
            return f7;
        }
        return f11;
    }

    /* renamed from: b */
    default InterfaceC2656k mo4571b() {
        f15123a.getClass();
        return C2897d.f15111b;
    }
}
