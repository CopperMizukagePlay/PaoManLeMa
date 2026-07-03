package p001a0;

import p034e0.C0622o0;
import p050g2.AbstractC1586f0;
import p050g2.C1587g;
import p050g2.C1602n0;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p150t5.InterfaceC3282f;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.h0 */
/* loaded from: classes.dex */
public final class C0030h0 extends AbstractC3368k implements InterfaceC3282f {

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2453q f146f;

    /* renamed from: g */
    public final /* synthetic */ boolean f147g;

    /* renamed from: h */
    public final /* synthetic */ C2459w f148h;

    /* renamed from: i */
    public final /* synthetic */ C0622o0 f149i;

    /* renamed from: j */
    public final /* synthetic */ C0043k1 f150j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0030h0(InterfaceC2453q interfaceC2453q, boolean z7, C2459w c2459w, C0622o0 c0622o0, C0043k1 c0043k1) {
        super(3);
        this.f146f = interfaceC2453q;
        this.f147g = z7;
        this.f148h = c2459w;
        this.f149i = c0622o0;
        this.f150j = c0043k1;
    }

    @Override // p150t5.InterfaceC3282f
    /* renamed from: c */
    public final Object mo24c(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        C2459w c2459w = this.f148h;
        C1587g c1587g = c2459w.f13723a;
        InterfaceC2453q interfaceC2453q = this.f146f;
        if (!booleanValue) {
            intValue = interfaceC2453q.mo167a(intValue);
        }
        if (!booleanValue) {
            intValue2 = interfaceC2453q.mo167a(intValue2);
        }
        boolean z7 = false;
        if (this.f147g) {
            long j6 = c2459w.f13724b;
            int i7 = C1602n0.f10303c;
            if (intValue != ((int) (j6 >> 32)) || intValue2 != ((int) (j6 & 4294967295L))) {
                int min = Math.min(intValue, intValue2);
                EnumC0091x0 enumC0091x0 = EnumC0091x0.f416e;
                C0622o0 c0622o0 = this.f149i;
                if (min >= 0 && Math.max(intValue, intValue2) <= c1587g.f10239f.length()) {
                    if (!booleanValue && intValue != intValue2) {
                        c0622o0.m1283f(true);
                    } else {
                        c0622o0.m1293p(false);
                        c0622o0.m1291n(enumC0091x0);
                    }
                    this.f150j.f230t.mo23f(new C2459w(c1587g, AbstractC1586f0.m2558b(intValue, intValue2), (C1602n0) null));
                    z7 = true;
                } else {
                    c0622o0.m1293p(false);
                    c0622o0.m1291n(enumC0091x0);
                }
            }
        }
        return Boolean.valueOf(z7);
    }
}
