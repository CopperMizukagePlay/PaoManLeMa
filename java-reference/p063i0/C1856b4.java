package p063i0;

import androidx.compose.foundation.layout.AbstractC0154b;
import p053g5.C1694m;
import p068i5.AbstractC2080d;
import p071j0.AbstractC2151s0;
import p140s2.EnumC3103m;
import p144t.InterfaceC3135i0;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.b4 */
/* loaded from: classes.dex */
public final class C1856b4 extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ int f10958f;

    /* renamed from: g */
    public final /* synthetic */ int f10959g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC3239v0 f10960h;

    /* renamed from: i */
    public final /* synthetic */ AbstractC3239v0 f10961i;

    /* renamed from: j */
    public final /* synthetic */ AbstractC3239v0 f10962j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC3239v0 f10963k;

    /* renamed from: l */
    public final /* synthetic */ AbstractC3239v0 f10964l;

    /* renamed from: m */
    public final /* synthetic */ AbstractC3239v0 f10965m;

    /* renamed from: n */
    public final /* synthetic */ AbstractC3239v0 f10966n;

    /* renamed from: o */
    public final /* synthetic */ AbstractC3239v0 f10967o;

    /* renamed from: p */
    public final /* synthetic */ AbstractC3239v0 f10968p;

    /* renamed from: q */
    public final /* synthetic */ C1865c4 f10969q;

    /* renamed from: r */
    public final /* synthetic */ InterfaceC3223n0 f10970r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1856b4(int i7, int i8, AbstractC3239v0 abstractC3239v0, AbstractC3239v0 abstractC3239v02, AbstractC3239v0 abstractC3239v03, AbstractC3239v0 abstractC3239v04, AbstractC3239v0 abstractC3239v05, AbstractC3239v0 abstractC3239v06, AbstractC3239v0 abstractC3239v07, AbstractC3239v0 abstractC3239v08, AbstractC3239v0 abstractC3239v09, C1865c4 c1865c4, InterfaceC3223n0 interfaceC3223n0) {
        super(1);
        this.f10958f = i7;
        this.f10959g = i8;
        this.f10960h = abstractC3239v0;
        this.f10961i = abstractC3239v02;
        this.f10962j = abstractC3239v03;
        this.f10963k = abstractC3239v04;
        this.f10964l = abstractC3239v05;
        this.f10965m = abstractC3239v06;
        this.f10966n = abstractC3239v07;
        this.f10967o = abstractC3239v08;
        this.f10968p = abstractC3239v09;
        this.f10969q = c1865c4;
        this.f10970r = interfaceC3223n0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7;
        float f7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        float f8;
        AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
        C1865c4 c1865c4 = this.f10969q;
        float f9 = c1865c4.f11010c;
        boolean z7 = c1865c4.f11009b;
        InterfaceC3223n0 interfaceC3223n0 = this.f10970r;
        float mo559b = interfaceC3223n0.mo559b();
        EnumC3103m layoutDirection = interfaceC3223n0.getLayoutDirection();
        InterfaceC3135i0 interfaceC3135i0 = c1865c4.f11011d;
        float f10 = AbstractC1847a4.f10920a;
        AbstractC3237u0.m4950h(abstractC3237u0, this.f10967o, 0L);
        float f11 = AbstractC2151s0.f12521b;
        AbstractC3239v0 abstractC3239v0 = this.f10968p;
        if (abstractC3239v0 != null) {
            i7 = abstractC3239v0.f16054f;
        } else {
            i7 = 0;
        }
        int i13 = this.f10958f - i7;
        int m5794D = AbstractC3784a.m5794D(interfaceC3135i0.mo4825b() * mo559b);
        int m5794D2 = AbstractC3784a.m5794D(AbstractC0154b.m334e(interfaceC3135i0, layoutDirection) * mo559b);
        float f12 = AbstractC2151s0.f12522c * mo559b;
        AbstractC3239v0 abstractC3239v02 = this.f10960h;
        if (abstractC3239v02 != null) {
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v02, 0, Math.round((1 + 0.0f) * ((i13 - abstractC3239v02.f16054f) / 2.0f)));
        }
        AbstractC3239v0 abstractC3239v03 = this.f10965m;
        if (abstractC3239v03 != null) {
            if (z7) {
                f7 = 2.0f;
                i12 = Math.round((1 + 0.0f) * ((i13 - abstractC3239v03.f16054f) / 2.0f));
            } else {
                f7 = 2.0f;
                i12 = m5794D;
            }
            int m3410w = AbstractC2080d.m3410w(f9, i12, -(abstractC3239v03.f16054f / 2));
            if (abstractC3239v02 == null) {
                f8 = 0.0f;
            } else {
                f8 = (1 - f9) * (abstractC3239v02.f16053e - f12);
            }
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v03, AbstractC3784a.m5794D(f8) + m5794D2, m3410w);
        } else {
            f7 = 2.0f;
        }
        AbstractC3239v0 abstractC3239v04 = this.f10962j;
        if (abstractC3239v04 != null) {
            if (abstractC3239v02 != null) {
                i11 = abstractC3239v02.f16053e;
            } else {
                i11 = 0;
            }
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v04, i11, AbstractC1847a4.m3106e(z7, i13, m5794D, abstractC3239v03, abstractC3239v04));
        }
        if (abstractC3239v02 != null) {
            i8 = abstractC3239v02.f16053e;
        } else {
            i8 = 0;
        }
        if (abstractC3239v04 != null) {
            i9 = abstractC3239v04.f16053e;
        } else {
            i9 = 0;
        }
        int i14 = i8 + i9;
        AbstractC3239v0 abstractC3239v05 = this.f10964l;
        AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v05, i14, AbstractC1847a4.m3106e(z7, i13, m5794D, abstractC3239v03, abstractC3239v05));
        AbstractC3239v0 abstractC3239v06 = this.f10966n;
        if (abstractC3239v06 != null) {
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v06, i14, AbstractC1847a4.m3106e(z7, i13, m5794D, abstractC3239v03, abstractC3239v06));
        }
        int i15 = this.f10959g;
        AbstractC3239v0 abstractC3239v07 = this.f10961i;
        AbstractC3239v0 abstractC3239v08 = this.f10963k;
        if (abstractC3239v08 != null) {
            if (abstractC3239v07 != null) {
                i10 = abstractC3239v07.f16053e;
            } else {
                i10 = 0;
            }
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v08, (i15 - i10) - abstractC3239v08.f16053e, AbstractC1847a4.m3106e(z7, i13, m5794D, abstractC3239v03, abstractC3239v08));
        }
        if (abstractC3239v07 != null) {
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v07, i15 - abstractC3239v07.f16053e, Math.round((1 + 0.0f) * ((i13 - abstractC3239v07.f16054f) / f7)));
        }
        if (abstractC3239v0 != null) {
            AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v0, 0, i13);
        }
        return C1694m.f10482a;
    }
}
