package p107o;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import androidx.compose.p007ui.input.pointer.SuspendPointerInputElement;
import p001a0.C0005b;
import p027d1.C0464b;
import p027d1.C0467e;
import p035e1.AbstractC0659i0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p067i4.AbstractC2072e;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p085l0.C2361g1;
import p085l0.C2413u0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p117p1.C2845b0;
import p117p1.C2867r;
import p122q.C2926m1;
import p122q.C2929n1;
import p140s2.C3107q;
import p174w5.AbstractC3784a;
import p177x0.C3807o;
import p177x0.InterfaceC3810r;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.g */
/* loaded from: classes.dex */
public final class C2740g implements InterfaceC2739f1 {

    /* renamed from: e */
    public C0464b f14656e;

    /* renamed from: f */
    public final C2726b0 f14657f;

    /* renamed from: g */
    public final C2361g1 f14658g;

    /* renamed from: h */
    public final boolean f14659h;

    /* renamed from: i */
    public boolean f14660i;

    /* renamed from: j */
    public long f14661j;

    /* renamed from: k */
    public C2867r f14662k;

    /* renamed from: l */
    public final InterfaceC3810r f14663l;

    public C2740g(Context context, C2733d1 c2733d1) {
        InterfaceC3810r mo5829e;
        C2723a0 c2723a0;
        C2726b0 c2726b0 = new C2726b0(context, AbstractC0659i0.m1426z(c2733d1.f14624a));
        this.f14657f = c2726b0;
        C2413u0 c2413u0 = C2413u0.f13572g;
        C1694m c1694m = C1694m.f10482a;
        this.f14658g = new C2361g1(c1694m, c2413u0);
        this.f14659h = true;
        this.f14661j = 0L;
        mo5829e = C3807o.f17991a.mo5829e(new SuspendPointerInputElement(c1694m, null, new C2845b0(new C2722a(this, null, 3)), 6));
        if (Build.VERSION.SDK_INT >= 31) {
            c2723a0 = new C2723a0(this, c2726b0);
        } else {
            c2723a0 = new C2723a0(this, c2726b0, c2733d1);
        }
        this.f14663l = mo5829e.mo5829e(c2723a0);
    }

