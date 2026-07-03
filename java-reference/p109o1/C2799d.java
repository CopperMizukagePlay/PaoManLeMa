package p109o1;

import p001a0.C0053n;
import p032d6.InterfaceC0516a0;
import p060h5.AbstractC1793a0;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p140s2.C3107q;
import p158u5.AbstractC3368k;
import p162v1.AbstractC3498f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: o1.d */
/* loaded from: classes.dex */
public final class C2799d {

    /* renamed from: a */
    public C2802g f14811a;

    /* renamed from: b */
    public C2802g f14812b;

    /* renamed from: c */
    public AbstractC3368k f14813c = new C0053n(21, this);

    /* renamed from: d */
    public InterfaceC0516a0 f14814d;

    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0082, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0080, code lost:
    
        if (r15 == r7) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4431a(long j6, long j7, AbstractC2583c abstractC2583c) {
        C2797b c2797b;
        int i7;
        C2802g c2802g;
        long j8;
        if (abstractC2583c instanceof C2797b) {
            c2797b = (C2797b) abstractC2583c;
            int i8 = c2797b.f14807j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2797b.f14807j = i8 - Integer.MIN_VALUE;
                C2797b c2797b2 = c2797b;
                Object obj = c2797b2.f14805h;
                i7 = c2797b2.f14807j;
                if (i7 == 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            AbstractC1793a0.m2972L(obj);
                            j8 = ((C3107q) obj).f15711a;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        AbstractC1793a0.m2972L(obj);
                        j8 = ((C3107q) obj).f15711a;
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2802g c2802g2 = this.f14811a;
                    C2802g c2802g3 = null;
                    if (c2802g2 != null && c2802g2.f18005r) {
                        c2802g = (C2802g) AbstractC3498f.m5371k(c2802g2);
                    } else {
                        c2802g = null;
                    }
                    j8 = 0;
                    EnumC2465a enumC2465a = EnumC2465a.f13750e;
                    if (c2802g == null) {
                        C2802g c2802g4 = this.f14812b;
                        if (c2802g4 != null) {
                            c2797b2.f14807j = 1;
                            obj = c2802g4.mo2745n(j6, j7, c2797b2);
                        }
                    } else {
                        C2802g c2802g5 = this.f14811a;
                        if (c2802g5 != null && c2802g5.f18005r) {
                            c2802g3 = (C2802g) AbstractC3498f.m5371k(c2802g5);
                        }
                        if (c2802g3 != null) {
                            c2797b2.f14807j = 2;
                            obj = c2802g3.mo2745n(j6, j7, c2797b2);
                        } else {
                            j8 = 0;
                        }
                    }
                }
                return new C3107q(j8);
            }
        }
        c2797b = new C2797b(this, abstractC2583c);
        C2797b c2797b22 = c2797b;
        Object obj2 = c2797b22.f14805h;
        i7 = c2797b22.f14807j;
        if (i7 == 0) {
        }
        return new C3107q(j8);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4432b(long j6, AbstractC2583c abstractC2583c) {
        C2798c c2798c;
        int i7;
        long j7;
        if (abstractC2583c instanceof C2798c) {
            c2798c = (C2798c) abstractC2583c;
            int i8 = c2798c.f14810j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c2798c.f14810j = i8 - Integer.MIN_VALUE;
                Object obj = c2798c.f14808h;
                i7 = c2798c.f14810j;
                if (i7 == 0) {
                    if (i7 == 1) {
                        AbstractC1793a0.m2972L(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C2802g c2802g = this.f14811a;
                    C2802g c2802g2 = null;
                    if (c2802g != null && c2802g.f18005r) {
                        c2802g2 = (C2802g) AbstractC3498f.m5371k(c2802g);
                    }
                    if (c2802g2 != null) {
                        c2798c.f14810j = 1;
                        obj = c2802g2.mo4429S(j6, c2798c);
                        EnumC2465a enumC2465a = EnumC2465a.f13750e;
                        if (obj == enumC2465a) {
                            return enumC2465a;
                        }
                    } else {
                        j7 = 0;
                        return new C3107q(j7);
                    }
                }
                j7 = ((C3107q) obj).f15711a;
                return new C3107q(j7);
            }
        }
        c2798c = new C2798c(this, abstractC2583c);
        Object obj2 = c2798c.f14808h;
        i7 = c2798c.f14810j;
        if (i7 == 0) {
        }
        j7 = ((C3107q) obj2).f15711a;
        return new C3107q(j7);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [t5.a, u5.k] */
    /* renamed from: c */
    public final InterfaceC0516a0 m4433c() {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) this.f14813c.mo52a();
        if (interfaceC0516a0 != null) {
            return interfaceC0516a0;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }
}
