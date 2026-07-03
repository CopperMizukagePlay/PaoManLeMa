package p160v;

import p001a0.C0013d;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p100n.AbstractC2638e;
import p100n.C2659l;
import p122q.InterfaceC2958x0;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3281e;
import p158u5.C3374q;
import p158u5.C3377t;
import p158u5.C3379v;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.k */
/* loaded from: classes.dex */
public final class C3418k extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public C3374q f16570i;

    /* renamed from: j */
    public C3379v f16571j;

    /* renamed from: k */
    public C3377t f16572k;

    /* renamed from: l */
    public float f16573l;

    /* renamed from: m */
    public float f16574m;

    /* renamed from: n */
    public float f16575n;

    /* renamed from: o */
    public int f16576o;

    /* renamed from: p */
    public int f16577p;

    /* renamed from: q */
    public /* synthetic */ Object f16578q;

    /* renamed from: r */
    public final /* synthetic */ int f16579r;

    /* renamed from: s */
    public final /* synthetic */ InterfaceC3093c f16580s;

    /* renamed from: t */
    public final /* synthetic */ InterfaceC3422m f16581t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3418k(int i7, InterfaceC3093c interfaceC3093c, InterfaceC3422m interfaceC3422m, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f16579r = i7;
        this.f16580s = interfaceC3093c;
        this.f16581t = interfaceC3422m;
    }

    /* renamed from: q */
    public static final boolean m5179q(boolean z7, InterfaceC3422m interfaceC3422m, int i7) {
        if (z7) {
            if (interfaceC3422m.mo4282i() <= i7) {
                if (interfaceC3422m.mo4282i() == i7 && interfaceC3422m.mo4277d() > 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        if (interfaceC3422m.mo4282i() >= i7) {
            if (interfaceC3422m.mo4282i() == i7 && interfaceC3422m.mo4277d() < 0) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C3418k) mo28k((InterfaceC2958x0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C3418k c3418k = new C3418k(this.f16579r, this.f16580s, this.f16581t, interfaceC2313c);
        c3418k.f16578q = obj;
        return c3418k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01b4, code lost:
    
        if (p100n.AbstractC2638e.m4223i(r1, r1, null, !r9, r4, r27, 2) == r14) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1 A[Catch: i -> 0x00c2, TryCatch #0 {i -> 0x00c2, blocks: (B:17:0x014c, B:19:0x009d, B:21:0x00a1, B:23:0x00a7, B:25:0x00b5, B:28:0x00cc, B:31:0x00f5, B:35:0x010e, B:40:0x013c), top: B:16:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b5 A[Catch: i -> 0x00c2, TryCatch #0 {i -> 0x00c2, blocks: (B:17:0x014c, B:19:0x009d, B:21:0x00a1, B:23:0x00a7, B:25:0x00b5, B:28:0x00cc, B:31:0x00f5, B:35:0x010e, B:40:0x013c), top: B:16:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Type inference failed for: r15v0, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r20v0, types: [u5.s, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v4, types: [u5.q, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, u5.v] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0144 -> B:16:0x014c). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C2659l m4226l;
        boolean z7;
        int i7;
        float f7;
        InterfaceC2958x0 interfaceC2958x0;
        C3377t c3377t;
        float f8;
        float f9;
        int i8;
        C3379v c3379v;
        C3374q c3374q;
        float mo4279f;
        float f10;
        C2659l m4226l2;
        Float f11;
        boolean z8;
        boolean z9;
        C3416j c3416j;
        boolean z10;
        C3374q c3374q2;
        C3379v c3379v2;
        InterfaceC2958x0 interfaceC2958x02;
        float f12;
        float f13;
        InterfaceC3093c interfaceC3093c = this.f16580s;
        int i9 = this.f16577p;
        int i10 = 30;
        Object obj2 = 2;
        int i11 = 0;
        float f14 = 0.0f;
        InterfaceC3422m interfaceC3422m = this.f16581t;
        int i12 = this.f16579r;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        try {
        } catch (C3414i e7) {
            e = e7;
        }
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    AbstractC1793a0.m2972L(obj);
                    interfaceC3422m.mo4283j(i12);
                    return C1694m.f10482a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i13 = this.f16576o;
            float f15 = this.f16575n;
            float f16 = this.f16574m;
            float f17 = this.f16573l;
            C3377t c3377t2 = this.f16572k;
            C3379v c3379v3 = this.f16571j;
            C3374q c3374q3 = this.f16570i;
            InterfaceC2958x0 interfaceC2958x03 = (InterfaceC2958x0) this.f16578q;
            AbstractC1793a0.m2972L(obj);
            f7 = f16;
            C3377t c3377t3 = c3377t2;
            C3379v c3379v4 = c3379v3;
            interfaceC2958x0 = interfaceC2958x03;
            i8 = i13;
            f9 = f17;
            C3374q c3374q4 = c3374q3;
            f8 = f15;
            try {
                c3377t3.f16449e++;
                c3377t = c3377t3;
                i10 = 30;
                i11 = 0;
                f14 = 0.0f;
                c3374q = c3374q4;
                c3379v = c3379v4;
            } catch (C3414i e8) {
                e = e8;
                obj2 = interfaceC2958x0;
                m4226l = AbstractC2638e.m4226l(e.f16555f, 0.0f, 0.0f, 30);
                float f18 = e.f16554e;
                Object obj3 = new Object();
                Float f19 = new Float(f18);
                if (((Number) m4226l.m4265a()).floatValue() != 0.0f) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C0013d c0013d = new C0013d(f18, obj3, obj2, 3);
                this.f16578q = obj2;
                this.f16570i = null;
                this.f16571j = null;
                this.f16572k = null;
                this.f16577p = 2;
            }
            if (c3374q.f16446e && interfaceC3422m.mo4276a() > 0) {
                try {
                    mo4279f = interfaceC3422m.mo4279f(i12) + i11;
                    if (Math.abs(mo4279f) < f9) {
                        f10 = Math.max(Math.abs(mo4279f), f8);
                        if (i8 == 0) {
                            f10 = -f10;
                        }
                    } else if (i8 != 0) {
                        f10 = f9;
                    } else {
                        f10 = -f9;
                    }
                    m4226l2 = AbstractC2638e.m4226l((C2659l) c3379v.f16451e, f14, f14, i10);
                    c3379v.f16451e = m4226l2;
                    ?? obj4 = new Object();
                    f11 = new Float(f10);
                    if (((Number) ((C2659l) c3379v.f16451e).m4265a()).floatValue() != f14) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = !z8;
                    InterfaceC3422m interfaceC3422m2 = this.f16581t;
                    int i14 = this.f16579r;
                    if (i8 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    c3374q2 = c3374q;
                    c3379v2 = c3379v;
                    c3416j = new C3416j(interfaceC3422m2, i14, f10, obj4, interfaceC2958x0, c3374q2, z10, f7, c3377t, c3379v2);
                    this.f16578q = interfaceC2958x02;
                    this.f16570i = c3374q2;
                    this.f16571j = c3379v2;
                    this.f16572k = c3377t3;
                    this.f16573l = f9;
                    this.f16574m = f12;
                    this.f16575n = f8;
                    this.f16576o = i8;
                    this.f16577p = 1;
                    f13 = f9;
                    interfaceC2958x0 = interfaceC2958x02;
                } catch (C3414i e9) {
                    e = e9;
                    interfaceC2958x0 = interfaceC2958x02;
                    obj2 = interfaceC2958x0;
                    m4226l = AbstractC2638e.m4226l(e.f16555f, 0.0f, 0.0f, 30);
                    float f182 = e.f16554e;
                    Object obj32 = new Object();
                    Float f192 = new Float(f182);
                    if (((Number) m4226l.m4265a()).floatValue() != 0.0f) {
                    }
                    C0013d c0013d2 = new C0013d(f182, obj32, obj2, 3);
                    this.f16578q = obj2;
                    this.f16570i = null;
                    this.f16571j = null;
                    this.f16572k = null;
                    this.f16577p = 2;
                }
                interfaceC2958x02 = interfaceC2958x0;
                f12 = f7;
                c3377t3 = c3377t;
                if (AbstractC2638e.m4223i(m4226l2, f11, null, z9, c3416j, this, 2) == enumC2465a) {
                    f7 = f12;
                    f9 = f13;
                    c3374q4 = c3374q2;
                    c3379v4 = c3379v2;
                    c3377t3.f16449e++;
                    c3377t = c3377t3;
                    i10 = 30;
                    i11 = 0;
                    f14 = 0.0f;
                    c3374q = c3374q4;
                    c3379v = c3379v4;
                    if (c3374q.f16446e) {
                        mo4279f = interfaceC3422m.mo4279f(i12) + i11;
                        if (Math.abs(mo4279f) < f9) {
                        }
                        m4226l2 = AbstractC2638e.m4226l((C2659l) c3379v.f16451e, f14, f14, i10);
                        c3379v.f16451e = m4226l2;
                        ?? obj42 = new Object();
                        f11 = new Float(f10);
                        if (((Number) ((C2659l) c3379v.f16451e).m4265a()).floatValue() != f14) {
                        }
                        z9 = !z8;
                        InterfaceC3422m interfaceC3422m22 = this.f16581t;
                        int i142 = this.f16579r;
                        if (i8 == 0) {
                        }
                        c3374q2 = c3374q;
                        c3379v2 = c3379v;
                        c3416j = new C3416j(interfaceC3422m22, i142, f10, obj42, interfaceC2958x0, c3374q2, z10, f7, c3377t, c3379v2);
                        interfaceC2958x02 = interfaceC2958x0;
                        f12 = f7;
                        c3377t3 = c3377t;
                        this.f16578q = interfaceC2958x02;
                        this.f16570i = c3374q2;
                        this.f16571j = c3379v2;
                        this.f16572k = c3377t3;
                        this.f16573l = f9;
                        this.f16574m = f12;
                        this.f16575n = f8;
                        this.f16576o = i8;
                        this.f16577p = 1;
                        f13 = f9;
                        interfaceC2958x0 = interfaceC2958x02;
                        if (AbstractC2638e.m4223i(m4226l2, f11, null, z9, c3416j, this, 2) == enumC2465a) {
                        }
                    }
                } else {
                    return enumC2465a;
                }
            }
            return C1694m.f10482a;
        }
        AbstractC1793a0.m2972L(obj);
        InterfaceC2958x0 interfaceC2958x04 = (InterfaceC2958x0) this.f16578q;
        if (i12 >= 0.0f) {
            float mo4526y = interfaceC3093c.mo4526y(AbstractC3420l.f16584a);
            float mo4526y2 = interfaceC3093c.mo4526y(AbstractC3420l.f16585b);
            float mo4526y3 = interfaceC3093c.mo4526y(AbstractC3420l.f16586c);
            ?? obj5 = new Object();
            obj5.f16446e = true;
            ?? obj6 = new Object();
            obj6.f16451e = AbstractC2638e.m4216b(0.0f, 0.0f, 30);
            if (!AbstractC3420l.m5181a(interfaceC3422m, i12)) {
                if (i12 > interfaceC3422m.mo4282i()) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                ?? obj7 = new Object();
                obj7.f16449e = 1;
                f7 = mo4526y2;
                interfaceC2958x0 = interfaceC2958x04;
                c3377t = obj7;
                f8 = mo4526y3;
                f9 = mo4526y;
                i8 = i7;
                c3374q = obj5;
                c3379v = obj6;
                if (c3374q.f16446e) {
                }
                return C1694m.f10482a;
            }
            throw new C3414i(AbstractC3784a.m5794D(interfaceC3422m.mo4279f(i12)), (C2659l) obj6.f16451e);
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i12 + ')').toString());
    }
}