    /* renamed from: a */
    public final void m4402a() {
        boolean z7;
        C2726b0 c2726b0 = this.f14657f;
        EdgeEffect edgeEffect = c2726b0.f14604d;
        boolean z8 = false;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z7 = edgeEffect.isFinished();
        } else {
            z7 = false;
        }
        EdgeEffect edgeEffect2 = c2726b0.f14605e;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            if (!edgeEffect2.isFinished() && !z7) {
                z7 = false;
            } else {
                z7 = true;
            }
        }
        EdgeEffect edgeEffect3 = c2726b0.f14606f;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            if (!edgeEffect3.isFinished() && !z7) {
                z7 = false;
            } else {
                z7 = true;
            }
        }
        EdgeEffect edgeEffect4 = c2726b0.f14607g;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            if (edgeEffect4.isFinished() || z7) {
                z8 = true;
            }
            z7 = z8;
        }
        if (z7) {
            m4404g();
        }
    }

    @Override // p107o.InterfaceC2739f1
    /* renamed from: b */
    public final boolean mo4391b() {
        float f7;
        float f8;
        float f9;
        float f10;
        C2726b0 c2726b0 = this.f14657f;
        EdgeEffect edgeEffect = c2726b0.f14604d;
        C2743h c2743h = C2743h.f14667a;
        if (edgeEffect != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f10 = c2743h.m4413b(edgeEffect);
            } else {
                f10 = 0.0f;
            }
            if (f10 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect2 = c2726b0.f14605e;
        if (edgeEffect2 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f9 = c2743h.m4413b(edgeEffect2);
            } else {
                f9 = 0.0f;
            }
            if (f9 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect3 = c2726b0.f14606f;
        if (edgeEffect3 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f8 = c2743h.m4413b(edgeEffect3);
            } else {
                f8 = 0.0f;
            }
            if (f8 != 0.0f) {
                return true;
            }
        }
        EdgeEffect edgeEffect4 = c2726b0.f14607g;
        if (edgeEffect4 != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f7 = c2743h.m4413b(edgeEffect4);
            } else {
                f7 = 0.0f;
            }
            if (f7 != 0.0f) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0253 A[ADDED_TO_REGION] */
    @Override // p107o.InterfaceC2739f1
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long mo4392c(long j6, int i7, C0005b c0005b) {
        float m4405h;
        float m4407j;
        long m5797a;
        boolean z7;
        boolean z8;
        EdgeEffect m4387b;
        EdgeEffect m4390e;
        EdgeEffect m4389d;
        boolean z9;
        boolean z10;
        if (C0467e.m1027e(this.f14661j)) {
            c0005b.getClass();
            C2929n1 c2929n1 = (C2929n1) c0005b.f54g;
            return new C0464b(C2929n1.m4588a(c2929n1, c2929n1.f15236h, j6, c2929n1.f15235g)).f1623a;
        }
        boolean z11 = this.f14660i;
        boolean z12 = true;
        C2726b0 c2726b0 = this.f14657f;
        if (!z11) {
            if (C2726b0.m4385g(c2726b0.f14606f)) {
                m4406i(0L);
            }
            if (C2726b0.m4385g(c2726b0.f14607g)) {
                m4407j(0L);
            }
            if (C2726b0.m4385g(c2726b0.f14604d)) {
                m4408k(0L);
            }
            if (C2726b0.m4385g(c2726b0.f14605e)) {
                m4405h(0L);
            }
            this.f14660i = true;
        }
        if (C0464b.m1009e(j6) != 0.0f) {
            if (C2726b0.m4385g(c2726b0.f14604d)) {
                m4405h = m4408k(j6);
                if (!C2726b0.m4385g(c2726b0.f14604d)) {
                    c2726b0.m4390e().onRelease();
                }
            } else if (C2726b0.m4385g(c2726b0.f14605e)) {
                m4405h = m4405h(j6);
                if (!C2726b0.m4385g(c2726b0.f14605e)) {
                    c2726b0.m4387b().onRelease();
                }
            }
            if (C0464b.m1008d(j6) != 0.0f) {
                if (C2726b0.m4385g(c2726b0.f14606f)) {
                    m4407j = m4406i(j6);
                    if (!C2726b0.m4385g(c2726b0.f14606f)) {
                        c2726b0.m4388c().onRelease();
                    }
                } else if (C2726b0.m4385g(c2726b0.f14607g)) {
                    m4407j = m4407j(j6);
                    if (!C2726b0.m4385g(c2726b0.f14607g)) {
                        c2726b0.m4389d().onRelease();
                    }
                }
                m5797a = AbstractC3784a.m5797a(m4407j, m4405h);
                if (!C0464b.m1006b(m5797a, 0L)) {
                    m4404g();
                }
                long m1010f = C0464b.m1010f(j6, m5797a);
                c0005b.getClass();
                C2929n1 c2929n12 = (C2929n1) c0005b.f54g;
                long j7 = new C0464b(C2929n1.m4588a(c2929n12, c2929n12.f15236h, m1010f, c2929n12.f15235g)).f1623a;
                long m1010f2 = C0464b.m1010f(m1010f, j7);
                if (i7 == 1) {
                    if (C0464b.m1008d(m1010f2) > 0.5f) {
                        m4406i(m1010f2);
                    } else if (C0464b.m1008d(m1010f2) < -0.5f) {
                        m4407j(m1010f2);
                    } else {
                        z9 = false;
                        if (C0464b.m1009e(m1010f2) <= 0.5f) {
                            m4408k(m1010f2);
                        } else if (C0464b.m1009e(m1010f2) < -0.5f) {
                            m4405h(m1010f2);
                        } else {
                            z10 = false;
                            if (!z9 || z10) {
                                z7 = true;
                                if (!C2726b0.m4384f(c2726b0.f14606f) && C0464b.m1008d(j6) < 0.0f) {
                                    EdgeEffect m4388c = c2726b0.m4388c();
                                    float m1008d = C0464b.m1008d(j6);
                                    if (m4388c instanceof C2747i0) {
                                        C2747i0 c2747i0 = (C2747i0) m4388c;
                                        float f7 = c2747i0.f14675b + m1008d;
                                        c2747i0.f14675b = f7;
                                        if (Math.abs(f7) > c2747i0.f14674a) {
                                            c2747i0.onRelease();
                                        }
                                    } else {
                                        m4388c.onRelease();
                                    }
                                    z8 = !C2726b0.m4384f(c2726b0.f14606f);
                                } else {
                                    z8 = false;
                                }
                                if (C2726b0.m4384f(c2726b0.f14607g) && C0464b.m1008d(j6) > 0.0f) {
                                    m4389d = c2726b0.m4389d();
                                    float m1008d2 = C0464b.m1008d(j6);
                                    if (!(m4389d instanceof C2747i0)) {
                                        C2747i0 c2747i02 = (C2747i0) m4389d;
                                        float f8 = c2747i02.f14675b + m1008d2;
                                        c2747i02.f14675b = f8;
                                        if (Math.abs(f8) > c2747i02.f14674a) {
                                            c2747i02.onRelease();
                                        }
                                    } else {
                                        m4389d.onRelease();
                                    }
                                    if (z8 && C2726b0.m4384f(c2726b0.f14607g)) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                }
                                if (C2726b0.m4384f(c2726b0.f14604d) && C0464b.m1009e(j6) < 0.0f) {
                                    m4390e = c2726b0.m4390e();
                                    float m1009e = C0464b.m1009e(j6);
                                    if (!(m4390e instanceof C2747i0)) {
                                        C2747i0 c2747i03 = (C2747i0) m4390e;
                                        float f9 = c2747i03.f14675b + m1009e;
                                        c2747i03.f14675b = f9;
                                        if (Math.abs(f9) > c2747i03.f14674a) {
                                            c2747i03.onRelease();
                                        }
                                    } else {
                                        m4390e.onRelease();
                                    }
                                    if (z8 && C2726b0.m4384f(c2726b0.f14604d)) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                }
                                if (C2726b0.m4384f(c2726b0.f14605e) && C0464b.m1009e(j6) > 0.0f) {
                                    m4387b = c2726b0.m4387b();
                                    float m1009e2 = C0464b.m1009e(j6);
                                    if (!(m4387b instanceof C2747i0)) {
                                        C2747i0 c2747i04 = (C2747i0) m4387b;
                                        float f10 = c2747i04.f14675b + m1009e2;
                                        c2747i04.f14675b = f10;
                                        if (Math.abs(f10) > c2747i04.f14674a) {
                                            c2747i04.onRelease();
                                        }
                                    } else {
                                        m4387b.onRelease();
                                    }
                                    if (z8 && C2726b0.m4384f(c2726b0.f14605e)) {
                                        z8 = false;
                                    } else {
                                        z8 = true;
                                    }
                                }
                                if (!z8 && !z7) {
                                    z12 = false;
                                }
                                if (z12) {
                                    m4404g();
                                }
                                return C0464b.m1011g(m5797a, j7);
                            }
                        }
                        z10 = true;
                        if (!z9) {
                        }
                        z7 = true;
                        if (!C2726b0.m4384f(c2726b0.f14606f)) {
                        }
                        z8 = false;
                        if (C2726b0.m4384f(c2726b0.f14607g)) {
                            m4389d = c2726b0.m4389d();
                            float m1008d22 = C0464b.m1008d(j6);
                            if (!(m4389d instanceof C2747i0)) {
                            }
                            if (z8) {
                            }
                            z8 = true;
                        }
                        if (C2726b0.m4384f(c2726b0.f14604d)) {
                            m4390e = c2726b0.m4390e();
                            float m1009e3 = C0464b.m1009e(j6);
                            if (!(m4390e instanceof C2747i0)) {
                            }
                            if (z8) {
                            }
                            z8 = true;
                        }
                        if (C2726b0.m4384f(c2726b0.f14605e)) {
                            m4387b = c2726b0.m4387b();
                            float m1009e22 = C0464b.m1009e(j6);
                            if (!(m4387b instanceof C2747i0)) {
                            }
                            if (z8) {
                            }
                            z8 = true;
                        }
                        if (!z8) {
                            z12 = false;
                        }
                        if (z12) {
                        }
                        return C0464b.m1011g(m5797a, j7);
                    }
                    z9 = true;
                    if (C0464b.m1009e(m1010f2) <= 0.5f) {
                    }
                    z10 = true;
                    if (!z9) {
                    }
                    z7 = true;
                    if (!C2726b0.m4384f(c2726b0.f14606f)) {
                    }
                    z8 = false;
                    if (C2726b0.m4384f(c2726b0.f14607g)) {
                    }
                    if (C2726b0.m4384f(c2726b0.f14604d)) {
                    }
                    if (C2726b0.m4384f(c2726b0.f14605e)) {
                    }
                    if (!z8) {
                    }
                    if (z12) {
                    }
                    return C0464b.m1011g(m5797a, j7);
                }
                z7 = false;
                if (!C2726b0.m4384f(c2726b0.f14606f)) {
                }
                z8 = false;
                if (C2726b0.m4384f(c2726b0.f14607g)) {
                }
                if (C2726b0.m4384f(c2726b0.f14604d)) {
                }
                if (C2726b0.m4384f(c2726b0.f14605e)) {
                }
                if (!z8) {
                }
                if (z12) {
                }
                return C0464b.m1011g(m5797a, j7);
            }
            m4407j = 0.0f;
            m5797a = AbstractC3784a.m5797a(m4407j, m4405h);
            if (!C0464b.m1006b(m5797a, 0L)) {
            }
            long m1010f3 = C0464b.m1010f(j6, m5797a);
            c0005b.getClass();
            C2929n1 c2929n122 = (C2929n1) c0005b.f54g;
            long j72 = new C0464b(C2929n1.m4588a(c2929n122, c2929n122.f15236h, m1010f3, c2929n122.f15235g)).f1623a;
            long m1010f22 = C0464b.m1010f(m1010f3, j72);
            if (i7 == 1) {
            }
            z7 = false;
            if (!C2726b0.m4384f(c2726b0.f14606f)) {
            }
            z8 = false;
            if (C2726b0.m4384f(c2726b0.f14607g)) {
            }
            if (C2726b0.m4384f(c2726b0.f14604d)) {
            }
            if (C2726b0.m4384f(c2726b0.f14605e)) {
            }
            if (!z8) {
            }
            if (z12) {
            }
            return C0464b.m1011g(m5797a, j72);
        }
        m4405h = 0.0f;
        if (C0464b.m1008d(j6) != 0.0f) {
        }
        m4407j = 0.0f;
        m5797a = AbstractC3784a.m5797a(m4407j, m4405h);
        if (!C0464b.m1006b(m5797a, 0L)) {
        }
        long m1010f32 = C0464b.m1010f(j6, m5797a);
        c0005b.getClass();
        C2929n1 c2929n1222 = (C2929n1) c0005b.f54g;
        long j722 = new C0464b(C2929n1.m4588a(c2929n1222, c2929n1222.f15236h, m1010f32, c2929n1222.f15235g)).f1623a;
        long m1010f222 = C0464b.m1010f(m1010f32, j722);
        if (i7 == 1) {
        }
        z7 = false;
        if (!C2726b0.m4384f(c2726b0.f14606f)) {
        }
        z8 = false;
        if (C2726b0.m4384f(c2726b0.f14607g)) {
        }
        if (C2726b0.m4384f(c2726b0.f14604d)) {
        }
        if (C2726b0.m4384f(c2726b0.f14605e)) {
        }
        if (!z8) {
        }
        if (z12) {
        }
        return C0464b.m1011g(m5797a, j722);
    }

    @Override // p107o.InterfaceC2739f1
    /* renamed from: d */
    public final InterfaceC3810r mo4393d() {
        return this.f14663l;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // p107o.InterfaceC2739f1
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo4394e(long j6, C2926m1 c2926m1, InterfaceC2313c interfaceC2313c) {
        C2737f c2737f;
        int i7;
        float f7;
        float f8;
        long m4803d;
        C2740g c2740g;
        long m4803d2;
        if (interfaceC2313c instanceof C2737f) {
            c2737f = (C2737f) interfaceC2313c;
            int i8 = c2737f.f14653l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2737f.f14653l = i8 - Integer.MIN_VALUE;
                Object obj = c2737f.f14651j;
                i7 = c2737f.f14653l;
                C1694m c1694m = C1694m.f10482a;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            m4803d = c2737f.f14650i;
                            c2740g = c2737f.f14649h;
                            AbstractC1793a0.m2972L(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    boolean m1027e = C0467e.m1027e(this.f14661j);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m1027e) {
                        c2737f.f14653l = 1;
                        c2926m1.getClass();
                        C2926m1 c2926m12 = new C2926m1(c2926m1.f15219l, c2737f);
                        c2926m12.f15218k = j6;
                        if (c2926m12.mo29m(c1694m) != enumC2465a) {
                            return c1694m;
                        }
                    } else {
                        float m4801b = C3107q.m4801b(j6);
                        C2726b0 c2726b0 = this.f14657f;
                        if (m4801b > 0.0f && C2726b0.m4385g(c2726b0.f14606f)) {
                            EdgeEffect m4388c = c2726b0.m4388c();
                            int m5794D = AbstractC3784a.m5794D(C3107q.m4801b(j6));
                            if (Build.VERSION.SDK_INT >= 31) {
                                m4388c.onAbsorb(m5794D);
                            } else if (m4388c.isFinished()) {
                                m4388c.onAbsorb(m5794D);
                            }
                            f7 = C3107q.m4801b(j6);
                        } else if (C3107q.m4801b(j6) < 0.0f && C2726b0.m4385g(c2726b0.f14607g)) {
                            EdgeEffect m4389d = c2726b0.m4389d();
                            int i9 = -AbstractC3784a.m5794D(C3107q.m4801b(j6));
                            if (Build.VERSION.SDK_INT >= 31) {
                                m4389d.onAbsorb(i9);
                            } else if (m4389d.isFinished()) {
                                m4389d.onAbsorb(i9);
                            }
                            f7 = C3107q.m4801b(j6);
                        } else {
                            f7 = 0.0f;
                        }
                        if (C3107q.m4802c(j6) > 0.0f && C2726b0.m4385g(c2726b0.f14604d)) {
                            EdgeEffect m4390e = c2726b0.m4390e();
                            int m5794D2 = AbstractC3784a.m5794D(C3107q.m4802c(j6));
                            if (Build.VERSION.SDK_INT >= 31) {
                                m4390e.onAbsorb(m5794D2);
                            } else if (m4390e.isFinished()) {
                                m4390e.onAbsorb(m5794D2);
                            }
                            f8 = C3107q.m4802c(j6);
                        } else if (C3107q.m4802c(j6) < 0.0f && C2726b0.m4385g(c2726b0.f14605e)) {
                            EdgeEffect m4387b = c2726b0.m4387b();
                            int i10 = -AbstractC3784a.m5794D(C3107q.m4802c(j6));
                            if (Build.VERSION.SDK_INT >= 31) {
                                m4387b.onAbsorb(i10);
                            } else if (m4387b.isFinished()) {
                                m4387b.onAbsorb(i10);
                            }
                            f8 = C3107q.m4802c(j6);
                        } else {
                            f8 = 0.0f;
                        }
                        long m3522i = AbstractC2168e.m3522i(f7, f8);
                        if (m3522i != 0) {
                            m4404g();
                        }
                        m4803d = C3107q.m4803d(j6, m3522i);
                        c2737f.f14649h = this;
                        c2737f.f14650i = m4803d;
                        c2737f.f14653l = 2;
                        c2926m1.getClass();
                        C2926m1 c2926m13 = new C2926m1(c2926m1.f15219l, c2737f);
                        c2926m13.f15218k = m4803d;
                        obj = c2926m13.mo29m(c1694m);
                        if (obj != enumC2465a) {
                            c2740g = this;
                        }
                    }
                    return enumC2465a;
                }
                m4803d2 = C3107q.m4803d(m4803d, ((C3107q) obj).f15711a);
                c2740g.f14660i = false;
                C2726b0 c2726b02 = c2740g.f14657f;
                if (C3107q.m4801b(m4803d2) <= 0.0f) {
                    EdgeEffect m4388c2 = c2726b02.m4388c();
                    int m5794D3 = AbstractC3784a.m5794D(C3107q.m4801b(m4803d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        m4388c2.onAbsorb(m5794D3);
                    } else if (m4388c2.isFinished()) {
                        m4388c2.onAbsorb(m5794D3);
                    }
                } else if (C3107q.m4801b(m4803d2) < 0.0f) {
                    EdgeEffect m4389d2 = c2726b02.m4389d();
                    int i11 = -AbstractC3784a.m5794D(C3107q.m4801b(m4803d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        m4389d2.onAbsorb(i11);
                    } else if (m4389d2.isFinished()) {
                        m4389d2.onAbsorb(i11);
                    }
                }
                if (C3107q.m4802c(m4803d2) <= 0.0f) {
                    EdgeEffect m4390e2 = c2726b02.m4390e();
                    int m5794D4 = AbstractC3784a.m5794D(C3107q.m4802c(m4803d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        m4390e2.onAbsorb(m5794D4);
                    } else if (m4390e2.isFinished()) {
                        m4390e2.onAbsorb(m5794D4);
                    }
                } else if (C3107q.m4802c(m4803d2) < 0.0f) {
                    EdgeEffect m4387b2 = c2726b02.m4387b();
                    int i12 = -AbstractC3784a.m5794D(C3107q.m4802c(m4803d2));
                    if (Build.VERSION.SDK_INT >= 31) {
                        m4387b2.onAbsorb(i12);
                    } else if (m4387b2.isFinished()) {
                        m4387b2.onAbsorb(i12);
                    }
                }
                if (m4803d2 != 0) {
                    c2740g.m4404g();
                }
                c2740g.m4402a();
                return c1694m;
            }
        }
        c2737f = new C2737f(this, (AbstractC2583c) interfaceC2313c);
        Object obj2 = c2737f.f14651j;
        i7 = c2737f.f14653l;
        C1694m c1694m2 = C1694m.f10482a;
        if (i7 == 0) {
        }
        m4803d2 = C3107q.m4803d(m4803d, ((C3107q) obj2).f15711a);
        c2740g.f14660i = false;
        C2726b0 c2726b022 = c2740g.f14657f;
        if (C3107q.m4801b(m4803d2) <= 0.0f) {
        }
        if (C3107q.m4802c(m4803d2) <= 0.0f) {
        }
        if (m4803d2 != 0) {
        }
        c2740g.m4402a();
        return c1694m2;
    }

    /* renamed from: f */
    public final long m4403f() {
        long m2990r;
        C0464b c0464b = this.f14656e;
        if (c0464b != null) {
            m2990r = c0464b.f1623a;
        } else {
            m2990r = AbstractC1793a0.m2990r(this.f14661j);
        }
        return AbstractC3784a.m5797a(C0464b.m1008d(m2990r) / C0467e.m1026d(this.f14661j), C0464b.m1009e(m2990r) / C0467e.m1024b(this.f14661j));
    }

    /* renamed from: g */
    public final void m4404g() {
        if (this.f14659h) {
            this.f14658g.setValue(C1694m.f10482a);
        }
    }

    /* renamed from: h */
    public final float m4405h(long j6) {
        float f7;
        float m1008d = C0464b.m1008d(m4403f());
        float m1009e = C0464b.m1009e(j6) / C0467e.m1024b(this.f14661j);
        EdgeEffect m4387b = this.f14657f.m4387b();
        float f8 = -m1009e;
        float f9 = 1 - m1008d;
        int i7 = Build.VERSION.SDK_INT;
        C2743h c2743h = C2743h.f14667a;
        if (i7 >= 31) {
            f8 = c2743h.m4414c(m4387b, f8, f9);
        } else {
            m4387b.onPull(f8, f9);
        }
        float m1024b = C0467e.m1024b(this.f14661j) * (-f8);
        if (i7 >= 31) {
            f7 = c2743h.m4413b(m4387b);
        } else {
            f7 = 0.0f;
        }
        if (f7 == 0.0f) {
            return m1024b;
        }
        return C0464b.m1009e(j6);
    }

    /* renamed from: i */
    public final float m4406i(long j6) {
        float f7;
        float m1009e = C0464b.m1009e(m4403f());
        float m1008d = C0464b.m1008d(j6) / C0467e.m1026d(this.f14661j);
        EdgeEffect m4388c = this.f14657f.m4388c();
        float f8 = 1 - m1009e;
        int i7 = Build.VERSION.SDK_INT;
        C2743h c2743h = C2743h.f14667a;
        if (i7 >= 31) {
            m1008d = c2743h.m4414c(m4388c, m1008d, f8);
        } else {
            m4388c.onPull(m1008d, f8);
        }
        float m1026d = C0467e.m1026d(this.f14661j) * m1008d;
        if (i7 >= 31) {
            f7 = c2743h.m4413b(m4388c);
        } else {
            f7 = 0.0f;
        }
        if (f7 == 0.0f) {
            return m1026d;
        }
        return C0464b.m1008d(j6);
    }

    /* renamed from: j */
    public final float m4407j(long j6) {
        float f7;
        float m1009e = C0464b.m1009e(m4403f());
        float m1008d = C0464b.m1008d(j6) / C0467e.m1026d(this.f14661j);
        EdgeEffect m4389d = this.f14657f.m4389d();
        float f8 = -m1008d;
        int i7 = Build.VERSION.SDK_INT;
        C2743h c2743h = C2743h.f14667a;
        if (i7 >= 31) {
            f8 = c2743h.m4414c(m4389d, f8, m1009e);
        } else {
            m4389d.onPull(f8, m1009e);
        }
        float m1026d = C0467e.m1026d(this.f14661j) * (-f8);
        if (i7 >= 31) {
            f7 = c2743h.m4413b(m4389d);
        } else {
            f7 = 0.0f;
        }
        if (f7 == 0.0f) {
            return m1026d;
        }
        return C0464b.m1008d(j6);
    }

    /* renamed from: k */
    public final float m4408k(long j6) {
        float f7;
        float m1008d = C0464b.m1008d(m4403f());
        float m1009e = C0464b.m1009e(j6) / C0467e.m1024b(this.f14661j);
        EdgeEffect m4390e = this.f14657f.m4390e();
        int i7 = Build.VERSION.SDK_INT;
        C2743h c2743h = C2743h.f14667a;
        if (i7 >= 31) {
            m1009e = c2743h.m4414c(m4390e, m1009e, m1008d);
        } else {
            m4390e.onPull(m1009e, m1008d);
        }
        float m1024b = C0467e.m1024b(this.f14661j) * m1009e;
        if (i7 >= 31) {
            f7 = c2743h.m4413b(m4390e);
        } else {
            f7 = 0.0f;
        }
        if (f7 == 0.0f) {
            return m1024b;
        }
        return C0464b.m1009e(j6);
    }

    /* renamed from: l */
    public final void m4409l(long j6) {
        boolean m1023a = C0467e.m1023a(this.f14661j, 0L);
        boolean m1023a2 = C0467e.m1023a(j6, this.f14661j);
        this.f14661j = j6;
        if (!m1023a2) {
            long m3326b = AbstractC2072e.m3326b(AbstractC3784a.m5794D(C0467e.m1026d(j6)), AbstractC3784a.m5794D(C0467e.m1024b(j6)));
            C2726b0 c2726b0 = this.f14657f;
            c2726b0.f14603c = m3326b;
            EdgeEffect edgeEffect = c2726b0.f14604d;
            if (edgeEffect != null) {
                edgeEffect.setSize((int) (m3326b >> 32), (int) (m3326b & 4294967295L));
            }
            EdgeEffect edgeEffect2 = c2726b0.f14605e;
            if (edgeEffect2 != null) {
                edgeEffect2.setSize((int) (m3326b >> 32), (int) (m3326b & 4294967295L));
            }
            EdgeEffect edgeEffect3 = c2726b0.f14606f;
            if (edgeEffect3 != null) {
                edgeEffect3.setSize((int) (m3326b & 4294967295L), (int) (m3326b >> 32));
            }
            EdgeEffect edgeEffect4 = c2726b0.f14607g;
            if (edgeEffect4 != null) {
                edgeEffect4.setSize((int) (m3326b & 4294967295L), (int) (m3326b >> 32));
            }
            EdgeEffect edgeEffect5 = c2726b0.f14608h;
            if (edgeEffect5 != null) {
                edgeEffect5.setSize((int) (m3326b >> 32), (int) (m3326b & 4294967295L));
            }
            EdgeEffect edgeEffect6 = c2726b0.f14609i;
            if (edgeEffect6 != null) {
                edgeEffect6.setSize((int) (m3326b >> 32), (int) (m3326b & 4294967295L));
            }
            EdgeEffect edgeEffect7 = c2726b0.f14610j;
            if (edgeEffect7 != null) {
                edgeEffect7.setSize((int) (m3326b & 4294967295L), (int) (m3326b >> 32));
            }
            EdgeEffect edgeEffect8 = c2726b0.f14611k;
            if (edgeEffect8 != null) {
                edgeEffect8.setSize((int) (m3326b & 4294967295L), (int) (m3326b >> 32));
            }
        }
        if (!m1023a && !m1023a2) {
            m4404g();
            m4402a();
        }
    }
}
