package p191z0;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.lifecycle.InterfaceC0183e;
import androidx.lifecycle.InterfaceC0213t;
import androidx.lifecycle.RunnableC0219y;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p012b3.AbstractC0273a;
import p018c0.C0349s;
import p019c1.C0363g;
import p027d1.C0465c;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0485r;
import p028d2.AbstractC0487t;
import p028d2.C0468a;
import p028d2.C0474g;
import p028d2.C0477j;
import p028d2.C0482o;
import p028d2.C0483p;
import p028d2.C0490w;
import p047f6.AbstractC1555j;
import p047f6.C1547b;
import p047f6.C1548c;
import p050g2.C1587g;
import p050g2.C1596k0;
import p050g2.C1598l0;
import p050g2.C1604o0;
import p053g5.C1694m;
import p058h2.AbstractC1765b;
import p059h3.C1781g;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p063i0.C1879e0;
import p067i4.AbstractC2072e;
import p077k.AbstractC2201l;
import p077k.AbstractC2203m;
import p077k.C2194h0;
import p077k.C2221w;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p098m5.AbstractC2583c;
import p100n.C2673p1;
import p140s2.C3105o;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3279c;
import p155u2.AbstractC3353a;
import p158u5.AbstractC3367j;
import p162v1.AbstractC3497e1;
import p170w1.AbstractC3681h0;
import p170w1.C3659b2;
import p170w1.C3728t;
import p183y0.AbstractC3832a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z0.c */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3864c implements InterfaceC0183e, View.OnAttachStateChangeListener {

    /* renamed from: e */
    public final C3728t f18104e;

    /* renamed from: f */
    public final C0363g f18105f;

    /* renamed from: g */
    public C0349s f18106g;

    /* renamed from: h */
    public final ArrayList f18107h = new ArrayList();

    /* renamed from: i */
    public final long f18108i = 100;

    /* renamed from: j */
    public EnumC3862a f18109j = EnumC3862a.f18097e;

    /* renamed from: k */
    public boolean f18110k = true;

    /* renamed from: l */
    public final C1548c f18111l = AbstractC1555j.m2510a(1, 6, null);

    /* renamed from: m */
    public final Handler f18112m = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    public C2221w f18113n;

    /* renamed from: o */
    public long f18114o;

    /* renamed from: p */
    public final C2221w f18115p;

    /* renamed from: q */
    public C3659b2 f18116q;

    /* renamed from: r */
    public boolean f18117r;

    /* renamed from: s */
    public final RunnableC0219y f18118s;

    public ViewOnAttachStateChangeListenerC3864c(C3728t c3728t, C0363g c0363g) {
        this.f18104e = c3728t;
        this.f18105f = c0363g;
        C2221w c2221w = AbstractC2203m.f12711a;
        AbstractC3367j.m5098c(c2221w, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f18113n = c2221w;
        this.f18115p = new C2221w();
        C0482o m1055a = c3728t.getSemanticsOwner().m1055a();
        AbstractC3367j.m5098c(c2221w, "null cannot be cast to non-null type androidx.collection.IntObjectMap<V of androidx.collection.IntObjectMapKt.intObjectMapOf>");
        this.f18116q = new C3659b2(m1055a, c2221w);
        this.f18118s = new RunnableC0219y(16, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004f, code lost:
    
        if (r8 != r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(r7.f18108i, r0) == r4) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:11:0x0047). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m5874a(AbstractC2583c abstractC2583c) {
        C3863b c3863b;
        int i7;
        C1547b c1547b;
        if (abstractC2583c instanceof C3863b) {
            c3863b = (C3863b) abstractC2583c;
            int i8 = c3863b.f18103k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3863b.f18103k = i8 - Integer.MIN_VALUE;
                Object obj = c3863b.f18101i;
                i7 = c3863b.f18103k;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            c1547b = c3863b.f18100h;
                            AbstractC1793a0.m2972L(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        c1547b = c3863b.f18100h;
                        AbstractC1793a0.m2972L(obj);
                        if (((Boolean) obj).booleanValue()) {
                            c1547b.m2477c();
                            if (m5877h()) {
                                m5878i();
                            }
                            if (!this.f18117r) {
                                this.f18117r = true;
                                this.f18112m.post(this.f18118s);
                            }
                            c3863b.f18100h = c1547b;
                            c3863b.f18103k = 2;
                        } else {
                            return C1694m.f10482a;
                        }
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C1548c c1548c = this.f18111l;
                    c1548c.getClass();
                    c1547b = new C1547b(c1548c);
                }
                c3863b.f18100h = c1547b;
                c3863b.f18103k = 1;
                obj = c1547b.m2476b(c3863b);
            }
        }
        c3863b = new C3863b(this, abstractC2583c);
        Object obj2 = c3863b.f18101i;
        i7 = c3863b.f18103k;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i7 == 0) {
        }
        c3863b.f18100h = c1547b;
        c3863b.f18103k = 1;
        obj2 = c1547b.m2476b(c3863b);
    }

    @Override // androidx.lifecycle.InterfaceC0183e
    /* renamed from: d */
    public final void mo451d(InterfaceC0213t interfaceC0213t) {
        this.f18106g = (C0349s) this.f18105f.mo52a();
        m5881l(-1, this.f18104e.getSemanticsOwner().m1055a());
        m5878i();
    }

    /* renamed from: e */
    public final void m5875e(AbstractC2201l abstractC2201l) {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j6;
        char c7;
        long j7;
        int i7;
        C0482o c0482o;
        long[] jArr3;
        long[] jArr4;
        long j8;
        C1587g c1587g;
        C1587g c1587g2;
        long j9;
        C1587g c1587g3;
        AbstractC2201l abstractC2201l2 = abstractC2201l;
        int[] iArr3 = abstractC2201l2.f12706b;
        long[] jArr5 = abstractC2201l2.f12705a;
        int length = jArr5.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j10 = jArr5[i8];
                char c8 = 7;
                long j11 = -9187201950435737472L;
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8;
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    int i11 = 0;
                    while (i11 < i10) {
                        if ((j10 & 255) < 128) {
                            int i12 = iArr3[(i8 << 3) + i11];
                            c7 = c8;
                            C3659b2 c3659b2 = (C3659b2) this.f18115p.m3612b(i12);
                            C0483p c0483p = (C0483p) abstractC2201l2.m3612b(i12);
                            if (c0483p != null) {
                                c0482o = c0483p.f1698a;
                            } else {
                                c0482o = null;
                            }
                            if (c0482o != null) {
                                j7 = j11;
                                int i13 = c0482o.f1697g;
                                C0477j c0477j = c0482o.f1694d;
                                if (c3659b2 == null) {
                                    C2194h0 c2194h0 = c0477j.f1683e;
                                    Object[] objArr = c2194h0.f12677b;
                                    long[] jArr6 = c2194h0.f12676a;
                                    int length2 = jArr6.length - 2;
                                    iArr2 = iArr3;
                                    if (length2 >= 0) {
                                        int i14 = i9;
                                        int i15 = 0;
                                        while (true) {
                                            long j12 = jArr6[i15];
                                            j6 = j10;
                                            if ((((~j12) << c7) & j12 & j7) != j7) {
                                                int i16 = 8 - ((~(i15 - length2)) >>> 31);
                                                for (int i17 = 0; i17 < i16; i17++) {
                                                    if ((j12 & 255) < 128) {
                                                        j9 = j12;
                                                        C0490w c0490w = (C0490w) objArr[(i15 << 3) + i17];
                                                        C0490w c0490w2 = AbstractC0487t.f1740a;
                                                        C0490w c0490w3 = AbstractC0487t.f1725A;
                                                        if (AbstractC3367j.m5096a(c0490w, c0490w3)) {
                                                            List list = (List) AbstractC0485r.m1060d(c0477j, c0490w3);
                                                            if (list != null) {
                                                                c1587g3 = (C1587g) AbstractC1805m.m3047k0(list);
                                                            } else {
                                                                c1587g3 = null;
                                                            }
                                                            m5880k(String.valueOf(c1587g3), i13);
                                                        }
                                                    } else {
                                                        j9 = j12;
                                                    }
                                                    j12 = j9 >> i14;
                                                }
                                                if (i16 != i14) {
                                                    break;
                                                }
                                            }
                                            if (i15 == length2) {
                                                break;
                                            }
                                            i15++;
                                            j10 = j6;
                                            i14 = 8;
                                        }
                                    } else {
                                        j6 = j10;
                                    }
                                } else {
                                    iArr2 = iArr3;
                                    j6 = j10;
                                    C2194h0 c2194h02 = c0477j.f1683e;
                                    Object[] objArr2 = c2194h02.f12677b;
                                    long[] jArr7 = c2194h02.f12676a;
                                    int length3 = jArr7.length - 2;
                                    if (length3 >= 0) {
                                        Object[] objArr3 = objArr2;
                                        jArr2 = jArr5;
                                        int i18 = 0;
                                        while (true) {
                                            long j13 = jArr7[i18];
                                            Object[] objArr4 = objArr3;
                                            i7 = i11;
                                            if ((((~j13) << c7) & j13 & j7) != j7) {
                                                int i19 = 8 - ((~(i18 - length3)) >>> 31);
                                                int i20 = 0;
                                                while (i20 < i19) {
                                                    if ((j13 & 255) < 128) {
                                                        jArr4 = jArr7;
                                                        C0490w c0490w4 = (C0490w) objArr4[(i18 << 3) + i20];
                                                        C0490w c0490w5 = AbstractC0487t.f1740a;
                                                        j8 = j13;
                                                        C0490w c0490w6 = AbstractC0487t.f1725A;
                                                        if (AbstractC3367j.m5096a(c0490w4, c0490w6)) {
                                                            List list2 = (List) AbstractC0485r.m1060d(c3659b2.f17491a, c0490w6);
                                                            if (list2 != null) {
                                                                c1587g = (C1587g) AbstractC1805m.m3047k0(list2);
                                                            } else {
                                                                c1587g = null;
                                                            }
                                                            List list3 = (List) AbstractC0485r.m1060d(c0477j, c0490w6);
                                                            if (list3 != null) {
                                                                c1587g2 = (C1587g) AbstractC1805m.m3047k0(list3);
                                                            } else {
                                                                c1587g2 = null;
                                                            }
                                                            if (!AbstractC3367j.m5096a(c1587g, c1587g2)) {
                                                                m5880k(String.valueOf(c1587g2), i13);
                                                            }
                                                        }
                                                    } else {
                                                        jArr4 = jArr7;
                                                        j8 = j13;
                                                    }
                                                    j13 = j8 >> 8;
                                                    i20++;
                                                    jArr7 = jArr4;
                                                }
                                                jArr3 = jArr7;
                                                if (i19 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr3 = jArr7;
                                            }
                                            if (i18 == length3) {
                                                break;
                                            }
                                            i18++;
                                            i11 = i7;
                                            objArr3 = objArr4;
                                            jArr7 = jArr3;
                                        }
                                        j10 = j6 >> 8;
                                        i11 = i7 + 1;
                                        jArr5 = jArr2;
                                        c8 = c7;
                                        j11 = j7;
                                        iArr3 = iArr2;
                                        i9 = 8;
                                        abstractC2201l2 = abstractC2201l;
                                    }
                                }
                                jArr2 = jArr5;
                            } else {
                                throw AbstractC2487d.m4041e("no value for specified key");
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr5;
                            j6 = j10;
                            c7 = c8;
                            j7 = j11;
                        }
                        i7 = i11;
                        j10 = j6 >> 8;
                        i11 = i7 + 1;
                        jArr5 = jArr2;
                        c8 = c7;
                        j11 = j7;
                        iArr3 = iArr2;
                        i9 = 8;
                        abstractC2201l2 = abstractC2201l;
                    }
                    iArr = iArr3;
                    int i21 = i9;
                    jArr = jArr5;
                    if (i10 != i21) {
                        return;
                    }
                } else {
                    iArr = iArr3;
                    jArr = jArr5;
                }
                if (i8 != length) {
                    i8++;
                    abstractC2201l2 = abstractC2201l;
                    jArr5 = jArr;
                    iArr3 = iArr;
                } else {
                    return;
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0183e
    /* renamed from: f */
    public final void mo452f(InterfaceC0213t interfaceC0213t) {
        m5882m(this.f18104e.getSemanticsOwner().m1055a());
        m5878i();
        this.f18106g = null;
    }

    /* renamed from: g */
    public final AbstractC2201l m5876g() {
        if (this.f18110k) {
            this.f18110k = false;
            this.f18113n = AbstractC0485r.m1058b(this.f18104e.getSemanticsOwner());
            this.f18114o = System.currentTimeMillis();
        }
        return this.f18113n;
    }

    /* renamed from: h */
    public final boolean m5877h() {
        if (this.f18106g != null) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void m5878i() {
        C0349s c0349s = this.f18106g;
        if (c0349s != null) {
            Object obj = c0349s.f1169a;
            if (Build.VERSION.SDK_INT >= 29) {
                ArrayList arrayList = this.f18107h;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        C3865d c3865d = (C3865d) arrayList.get(i7);
                        int ordinal = c3865d.f18121c.ordinal();
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                AutofillId m788b = c0349s.m788b(c3865d.f18119a);
                                if (m788b != null && Build.VERSION.SDK_INT >= 29) {
                                    AbstractC0273a.m576f(AbstractC1765b.m2899f(obj), m788b);
                                }
                            } else {
                                throw new RuntimeException();
                            }
                        } else {
                            C2673p1 c2673p1 = c3865d.f18122d;
                            if (c2673p1 != null) {
                                ViewStructure viewStructure = (ViewStructure) c2673p1.f14390f;
                                if (Build.VERSION.SDK_INT >= 29) {
                                    AbstractC0273a.m575e(AbstractC1765b.m2899f(obj), viewStructure);
                                }
                            }
                        }
                    }
                    if (Build.VERSION.SDK_INT >= 29) {
                        ContentCaptureSession m2899f = AbstractC1765b.m2899f(obj);
                        C1781g m3334l = AbstractC2072e.m3334l(c0349s.f1170b);
                        Objects.requireNonNull(m3334l);
                        AbstractC0273a.m578h(m2899f, AbstractC3832a.m5840a(m3334l.f10824a), new long[]{Long.MIN_VALUE});
                    }
                    arrayList.clear();
                }
            }
        }
    }

    /* renamed from: j */
    public final void m5879j(C0482o c0482o, C3659b2 c3659b2) {
        C1879e0 c1879e0 = new C1879e0(16, c3659b2, this);
        c0482o.getClass();
        List m1038j = C0482o.m1038j(4, c0482o);
        int size = m1038j.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            Object obj = m1038j.get(i8);
            if (m5876g().m3611a(((C0482o) obj).f1697g)) {
                c1879e0.mo22d(Integer.valueOf(i7), obj);
                i7++;
            }
        }
        List m1038j2 = C0482o.m1038j(4, c0482o);
        int size2 = m1038j2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            C0482o c0482o2 = (C0482o) m1038j2.get(i9);
            AbstractC2201l m5876g = m5876g();
            int i10 = c0482o2.f1697g;
            if (m5876g.m3611a(i10)) {
                C2221w c2221w = this.f18115p;
                if (c2221w.m3611a(i10)) {
                    Object m3612b = c2221w.m3612b(i10);
                    if (m3612b != null) {
                        m5879j(c0482o2, (C3659b2) m3612b);
                    } else {
                        throw AbstractC2487d.m4041e("node not present in pruned tree before this change");
                    }
                } else {
                    continue;
                }
            }
        }
    }

    /* renamed from: k */
    public final void m5880k(String str, int i7) {
        C0349s c0349s;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29 && (c0349s = this.f18106g) != null) {
            AutofillId m788b = c0349s.m788b(i7);
            if (m788b != null) {
                if (i8 >= 29) {
                    AbstractC0273a.m577g(AbstractC1765b.m2899f(c0349s.f1169a), m788b, str);
                    return;
                }
                return;
            }
            throw AbstractC2487d.m4041e("Invalid content capture ID");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        if (r8 == null) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01cd  */
    /* renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5881l(int i7, C0482o c0482o) {
        InterfaceC3279c interfaceC3279c;
        int i8;
        C1781g m3334l;
        AutofillId m5840a;
        C2673p1 c2673p1;
        C0465c c0465c;
        C2673p1 c2673p12;
        String m5680A;
        int size;
        InterfaceC3279c interfaceC3279c2;
        if (!m5877h()) {
            return;
        }
        C2194h0 c2194h0 = c0482o.f1694d.f1683e;
        Object m3592g = c2194h0.m3592g(AbstractC0487t.f1727C);
        AbstractC3497e1 abstractC3497e1 = null;
        if (m3592g == null) {
            m3592g = null;
        }
        Boolean bool = (Boolean) m3592g;
        if (this.f18109j == EnumC3862a.f18097e && AbstractC3367j.m5096a(bool, Boolean.TRUE)) {
            Object m3592g2 = c2194h0.m3592g(AbstractC0476i.f1668l);
            if (m3592g2 == null) {
                m3592g2 = null;
            }
            C0468a c0468a = (C0468a) m3592g2;
            if (c0468a != null && (interfaceC3279c2 = (InterfaceC3279c) c0468a.f1639b) != null) {
            }
        } else if (this.f18109j == EnumC3862a.f18098f && AbstractC3367j.m5096a(bool, Boolean.FALSE)) {
            Object m3592g3 = c2194h0.m3592g(AbstractC0476i.f1668l);
            if (m3592g3 == null) {
                m3592g3 = null;
            }
            C0468a c0468a2 = (C0468a) m3592g3;
            if (c0468a2 != null && (interfaceC3279c = (InterfaceC3279c) c0468a2.f1639b) != null) {
            }
        }
        int i9 = c0482o.f1697g;
        C0349s c0349s = this.f18106g;
        if (c0349s != null && (i8 = Build.VERSION.SDK_INT) >= 29 && (m3334l = AbstractC2072e.m3334l(this.f18104e)) != null) {
            C0482o m1049l = c0482o.m1049l();
            int i10 = c0482o.f1697g;
            if (m1049l != null) {
                m5840a = c0349s.m788b(m1049l.f1697g);
            } else {
                m5840a = AbstractC3832a.m5840a(m3334l.f10824a);
            }
            long j6 = i10;
            if (i8 >= 29) {
                c2673p1 = new C2673p1(15, AbstractC0273a.m574d(AbstractC1765b.m2899f(c0349s.f1169a), m5840a, j6));
            } else {
                c2673p1 = null;
            }
            if (c2673p1 != null) {
                ViewStructure viewStructure = (ViewStructure) c2673p1.f14390f;
                C0477j c0477j = c0482o.f1694d;
                C0490w c0490w = AbstractC0487t.f1734J;
                C2194h0 c2194h02 = c0477j.f1683e;
                if (!c2194h02.m3588c(c0490w)) {
                    Bundle extras = viewStructure.getExtras();
                    if (extras != null) {
                        extras.putLong("android.view.contentcapture.EventTimestamp", this.f18114o);
                        extras.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i7);
                    }
                    Object m3592g4 = c2194h02.m3592g(AbstractC0487t.f1764y);
                    if (m3592g4 == null) {
                        m3592g4 = null;
                    }
                    String str = (String) m3592g4;
                    if (str != null) {
                        viewStructure.setId(i10, null, null, str);
                    }
                    Object m3592g5 = c2194h02.m3592g(AbstractC0487t.f1752m);
                    if (m3592g5 == null) {
                        m3592g5 = null;
                    }
                    if (((Boolean) m3592g5) != null) {
                        viewStructure.setClassName("android.widget.ViewGroup");
                    }
                    Object m3592g6 = c2194h02.m3592g(AbstractC0487t.f1725A);
                    if (m3592g6 == null) {
                        m3592g6 = null;
                    }
                    List list = (List) m3592g6;
                    if (list != null) {
                        viewStructure.setClassName("android.widget.TextView");
                        viewStructure.setText(AbstractC3353a.m5086a(list, "\n", null, 62));
                    }
                    Object m3592g7 = c2194h02.m3592g(AbstractC0487t.f1729E);
                    if (m3592g7 == null) {
                        m3592g7 = null;
                    }
                    C1587g c1587g = (C1587g) m3592g7;
                    if (c1587g != null) {
                        viewStructure.setClassName("android.widget.EditText");
                        viewStructure.setText(c1587g);
                    }
                    Object m3592g8 = c2194h02.m3592g(AbstractC0487t.f1740a);
                    if (m3592g8 == null) {
                        m3592g8 = null;
                    }
                    List list2 = (List) m3592g8;
                    if (list2 != null) {
                        viewStructure.setContentDescription(AbstractC3353a.m5086a(list2, "\n", null, 62));
                    }
                    Object m3592g9 = c2194h02.m3592g(AbstractC0487t.f1763x);
                    if (m3592g9 == null) {
                        m3592g9 = null;
                    }
                    C0474g c0474g = (C0474g) m3592g9;
                    if (c0474g != null && (m5680A = AbstractC3681h0.m5680A(c0474g.f1652a)) != null) {
                        viewStructure.setClassName(m5680A);
                    }
                    C1598l0 m5693t = AbstractC3681h0.m5693t(c0477j);
                    if (m5693t != null) {
                        C1596k0 c1596k0 = m5693t.f10288a;
                        C1604o0 c1604o0 = c1596k0.f10277b;
                        InterfaceC3093c interfaceC3093c = c1596k0.f10282g;
                        viewStructure.setTextStyle(interfaceC3093c.mo560l() * interfaceC3093c.mo559b() * C3105o.m4796c(c1604o0.f10309a.f10243b), 0, 0, 0);
                    }
                    AbstractC3497e1 m1042d = c0482o.m1042d();
                    if (m1042d != null) {
                        if (m1042d.mo5333V0().f18005r) {
                            abstractC3497e1 = m1042d;
                        }
                        if (abstractC3497e1 != null) {
                            c0465c = c0482o.m1039a(abstractC3497e1);
                            float f7 = c0465c.f1625a;
                            float f8 = c0465c.f1626b;
                            viewStructure.setDimens((int) f7, (int) f8, 0, 0, (int) (c0465c.f1627c - f7), (int) (c0465c.f1628d - f8));
                            c2673p12 = c2673p1;
                            if (c2673p12 != null) {
                                this.f18107h.add(new C3865d(i9, this.f18114o, EnumC3866e.f18123e, c2673p12));
                            }
                            List m1038j = C0482o.m1038j(4, c0482o);
                            size = m1038j.size();
                            int i11 = 0;
                            for (int i12 = 0; i12 < size; i12++) {
                                Object obj = m1038j.get(i12);
                                if (m5876g().m3611a(((C0482o) obj).f1697g)) {
                                    m5881l(i11, (C0482o) obj);
                                    i11++;
                                }
                            }
                        }
                    }
                    c0465c = C0465c.f1624e;
                    float f72 = c0465c.f1625a;
                    float f82 = c0465c.f1626b;
                    viewStructure.setDimens((int) f72, (int) f82, 0, 0, (int) (c0465c.f1627c - f72), (int) (c0465c.f1628d - f82));
                    c2673p12 = c2673p1;
                    if (c2673p12 != null) {
                    }
                    List m1038j2 = C0482o.m1038j(4, c0482o);
                    size = m1038j2.size();
                    int i112 = 0;
                    while (i12 < size) {
                    }
                }
            }
        }
        c2673p12 = null;
        if (c2673p12 != null) {
        }
        List m1038j22 = C0482o.m1038j(4, c0482o);
        size = m1038j22.size();
        int i1122 = 0;
        while (i12 < size) {
        }
    }

    /* renamed from: m */
    public final void m5882m(C0482o c0482o) {
        if (m5877h()) {
            this.f18107h.add(new C3865d(c0482o.f1697g, this.f18114o, EnumC3866e.f18124f, null));
            List m1038j = C0482o.m1038j(4, c0482o);
            int size = m1038j.size();
            for (int i7 = 0; i7 < size; i7++) {
                m5882m((C0482o) m1038j.get(i7));
            }
        }
    }

    /* renamed from: n */
    public final void m5883n() {
        C2221w c2221w = this.f18115p;
        c2221w.m3648c();
        AbstractC2201l m5876g = m5876g();
        int[] iArr = m5876g.f12706b;
        Object[] objArr = m5876g.f12707c;
        long[] jArr = m5876g.f12705a;
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
                            c2221w.m3652g(iArr[i10], new C3659b2(((C0483p) objArr[i10]).f1698a, m5876g()));
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        break;
                    }
                }
                if (i7 == length) {
                    break;
                } else {
                    i7++;
                }
            }
        }
        this.f18116q = new C3659b2(this.f18104e.getSemanticsOwner().m1055a(), m5876g());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f18112m.removeCallbacks(this.f18118s);
        this.f18106g = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
