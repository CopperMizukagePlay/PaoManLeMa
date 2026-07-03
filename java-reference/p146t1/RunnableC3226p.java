package p146t1;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.compose.p007ui.layout.AbstractC0173b;
import java.util.Collections;
import java.util.List;
import p001a0.C0068q2;
import p012b3.C0274b;
import p021c3.AbstractC0390a;
import p051g3.AbstractC1625c0;
import p051g3.AbstractC1643l;
import p051g3.AbstractC1653q;
import p051g3.AbstractC1661u;
import p051g3.C1624c;
import p051g3.C1628d0;
import p051g3.C1672z0;
import p051g3.InterfaceC1631f;
import p077k.C2184c0;
import p077k.C2194h0;
import p077k.C2196i0;
import p077k.C2221w;
import p085l0.AbstractC2418w;
import p085l0.C2349d1;
import p085l0.InterfaceC2425y0;
import p158u5.AbstractC3367j;
import p161v0.AbstractC3465l;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t1.p */
/* loaded from: classes.dex */
public final class RunnableC3226p extends AbstractC1661u implements Runnable, InterfaceC1631f, View.OnAttachStateChangeListener {

    /* renamed from: g */
    public boolean f16024g;

    /* renamed from: h */
    public int f16025h;

    /* renamed from: i */
    public C1672z0 f16026i;

    /* renamed from: j */
    public final C2194h0 f16027j;

    /* renamed from: k */
    public final C2349d1 f16028k;

    /* renamed from: l */
    public final C2184c0 f16029l;

    /* renamed from: m */
    public final C3469p f16030m;

