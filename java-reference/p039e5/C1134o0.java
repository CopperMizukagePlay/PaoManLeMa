package p039e5;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p122q.C2920k1;
import p122q.C2923l1;
import p122q.C2929n1;
import p122q.EnumC2931o0;
import p122q.InterfaceC2925m0;
import p140s2.C3107q;
import p150t5.InterfaceC3281e;
import p158u5.C3378u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.o0 */
/* loaded from: classes.dex */
public final class C1134o0 extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f6412i = 0;

    /* renamed from: j */
    public long f6413j;

    /* renamed from: k */
    public int f6414k;

    /* renamed from: l */
    public /* synthetic */ Object f6415l;

    /* renamed from: m */
    public long f6416m;

    /* renamed from: n */
    public Object f6417n;

    /* renamed from: o */
    public Serializable f6418o;

    /* renamed from: p */
    public final /* synthetic */ Object f6419p;

    /* renamed from: q */
    public final /* synthetic */ Serializable f6420q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134o0(AtomicLong atomicLong, C1196q0 c1196q0, String str, AtomicLong atomicLong2, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6417n = atomicLong;
        this.f6419p = c1196q0;
        this.f6420q = str;
        this.f6418o = atomicLong2;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        switch (this.f6412i) {
            case 0:
                return ((C1134o0) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
            default:
                return ((C1134o0) mo28k((C2923l1) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f6412i) {
            case 0:
                C1134o0 c1134o0 = new C1134o0((AtomicLong) this.f6417n, (C1196q0) this.f6419p, (String) this.f6420q, (AtomicLong) this.f6418o, interfaceC2313c);
                c1134o0.f6415l = obj;
                return c1134o0;
            default:
                C1134o0 c1134o02 = new C1134o0((C2929n1) this.f6419p, (C3378u) this.f6420q, this.f6416m, interfaceC2313c);
                c1134o02.f6415l = obj;
                return c1134o02;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00d2 -> B:27:0x00d5). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC0516a0 interfaceC0516a0;
        long j6;
        long nanoTime;
        C2929n1 c2929n1;
        C3378u c3378u;
        long j7;
        float m4802c;
        Object mo4587a;
        C2929n1 c2929n12;
        long m4800a;
        switch (this.f6412i) {
            case 0:
                AtomicLong atomicLong = (AtomicLong) this.f6417n;
                int i7 = this.f6414k;
                if (i7 != 0) {
                    if (i7 == 1) {
                        nanoTime = this.f6416m;
                        j6 = this.f6413j;
                        interfaceC0516a0 = (InterfaceC0516a0) this.f6415l;
                        AbstractC1793a0.m2972L(obj);
                        long nanoTime2 = System.nanoTime();
                        long j8 = atomicLong.get();
                        long j9 = (j8 - j6) * 1000000000;
                        long j10 = nanoTime2 - nanoTime;
                        if (j10 < 1) {
                            j10 = 1;
                        }
                        long j11 = j9 / j10;
                        if (j11 < 0) {
                            j11 = 0;
                        }
                        ((C1196q0) this.f6419p).m2123W(0, (String) this.f6420q, new C0917h((AtomicLong) this.f6418o, j11));
                        nanoTime = nanoTime2;
                        j6 = j8;
                        if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
                            this.f6415l = interfaceC0516a0;
                            this.f6413j = j6;
                            this.f6416m = nanoTime;
                            this.f6414k = 1;
                            Object m1131i = AbstractC0525d0.m1131i(500L, this);
                            EnumC2465a enumC2465a = EnumC2465a.f13750e;
                            if (m1131i == enumC2465a) {
                                return enumC2465a;
                            }
                            long nanoTime22 = System.nanoTime();
                            long j82 = atomicLong.get();
                            long j92 = (j82 - j6) * 1000000000;
                            long j102 = nanoTime22 - nanoTime;
                            if (j102 < 1) {
                            }
                            long j112 = j92 / j102;
                            if (j112 < 0) {
                            }
                            ((C1196q0) this.f6419p).m2123W(0, (String) this.f6420q, new C0917h((AtomicLong) this.f6418o, j112));
                            nanoTime = nanoTime22;
                            j6 = j82;
                            if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
                                return C1694m.f10482a;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    interfaceC0516a0 = (InterfaceC0516a0) this.f6415l;
                    j6 = atomicLong.get();
                    nanoTime = System.nanoTime();
                    if (AbstractC0525d0.m1139q(interfaceC0516a0)) {
                    }
                }
            default:
                int i8 = this.f6414k;
                EnumC2931o0 enumC2931o0 = EnumC2931o0.f15241f;
                if (i8 != 0) {
                    if (i8 == 1) {
                        long j12 = this.f6413j;
                        c3378u = (C3378u) this.f6418o;
                        c2929n1 = (C2929n1) this.f6417n;
                        c2929n12 = (C2929n1) this.f6415l;
                        AbstractC1793a0.m2972L(obj);
                        j7 = j12;
                        mo4587a = obj;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2923l1 c2923l1 = (C2923l1) this.f6415l;
                    c2929n1 = (C2929n1) this.f6419p;
                    C2920k1 c2920k1 = new C2920k1(c2929n1, c2923l1);
                    c3378u = (C3378u) this.f6420q;
                    long j13 = this.f6416m;
                    InterfaceC2925m0 interfaceC2925m0 = c2929n1.f15231c;
                    j7 = c3378u.f16450e;
                    if (c2929n1.f15232d == enumC2931o0) {
                        m4802c = C3107q.m4801b(j13);
                    } else {
                        m4802c = C3107q.m4802c(j13);
                    }
                    float m4590c = c2929n1.m4590c(m4802c);
                    this.f6415l = c2929n1;
                    this.f6417n = c2929n1;
                    this.f6418o = c3378u;
                    this.f6413j = j7;
                    this.f6414k = 1;
                    mo4587a = interfaceC2925m0.mo4587a(c2920k1, m4590c, this);
                    EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                    if (mo4587a != enumC2465a2) {
                        c2929n12 = c2929n1;
                    } else {
                        return enumC2465a2;
                    }
                }
                float m4590c2 = c2929n12.m4590c(((Number) mo4587a).floatValue());
                if (c2929n1.f15232d == enumC2931o0) {
                    m4800a = C3107q.m4800a(j7, m4590c2, 0.0f, 2);
                } else {
                    m4800a = C3107q.m4800a(j7, 0.0f, m4590c2, 1);
                }
                c3378u.f16450e = m4800a;
                return C1694m.f10482a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134o0(C2929n1 c2929n1, C3378u c3378u, long j6, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f6419p = c2929n1;
        this.f6420q = c3378u;
        this.f6416m = j6;
    }
}
