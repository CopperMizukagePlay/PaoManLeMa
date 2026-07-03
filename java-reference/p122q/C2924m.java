package p122q;

import p085l0.C2361g1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.m */
/* loaded from: classes.dex */
public final class C2924m implements InterfaceC2958x0 {

    /* renamed from: a */
    public final /* synthetic */ C2927n f15215a;

    public C2924m(C2927n c2927n) {
        this.f15215a = c2927n;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [t5.c, u5.k] */
    @Override // p122q.InterfaceC2958x0
    /* renamed from: a */
    public final float mo4566a(float f7) {
        boolean z7;
        if (Float.isNaN(f7)) {
            return 0.0f;
        }
        C2927n c2927n = this.f15215a;
        float floatValue = ((Number) c2927n.f15220a.mo23f(Float.valueOf(f7))).floatValue();
        C2361g1 c2361g1 = c2927n.f15224e;
        boolean z8 = false;
        if (floatValue > 0.0f) {
            z7 = true;
        } else {
            z7 = false;
        }
        c2361g1.setValue(Boolean.valueOf(z7));
        C2361g1 c2361g12 = c2927n.f15225f;
        if (floatValue < 0.0f) {
            z8 = true;
        }
        c2361g12.setValue(Boolean.valueOf(z8));
        return floatValue;
    }
}
