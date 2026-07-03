package p162v1;

import java.util.HashMap;
import java.util.Map;
import p027d1.C0464b;
import p035e1.C0661j0;
import p060h5.AbstractC1817y;
import p146t1.AbstractC3189c;
import p146t1.AbstractC3239v0;
import p146t1.C3216l;
import p158u5.AbstractC3367j;
import p160v.C3423m0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.h0 */
/* loaded from: classes.dex */
public final class C3505h0 {

    /* renamed from: a */
    public final AbstractC3239v0 f16914a;

    /* renamed from: c */
    public boolean f16916c;

    /* renamed from: d */
    public boolean f16917d;

    /* renamed from: e */
    public boolean f16918e;

    /* renamed from: f */
    public boolean f16919f;

    /* renamed from: g */
    public boolean f16920g;

    /* renamed from: h */
    public InterfaceC3480a f16921h;

    /* renamed from: j */
    public final /* synthetic */ int f16923j;

    /* renamed from: b */
    public boolean f16915b = true;

    /* renamed from: i */
    public final HashMap f16922i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public C3505h0(InterfaceC3480a interfaceC3480a, int i7) {
        this.f16923j = i7;
        this.f16914a = (AbstractC3239v0) interfaceC3480a;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [t5.e, u5.h] */
    /* JADX WARN: Type inference failed for: r3v5, types: [t1.v0, v1.a] */
    /* renamed from: a */
    public static final void m5452a(C3505h0 c3505h0, C3216l c3216l, int i7, AbstractC3497e1 abstractC3497e1) {
        float intBitsToFloat;
        HashMap hashMap = c3505h0.f16922i;
        float f7 = i7;
        long floatToRawIntBits = Float.floatToRawIntBits(f7) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f7) & 4294967295L;
        while (true) {
            long j6 = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (c3505h0.f16923j) {
                    case 0:
                        C0661j0 c0661j0 = AbstractC3497e1.f16828O;
                        j6 = abstractC3497e1.m5353q1(j6);
                        break;
                    default:
                        AbstractC3529p0 mo5331T0 = abstractC3497e1.mo5331T0();
                        AbstractC3367j.m5097b(mo5331T0);
                        long j7 = mo5331T0.f16986t;
                        j6 = C0464b.m1011g((Float.floatToRawIntBits((int) (j7 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j7 >> 32)) << 32), j6);
                        break;
                }
                abstractC3497e1 = abstractC3497e1.f16849u;
                AbstractC3367j.m5097b(abstractC3497e1);
                if (abstractC3497e1.equals(c3505h0.f16914a.mo5288q())) {
                    if (c3216l instanceof C3216l) {
                        intBitsToFloat = Float.intBitsToFloat((int) (j6 & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32));
                    }
                    int round = Math.round(intBitsToFloat);
                    if (hashMap.containsKey(c3216l)) {
                        int intValue = ((Number) AbstractC1817y.m3081M(c3216l, hashMap)).intValue();
                        C3216l c3216l2 = AbstractC3189c.f15928a;
                        round = ((Number) c3216l.f15996a.mo22d(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(c3216l, Integer.valueOf(round));
                    return;
                }
            } while (!c3505h0.m5453b(abstractC3497e1).containsKey(c3216l));
            float m5454c = c3505h0.m5454c(abstractC3497e1, c3216l);
            long floatToRawIntBits3 = Float.floatToRawIntBits(m5454c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(m5454c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    /* renamed from: b */
    public final Map m5453b(AbstractC3497e1 abstractC3497e1) {
        switch (this.f16923j) {
            case 0:
                return abstractC3497e1.mo5318D0().mo4882a();
            default:
                AbstractC3529p0 mo5331T0 = abstractC3497e1.mo5331T0();
                AbstractC3367j.m5097b(mo5331T0);
                return mo5331T0.mo5318D0().mo4882a();
        }
    }

    /* renamed from: c */
    public final int m5454c(AbstractC3497e1 abstractC3497e1, C3216l c3216l) {
        switch (this.f16923j) {
            case 0:
                return abstractC3497e1.mo4939h0(c3216l);
            default:
                AbstractC3529p0 mo5331T0 = abstractC3497e1.mo5331T0();
                AbstractC3367j.m5097b(mo5331T0);
                return mo5331T0.mo4939h0(c3216l);
        }
    }

    /* renamed from: d */
    public final boolean m5455d() {
        if (!this.f16916c && !this.f16918e && !this.f16919f && !this.f16920g) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final boolean m5456e() {
        m5459h();
        if (this.f16921h != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t1.v0, v1.a] */
    /* renamed from: f */
    public final void m5457f() {
        this.f16915b = true;
        ?? r02 = this.f16914a;
        InterfaceC3480a mo5290t = r02.mo5290t();
        if (mo5290t == null) {
            return;
        }
        if (this.f16916c) {
            mo5290t.mo5286Z();
        } else if (this.f16918e || this.f16917d) {
            mo5290t.requestLayout();
        }
        if (this.f16919f) {
            r02.mo5286Z();
        }
        if (this.f16920g) {
            r02.requestLayout();
        }
        mo5290t.mo5287a().m5457f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [t1.v0, v1.a] */
    /* renamed from: g */
    public final void m5458g() {
        HashMap hashMap = this.f16922i;
        hashMap.clear();
        C3423m0 c3423m0 = new C3423m0(1, this);
        ?? r22 = this.f16914a;
        r22.mo5289r(c3423m0);
        hashMap.putAll(m5453b(r22.mo5288q()));
        this.f16915b = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r0 != false) goto L29;
     */
    /* JADX WARN: Type inference failed for: r1v0, types: [t1.v0, v1.a] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5459h() {
        C3505h0 mo5287a;
        C3505h0 mo5287a2;
        boolean m5455d = m5455d();
        ?? r12 = this.f16914a;
        InterfaceC3480a interfaceC3480a = r12;
        if (!m5455d) {
            InterfaceC3480a mo5290t = r12.mo5290t();
            if (mo5290t != null) {
                InterfaceC3480a interfaceC3480a2 = mo5290t.mo5287a().f16921h;
                if (interfaceC3480a2 != null) {
                    boolean m5455d2 = interfaceC3480a2.mo5287a().m5455d();
                    interfaceC3480a = interfaceC3480a2;
                }
                InterfaceC3480a interfaceC3480a3 = this.f16921h;
                if (interfaceC3480a3 != null && !interfaceC3480a3.mo5287a().m5455d()) {
                    InterfaceC3480a mo5290t2 = interfaceC3480a3.mo5290t();
                    if (mo5290t2 != null && (mo5287a2 = mo5290t2.mo5287a()) != null) {
                        mo5287a2.m5459h();
                    }
                    InterfaceC3480a mo5290t3 = interfaceC3480a3.mo5290t();
                    if (mo5290t3 != null && (mo5287a = mo5290t3.mo5287a()) != null) {
                        interfaceC3480a = mo5287a.f16921h;
                    } else {
                        interfaceC3480a = null;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.f16921h = interfaceC3480a;
    }
}
