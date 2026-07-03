package p122q;

import androidx.compose.foundation.gestures.AbstractC0152a;
import p027d1.C0464b;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p107o.EnumC2788y0;
import p107o.InterfaceC2739f1;
import p140s2.C3107q;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.e1 */
/* loaded from: classes.dex */
public final class C2902e1 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f15129i;

    /* renamed from: j */
    public int f15130j;

    /* renamed from: k */
    public final /* synthetic */ C2911h1 f15131k;

    /* renamed from: l */
    public /* synthetic */ long f15132l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2902e1(C2911h1 c2911h1, long j6, InterfaceC2313c interfaceC2313c, int i7) {
        super(2, interfaceC2313c);
        this.f15129i = i7;
        this.f15131k = c2911h1;
        this.f15132l = j6;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f15129i) {
            case 0:
                return ((C2902e1) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 1:
                return ((C2902e1) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            case 2:
                return ((C2902e1) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                long j6 = ((C0464b) obj).f1623a;
                C2902e1 c2902e1 = new C2902e1(this.f15131k, (InterfaceC2313c) obj2);
                c2902e1.f15132l = j6;
                return c2902e1.mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f15129i) {
            case 0:
                return new C2902e1(this.f15131k, this.f15132l, interfaceC2313c, 0);
            case 1:
                return new C2902e1(this.f15131k, this.f15132l, interfaceC2313c, 1);
            case 2:
                return new C2902e1(this.f15131k, this.f15132l, interfaceC2313c, 2);
            default:
                C2902e1 c2902e1 = new C2902e1(this.f15131k, interfaceC2313c);
                c2902e1.f15132l = ((C0464b) obj).f1623a;
                return c2902e1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00e4, code lost:
    
        if (r8 == r5) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e7, code lost:
    
        r8 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
    
        if (r8 != r5) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00fb, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f6, code lost:
    
        if (r8 == r5) goto L58;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        long m4800a;
        Object mo29m;
        switch (this.f15129i) {
            case 0:
                int i7 = this.f15130j;
                C1694m c1694m = C1694m.f10482a;
                if (i7 != 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C2929n1 c2929n1 = this.f15131k.f15168H;
                long j6 = this.f15132l;
                this.f15130j = 1;
                if (c2929n1.f15232d == EnumC2931o0.f15241f) {
                    m4800a = C3107q.m4800a(j6, 0.0f, 0.0f, 1);
                } else {
                    m4800a = C3107q.m4800a(j6, 0.0f, 0.0f, 2);
                }
                C2926m1 c2926m1 = new C2926m1(c2929n1, null);
                InterfaceC2739f1 interfaceC2739f1 = c2929n1.f15230b;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (interfaceC2739f1 != null && (c2929n1.f15229a.mo115d() || c2929n1.f15229a.mo113b())) {
                    mo29m = interfaceC2739f1.mo4394e(m4800a, c2926m1, this);
                    break;
                } else {
                    C2926m1 c2926m12 = new C2926m1(c2926m1.f15219l, this);
                    c2926m12.f15218k = m4800a;
                    mo29m = c2926m12.mo29m(c1694m);
                    break;
                }
            case 1:
                int i8 = this.f15130j;
                if (i8 != 0) {
                    if (i8 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2929n1 c2929n12 = this.f15131k.f15168H;
                    C2905f1 c2905f1 = new C2905f1(this.f15132l, null, 0);
                    this.f15130j = 1;
                    Object m4592e = c2929n12.m4592e(EnumC2788y0.f14797f, c2905f1, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (m4592e == enumC2465a2) {
                        return enumC2465a2;
                    }
                }
                return C1694m.f10482a;
            case 2:
                int i9 = this.f15130j;
                if (i9 != 0) {
                    if (i9 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2929n1 c2929n13 = this.f15131k.f15168H;
                    C2905f1 c2905f12 = new C2905f1(this.f15132l, null, 1);
                    this.f15130j = 1;
                    Object m4592e2 = c2929n13.m4592e(EnumC2788y0.f14797f, c2905f12, this);
                    EnumC2465a enumC2465a3 = EnumC2465a.f13750e;
                    if (m4592e2 == enumC2465a3) {
                        return enumC2465a3;
                    }
                }
                return C1694m.f10482a;
            default:
                int i10 = this.f15130j;
                if (i10 != 0) {
                    if (i10 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                long j7 = this.f15132l;
                C2929n1 c2929n14 = this.f15131k.f15168H;
                this.f15130j = 1;
                Object m327a = AbstractC0152a.m327a(c2929n14, j7, this);
                EnumC2465a enumC2465a4 = EnumC2465a.f13750e;
                if (m327a == enumC2465a4) {
                    return enumC2465a4;
                }
                return m327a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2902e1(C2911h1 c2911h1, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15129i = 3;
        this.f15131k = c2911h1;
    }
}
