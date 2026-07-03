package p161v0;

import p001a0.C0031h1;
import p150t5.InterfaceC3279c;
import p153u0.C3343j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.f */
/* loaded from: classes.dex */
public abstract class AbstractC3459f {

    /* renamed from: a */
    public C3463j f16700a;

    /* renamed from: b */
    public long f16701b;

    /* renamed from: c */
    public boolean f16702c;

    /* renamed from: d */
    public int f16703d;

    public AbstractC3459f(long j6, C3463j c3463j) {
        int i7;
        int numberOfTrailingZeros;
        this.f16700a = c3463j;
        this.f16701b = j6;
        C3343j c3343j = AbstractC3465l.f16719a;
        if (j6 != 0) {
            C3463j mo5220d = mo5220d();
            long j7 = mo5220d.f16714g;
            long[] jArr = mo5220d.f16715h;
            if (jArr != null) {
                j6 = jArr[0];
            } else {
                long j8 = mo5220d.f16713f;
                if (j8 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j8);
                } else {
                    long j9 = mo5220d.f16712e;
                    if (j9 != 0) {
                        j7 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j9);
                    }
                }
                j6 = numberOfTrailingZeros + j7;
            }
            synchronized (AbstractC3465l.f16721c) {
                i7 = AbstractC3465l.f16724f.m5195a(j6);
            }
        } else {
            i7 = -1;
        }
        this.f16703d = i7;
    }

    /* renamed from: q */
    public static void m5225q(AbstractC3459f abstractC3459f) {
        AbstractC3465l.f16720b.m82F(abstractC3459f);
    }

    /* renamed from: a */
    public final void m5226a() {
        synchronized (AbstractC3465l.f16721c) {
            mo5206b();
            mo5212p();
        }
    }

    /* renamed from: b */
    public void mo5206b() {
        AbstractC3465l.f16722d = AbstractC3465l.f16722d.m5230b(mo5221g());
    }

    /* renamed from: c */
    public abstract void mo5198c();

    /* renamed from: d */
    public C3463j mo5220d() {
        return this.f16700a;
    }

    /* renamed from: e */
    public abstract InterfaceC3279c mo5207e();

    /* renamed from: f */
    public abstract boolean mo5208f();

    /* renamed from: g */
    public long mo5221g() {
        return this.f16701b;
    }

    /* renamed from: h */
    public int mo5209h() {
        return 0;
    }

    /* renamed from: i */
    public abstract InterfaceC3279c mo5210i();

    /* renamed from: j */
    public final AbstractC3459f m5227j() {
        C0031h1 c0031h1 = AbstractC3465l.f16720b;
        AbstractC3459f abstractC3459f = (AbstractC3459f) c0031h1.m105t();
        c0031h1.m82F(this);
        return abstractC3459f;
    }

    /* renamed from: k */
    public abstract void mo5199k();

    /* renamed from: l */
    public abstract void mo5200l();

    /* renamed from: m */
    public abstract void mo5201m();

    /* renamed from: n */
    public abstract void mo5211n(InterfaceC3478y interfaceC3478y);

    /* renamed from: o */
    public final void m5228o() {
        int i7 = this.f16703d;
        if (i7 >= 0) {
            AbstractC3465l.m5254u(i7);
            this.f16703d = -1;
        }
    }

    /* renamed from: p */
    public void mo5212p() {
        m5228o();
    }

    /* renamed from: r */
    public void mo5222r(C3463j c3463j) {
        this.f16700a = c3463j;
    }

    /* renamed from: s */
    public void mo5223s(long j6) {
        this.f16701b = j6;
    }

    /* renamed from: t */
    public void mo5213t(int i7) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    /* renamed from: u */
    public abstract AbstractC3459f mo5202u(InterfaceC3279c interfaceC3279c);
}
