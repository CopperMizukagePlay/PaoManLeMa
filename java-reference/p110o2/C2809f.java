package p110o2;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;
import p023c5.C0427s;
import p027d1.C0467e;
import p035e1.AbstractC0659i0;
import p035e1.AbstractC0663k0;
import p035e1.AbstractC0670o;
import p035e1.C0665l0;
import p035e1.C0671o0;
import p035e1.C0677s;
import p049g1.AbstractC1571e;
import p049g1.C1573g;
import p049g1.C1574h;
import p066i3.AbstractC2067b;
import p085l0.AbstractC2418w;
import p085l0.C2352e0;
import p132r2.C3038l;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o2.f */
/* loaded from: classes.dex */
public final class C2809f extends TextPaint {

    /* renamed from: a */
    public C0427s f14846a;

    /* renamed from: b */
    public C3038l f14847b;

    /* renamed from: c */
    public int f14848c;

    /* renamed from: d */
    public C0665l0 f14849d;

    /* renamed from: e */
    public C0677s f14850e;

    /* renamed from: f */
    public AbstractC0670o f14851f;

    /* renamed from: g */
    public C2352e0 f14852g;

    /* renamed from: h */
    public C0467e f14853h;

    /* renamed from: i */
    public AbstractC1571e f14854i;

    /* renamed from: a */
    public final C0427s m4435a() {
        C0427s c0427s = this.f14846a;
        if (c0427s != null) {
            return c0427s;
        }
        C0427s c0427s2 = new C0427s(this);
        this.f14846a = c0427s2;
        return c0427s2;
    }

    /* renamed from: b */
    public final void m4436b(int i7) {
        if (i7 == this.f14848c) {
            return;
        }
        m4435a().m909h(i7);
        this.f14848c = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
    
        if (r1 == false) goto L19;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4437c(final AbstractC0670o abstractC0670o, final long j6, float f7) {
        Shader shader;
        boolean m1023a;
        if (abstractC0670o == null) {
            this.f14852g = null;
            this.f14851f = null;
            this.f14853h = null;
            setShader(null);
            return;
        }
        if (abstractC0670o instanceof C0671o0) {
            m4438d(AbstractC2067b.m3294s(f7, ((C0671o0) abstractC0670o).f2197a));
            return;
        }
        if (abstractC0670o instanceof AbstractC0663k0) {
            boolean z7 = false;
            if (AbstractC3367j.m5096a(this.f14851f, abstractC0670o)) {
                C0467e c0467e = this.f14853h;
                if (c0467e == null) {
                    m1023a = false;
                } else {
                    m1023a = C0467e.m1023a(c0467e.f1637a, j6);
                }
            }
            if (j6 != 9205357640488583168L) {
                z7 = true;
            }
            if (z7) {
                this.f14851f = abstractC0670o;
                this.f14853h = new C0467e(j6);
                this.f14852g = AbstractC2418w.m3974q(new InterfaceC3277a() { // from class: o2.e
                    @Override // p150t5.InterfaceC3277a
                    /* renamed from: a */
                    public final Object mo52a() {
                        return ((AbstractC0663k0) AbstractC0670o.this).mo1348b(j6);
                    }
                });
            }
            C0427s m4435a = m4435a();
            C2352e0 c2352e0 = this.f14852g;
            if (c2352e0 != null) {
                shader = (Shader) c2352e0.getValue();
            } else {
                shader = null;
            }
            m4435a.m913l(shader);
            this.f14850e = null;
            AbstractC2814k.m4443b(this, f7);
            return;
        }
        throw new RuntimeException();
    }

    /* renamed from: d */
    public final void m4438d(long j6) {
        boolean m1454c;
        C0677s c0677s = this.f14850e;
        boolean z7 = false;
        if (c0677s == null) {
            m1454c = false;
        } else {
            m1454c = C0677s.m1454c(c0677s.f2211a, j6);
        }
        if (!m1454c) {
            if (j6 != 16) {
                z7 = true;
            }
            if (z7) {
                this.f14850e = new C0677s(j6);
                setColor(AbstractC0659i0.m1426z(j6));
                this.f14852g = null;
                this.f14851f = null;
                this.f14853h = null;
                setShader(null);
            }
        }
    }

    /* renamed from: e */
    public final void m4439e(AbstractC1571e abstractC1571e) {
        if (abstractC1571e != null && !AbstractC3367j.m5096a(this.f14854i, abstractC1571e)) {
            this.f14854i = abstractC1571e;
            if (abstractC1571e.equals(C1573g.f10187a)) {
                setStyle(Paint.Style.FILL);
                return;
            }
            if (abstractC1571e instanceof C1574h) {
                m4435a().m917p(1);
                C1574h c1574h = (C1574h) abstractC1571e;
                m4435a().m916o(c1574h.f10188a);
                C0427s m4435a = m4435a();
                ((Paint) m4435a.f1462g).setStrokeMiter(c1574h.f10189b);
                m4435a().m915n(c1574h.f10191d);
                m4435a().m914m(c1574h.f10190c);
                ((Paint) m4435a().f1462g).setPathEffect(null);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* renamed from: f */
    public final void m4440f(C0665l0 c0665l0) {
        if (c0665l0 != null && !AbstractC3367j.m5096a(this.f14849d, c0665l0)) {
            this.f14849d = c0665l0;
            if (c0665l0.equals(C0665l0.f2176d)) {
                clearShadowLayer();
                return;
            }
            C0665l0 c0665l02 = this.f14849d;
            float f7 = c0665l02.f2179c;
            if (f7 == 0.0f) {
                f7 = Float.MIN_VALUE;
            }
            setShadowLayer(f7, Float.intBitsToFloat((int) (c0665l02.f2178b >> 32)), Float.intBitsToFloat((int) (this.f14849d.f2178b & 4294967295L)), AbstractC0659i0.m1426z(this.f14849d.f2177a));
        }
    }

    /* renamed from: g */
    public final void m4441g(C3038l c3038l) {
        boolean z7;
        if (c3038l != null && !AbstractC3367j.m5096a(this.f14847b, c3038l)) {
            this.f14847b = c3038l;
            int i7 = c3038l.f15607a;
            boolean z8 = false;
            if ((i7 | 1) == i7) {
                z7 = true;
            } else {
                z7 = false;
            }
            setUnderlineText(z7);
            int i8 = this.f14847b.f15607a;
            if ((i8 | 2) == i8) {
                z8 = true;
            }
            setStrikeThruText(z8);
        }
    }
}
