package p117p1;

import androidx.compose.p007ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import p001a0.C0005b;
import p001a0.C0075s1;
import p032d6.AbstractC0525d0;
import p032d6.C0548l;
import p032d6.C0565q1;
import p053g5.C1694m;
import p065i2.AbstractC2064e;
import p082k5.C2320j;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p101n0.C2705e;
import p139s1.AbstractC3089b;
import p140s2.InterfaceC3093c;
import p150t5.InterfaceC3281e;
import p162v1.AbstractC3498f;
import p162v1.InterfaceC3539s1;
import p177x0.AbstractC3809q;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.h0 */
/* loaded from: classes.dex */
public final class C2857h0 extends AbstractC3809q implements InterfaceC2872w, InterfaceC3093c, InterfaceC3539s1 {

    /* renamed from: A */
    public final C2705e f14978A;

    /* renamed from: B */
    public C2859j f14979B;

    /* renamed from: C */
    public long f14980C;

    /* renamed from: s */
    public Object f14981s;

    /* renamed from: t */
    public Object f14982t;

    /* renamed from: u */
    public AbstractC2590j f14983u;

    /* renamed from: v */
    public PointerInputEventHandler f14984v;

    /* renamed from: w */
    public C0565q1 f14985w;

    /* renamed from: x */
    public C2859j f14986x = AbstractC2847c0.f14941a;

    /* renamed from: y */
    public final C2705e f14987y;

    /* renamed from: z */
    public final C2705e f14988z;

    public C2857h0(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler) {
        this.f14981s = obj;
        this.f14982t = obj2;
        this.f14984v = pointerInputEventHandler;
        C2705e c2705e = new C2705e(new C2855g0[16]);
        this.f14987y = c2705e;
        this.f14988z = c2705e;
        this.f14978A = new C2705e(new C2855g0[16]);
        this.f14980C = 0L;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // p162v1.InterfaceC3539s1
    /* renamed from: A */
    public final void mo545A(C2859j c2859j, EnumC2860k enumC2860k, long j6) {
        this.f14980C = j6;
        if (enumC2860k == EnumC2860k.f14995e) {
            this.f14986x = c2859j;
        }
        InterfaceC2313c interfaceC2313c = null;
        if (this.f14985w == null) {
            this.f14985w = AbstractC0525d0.m1141s(m5830y0(), null, new C0075s1(this, interfaceC2313c, 8), 1);
        }
        m4534L0(c2859j, enumC2860k);
        ?? r42 = c2859j.f14991a;
        int size = r42.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                if (!AbstractC2866q.m4544c((C2868s) r42.get(i7))) {
                    break;
                } else {
                    i7++;
                }
            } else {
                c2859j = null;
                break;
            }
        }
        this.f14979B = c2859j;
    }

    @Override // p177x0.AbstractC3809q
    /* renamed from: D0 */
    public final void mo198D0() {
        m4535M0();
    }

    /* renamed from: K0 */
    public final Object m4533K0(InterfaceC3281e interfaceC3281e, InterfaceC2313c interfaceC2313c) {
        C0548l c0548l = new C0548l(1, AbstractC2064e.m3250x(interfaceC2313c));
        c0548l.m1222u();
        C2855g0 c2855g0 = new C2855g0(this, c0548l);
        synchronized (this.f14988z) {
            this.f14987y.m4300b(c2855g0);
            new C2320j(AbstractC2064e.m3250x(AbstractC2064e.m3242p(c2855g0, c2855g0, interfaceC3281e)), EnumC2465a.f13750e).mo663n(C1694m.f10482a);
        }
        c0548l.m1224w(new C0005b(22, c2855g0));
        return c0548l.m1221t();
    }

    /* renamed from: L0 */
    public final void m4534L0(C2859j c2859j, EnumC2860k enumC2860k) {
        C0548l c0548l;
        C0548l c0548l2;
        synchronized (this.f14988z) {
            C2705e c2705e = this.f14978A;
            c2705e.m4302d(c2705e.f14519g, this.f14987y);
        }
        try {
            int ordinal = enumC2860k.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        throw new RuntimeException();
                    }
                } else {
                    C2705e c2705e2 = this.f14978A;
                    int i7 = c2705e2.f14519g - 1;
                    Object[] objArr = c2705e2.f14517e;
                    if (i7 < objArr.length) {
                        while (i7 >= 0) {
                            C2855g0 c2855g0 = (C2855g0) objArr[i7];
                            if (enumC2860k == c2855g0.f14967h && (c0548l2 = c2855g0.f14966g) != null) {
                                c2855g0.f14966g = null;
                                c0548l2.mo663n(c2859j);
                            }
                            i7--;
                        }
                    }
                    this.f14978A.m4305g();
                }
            }
            C2705e c2705e3 = this.f14978A;
            Object[] objArr2 = c2705e3.f14517e;
            int i8 = c2705e3.f14519g;
            for (int i9 = 0; i9 < i8; i9++) {
                C2855g0 c2855g02 = (C2855g0) objArr2[i9];
                if (enumC2860k == c2855g02.f14967h && (c0548l = c2855g02.f14966g) != null) {
                    c2855g02.f14966g = null;
                    c0548l.mo663n(c2859j);
                }
            }
            this.f14978A.m4305g();
        } catch (Throwable th) {
            this.f14978A.m4305g();
            throw th;
        }
    }

    /* renamed from: M0 */
    public final void m4535M0() {
        C0565q1 c0565q1 = this.f14985w;
        if (c0565q1 != null) {
            c0565q1.mo1174H(new AbstractC3089b("Pointer input was reset", 0));
            this.f14985w = null;
        }
    }

    @Override // p162v1.InterfaceC3516l
    /* renamed from: a */
    public final void mo554a() {
        m4535M0();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return AbstractC3498f.m5382v(this).f16865B.mo559b();
    }

    @Override // p162v1.InterfaceC3539s1
    /* renamed from: c0 */
    public final void mo4536c0() {
        m4535M0();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // p162v1.InterfaceC3539s1
    /* renamed from: i0 */
    public final void mo548i0() {
        C2859j c2859j = this.f14979B;
        if (c2859j != null) {
            ?? r12 = c2859j.f14991a;
            int size = r12.size();
            for (int i7 = 0; i7 < size; i7++) {
                if (((C2868s) r12.get(i7)).f15009d) {
                    ArrayList arrayList = new ArrayList(r12.size());
                    int size2 = r12.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        C2868s c2868s = (C2868s) r12.get(i8);
                        long j6 = c2868s.f15006a;
                        long j7 = c2868s.f15008c;
                        long j8 = c2868s.f15007b;
                        float f7 = c2868s.f15010e;
                        boolean z7 = c2868s.f15009d;
                        arrayList.add(new C2868s(j6, j8, j7, false, f7, j8, j7, z7, z7, c2868s.f15014i, 0L));
                    }
                    C2859j c2859j2 = new C2859j(arrayList, null);
                    this.f14986x = c2859j2;
                    m4534L0(c2859j2, EnumC2860k.f14995e);
                    m4534L0(c2859j2, EnumC2860k.f14996f);
                    m4534L0(c2859j2, EnumC2860k.f14997g);
                    this.f14979B = null;
                    return;
                }
            }
        }
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return AbstractC3498f.m5382v(this).f16865B.mo560l();
    }
}
