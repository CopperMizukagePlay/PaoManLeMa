package p056h0;

import android.view.View;
import androidx.compose.p007ui.platform.AndroidCompositionLocals_androidKt;
import java.util.LinkedHashMap;
import p001a0.C0053n;
import p001a0.C0068q2;
import p035e1.AbstractC0646c;
import p035e1.InterfaceC0674q;
import p137s.C3083l;
import p162v1.AbstractC3498f;
import p162v1.C3508i0;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h0.b */
/* loaded from: classes.dex */
public final class C1728b extends AbstractC1742p implements InterfaceC1739m {

    /* renamed from: C */
    public C1738l f10584C;

    /* renamed from: D */
    public C1740n f10585D;

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        C1738l c1738l = this.f10584C;
        if (c1738l != null) {
            mo2782l0();
            C0068q2 c0068q2 = c1738l.f10620h;
            C1740n c1740n = (C1740n) ((LinkedHashMap) c0068q2.f344f).get(this);
            if (c1740n != null) {
                c1740n.m2794c();
                LinkedHashMap linkedHashMap = (LinkedHashMap) c0068q2.f344f;
                C1740n c1740n2 = (C1740n) linkedHashMap.get(this);
                if (c1740n2 != null) {
                }
                linkedHashMap.remove(this);
                c1738l.f10619g.add(c1740n);
            }
        }
    }

    @Override // p056h0.AbstractC1742p
    /* renamed from: K0 */
    public final void mo2783K0(C3083l c3083l, long j6, float f7) {
        C1738l c1738l = this.f10584C;
        if (c1738l == null) {
            c1738l = AbstractC1746t.m2798a(AbstractC1746t.m2799b((View) AbstractC3498f.m5369i(this, AndroidCompositionLocals_androidKt.f790f)));
            this.f10584C = c1738l;
        }
        C1740n m2791a = c1738l.m2791a(this);
        int m5794D = AbstractC3784a.m5794D(f7);
        long mo1461a = this.f10635v.mo1461a();
        this.f10636w.mo52a();
        m2791a.m2793b(c3083l, this.f10633t, j6, m5794D, mo1461a, 0.1f, new C0053n(9, this));
        this.f10585D = m2791a;
        AbstractC3498f.m5373m(this);
    }

    @Override // p056h0.AbstractC1742p
    /* renamed from: L0 */
    public final void mo2784L0(C3508i0 c3508i0) {
        InterfaceC0674q m106u = c3508i0.f16933e.f10182f.m106u();
        C1740n c1740n = this.f10585D;
        if (c1740n != null) {
            long j6 = this.f10639z;
            long mo1461a = this.f10635v.mo1461a();
            this.f10636w.mo52a();
            c1740n.m2796e(j6, mo1461a, 0.1f);
            c1740n.draw(AbstractC0646c.m1349a(m106u));
        }
    }

    @Override // p056h0.AbstractC1742p
    /* renamed from: N0 */
    public final void mo2785N0(C3083l c3083l) {
        C1740n c1740n = this.f10585D;
        if (c1740n != null) {
            c1740n.m2795d();
        }
    }

    @Override // p056h0.InterfaceC1739m
    /* renamed from: l0 */
    public final void mo2782l0() {
        this.f10585D = null;
        AbstractC3498f.m5373m(this);
    }
}
