package p168w;

import p085l0.C2345c1;
import p085l0.C2349d1;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w.f */
/* loaded from: classes.dex */
public final class C3623f extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f17298f;

    /* renamed from: g */
    public final /* synthetic */ AbstractC3642y f17299g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3623f(AbstractC3642y abstractC3642y, int i7) {
        super(0);
        this.f17298f = i7;
        this.f17299g = abstractC3642y;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        int m5608i;
        int m5608i2;
        switch (this.f17298f) {
            case 0:
                return Integer.valueOf(this.f17299g.mo5600k());
            case 1:
                return Integer.valueOf(this.f17299g.mo5600k());
            case 2:
                AbstractC3642y abstractC3642y = this.f17299g;
                if (abstractC3642y.f17403j.mo114c()) {
                    m5608i = abstractC3642y.f17412s.m3741g();
                } else {
                    m5608i = abstractC3642y.m5608i();
                }
                return Integer.valueOf(m5608i);
            default:
                AbstractC3642y abstractC3642y2 = this.f17299g;
                C2349d1 c2349d1 = abstractC3642y2.f17411r;
                if (!abstractC3642y2.f17403j.mo114c()) {
                    m5608i2 = abstractC3642y2.m5608i();
                } else if (c2349d1.m3741g() != -1) {
                    m5608i2 = c2349d1.m3741g();
                } else if (Math.abs(((C2345c1) abstractC3642y2.f17396c.f15486d).m3729g()) >= Math.abs(Math.min(abstractC3642y2.f17409p.mo4526y(AbstractC3618c0.f17274a), abstractC3642y2.m5610l() / 2.0f) / abstractC3642y2.m5610l())) {
                    if (((Boolean) abstractC3642y2.f17392E.getValue()).booleanValue()) {
                        m5608i2 = abstractC3642y2.f17397d + 1;
                    } else {
                        m5608i2 = abstractC3642y2.f17397d;
                    }
                } else {
                    m5608i2 = abstractC3642y2.m5608i();
                }
                return Integer.valueOf(abstractC3642y2.m5607h(m5608i2));
        }
    }
}
