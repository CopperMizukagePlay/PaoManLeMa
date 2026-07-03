package p146t1;

import p057h1.C1752b;
import p073j2.AbstractC2168e;
import p140s2.C3091a;
import p140s2.C3102l;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.v0 */
/* loaded from: classes.dex */
public abstract class AbstractC3239v0 {

    /* renamed from: e */
    public int f16053e;

    /* renamed from: f */
    public int f16054f;

    /* renamed from: g */
    public long f16055g;

    /* renamed from: h */
    public long f16056h = AbstractC3243x0.f16062a;

    /* renamed from: i */
    public long f16057i = 0;

    public AbstractC3239v0() {
        long j6 = 0;
        this.f16055g = (j6 & 4294967295L) | (j6 << 32);
    }

    /* renamed from: h0 */
    public abstract int mo4939h0(C3216l c3216l);

    /* renamed from: i0 */
    public int mo4955i0() {
        return (int) (this.f16055g & 4294967295L);
    }

    /* renamed from: k0 */
    public int mo4956k0() {
        return (int) (this.f16055g >> 32);
    }

    /* renamed from: l0 */
    public final void m4957l0() {
        this.f16053e = AbstractC2168e.m3530q((int) (this.f16055g >> 32), C3091a.m4762j(this.f16056h), C3091a.m4760h(this.f16056h));
        this.f16054f = AbstractC2168e.m3530q((int) (this.f16055g & 4294967295L), C3091a.m4761i(this.f16056h), C3091a.m4759g(this.f16056h));
        int i7 = this.f16053e;
        long j6 = this.f16055g;
        this.f16057i = (((i7 - ((int) (j6 >> 32))) / 2) << 32) | (4294967295L & ((r0 - ((int) (j6 & 4294967295L))) / 2));
    }

    /* renamed from: m0 */
    public void mo4958m0(long j6, float f7, C1752b c1752b) {
        mo4940o0(j6, f7, null);
    }

    /* renamed from: n */
    public Object mo4921n() {
        return null;
    }

    /* renamed from: o0 */
    public abstract void mo4940o0(long j6, float f7, InterfaceC3279c interfaceC3279c);

    /* renamed from: p0 */
    public final void m4959p0(long j6) {
        if (!C3102l.m4790a(this.f16055g, j6)) {
            this.f16055g = j6;
            m4957l0();
        }
    }

    /* renamed from: q0 */
    public final void m4960q0(long j6) {
        if (!C3091a.m4754b(this.f16056h, j6)) {
            this.f16056h = j6;
            m4957l0();
        }
    }
}
