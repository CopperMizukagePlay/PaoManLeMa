package p063i0;

import p053g5.C1694m;
import p140s2.C3091a;
import p144t.AbstractC3136j;
import p144t.C3126e;
import p144t.InterfaceC3128f;
import p144t.InterfaceC3132h;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3239v0;
import p146t1.InterfaceC3223n0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.u */
/* loaded from: classes.dex */
public final class C2010u extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: f */
    public final /* synthetic */ AbstractC3239v0 f11874f;

    /* renamed from: g */
    public final /* synthetic */ int f11875g;

    /* renamed from: h */
    public final /* synthetic */ AbstractC3239v0 f11876h;

    /* renamed from: i */
    public final /* synthetic */ InterfaceC3128f f11877i;

    /* renamed from: j */
    public final /* synthetic */ long f11878j;

    /* renamed from: k */
    public final /* synthetic */ AbstractC3239v0 f11879k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC3223n0 f11880l;

    /* renamed from: m */
    public final /* synthetic */ InterfaceC3132h f11881m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2010u(AbstractC3239v0 abstractC3239v0, int i7, AbstractC3239v0 abstractC3239v02, InterfaceC3128f interfaceC3128f, long j6, AbstractC3239v0 abstractC3239v03, InterfaceC3223n0 interfaceC3223n0, InterfaceC3132h interfaceC3132h, int i8) {
        super(1);
        this.f11874f = abstractC3239v0;
        this.f11875g = i7;
        this.f11876h = abstractC3239v02;
        this.f11877i = interfaceC3128f;
        this.f11878j = j6;
        this.f11879k = abstractC3239v03;
        this.f11880l = interfaceC3223n0;
        this.f11881m = interfaceC3132h;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int max;
        int m4760h;
        AbstractC3237u0 abstractC3237u0 = (AbstractC3237u0) obj;
        AbstractC3239v0 abstractC3239v0 = this.f11874f;
        int i7 = abstractC3239v0.f16054f;
        int i8 = this.f11875g;
        int i9 = 0;
        AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v0, 0, (i8 - i7) / 2);
        C3126e c3126e = AbstractC3136j.f15793e;
        InterfaceC3128f interfaceC3128f = this.f11877i;
        boolean m5096a = AbstractC3367j.m5096a(interfaceC3128f, c3126e);
        AbstractC3239v0 abstractC3239v02 = this.f11879k;
        AbstractC3239v0 abstractC3239v03 = this.f11876h;
        long j6 = this.f11878j;
        if (m5096a) {
            int m4760h2 = C3091a.m4760h(j6);
            int i10 = abstractC3239v03.f16053e;
            max = (m4760h2 - i10) / 2;
            int i11 = abstractC3239v0.f16053e;
            if (max < i11) {
                m4760h = i11 - max;
            } else if (i10 + max > C3091a.m4760h(j6) - abstractC3239v02.f16053e) {
                m4760h = (C3091a.m4760h(j6) - abstractC3239v02.f16053e) - (abstractC3239v03.f16053e + max);
            }
            max += m4760h;
        } else if (AbstractC3367j.m5096a(interfaceC3128f, AbstractC3136j.f15790b)) {
            max = (C3091a.m4760h(j6) - abstractC3239v03.f16053e) - abstractC3239v02.f16053e;
        } else {
            max = Math.max(this.f11880l.mo4513Q(AbstractC2034x.f12093b), abstractC3239v0.f16053e);
        }
        InterfaceC3132h interfaceC3132h = this.f11881m;
        if (AbstractC3367j.m5096a(interfaceC3132h, c3126e)) {
            i9 = (i8 - abstractC3239v03.f16054f) / 2;
        } else if (AbstractC3367j.m5096a(interfaceC3132h, AbstractC3136j.f15792d)) {
            i9 = i8 - abstractC3239v03.f16054f;
        }
        AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v03, max, i9);
        AbstractC3237u0.m4951j(abstractC3237u0, abstractC3239v02, C3091a.m4760h(j6) - abstractC3239v02.f16053e, (i8 - abstractC3239v02.f16054f) / 2);
        return C1694m.f10482a;
    }
}
