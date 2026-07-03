package p028d2;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Trace;
import java.util.List;
import p001a0.C0019e1;
import p027d1.C0465c;
import p066i3.AbstractC2067b;
import p077k.AbstractC2203m;
import p077k.C2194h0;
import p077k.C2221w;
import p101n0.C2705e;
import p140s2.C3101k;
import p146t1.AbstractC3191c1;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.C3502g0;
import p162v1.InterfaceC3551w1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.r */
/* loaded from: classes.dex */
public abstract class AbstractC0485r {

    /* renamed from: a */
    public static final C0465c f1704a = new C0465c(0.0f, 0.0f, 10.0f, 10.0f);

    /* renamed from: a */
    public static final C0482o m1057a(C3502g0 c3502g0, boolean z7) {
        AbstractC3809q abstractC3809q = c3502g0.f16872I.f16802f;
        Object obj = null;
        if ((abstractC3809q.f17995h & 8) != 0) {
            loop0: while (true) {
                if (abstractC3809q == null) {
                    break;
                }
                if ((abstractC3809q.f17994g & 8) != 0) {
                    AbstractC3809q abstractC3809q2 = abstractC3809q;
                    C2705e c2705e = null;
                    while (abstractC3809q2 != null) {
                        if (abstractC3809q2 instanceof InterfaceC3551w1) {
                            obj = abstractC3809q2;
                            break loop0;
                        }
                        if ((abstractC3809q2.f17994g & 8) != 0 && (abstractC3809q2 instanceof AbstractC3519m)) {
                            int i7 = 0;
                            for (AbstractC3809q abstractC3809q3 = ((AbstractC3519m) abstractC3809q2).f16962t; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                                if ((abstractC3809q3.f17994g & 8) != 0) {
                                    i7++;
                                    if (i7 == 1) {
                                        abstractC3809q2 = abstractC3809q3;
                                    } else {
                                        if (c2705e == null) {
                                            c2705e = new C2705e(new AbstractC3809q[16]);
                                        }
                                        if (abstractC3809q2 != null) {
                                            c2705e.m4300b(abstractC3809q2);
                                            abstractC3809q2 = null;
                                        }
                                        c2705e.m4300b(abstractC3809q3);
                                    }
                                }
                            }
                            if (i7 == 1) {
                            }
                        }
                        abstractC3809q2 = AbstractC3498f.m5366f(c2705e);
                    }
                }
                if ((abstractC3809q.f17995h & 8) == 0) {
                    break;
                }
                abstractC3809q = abstractC3809q.f17997j;
            }
        }
        AbstractC3367j.m5097b(obj);
        AbstractC3809q abstractC3809q4 = ((AbstractC3809q) ((InterfaceC3551w1) obj)).f17992e;
        C0477j m5449w = c3502g0.m5449w();
        if (m5449w == null) {
            m5449w = new C0477j();
        }
        return new C0482o(abstractC3809q4, z7, c3502g0, m5449w);
    }

