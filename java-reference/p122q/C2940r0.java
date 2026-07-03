package p122q;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p090l5.EnumC2465a;
import p091l6.C2472c;
import p098m5.AbstractC2583c;
import p140s2.InterfaceC3093c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q.r0 */
/* loaded from: classes.dex */
public final class C2940r0 implements InterfaceC3093c {

    /* renamed from: e */
    public final /* synthetic */ InterfaceC3093c f15266e;

    /* renamed from: f */
    public boolean f15267f;

    /* renamed from: g */
    public boolean f15268g;

    /* renamed from: h */
    public final C2472c f15269h = new C2472c();

    public C2940r0(InterfaceC3093c interfaceC3093c) {
        this.f15266e = interfaceC3093c;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: H */
    public final int mo4511H(long j6) {
        return this.f15266e.mo4511H(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: L */
    public final float mo4512L(long j6) {
        return this.f15266e.mo4512L(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: Q */
    public final int mo4513Q(float f7) {
        return this.f15266e.mo4513Q(f7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4595a(AbstractC2583c abstractC2583c) {
        C2934p0 c2934p0;
        int i7;
        C2940r0 c2940r0;
        if (abstractC2583c instanceof C2934p0) {
            c2934p0 = (C2934p0) abstractC2583c;
            int i8 = c2934p0.f15252k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2934p0.f15252k = i8 - Integer.MIN_VALUE;
                Object obj = c2934p0.f15250i;
                i7 = c2934p0.f15252k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c2940r0 = c2934p0.f15249h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    c2934p0.f15249h = this;
                    c2934p0.f15252k = 1;
                    Object m4028d = this.f15269h.m4028d(c2934p0);
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (m4028d == enumC2465a) {
                        return enumC2465a;
                    }
                    c2940r0 = this;
                }
                c2940r0.f15267f = false;
                c2940r0.f15268g = false;
                return C1694m.f10482a;
            }
        }
        c2934p0 = new C2934p0(this, abstractC2583c);
        Object obj2 = c2934p0.f15250i;
        i7 = c2934p0.f15252k;
        if (i7 == 0) {
        }
        c2940r0.f15267f = false;
        c2940r0.f15268g = false;
        return C1694m.f10482a;
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: a0 */
    public final long mo4515a0(long j6) {
        return this.f15266e.mo4515a0(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: b */
    public final float mo559b() {
        return this.f15266e.mo559b();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4596d(AbstractC2583c abstractC2583c) {
        C2937q0 c2937q0;
        int i7;
        C2940r0 c2940r0;
        if (abstractC2583c instanceof C2937q0) {
            c2937q0 = (C2937q0) abstractC2583c;
            int i8 = c2937q0.f15261k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2937q0.f15261k = i8 - Integer.MIN_VALUE;
                Object obj = c2937q0.f15259i;
                i7 = c2937q0.f15261k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c2940r0 = c2937q0.f15258h;
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (!this.f15267f && !this.f15268g) {
                        c2937q0.f15258h = this;
                        c2937q0.f15261k = 1;
                        Object m4028d = this.f15269h.m4028d(c2937q0);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (m4028d == enumC2465a) {
                            return enumC2465a;
                        }
                        c2940r0 = this;
                    } else {
                        c2940r0 = this;
                        return Boolean.valueOf(c2940r0.f15267f);
                    }
                }
                c2940r0.f15269h.m4030f(null);
                return Boolean.valueOf(c2940r0.f15267f);
            }
        }
        c2937q0 = new C2937q0(this, abstractC2583c);
        Object obj2 = c2937q0.f15259i;
        i7 = c2937q0.f15261k;
        if (i7 == 0) {
        }
        c2940r0.f15269h.m4030f(null);
        return Boolean.valueOf(c2940r0.f15267f);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: f0 */
    public final float mo4518f0(long j6) {
        return this.f15266e.mo4518f0(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: l */
    public final float mo560l() {
        return this.f15266e.mo560l();
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: n0 */
    public final long mo4521n0(float f7) {
        return this.f15266e.mo4521n0(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: t0 */
    public final float mo4522t0(int i7) {
        return this.f15266e.mo4522t0(i7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v */
    public final long mo4523v(float f7) {
        return this.f15266e.mo4523v(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: v0 */
    public final float mo4524v0(float f7) {
        return this.f15266e.mo4524v0(f7);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: w */
    public final long mo4525w(long j6) {
        return this.f15266e.mo4525w(j6);
    }

    @Override // p140s2.InterfaceC3093c
    /* renamed from: y */
    public final float mo4526y(float f7) {
        return this.f15266e.mo4526y(f7);
    }
}
