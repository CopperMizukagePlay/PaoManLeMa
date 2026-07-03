package p001a0;

import p000a.AbstractC0000a;
import p010b1.C0265c;
import p027d1.C0467e;
import p028d2.C0477j;
import p034e0.AbstractC0641z;
import p034e0.C0640y;
import p035e1.C0666m;
import p053g5.C1694m;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.e */
/* loaded from: classes.dex */
public final class C0017e extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f101f;

    /* renamed from: g */
    public final /* synthetic */ long f102g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0017e(int i7, long j6) {
        super(1);
        this.f101f = i7;
        this.f102g = j6;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f101f) {
            case 0:
                C0265c c0265c = (C0265c) obj;
                float m1026d = C0467e.m1026d(c0265c.f999e.mo550c()) / 2.0f;
                return c0265c.m558a(new C0013d(m1026d, AbstractC0000a.m8i(c0265c, m1026d), new C0666m(5, this.f102g), 0));
            default:
                ((C0477j) obj).m1036d(AbstractC0641z.f2122c, new C0640y(EnumC0088w0.f405e, this.f102g, 2, true));
                return C1694m.f10482a;
        }
    }
}
