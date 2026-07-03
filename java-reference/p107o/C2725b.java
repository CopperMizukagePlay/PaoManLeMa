package p107o;

import p001a0.C0012c2;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p122q.C2940r0;
import p137s.C3081j;
import p137s.C3082k;
import p137s.C3083l;
import p137s.C3084m;
import p137s.InterfaceC3079h;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o.b */
/* loaded from: classes.dex */
public final class C2725b extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public boolean f14594i;

    /* renamed from: j */
    public int f14595j;

    /* renamed from: k */
    public /* synthetic */ Object f14596k;

    /* renamed from: l */
    public final /* synthetic */ C2940r0 f14597l;

    /* renamed from: m */
    public final /* synthetic */ long f14598m;

    /* renamed from: n */
    public final /* synthetic */ C3081j f14599n;

    /* renamed from: o */
    public final /* synthetic */ AbstractC2734e f14600o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2725b(C2940r0 c2940r0, long j6, C3081j c3081j, AbstractC2734e abstractC2734e, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f14597l = c2940r0;
        this.f14598m = j6;
        this.f14599n = c3081j;
        this.f14600o = abstractC2734e;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2725b) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2725b c2725b = new C2725b(this.f14597l, this.f14598m, this.f14599n, this.f14600o, interfaceC2313c);
        c2725b.f14596k = obj;
        return c2725b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ab, code lost:
    
        if (r14.m4747b(r1, r17) != r9) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c8, code lost:
    
        if (r14.m4747b(r2, r17) == r9) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
    
        if (r2 == r9) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008b  */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        EnumC2465a enumC2465a;
        InterfaceC0520b1 m1141s;
        Object m4596d;
        InterfaceC3079h c3082k;
        boolean z7;
        C3084m c3084m;
        int i7 = this.f14595j;
        AbstractC2734e abstractC2734e = this.f14600o;
        C3081j c3081j = this.f14599n;
        EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4 && i7 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC1793a0.m2972L(obj);
                        abstractC2734e.f14631E = null;
                        return C1694m.f10482a;
                    }
                    c3084m = (C3084m) this.f14596k;
                    AbstractC1793a0.m2972L(obj);
                    enumC2465a = enumC2465a2;
                    this.f14596k = null;
                    this.f14595j = 4;
                } else {
                    z7 = this.f14594i;
                    AbstractC1793a0.m2972L(obj);
                    enumC2465a = enumC2465a2;
                    if (z7) {
                        C3083l c3083l = new C3083l(this.f14598m);
                        C3084m c3084m2 = new C3084m(c3083l);
                        this.f14596k = c3084m2;
                        this.f14595j = 3;
                        if (c3081j.m4747b(c3083l, this) != enumC2465a) {
                            c3084m = c3084m2;
                            this.f14596k = null;
                            this.f14595j = 4;
                        }
                        return enumC2465a;
                    }
                    abstractC2734e.f14631E = null;
                    return C1694m.f10482a;
                }
            } else {
                m1141s = (InterfaceC0520b1) this.f14596k;
                AbstractC1793a0.m2972L(obj);
                enumC2465a = enumC2465a2;
                m4596d = obj;
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            enumC2465a = enumC2465a2;
            m1141s = AbstractC0525d0.m1141s((InterfaceC0516a0) this.f14596k, null, new C0012c2(abstractC2734e, this.f14598m, this.f14599n, null, 1), 3);
            this.f14596k = m1141s;
            this.f14595j = 1;
            m4596d = this.f14597l.m4596d(this);
        }
        boolean booleanValue = ((Boolean) m4596d).booleanValue();
        if (m1141s.mo1113b()) {
            this.f14596k = null;
            this.f14594i = booleanValue;
            this.f14595j = 2;
            if (AbstractC0525d0.m1129g(m1141s, this) != enumC2465a) {
                z7 = booleanValue;
                if (z7) {
                }
                abstractC2734e.f14631E = null;
                return C1694m.f10482a;
            }
        } else {
            C3083l c3083l2 = abstractC2734e.f14631E;
            if (c3083l2 != null) {
                if (booleanValue) {
                    c3082k = new C3084m(c3083l2);
                } else {
                    c3082k = new C3082k(c3083l2);
                }
                this.f14596k = null;
                this.f14595j = 5;
            }
            abstractC2734e.f14631E = null;
            return C1694m.f10482a;
        }
        return enumC2465a;
    }
}
