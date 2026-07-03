package p034e0;

import p050g2.C1598l0;
import p050g2.C1602n0;
import p053g5.InterfaceC1685d;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.s */
/* loaded from: classes.dex */
public final class C0629s extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ C0619n f2082f;

    /* renamed from: g */
    public final /* synthetic */ int f2083g;

    /* renamed from: h */
    public final /* synthetic */ int f2084h;

    /* renamed from: i */
    public final /* synthetic */ C0614k0 f2085i;

    /* renamed from: j */
    public final /* synthetic */ Object f2086j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0629s(C0619n c0619n, int i7, int i8, C0614k0 c0614k0, InterfaceC1685d interfaceC1685d) {
        super(0);
        this.f2082f = c0619n;
        this.f2083g = i7;
        this.f2084h = i8;
        this.f2085i = c0614k0;
        this.f2086j = interfaceC1685d;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, g5.d] */
    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        boolean z7;
        C0619n c0619n = this.f2082f;
        C1598l0 c1598l0 = (C1598l0) c0619n.f2038e;
        int intValue = ((Number) this.f2086j.getValue()).intValue();
        C0614k0 c0614k0 = this.f2085i;
        boolean z8 = c0614k0.f2017b;
        if (c0614k0.m1251b() == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        int i7 = this.f2083g;
        long m2584k = c1598l0.m2584k(i7);
        int i8 = C1602n0.f10303c;
        int i9 = (int) (m2584k >> 32);
        int m2578e = c1598l0.m2578e(i9);
        int i10 = c1598l0.f10289b.f10317f;
        if (m2578e != intValue) {
            if (intValue >= i10) {
                i9 = c1598l0.m2581h(i10 - 1);
            } else {
                i9 = c1598l0.m2581h(intValue);
            }
        }
        int i11 = (int) (m2584k & 4294967295L);
        if (c1598l0.m2578e(i11) != intValue) {
            if (intValue >= i10) {
                i11 = c1598l0.m2577d(i10 - 1, false);
            } else {
                i11 = c1598l0.m2577d(intValue, false);
            }
        }
        int i12 = this.f2084h;
        if (i9 == i12) {
            return c0619n.m1274a(i11);
        }
        if (i11 == i12) {
            return c0619n.m1274a(i9);
        }
        if (!(z8 ^ z7) ? i7 >= i9 : i7 > i11) {
            i9 = i11;
        }
        return c0619n.m1274a(i9);
    }
}
