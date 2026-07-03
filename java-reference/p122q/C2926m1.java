package p122q;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p109o1.C2799d;
import p140s2.C3107q;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.m1 */
/* loaded from: classes.dex */
public final class C2926m1 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public long f15216i;

    /* renamed from: j */
    public int f15217j;

    /* renamed from: k */
    public /* synthetic */ long f15218k;

    /* renamed from: l */
    public final /* synthetic */ C2929n1 f15219l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2926m1(C2929n1 c2929n1, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f15219l = c2929n1;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        long j6 = ((C3107q) obj).f15711a;
        C2926m1 c2926m1 = new C2926m1(this.f15219l, (InterfaceC2313c) obj2);
        c2926m1.f15218k = j6;
        return c2926m1.mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2926m1 c2926m1 = new C2926m1(this.f15219l, interfaceC2313c);
        c2926m1.f15218k = ((C3107q) obj).f15711a;
        return c2926m1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        if (r15 == r5) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        long j6;
        long j7;
        long j8;
        long j9;
        int i7 = this.f15217j;
        C2929n1 c2929n1 = this.f15219l;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        j9 = this.f15216i;
                        j8 = this.f15218k;
                        AbstractC1793a0.m2972L(obj);
                        return new C3107q(C3107q.m4803d(j8, C3107q.m4803d(j9, ((C3107q) obj).f15711a)));
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j7 = this.f15216i;
                j6 = this.f15218k;
                AbstractC1793a0.m2972L(obj);
                long j10 = ((C3107q) obj).f15711a;
                C2799d c2799d = c2929n1.f15234f;
                long m4803d = C3107q.m4803d(j7, j10);
                this.f15218k = j6;
                this.f15216i = j10;
                this.f15217j = 3;
                obj = c2799d.m4431a(m4803d, j10, this);
                if (obj != enumC2465a) {
                    j8 = j6;
                    j9 = j10;
                    return new C3107q(C3107q.m4803d(j8, C3107q.m4803d(j9, ((C3107q) obj).f15711a)));
                }
                return enumC2465a;
            }
            j6 = this.f15218k;
            AbstractC1793a0.m2972L(obj);
        } else {
            AbstractC1793a0.m2972L(obj);
            j6 = this.f15218k;
            C2799d c2799d2 = c2929n1.f15234f;
            this.f15218k = j6;
            this.f15217j = 1;
            obj = c2799d2.m4432b(j6, this);
        }
        long m4803d2 = C3107q.m4803d(j6, ((C3107q) obj).f15711a);
        this.f15218k = j6;
        this.f15216i = m4803d2;
        this.f15217j = 2;
        obj = c2929n1.m4589b(m4803d2, this);
        if (obj != enumC2465a) {
            j7 = m4803d2;
            long j102 = ((C3107q) obj).f15711a;
            C2799d c2799d3 = c2929n1.f15234f;
            long m4803d3 = C3107q.m4803d(j7, j102);
            this.f15218k = j6;
            this.f15216i = j102;
            this.f15217j = 3;
            obj = c2799d3.m4431a(m4803d3, j102, this);
            if (obj != enumC2465a) {
            }
        }
        return enumC2465a;
    }
}