    /* renamed from: b */
    public static final C2221w m1058b(C0484q c0484q) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            C0482o m1055a = c0484q.m1055a();
            C3502g0 c3502g0 = m1055a.f1693c;
            if (c3502g0.m5408J() && c3502g0.m5407I()) {
                C2221w c2221w = new C2221w(48);
                C0019e1 c0019e1 = new C0019e1(9, false);
                C3101k m3298w = AbstractC2067b.m3298w(m1055a.m1045g());
                ((Region) c0019e1.f109e).set(m3298w.f15698a, m3298w.f15699b, m3298w.f15700c, m3298w.f15701d);
                m1059c(c0019e1, m1055a, c2221w, m1055a, new C0019e1(9, false));
                return c2221w;
            }
            C2221w c2221w2 = AbstractC2203m.f12711a;
            AbstractC3367j.m5098c(c2221w2, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.emptyIntObjectMap>");
            return c2221w2;
        } finally {
            Trace.endSection();
        }
    }

    /* renamed from: c */
    public static final void m1059c(C0019e1 c0019e1, C0482o c0482o, C2221w c2221w, C0482o c0482o2, C0019e1 c0019e12) {
        boolean z7;
        C0465c m5354r1;
        C0465c c0465c;
        C3502g0 c3502g0;
        int i7 = c0482o.f1697g;
        Region region = (Region) c0019e12.f109e;
        C3502g0 c3502g02 = c0482o2.f1693c;
        int i8 = c0482o2.f1697g;
        boolean z8 = false;
        if (c3502g02.m5408J() && c3502g02.m5407I()) {
            z7 = false;
        } else {
            z7 = true;
        }
        Region region2 = (Region) c0019e1.f109e;
        if (!region2.isEmpty() || i8 == i7) {
            if (!z7 || c0482o2.f1695e) {
                Object m1044f = c0482o2.m1044f();
                if (m1044f == null) {
                    m5354r1 = c3502g02.f16872I.f16799c.m5354r1();
                } else {
                    AbstractC3809q abstractC3809q = ((AbstractC3809q) m1044f).f17992e;
                    Object m3592g = c0482o2.f1694d.f1683e.m3592g(AbstractC0476i.f1658b);
                    if (m3592g == null) {
                        m3592g = null;
                    }
                    if (m3592g != null) {
                        z8 = true;
                    }
                    if (!abstractC3809q.f17992e.f18005r) {
                        m5354r1 = C0465c.f1624e;
                    } else if (!z8) {
                        AbstractC3497e1 m5380t = AbstractC3498f.m5380t(abstractC3809q, 8);
                        m5354r1 = AbstractC3191c1.m4897h(m5380t).mo4934j(m5380t, true);
                    } else {
                        m5354r1 = AbstractC3498f.m5380t(abstractC3809q, 8).m5354r1();
                    }
                }
                C3101k m3298w = AbstractC2067b.m3298w(m5354r1);
                region.set(m3298w.f15698a, m3298w.f15699b, m3298w.f15700c, m3298w.f15701d);
                if (i8 == i7) {
                    i8 = -1;
                }
                if (region.op(region2, Region.Op.INTERSECT)) {
                    Rect bounds = region.getBounds();
                    c2221w.m3652g(i8, new C0483p(c0482o2, new C3101k(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    List m1038j = C0482o.m1038j(4, c0482o2);
                    for (int size = m1038j.size() - 1; -1 < size; size--) {
                        if (!((C0482o) m1038j.get(size)).m1048k().f1683e.m3588c(AbstractC0487t.f1765z)) {
                            m1059c(c0019e1, c0482o, c2221w, (C0482o) m1038j.get(size), c0019e12);
                        }
                    }
                    if (m1062f(c0482o2)) {
                        region2.op(m3298w.f15698a, m3298w.f15699b, m3298w.f15700c, m3298w.f15701d, Region.Op.DIFFERENCE);
                        return;
                    }
                    return;
                }
                if (c0482o2.f1695e) {
                    C0482o m1049l = c0482o2.m1049l();
                    if (m1049l != null && (c3502g0 = m1049l.f1693c) != null && c3502g0.m5408J()) {
                        c0465c = m1049l.m1045g();
                    } else {
                        c0465c = f1704a;
                    }
                    c2221w.m3652g(i8, new C0483p(c0482o2, AbstractC2067b.m3298w(c0465c)));
                    return;
                }
                if (i8 == -1) {
                    Rect bounds2 = region.getBounds();
                    c2221w.m3652g(i8, new C0483p(c0482o2, new C3101k(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
                }
            }
        }
    }

    /* renamed from: d */
    public static final Object m1060d(C0477j c0477j, C0490w c0490w) {
        Object m3592g = c0477j.f1683e.m3592g(c0490w);
        if (m3592g == null) {
            return null;
        }
        return m3592g;
    }

    /* renamed from: e */
    public static final boolean m1061e(C0482o c0482o) {
        boolean z7;
        AbstractC3497e1 m1042d = c0482o.m1042d();
        C0477j c0477j = c0482o.f1694d;
        if (m1042d != null) {
            z7 = m1042d.m5341d1();
        } else {
            z7 = false;
        }
        if (!z7) {
            C0490w c0490w = AbstractC0487t.f1740a;
            if (!c0477j.f1683e.m3588c(AbstractC0487t.f1755p)) {
                if (!c0477j.f1683e.m3588c(AbstractC0487t.f1754o)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public static final boolean m1062f(C0482o c0482o) {
        if (!m1061e(c0482o)) {
            C0477j c0477j = c0482o.f1694d;
            if (!c0477j.f1685g) {
                C2194h0 c2194h0 = c0477j.f1683e;
                Object[] objArr = c2194h0.f12677b;
                Object[] objArr2 = c2194h0.f12678c;
                long[] jArr = c2194h0.f12676a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j6 = jArr[i7];
                        if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8 - ((~(i7 - length)) >>> 31);
                            for (int i9 = 0; i9 < i8; i9++) {
                                if ((255 & j6) < 128) {
                                    int i10 = (i7 << 3) + i9;
                                    Object obj = objArr[i10];
                                    Object obj2 = objArr2[i10];
                                    if (((C0490w) obj).f1771c) {
                                        return true;
                                    }
                                }
                                j6 >>= 8;
                            }
                            if (i8 != 8) {
                                break;
                            }
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
