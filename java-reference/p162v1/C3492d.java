package p162v1;

import p154u1.C3352h;
import p154u1.InterfaceC3351g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.d */
/* loaded from: classes.dex */
public final class C3492d implements InterfaceC3351g {

    /* renamed from: e */
    public final /* synthetic */ int f16807e;

    public /* synthetic */ C3492d(int i7) {
        this.f16807e = i7;
    }

    /* renamed from: a */
    public static final int m5312a(int i7, long j6) {
        int i8 = AbstractC3560z1.f17109b;
        return ((int) (j6 >> (i7 * 15))) & 32767;
    }

    /* renamed from: b */
    public int m5313b() {
        switch (this.f16807e) {
            case 1:
                return 16;
            default:
                return 8;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [t5.a, u5.k] */
    @Override // p154u1.InterfaceC3351g
    /* renamed from: e */
    public Object mo5084e(C3352h c3352h) {
        return c3352h.f16415a.mo52a();
    }
}
