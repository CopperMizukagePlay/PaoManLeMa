package p051g3;

import android.graphics.Rect;
import java.util.List;
import p012b3.C0274b;
import p159u6.AbstractC3393k;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.l0 */
/* loaded from: classes.dex */
public abstract class AbstractC1644l0 {

    /* renamed from: a */
    public final C1672z0 f10395a;

    /* renamed from: b */
    public C0274b[] f10396b;

    /* renamed from: c */
    public final Rect[][] f10397c;

    /* renamed from: d */
    public final Rect[][] f10398d;

    public AbstractC1644l0() {
        this(new C1672z0((C1672z0) null));
    }

    /* renamed from: a */
    public final void m2652a() {
        C0274b[] c0274bArr = this.f10396b;
        if (c0274bArr != null) {
            C0274b c0274b = c0274bArr[0];
            C0274b c0274b2 = c0274bArr[1];
            C1672z0 c1672z0 = this.f10395a;
            if (c0274b2 == null) {
                c0274b2 = c1672z0.f10450a.mo2671i(2);
            }
            if (c0274b == null) {
                c0274b = c1672z0.f10450a.mo2671i(1);
            }
            mo2643h(C0274b.m580a(c0274b, c0274b2));
            C0274b c0274b3 = this.f10396b[AbstractC3393k.m5152w(16)];
            if (c0274b3 != null) {
                mo2646g(c0274b3);
            }
            C0274b c0274b4 = this.f10396b[AbstractC3393k.m5152w(32)];
            if (c0274b4 != null) {
                mo2645e(c0274b4);
            }
            C0274b c0274b5 = this.f10396b[AbstractC3393k.m5152w(64)];
            if (c0274b5 != null) {
                mo2647i(c0274b5);
            }
        }
    }

    /* renamed from: b */
    public abstract C1672z0 mo2641b();

    /* renamed from: c */
    public void mo2649c(C1672z0 c1672z0) {
        for (int i7 = 1; i7 <= 512; i7 <<= 1) {
            List<Rect> mo2669f = c1672z0.f10450a.mo2669f(i7);
            int m5152w = AbstractC3393k.m5152w(i7);
            this.f10397c[m5152w] = (Rect[]) mo2669f.toArray(new Rect[mo2669f.size()]);
            if (i7 != 8) {
                List<Rect> mo2670g = c1672z0.f10450a.mo2670g(i7);
                this.f10398d[m5152w] = (Rect[]) mo2670g.toArray(new Rect[mo2670g.size()]);
            }
        }
    }

    /* renamed from: d */
    public void mo2648d(int i7, C0274b c0274b) {
        if (this.f10396b == null) {
            this.f10396b = new C0274b[10];
        }
        for (int i8 = 1; i8 <= 512; i8 <<= 1) {
            if ((i7 & i8) != 0) {
                this.f10396b[AbstractC3393k.m5152w(i8)] = c0274b;
            }
        }
    }

    /* renamed from: f */
    public abstract void mo2642f(C0274b c0274b);

    /* renamed from: h */
    public abstract void mo2643h(C0274b c0274b);

    public AbstractC1644l0(C1672z0 c1672z0) {
        this.f10397c = new Rect[10];
        this.f10398d = new Rect[10];
        this.f10395a = c1672z0;
        mo2649c(c1672z0);
    }

    /* renamed from: e */
    public void mo2645e(C0274b c0274b) {
    }

    /* renamed from: g */
    public void mo2646g(C0274b c0274b) {
    }

    /* renamed from: i */
    public void mo2647i(C0274b c0274b) {
    }
}
