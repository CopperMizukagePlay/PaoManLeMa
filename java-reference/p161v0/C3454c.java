package p161v0;

import java.util.Arrays;
import java.util.HashMap;
import p077k.C2196i0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.c */
/* loaded from: classes.dex */
public final class C3454c extends C3452b {

    /* renamed from: o */
    public final C3452b f16683o;

    /* renamed from: p */
    public boolean f16684p;

    public C3454c(long j6, C3463j c3463j, InterfaceC3279c interfaceC3279c, InterfaceC3279c interfaceC3279c2, C3452b c3452b) {
        super(j6, c3463j, interfaceC3279c, interfaceC3279c2);
        this.f16683o = c3452b;
        c3452b.mo5199k();
    }

    @Override // p161v0.C3452b, p161v0.AbstractC3459f
    /* renamed from: c */
    public final void mo5198c() {
        if (!this.f16702c) {
            super.mo5198c();
            if (!this.f16684p) {
                this.f16684p = true;
                this.f16683o.mo5200l();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, v0.q] */
    @Override // p161v0.C3452b
    /* renamed from: w */
    public final AbstractC3470q mo5203w() {
        HashMap hashMap;
        C3454c c3454c;
        C3452b c3452b = this.f16683o;
        if (!c3452b.f16678m && !c3452b.f16702c) {
            C2196i0 c2196i0 = this.f16673h;
            long j6 = this.f16701b;
            if (c2196i0 != null) {
                hashMap = AbstractC3465l.m5236c(c3452b.mo5221g(), this, this.f16683o.mo5220d());
            } else {
                hashMap = null;
            }
            Object obj = AbstractC3465l.f16721c;
            synchronized (obj) {
                try {
                    AbstractC3465l.m5237d(this);
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (c2196i0 == null || c2196i0.f12687d == 0) {
                        c3454c = this;
                        m5226a();
                    } else {
                        c3454c = this;
                        AbstractC3470q m5217z = c3454c.m5217z(this.f16683o.mo5221g(), c2196i0, hashMap, this.f16683o.mo5220d());
                        if (!m5217z.equals(C3461h.f16704c)) {
                            return m5217z;
                        }
                        C2196i0 mo5215x = c3454c.f16683o.mo5215x();
                        if (mo5215x != null) {
                            mo5215x.m3608j(c2196i0);
                        } else {
                            c3454c.f16683o.mo5205B(c2196i0);
                            c3454c.f16673h = null;
                        }
                    }
                    if (AbstractC3367j.m5102g(c3454c.f16683o.mo5221g(), j6) < 0) {
                        c3454c.f16683o.m5214v();
                    }
                    C3452b c3452b2 = c3454c.f16683o;
                    c3452b2.mo5222r(c3452b2.mo5220d().m5230b(j6).m5229a(c3454c.f16675j));
                    c3454c.f16683o.m5204A(j6);
                    C3452b c3452b3 = c3454c.f16683o;
                    int i7 = c3454c.f16703d;
                    c3454c.f16703d = -1;
                    if (i7 >= 0) {
                        int[] iArr = c3452b3.f16676k;
                        AbstractC3367j.m5100e(iArr, "<this>");
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i7;
                        c3452b3.f16676k = copyOf;
                    } else {
                        c3452b3.getClass();
                    }
                    C3452b c3452b4 = c3454c.f16683o;
                    C3463j c3463j = c3454c.f16675j;
                    c3452b4.getClass();
                    synchronized (obj) {
                        c3452b4.f16675j = c3452b4.f16675j.m5232d(c3463j);
                        C3452b c3452b5 = c3454c.f16683o;
                        int[] iArr2 = c3454c.f16676k;
                        c3452b5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = c3452b5.f16676k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                AbstractC3367j.m5097b(copyOf2);
                                iArr2 = copyOf2;
                            }
                            c3452b5.f16676k = iArr2;
                        }
                    }
                    c3454c.f16678m = true;
                    if (!c3454c.f16684p) {
                        c3454c.f16684p = true;
                        c3454c.f16683o.mo5200l();
                    }
                    return C3461h.f16704c;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        return new Object();
    }
}
