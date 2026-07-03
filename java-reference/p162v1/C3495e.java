package p162v1;

import p001a0.C0068q2;
import p036e2.C0685a;
import p053g5.C1694m;
import p077k.C2194h0;
import p077k.C2196i0;
import p101n0.C2705e;
import p144t.AbstractC3122c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.e */
/* loaded from: classes.dex */
public final class C3495e extends AbstractC3368k implements InterfaceC3279c {

    /* renamed from: g */
    public static final C3495e f16811g;

    /* renamed from: h */
    public static final C3495e f16812h;

    /* renamed from: i */
    public static final C3495e f16813i;

    /* renamed from: j */
    public static final C3495e f16814j;

    /* renamed from: k */
    public static final C3495e f16815k;

    /* renamed from: l */
    public static final C3495e f16816l;

    /* renamed from: m */
    public static final C3495e f16817m;

    /* renamed from: n */
    public static final C3495e f16818n;

    /* renamed from: o */
    public static final C3495e f16819o;

    /* renamed from: p */
    public static final C3495e f16820p;

    /* renamed from: q */
    public static final C3495e f16821q;

    /* renamed from: r */
    public static final C3495e f16822r;

    /* renamed from: f */
    public final /* synthetic */ int f16823f;

    static {
        int i7 = 1;
        f16811g = new C3495e(i7, 0);
        f16812h = new C3495e(i7, 1);
        f16813i = new C3495e(i7, 2);
        f16814j = new C3495e(i7, 3);
        f16815k = new C3495e(i7, 4);
        f16816l = new C3495e(i7, 5);
        f16817m = new C3495e(i7, 6);
        f16818n = new C3495e(i7, 7);
        f16819o = new C3495e(i7, 8);
        f16820p = new C3495e(i7, 9);
        f16821q = new C3495e(i7, 10);
        f16822r = new C3495e(i7, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3495e(int i7, int i8) {
        super(i7);
        this.f16823f = i8;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        switch (this.f16823f) {
            case 0:
                ((C3488c) obj).m5299M0();
                return C1694m.f10482a;
            case 1:
                C3536r1 c3536r1 = (C3536r1) obj;
                if (c3536r1.mo5303z()) {
                    AbstractC3526o0 abstractC3526o0 = c3536r1.f17009f;
                    if (!abstractC3526o0.f16978o) {
                        InterfaceC3279c mo4885d = c3536r1.f17008e.mo4885d();
                        C2194h0 c2194h0 = abstractC3526o0.f16981r;
                        if (mo4885d == null) {
                            if (c2194h0 != null) {
                                Object[] objArr = c2194h0.f12678c;
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
                                                    abstractC3526o0.m5488I0((C2196i0) objArr[(i7 << 3) + i9]);
                                                }
                                                j6 >>= 8;
                                            }
                                            if (i8 != 8) {
                                            }
                                        }
                                        if (i7 != length) {
                                            i7++;
                                        }
                                    }
                                }
                                c2194h0.m3586a();
                            }
                        } else {
                            abstractC3526o0.m5492w0(c3536r1, 9223372034707292159L, 0L);
                            abstractC3526o0.f16974k = mo4885d;
                        }
                    }
                }
                return C1694m.f10482a;
            case 2:
                InterfaceC3521m1 interfaceC3521m1 = ((AbstractC3497e1) obj).f16845M;
                if (interfaceC3521m1 != null) {
                    interfaceC3521m1.invalidate();
                }
                return C1694m.f10482a;
            case 3:
                AbstractC3497e1 abstractC3497e1 = (AbstractC3497e1) obj;
                if (abstractC3497e1.mo5303z() && abstractC3497e1.m5358v1(true)) {
                    C3502g0 c3502g0 = abstractC3497e1.f16847s;
                    C3514k0 c3514k0 = c3502g0.f16873J;
                    if (c3514k0.f16949l > 0) {
                        if (c3514k0.f16948k || c3514k0.f16947j) {
                            c3502g0.m5420X(false);
                        }
                        c3514k0.f16953p.m5533y0();
                    }
                    c3502g0.m5413O();
                    C3728t c3728t = (C3728t) AbstractC3511j0.m5464a(c3502g0);
                    C0685a rectManager = c3728t.getRectManager();
                    if (abstractC3497e1 == c3502g0.f16872I.f16800d) {
                        rectManager.m1471g(c3502g0, false);
                        rectManager.m1469e(c3502g0);
                    } else {
                        rectManager.m1470f(c3502g0);
                    }
                    if (c3502g0.f16882S > 0) {
                        C0068q2 c0068q2 = c3728t.f17730S.f17055e;
                        c0068q2.getClass();
                        if (c3502g0.f16882S > 0) {
                            ((C2705e) c0068q2.f344f).m4300b(c3502g0);
                            c3502g0.f16881R = true;
                        }
                        c3728t.m5732G(null);
                    }
                }
                return C1694m.f10482a;
            case 4:
                C3512j1 c3512j1 = (C3512j1) obj;
                if (c3512j1.mo5303z()) {
                    c3512j1.f16937e.mo553M();
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15761f /* 5 */:
                C3502g0 c3502g02 = (C3502g0) obj;
                if (c3502g02.m5407I()) {
                    c3502g02.m5420X(false);
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15759d /* 6 */:
                C3502g0 c3502g03 = (C3502g0) obj;
                if (c3502g03.m5407I()) {
                    c3502g03.m5420X(false);
                }
                return C1694m.f10482a;
            case 7:
                C3502g0 c3502g04 = (C3502g0) obj;
                if (c3502g04.m5407I()) {
                    c3502g04.m5419V(false);
                }
                return C1694m.f10482a;
            case 8:
                C3502g0 c3502g05 = (C3502g0) obj;
                if (c3502g05.m5407I()) {
                    c3502g05.m5419V(false);
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15758c /* 9 */:
                C3502g0 c3502g06 = (C3502g0) obj;
                if (c3502g06.m5407I()) {
                    C3502g0.m5395W(c3502g06, false, 7);
                }
                return C1694m.f10482a;
            case AbstractC3122c.f15760e /* 10 */:
                C3502g0 c3502g07 = (C3502g0) obj;
                if (c3502g07.m5407I()) {
                    C3502g0.m5396Y(c3502g07, false, 7);
                }
                return C1694m.f10482a;
            default:
                C3502g0 c3502g08 = (C3502g0) obj;
                if (c3502g08.m5407I()) {
                    c3502g08.m5405G();
                }
                return C1694m.f10482a;
        }
    }
}