    public RunnableC3226p() {
        super(1);
        C2194h0 c2194h0 = new C2194h0(9);
        InterfaceC3215k1.f15995a.getClass();
        c2194h0.m3598m(C3212j1.f15985b, new C3221m1("caption bar"));
        c2194h0.m3598m(C3212j1.f15986c, new C3221m1("display cutout"));
        c2194h0.m3598m(C3212j1.f15987d, new C3221m1("ime"));
        c2194h0.m3598m(C3212j1.f15988e, new C3221m1("mandatory system gestures"));
        c2194h0.m3598m(C3212j1.f15989f, new C3221m1("navigation bars"));
        c2194h0.m3598m(C3212j1.f15990g, new C3221m1("status bars"));
        c2194h0.m3598m(C3212j1.f15991h, new C3221m1("system gestures"));
        c2194h0.m3598m(C3212j1.f15992i, new C3221m1("tappable element"));
        c2194h0.m3598m(C3212j1.f15993j, new C3221m1("waterfall"));
        this.f16027j = c2194h0;
        this.f16028k = new C2349d1(0);
        this.f16029l = new C2184c0(4);
        this.f16030m = new C3469p();
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: a */
    public final void mo2710a(C1628d0 c1628d0) {
        boolean z7 = false;
        this.f16024g = false;
        int mo2636d = c1628d0.f10375a.mo2636d();
        this.f16025h &= ~mo2636d;
        this.f16026i = null;
        InterfaceC3215k1 interfaceC3215k1 = (InterfaceC3215k1) AbstractC0173b.f783c.m3612b(mo2636d);
        if (interfaceC3215k1 != null) {
            Object m3592g = this.f16027j.m3592g(interfaceC3215k1);
            AbstractC3367j.m5097b(m3592g);
            C3221m1 c3221m1 = (C3221m1) m3592g;
            c3221m1.f16004c.m3730h(0.0f);
            c3221m1.f16006e.m3730h(1.0f);
            c3221m1.f16005d.m3794h(0L);
            c3221m1.f16004c.m3730h(0.0f);
            c3221m1.f16003b.setValue(Boolean.FALSE);
            c3221m1.f16011j = -1L;
            c3221m1.f16012k = -1L;
            C2349d1 c2349d1 = this.f16028k;
            c2349d1.m3742h(c2349d1.m3741g() + 1);
            synchronized (AbstractC3465l.f16721c) {
                C2196i0 c2196i0 = AbstractC3465l.f16728j.f16673h;
                if (c2196i0 != null) {
                    if (c2196i0.m3606h()) {
                        z7 = true;
                    }
                }
            }
            if (z7) {
                AbstractC3465l.m5234a();
            }
        }
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: b */
    public final void mo2711b(C1628d0 c1628d0) {
        this.f16024g = true;
    }

    @Override // p051g3.InterfaceC1631f
    /* renamed from: c */
    public final C1672z0 mo2644c(View view, C1672z0 c1672z0) {
        if (this.f16024g) {
            this.f16026i = c1672z0;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c1672z0;
            }
        } else if (this.f16025h == 0) {
            m4946f(c1672z0);
        }
        return c1672z0;
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: d */
    public final C1672z0 mo2712d(C1672z0 c1672z0, List list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            C1628d0 c1628d0 = (C1628d0) list.get(i7);
            InterfaceC3215k1 interfaceC3215k1 = (InterfaceC3215k1) AbstractC0173b.f783c.m3612b(c1628d0.f10375a.mo2636d());
            if (interfaceC3215k1 != null) {
                Object m3592g = this.f16027j.m3592g(interfaceC3215k1);
                AbstractC3367j.m5097b(m3592g);
                C3221m1 c3221m1 = (C3221m1) m3592g;
                if (((Boolean) c3221m1.f16003b.getValue()).booleanValue()) {
                    AbstractC1625c0 abstractC1625c0 = c1628d0.f10375a;
                    c3221m1.f16004c.m3730h(abstractC1625c0.mo2635c());
                    c3221m1.f16006e.m3730h(abstractC1625c0.mo2633a());
                    c3221m1.f16005d.m3794h(abstractC1625c0.mo2634b());
                }
            }
        }
        m4946f(c1672z0);
        return c1672z0;
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: e */
    public final C0068q2 mo2713e(C1628d0 c1628d0, C0068q2 c0068q2) {
        C1672z0 c1672z0 = this.f16026i;
        boolean z7 = false;
        this.f16024g = false;
        this.f16026i = null;
        if (c1628d0.f10375a.mo2634b() > 0 && c1672z0 != null) {
            int mo2636d = c1628d0.f10375a.mo2636d();
            this.f16025h |= mo2636d;
            InterfaceC3215k1 interfaceC3215k1 = (InterfaceC3215k1) AbstractC0173b.f783c.m3612b(mo2636d);
            if (interfaceC3215k1 != null) {
                Object m3592g = this.f16027j.m3592g(interfaceC3215k1);
                AbstractC3367j.m5097b(m3592g);
                C3221m1 c3221m1 = (C3221m1) m3592g;
                C0274b mo2671i = c1672z0.f10450a.mo2671i(mo2636d);
                long j6 = (mo2671i.f1015a << 48) | (mo2671i.f1016b << 32) | (mo2671i.f1017c << 16) | mo2671i.f1018d;
                long j7 = c3221m1.f16009h;
                if (!AbstractC3191c1.m4896g(j6, j7)) {
                    c3221m1.f16011j = j7;
                    c3221m1.f16012k = j6;
                    c3221m1.f16003b.setValue(Boolean.TRUE);
                    AbstractC1625c0 abstractC1625c0 = c1628d0.f10375a;
                    c3221m1.f16004c.m3730h(abstractC1625c0.mo2635c());
                    c3221m1.f16006e.m3730h(abstractC1625c0.mo2633a());
                    c3221m1.f16005d.m3794h(abstractC1625c0.mo2634b());
                    C2349d1 c2349d1 = this.f16028k;
                    c2349d1.m3742h(c2349d1.m3741g() + 1);
                    synchronized (AbstractC3465l.f16721c) {
                        C2196i0 c2196i0 = AbstractC3465l.f16728j.f16673h;
                        if (c2196i0 != null) {
                            if (c2196i0.m3606h()) {
                                z7 = true;
                            }
                        }
                    }
                    if (z7) {
                        AbstractC3465l.m5234a();
                        return c0068q2;
                    }
                }
            }
        }
        return c0068q2;
    }

    /* renamed from: f */
    public final void m4946f(C1672z0 c1672z0) {
        char c7;
        char c8;
        char c9;
        char c10;
        long j6;
        boolean z7;
        boolean z8;
        boolean z9;
        long j7;
        int i7;
        int i8;
        int i9;
        int i10;
        long j8;
        List list;
        boolean z10;
        long[] jArr;
        int[] iArr;
        long[] jArr2;
        int[] iArr2;
        long[] jArr3;
        int[] iArr3;
        long[] jArr4;
        int[] iArr4;
        int i11;
        C2221w c2221w = AbstractC0173b.f781a;
        int[] iArr5 = c2221w.f12706b;
        Object[] objArr = c2221w.f12707c;
        long[] jArr5 = c2221w.f12705a;
        int length = jArr5.length - 2;
        int i12 = 8;
        if (length >= 0) {
            int i13 = 0;
            z8 = false;
            z9 = false;
            c7 = 7;
            c8 = 16;
            c9 = ' ';
            while (true) {
                long j9 = jArr5[i13];
                c10 = '0';
                j6 = -9187201950435737472L;
                if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i14 = 8 - ((~(i13 - length)) >>> 31);
                    int i15 = 0;
                    while (i15 < i14) {
                        if ((j9 & 255) < 128) {
                            int i16 = (i13 << 3) + i15;
                            int i17 = iArr5[i16];
                            InterfaceC3215k1 interfaceC3215k1 = (InterfaceC3215k1) objArr[i16];
                            i11 = i12;
                            C0274b mo2671i = c1672z0.f10450a.mo2671i(i17);
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            long j10 = (mo2671i.f1016b << 32) | (mo2671i.f1015a << 48) | (mo2671i.f1017c << 16) | mo2671i.f1018d;
                            Object m3592g = this.f16027j.m3592g(interfaceC3215k1);
                            AbstractC3367j.m5097b(m3592g);
                            C3221m1 c3221m1 = (C3221m1) m3592g;
                            if (!AbstractC3191c1.m4896g(j10, c3221m1.f16009h)) {
                                c3221m1.f16009h = j10;
                                z8 = true;
                                if (!AbstractC3191c1.m4896g(j10, 0L)) {
                                    z9 = true;
                                }
                            }
                        } else {
                            jArr4 = jArr5;
                            iArr4 = iArr5;
                            i11 = i12;
                        }
                        j9 >>= i11;
                        i15++;
                        i12 = i11;
                        iArr5 = iArr4;
                        jArr5 = jArr4;
                    }
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z7 = true;
                    if (i14 != i12) {
                        break;
                    }
                } else {
                    jArr3 = jArr5;
                    iArr3 = iArr5;
                    z7 = true;
                }
                if (i13 == length) {
                    break;
                }
                i13++;
                iArr5 = iArr3;
                jArr5 = jArr3;
                i12 = 8;
            }
        } else {
            c7 = 7;
            c8 = 16;
            c9 = ' ';
            c10 = '0';
            j6 = -9187201950435737472L;
            z7 = true;
            z8 = false;
            z9 = false;
        }
        C2221w c2221w2 = AbstractC0173b.f783c;
        int[] iArr6 = c2221w2.f12706b;
        Object[] objArr2 = c2221w2.f12707c;
        long[] jArr6 = c2221w2.f12705a;
        int length2 = jArr6.length - 2;
        if (length2 >= 0) {
            int i18 = 0;
            while (true) {
                long j11 = jArr6[i18];
                if ((((~j11) << c7) & j11 & j6) != j6) {
                    int i19 = 8 - ((~(i18 - length2)) >>> 31);
                    int i20 = 0;
                    while (i20 < i19) {
                        if ((j11 & 255) < 128) {
                            int i21 = (i18 << 3) + i20;
                            int i22 = iArr6[i21];
                            Object m3592g2 = this.f16027j.m3592g((InterfaceC3215k1) objArr2[i21]);
                            AbstractC3367j.m5097b(m3592g2);
                            C3221m1 c3221m12 = (C3221m1) m3592g2;
                            if (i22 != 8) {
                                C0274b mo2672j = c1672z0.f10450a.mo2672j(i22);
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                                long j12 = (mo2672j.f1016b << c9) | (mo2672j.f1015a << c10) | (mo2672j.f1017c << c8) | mo2672j.f1018d;
                                if (!AbstractC3191c1.m4896g(c3221m12.f16010i, j12)) {
                                    c3221m12.f16010i = j12;
                                    z8 = z7;
                                    if (!AbstractC3191c1.m4896g(j12, 0L)) {
                                        z9 = z8;
                                    }
                                }
                            } else {
                                jArr2 = jArr6;
                                iArr2 = iArr6;
                            }
                            c3221m12.f16002a.setValue(Boolean.valueOf(c1672z0.f10450a.mo2678u(i22)));
                        } else {
                            jArr2 = jArr6;
                            iArr2 = iArr6;
                        }
                        j11 >>= 8;
                        i20++;
                        jArr6 = jArr2;
                        iArr6 = iArr2;
                    }
                    jArr = jArr6;
                    iArr = iArr6;
                    if (i19 != 8) {
                        break;
                    }
                } else {
                    jArr = jArr6;
                    iArr = iArr6;
                }
                if (i18 == length2) {
                    break;
                }
                i18++;
                jArr6 = jArr;
                iArr6 = iArr;
            }
        }
        C1624c mo2693h = c1672z0.f10450a.mo2693h();
        if (mo2693h == null) {
            j7 = 0;
        } else {
            C0274b m2638a = mo2693h.m2638a();
            j7 = (m2638a.f1015a << c10) | (m2638a.f1016b << c9) | (m2638a.f1017c << c8) | m2638a.f1018d;
        }
        C2194h0 c2194h0 = this.f16027j;
        InterfaceC3215k1.f15995a.getClass();
        Object m3592g3 = c2194h0.m3592g(C3212j1.f15993j);
        AbstractC3367j.m5097b(m3592g3);
        C3221m1 c3221m13 = (C3221m1) m3592g3;
        if (!AbstractC3191c1.m4896g(c3221m13.f16009h, j7)) {
            c3221m13.f16009h = j7;
            c3221m13.f16010i = j7;
            z8 = z7;
            if (!AbstractC3191c1.m4896g(j7, 0L)) {
                z9 = z8;
            }
        }
        if (mo2693h == null) {
            j8 = 0;
        } else {
            int i23 = Build.VERSION.SDK_INT;
            if (i23 >= 28) {
                i7 = AbstractC0390a.m862e(mo2693h.f10367a);
            } else {
                i7 = 0;
            }
            if (i23 >= 28) {
                i8 = AbstractC0390a.m864g(mo2693h.f10367a);
            } else {
                i8 = 0;
            }
            if (i23 >= 28) {
                i9 = AbstractC0390a.m863f(mo2693h.f10367a);
            } else {
                i9 = 0;
            }
            if (i23 >= 28) {
                i10 = AbstractC0390a.m861d(mo2693h.f10367a);
            } else {
                i10 = 0;
            }
            j8 = i10 | (i8 << c9) | (i7 << c10) | (i9 << c8);
        }
        Object m3592g4 = this.f16027j.m3592g(C3212j1.f15986c);
        AbstractC3367j.m5097b(m3592g4);
        C3221m1 c3221m14 = (C3221m1) m3592g4;
        if (!AbstractC3191c1.m4896g(j8, c3221m14.f16009h)) {
            c3221m14.f16009h = j8;
            c3221m14.f16010i = j8;
            z8 = z7;
            if (!AbstractC3191c1.m4896g(j8, 0L)) {
                z9 = z8;
            }
        }
        if (mo2693h == null) {
            C2184c0 c2184c0 = this.f16029l;
            if (c2184c0.f12629b > 0) {
                c2184c0.m3558c();
                this.f16030m.clear();
                z8 = z7;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 28) {
                list = AbstractC0390a.m859b(mo2693h.f10367a);
            } else {
                list = Collections.EMPTY_LIST;
            }
            int size = list.size();
            C2184c0 c2184c02 = this.f16029l;
            if (size < c2184c02.f12629b) {
                c2184c02.m3566k(list.size(), this.f16029l.f12629b);
                this.f16030m.m5259d(list.size(), this.f16030m.size());
                z8 = z7;
            } else {
                int size2 = list.size() - this.f16029l.f12629b;
                int i24 = 0;
                while (i24 < size2) {
                    C2184c0 c2184c03 = this.f16029l;
                    c2184c03.m3556a(AbstractC2418w.m3980x(list.get(c2184c03.f12629b)));
                    this.f16030m.add(new C3224o("display cutout rect " + this.f16029l.f12629b));
                    i24++;
                    z8 = z7;
                }
            }
            int size3 = list.size();
            for (int i25 = 0; i25 < size3; i25++) {
                Rect rect = (Rect) list.get(i25);
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) this.f16029l.m3560e(i25);
                if (!AbstractC3367j.m5096a(interfaceC2425y0.getValue(), rect)) {
                    interfaceC2425y0.setValue(rect);
                    z8 = z7;
                }
            }
            if (!list.isEmpty()) {
                z9 = z7;
            }
        }
        if ((z9 || this.f16028k.m3741g() != 0) && z8) {
            C2349d1 c2349d1 = this.f16028k;
            c2349d1.m3742h(c2349d1.m3741g() + 1);
            synchronized (AbstractC3465l.f16721c) {
                C2196i0 c2196i0 = AbstractC3465l.f16728j.f16673h;
                if (c2196i0 != null) {
                    boolean z11 = z7;
                    if (c2196i0.m3606h() == z11) {
                        z10 = z11;
                    }
                }
                z10 = false;
            }
            if (z10) {
                AbstractC3465l.m5234a();
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        int i7 = AbstractC1653q.f10423a;
        AbstractC1643l.m2651b(view, this);
        AbstractC1653q.m2699b(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        View view2;
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            view = view2;
        }
        int i7 = AbstractC1653q.f10423a;
        AbstractC1643l.m2651b(view, null);
        AbstractC1653q.m2699b(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f16024g) {
            this.f16025h = 0;
            this.f16024g = false;
            C1672z0 c1672z0 = this.f16026i;
            if (c1672z0 != null) {
                m4946f(c1672z0);
                this.f16026i = null;
            }
        }
    }
}
