package p146t1;

import p027d1.C0464b;
import p027d1.C0465c;
import p065i2.AbstractC2064e;
import p139s1.AbstractC3088a;
import p140s2.C3100j;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3529p0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.j0 */
/* loaded from: classes.dex */
public final class C3211j0 implements InterfaceC3238v {

    /* renamed from: e */
    public final AbstractC3529p0 f15983e;

    public C3211j0(AbstractC3529p0 abstractC3529p0) {
        this.f15983e = abstractC3529p0;
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: C */
    public final long mo4922C(long j6) {
        return C0464b.m1011g(this.f15983e.f16985s.mo4922C(j6), m4929a());
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: M */
    public final boolean mo4923M() {
        return this.f15983e.f16985s.mo5333V0().f18005r;
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: N */
    public final void mo4924N(float[] fArr) {
        this.f15983e.f16985s.mo4924N(fArr);
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: O */
    public final void mo4925O(InterfaceC3238v interfaceC3238v, float[] fArr) {
        this.f15983e.f16985s.mo4925O(interfaceC3238v, fArr);
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: S */
    public final long mo4926S() {
        AbstractC3529p0 abstractC3529p0 = this.f15983e;
        return (abstractC3529p0.f16053e << 32) | (abstractC3529p0.f16054f & 4294967295L);
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: U */
    public final long mo4927U(long j6) {
        return this.f15983e.f16985s.mo4927U(C0464b.m1011g(j6, m4929a()));
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: X */
    public final long mo4928X(InterfaceC3238v interfaceC3238v, long j6) {
        return m4930b(interfaceC3238v, j6);
    }

    /* renamed from: a */
    public final long m4929a() {
        AbstractC3529p0 abstractC3529p0 = this.f15983e;
        AbstractC3529p0 m4898i = AbstractC3191c1.m4898i(abstractC3529p0);
        return C0464b.m1010f(m4930b(m4898i.f16988v, 0L), abstractC3529p0.f16985s.m5342e1(m4898i.f16985s, 0L));
    }

    /* renamed from: b */
    public final long m4930b(InterfaceC3238v interfaceC3238v, long j6) {
        boolean z7 = interfaceC3238v instanceof C3211j0;
        AbstractC3529p0 abstractC3529p0 = this.f15983e;
        if (z7) {
            AbstractC3529p0 abstractC3529p02 = ((C3211j0) interfaceC3238v).f15983e;
            AbstractC3497e1 abstractC3497e1 = abstractC3529p02.f16985s;
            abstractC3497e1.m5343f1();
            AbstractC3529p0 mo5331T0 = abstractC3529p0.f16985s.m5329R0(abstractC3497e1).mo5331T0();
            if (mo5331T0 != null) {
                long m4784b = C3100j.m4784b(C3100j.m4785c(abstractC3529p02.m5497N0(mo5331T0, false), AbstractC2064e.m3225F(j6)), abstractC3529p0.m5497N0(mo5331T0, false));
                return (Float.floatToRawIntBits((int) (m4784b >> 32)) << 32) | (Float.floatToRawIntBits((int) (m4784b & 4294967295L)) & 4294967295L);
            }
            AbstractC3529p0 m4898i = AbstractC3191c1.m4898i(abstractC3529p02);
            long m4785c = C3100j.m4785c(C3100j.m4785c(abstractC3529p02.m5497N0(m4898i, false), m4898i.f16986t), AbstractC2064e.m3225F(j6));
            AbstractC3529p0 m4898i2 = AbstractC3191c1.m4898i(abstractC3529p0);
            long m4784b2 = C3100j.m4784b(m4785c, C3100j.m4785c(abstractC3529p0.m5497N0(m4898i2, false), m4898i2.f16986t));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (m4784b2 >> 32));
            long floatToRawIntBits2 = Float.floatToRawIntBits((int) (m4784b2 & 4294967295L)) & 4294967295L;
            AbstractC3497e1 abstractC3497e12 = m4898i2.f16985s.f16849u;
            AbstractC3367j.m5097b(abstractC3497e12);
            AbstractC3497e1 abstractC3497e13 = m4898i.f16985s.f16849u;
            AbstractC3367j.m5097b(abstractC3497e13);
            return abstractC3497e12.m5342e1(abstractC3497e13, floatToRawIntBits2 | (floatToRawIntBits << 32));
        }
        AbstractC3529p0 m4898i3 = AbstractC3191c1.m4898i(abstractC3529p0);
        AbstractC3497e1 abstractC3497e14 = m4898i3.f16985s;
        long m4930b = m4930b(m4898i3.f16988v, j6);
        long j7 = m4898i3.f16986t;
        long m1010f = C0464b.m1010f(m4930b, (4294967295L & Float.floatToRawIntBits((int) (j7 & 4294967295L))) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32));
        if (!abstractC3497e14.mo5333V0().f18005r) {
            AbstractC3088a.m4750b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        abstractC3497e14.m5343f1();
        AbstractC3497e1 abstractC3497e15 = abstractC3497e14.f16849u;
        if (abstractC3497e15 != null) {
            abstractC3497e14 = abstractC3497e15;
        }
        return C0464b.m1011g(m1010f, abstractC3497e14.m5342e1(interfaceC3238v, 0L));
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: d */
    public final long mo4931d(long j6) {
        return this.f15983e.f16985s.mo4931d(C0464b.m1011g(0L, m4929a()));
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: g */
    public final long mo4932g(long j6) {
        return C0464b.m1011g(this.f15983e.f16985s.mo4932g(j6), m4929a());
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: h */
    public final long mo4933h(long j6) {
        return this.f15983e.f16985s.mo4933h(C0464b.m1011g(j6, m4929a()));
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: j */
    public final C0465c mo4934j(InterfaceC3238v interfaceC3238v, boolean z7) {
        return this.f15983e.f16985s.mo4934j(interfaceC3238v, z7);
    }

    @Override // p146t1.InterfaceC3238v
    /* renamed from: o */
    public final InterfaceC3238v mo4935o() {
        AbstractC3529p0 mo5331T0;
        if (!mo4923M()) {
            AbstractC3088a.m4750b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        AbstractC3497e1 abstractC3497e1 = this.f15983e.f16985s.f16847s.f16872I.f16800d.f16849u;
        if (abstractC3497e1 != null && (mo5331T0 = abstractC3497e1.mo5331T0()) != null) {
            return mo5331T0.f16988v;
        }
        return null;
    }
}
