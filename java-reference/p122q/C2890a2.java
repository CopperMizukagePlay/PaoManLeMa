package p122q;

import p001a0.C0013d;
import p001a0.C0037j;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2418w;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p100n.AbstractC2667n1;
import p100n.C2649h1;
import p100n.C2662m;
import p100n.InterfaceC2656k;
import p100n.InterfaceC2670o1;
import p107o.C2746i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p177x0.C3795c;
import p177x0.InterfaceC3811s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.a2 */
/* loaded from: classes.dex */
public final class C2890a2 {

    /* renamed from: f */
    public static final C2662m f15093f = new C2662m(0.0f);

    /* renamed from: a */
    public final InterfaceC2670o1 f15094a;

    /* renamed from: b */
    public long f15095b = Long.MIN_VALUE;

    /* renamed from: c */
    public C2662m f15096c = f15093f;

    /* renamed from: d */
    public boolean f15097d;

    /* renamed from: e */
    public float f15098e;

    public C2890a2(InterfaceC2656k interfaceC2656k) {
        this.f15094a = interfaceC2656k.mo4196a(AbstractC2667n1.f14365a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b3, code lost:
    
        if (r13 != 0.0f) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00de, code lost:
    
        if (p085l0.AbstractC2418w.m3976s(r15).mo3790m(r0, r1) == r9) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /* JADX WARN: Type inference failed for: r14v0, types: [o.i] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v2, types: [q.a2] */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v7, types: [t5.c] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00ab -> B:24:0x00ae). Please report as a decompilation issue!!! */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4567a(C0037j c0037j, C2746i c2746i, AbstractC2583c abstractC2583c) {
        C2965z1 c2965z1;
        int i7;
        float f7;
        C2965z1 c2965z12;
        InterfaceC3277a interfaceC3277a;
        C0037j c0037j2;
        float f8;
        C2890a2 c2890a2;
        InterfaceC3277a interfaceC3277a2;
        C2890a2 c2890a22;
        try {
            if (abstractC2583c instanceof C2965z1) {
                c2965z1 = (C2965z1) abstractC2583c;
                int i8 = c2965z1.f15368n;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    c2965z1.f15368n = i8 - Integer.MIN_VALUE;
                    Object obj = c2965z1.f15366l;
                    i7 = c2965z1.f15368n;
                    C2662m c2662m = f15093f;
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (i7 == 0) {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                interfaceC3277a2 = (InterfaceC3277a) c2965z1.f15363i;
                                C2890a2 c2890a23 = c2965z1.f15362h;
                                AbstractC1793a0.m2972L(obj);
                                c2746i = c2890a23;
                                interfaceC3277a2.mo52a();
                                c2890a22 = c2746i;
                                c2890a22.f15095b = Long.MIN_VALUE;
                                c2890a22.f15096c = c2662m;
                                c2890a22.f15097d = false;
                                return C1694m.f10482a;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        f8 = c2965z1.f15365k;
                        InterfaceC3277a interfaceC3277a3 = c2965z1.f15364j;
                        ?? r12 = (InterfaceC3279c) c2965z1.f15363i;
                        C2890a2 c2890a24 = c2965z1.f15362h;
                        try {
                            AbstractC1793a0.m2972L(obj);
                            C2965z1 c2965z13 = c2965z1;
                            interfaceC3277a = interfaceC3277a3;
                            c0037j2 = r12;
                            c2965z12 = c2965z13;
                            c2890a2 = c2890a24;
                        } catch (Throwable th) {
                            th = th;
                            c2746i = c2890a24;
                            c2746i.f15095b = Long.MIN_VALUE;
                            c2746i.f15096c = c2662m;
                            c2746i.f15097d = false;
                            throw th;
                        }
                        try {
                            interfaceC3277a.mo52a();
                        } catch (Throwable th2) {
                            th = th2;
                            c2746i = c2890a2;
                            c2746i.f15095b = Long.MIN_VALUE;
                            c2746i.f15096c = c2662m;
                            c2746i.f15097d = false;
                            throw th;
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        if (!this.f15097d) {
                            InterfaceC2318h interfaceC2318h = c2965z1.f13999f;
                            AbstractC3367j.m5097b(interfaceC2318h);
                            InterfaceC3811s interfaceC3811s = (InterfaceC3811s) interfaceC2318h.mo853h(C3795c.f17979t);
                            if (interfaceC3811s != null) {
                                f7 = interfaceC3811s.mo851A();
                            } else {
                                f7 = 1.0f;
                            }
                            this.f15097d = true;
                            c2965z12 = c2965z1;
                            interfaceC3277a = c2746i;
                            c0037j2 = c0037j;
                            f8 = f7;
                            c2890a2 = this;
                            if (Math.abs(c2890a2.f15098e) >= 0.01f) {
                                C0013d c0013d = new C0013d(c2890a2, f8, c0037j2);
                                c2965z12.f15362h = c2890a2;
                                c2965z12.f15363i = c0037j2;
                                c2965z12.f15364j = interfaceC3277a;
                                c2965z12.f15365k = f8;
                                c2965z12.f15368n = 1;
                                InterfaceC2318h interfaceC2318h2 = c2965z12.f13999f;
                                AbstractC3367j.m5097b(interfaceC2318h2);
                                if (AbstractC2418w.m3976s(interfaceC2318h2).mo3790m(c0013d, c2965z12) == enumC2465a) {
                                    return enumC2465a;
                                }
                                interfaceC3277a.mo52a();
                            }
                            C2890a2 c2890a25 = c2890a2;
                            C0037j c0037j3 = c0037j2;
                            C2890a2 c2890a26 = c2890a25;
                            interfaceC3277a2 = interfaceC3277a;
                            if (Math.abs(c2890a26.f15098e) != 0.0f) {
                                C2649h1 c2649h1 = new C2649h1(11, c2890a26, c0037j3);
                                c2965z12.f15362h = c2890a26;
                                c2965z12.f15363i = interfaceC3277a2;
                                c2965z12.f15364j = null;
                                c2965z12.f15368n = 2;
                                InterfaceC2318h interfaceC2318h3 = c2965z12.f13999f;
                                AbstractC3367j.m5097b(interfaceC2318h3);
                                c2746i = c2890a26;
                            } else {
                                c2890a22 = c2890a26;
                                c2890a22.f15095b = Long.MIN_VALUE;
                                c2890a22.f15096c = c2662m;
                                c2890a22.f15097d = false;
                                return C1694m.f10482a;
                            }
                        } else {
                            throw new IllegalStateException("animateToZero called while previous animation is running");
                        }
                    }
                }
            }
            if (i7 == 0) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
        c2965z1 = new C2965z1(this, abstractC2583c);
        Object obj2 = c2965z1.f15366l;
        i7 = c2965z1.f15368n;
        C2662m c2662m2 = f15093f;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
    }
}
