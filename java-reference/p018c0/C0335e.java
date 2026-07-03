package p018c0;

import android.graphics.Rect;
import java.lang.ref.WeakReference;
import p001a0.C0005b;
import p001a0.C0006b0;
import p001a0.C0037j;
import p001a0.C0062p0;
import p001a0.C0079t1;
import p009b0.AbstractC0262d;
import p027d1.C0465c;
import p032d6.AbstractC0525d0;
import p032d6.C0565q1;
import p047f6.EnumC1546a;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p054g6.AbstractC1719t;
import p054g6.C1718s;
import p054g6.InterfaceC1713n;
import p087l2.C2447k;
import p087l2.C2459w;
import p087l2.InterfaceC2453q;
import p087l2.InterfaceC2454r;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p162v1.AbstractC3498f;
import p170w1.AbstractC3674f1;
import p170w1.C3682h1;
import p170w1.InterfaceC3663c2;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.e */
/* loaded from: classes.dex */
public final class C0335e implements InterfaceC2454r {

    /* renamed from: a */
    public C0350t f1153a;

    /* renamed from: b */
    public C0565q1 f1154b;

    /* renamed from: c */
    public C0354x f1155c;

    /* renamed from: d */
    public C1718s f1156d;

    @Override // p087l2.InterfaceC2454r
    /* renamed from: a */
    public final void mo682a(C2459w c2459w, InterfaceC2453q interfaceC2453q, C1598l0 c1598l0, C0005b c0005b, C0465c c0465c, C0465c c0465c2) {
        C0354x c0354x = this.f1155c;
        if (c0354x != null) {
            C0351u c0351u = c0354x.f1206m;
            synchronized (c0351u.f1177c) {
                try {
                    c0351u.f1184j = c2459w;
                    c0351u.f1186l = interfaceC2453q;
                    c0351u.f1185k = c1598l0;
                    c0351u.f1187m = c0465c;
                    c0351u.f1188n = c0465c2;
                    if (!c0351u.f1179e) {
                        if (c0351u.f1178d) {
                        }
                    }
                    c0351u.m791a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: b */
    public final void mo683b(C2459w c2459w, C2459w c2459w2) {
        boolean z7;
        int i7;
        int i8;
        int i9;
        C0354x c0354x = this.f1155c;
        if (c0354x != null) {
            if (C1602n0.m2585a(c0354x.f1201h.f13724b, c2459w2.f13724b) && AbstractC3367j.m5096a(c0354x.f1201h.f13725c, c2459w2.f13725c)) {
                z7 = false;
            } else {
                z7 = true;
            }
            c0354x.f1201h = c2459w2;
            int size = c0354x.f1203j.size();
            for (int i10 = 0; i10 < size; i10++) {
                InputConnectionC0356z inputConnectionC0356z = (InputConnectionC0356z) ((WeakReference) c0354x.f1203j.get(i10)).get();
                if (inputConnectionC0356z != null) {
                    inputConnectionC0356z.f1214g = c2459w2;
                }
            }
            C0351u c0351u = c0354x.f1206m;
            synchronized (c0351u.f1177c) {
                c0351u.f1184j = null;
                c0351u.f1186l = null;
                c0351u.f1185k = null;
                c0351u.f1187m = null;
                c0351u.f1188n = null;
            }
            int i11 = -1;
            if (AbstractC3367j.m5096a(c2459w, c2459w2)) {
                if (z7) {
                    C0349s c0349s = c0354x.f1195b;
                    int m2589e = C1602n0.m2589e(c2459w2.f13724b);
                    int m2588d = C1602n0.m2588d(c2459w2.f13724b);
                    C1602n0 c1602n0 = c0354x.f1201h.f13725c;
                    if (c1602n0 != null) {
                        i9 = C1602n0.m2589e(c1602n0.f10304a);
                    } else {
                        i9 = -1;
                    }
                    C1602n0 c1602n02 = c0354x.f1201h.f13725c;
                    if (c1602n02 != null) {
                        i11 = C1602n0.m2588d(c1602n02.f10304a);
                    }
                    c0349s.m787a().updateSelection(c0349s.f1170b, m2589e, m2588d, i9, i11);
                    return;
                }
                return;
            }
            if (c2459w != null && (!AbstractC3367j.m5096a(c2459w.f13723a.f10239f, c2459w2.f13723a.f10239f) || (C1602n0.m2585a(c2459w.f13724b, c2459w2.f13724b) && !AbstractC3367j.m5096a(c2459w.f13725c, c2459w2.f13725c)))) {
                C0349s c0349s2 = c0354x.f1195b;
                c0349s2.m787a().restartInput(c0349s2.f1170b);
                return;
            }
            int size2 = c0354x.f1203j.size();
            for (int i12 = 0; i12 < size2; i12++) {
                InputConnectionC0356z inputConnectionC0356z2 = (InputConnectionC0356z) ((WeakReference) c0354x.f1203j.get(i12)).get();
                if (inputConnectionC0356z2 != null) {
                    C2459w c2459w3 = c0354x.f1201h;
                    C0349s c0349s3 = c0354x.f1195b;
                    if (inputConnectionC0356z2.f1218k) {
                        inputConnectionC0356z2.f1214g = c2459w3;
                        if (inputConnectionC0356z2.f1216i) {
                            c0349s3.m787a().updateExtractedText(c0349s3.f1170b, inputConnectionC0356z2.f1215h, AbstractC3393k.m5134e(c2459w3));
                        }
                        C1602n0 c1602n03 = c2459w3.f13725c;
                        long j6 = c2459w3.f13724b;
                        if (c1602n03 != null) {
                            i7 = C1602n0.m2589e(c1602n03.f10304a);
                        } else {
                            i7 = -1;
                        }
                        C1602n0 c1602n04 = c2459w3.f13725c;
                        if (c1602n04 != null) {
                            i8 = C1602n0.m2588d(c1602n04.f10304a);
                        } else {
                            i8 = -1;
                        }
                        c0349s3.m787a().updateSelection(c0349s3.f1170b, C1602n0.m2589e(j6), C1602n0.m2588d(j6), i7, i8);
                    }
                }
            }
        }
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: c */
    public final void mo684c(C0465c c0465c) {
        Rect rect;
        C0354x c0354x = this.f1155c;
        if (c0354x != null) {
            c0354x.f1205l = new Rect(AbstractC3784a.m5794D(c0465c.f1625a), AbstractC3784a.m5794D(c0465c.f1626b), AbstractC3784a.m5794D(c0465c.f1627c), AbstractC3784a.m5794D(c0465c.f1628d));
            if (c0354x.f1203j.isEmpty() && (rect = c0354x.f1205l) != null) {
                c0354x.f1194a.requestRectangleOnScreen(new Rect(rect));
            }
        }
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: d */
    public final void mo685d() {
        m691j(null);
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: e */
    public final void mo686e() {
        InterfaceC3663c2 interfaceC3663c2;
        C0350t c0350t = this.f1153a;
        if (c0350t != null && (interfaceC3663c2 = (InterfaceC3663c2) AbstractC3498f.m5369i(c0350t, AbstractC3674f1.f17525p)) != null) {
            ((C3682h1) interfaceC3663c2).m5701b();
        }
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: f */
    public final void mo687f() {
        InterfaceC3663c2 interfaceC3663c2;
        C0350t c0350t = this.f1153a;
        if (c0350t != null && (interfaceC3663c2 = (InterfaceC3663c2) AbstractC3498f.m5369i(c0350t, AbstractC3674f1.f17525p)) != null) {
            ((C3682h1) interfaceC3663c2).m5700a();
        }
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: g */
    public final void mo688g() {
        C0565q1 c0565q1 = this.f1154b;
        if (c0565q1 != null) {
            c0565q1.mo1114c(null);
        }
        this.f1154b = null;
        InterfaceC1713n m690i = m690i();
        if (m690i != null) {
            C1718s c1718s = (C1718s) m690i;
            synchronized (c1718s) {
                c1718s.m2768u(c1718s.m2762o() + c1718s.f10553o, c1718s.f10552n, c1718s.m2762o() + c1718s.f10553o, c1718s.m2762o() + c1718s.f10553o + c1718s.f10554p);
            }
        }
    }

    @Override // p087l2.InterfaceC2454r
    /* renamed from: h */
    public final void mo689h(C2459w c2459w, C2447k c2447k, C0037j c0037j, C0006b0 c0006b0) {
        m691j(new C0079t1(c2459w, this, c2447k, c0037j, c0006b0));
    }

    /* renamed from: i */
    public final InterfaceC1713n m690i() {
        C1718s c1718s = this.f1156d;
        if (c1718s != null) {
            return c1718s;
        }
        if (!AbstractC0262d.f995a) {
            return null;
        }
        C1718s m2770a = AbstractC1719t.m2770a(2, EnumC1546a.f10130g);
        this.f1156d = m2770a;
        return m2770a;
    }

    /* renamed from: j */
    public final void m691j(C0079t1 c0079t1) {
        C0350t c0350t = this.f1153a;
        if (c0350t == null) {
            return;
        }
        C0565q1 c0565q1 = null;
        C0334d c0334d = new C0334d(c0079t1, this, c0350t, c0565q1, 0);
        if (c0350t.f18005r) {
            c0565q1 = AbstractC0525d0.m1141s(c0350t.m5830y0(), null, new C0062p0(c0350t, c0334d, c0565q1, 4), 1);
        }
        this.f1154b = c0565q1;
    }

    /* renamed from: k */
    public final void m692k(C0350t c0350t) {
        if (this.f1153a == c0350t) {
            this.f1153a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + c0350t + " but was " + this.f1153a).toString());
    }
}
