package p063i0;

import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p071j0.AbstractC2156v;
import p090l5.EnumC2465a;
import p098m5.AbstractC2583c;
import p100n.AbstractC2667n1;
import p100n.C2635d;
import p137s.C3075d;
import p137s.C3077f;
import p137s.C3083l;
import p137s.InterfaceC3079h;
import p140s2.C3096f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: i0.e2 */
/* loaded from: classes.dex */
public final class C1881e2 {

    /* renamed from: a */
    public float f11131a;

    /* renamed from: b */
    public float f11132b;

    /* renamed from: c */
    public float f11133c;

    /* renamed from: d */
    public float f11134d;

    /* renamed from: e */
    public final C2635d f11135e;

    /* renamed from: f */
    public InterfaceC3079h f11136f;

    /* renamed from: g */
    public InterfaceC3079h f11137g;

    public C1881e2(float f7, float f8, float f9, float f10) {
        this.f11131a = f7;
        this.f11132b = f8;
        this.f11133c = f9;
        this.f11134d = f10;
        this.f11135e = new C2635d(new C3096f(f7), AbstractC2667n1.f14367c, null, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3115a(InterfaceC3079h interfaceC3079h, AbstractC2583c abstractC2583c) {
        C1863c2 c1863c2;
        int i7;
        float f7;
        C1881e2 c1881e2;
        C2635d c2635d = this.f11135e;
        if (abstractC2583c instanceof C1863c2) {
            c1863c2 = (C1863c2) abstractC2583c;
            int i8 = c1863c2.f11001l;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1863c2.f11001l = i8 - Integer.MIN_VALUE;
                Object obj = c1863c2.f10999j;
                i7 = c1863c2.f11001l;
                if (i7 == 0) {
                    if (i7 == 1) {
                        interfaceC3079h = c1863c2.f10998i;
                        c1881e2 = c1863c2.f10997h;
                        try {
                            AbstractC1793a0.m2972L(obj);
                        } catch (Throwable th) {
                            th = th;
                            c1881e2.f11136f = interfaceC3079h;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    if (interfaceC3079h instanceof C3083l) {
                        f7 = this.f11132b;
                    } else if (interfaceC3079h instanceof C3077f) {
                        f7 = this.f11133c;
                    } else if (interfaceC3079h instanceof C3075d) {
                        f7 = this.f11134d;
                    } else {
                        f7 = this.f11131a;
                    }
                    this.f11137g = interfaceC3079h;
                    try {
                        if (!C3096f.m4776a(((C3096f) c2635d.f14261e.getValue()).f15693e, f7)) {
                            InterfaceC3079h interfaceC3079h2 = this.f11136f;
                            c1863c2.f10997h = this;
                            c1863c2.f10998i = interfaceC3079h;
                            c1863c2.f11001l = 1;
                            Object m3499a = AbstractC2156v.m3499a(c2635d, f7, interfaceC3079h2, interfaceC3079h, c1863c2);
                            EnumC2465a enumC2465a = EnumC2465a.f13750e;
                            if (m3499a == enumC2465a) {
                                return enumC2465a;
                            }
                        }
                        c1881e2 = this;
                    } catch (Throwable th2) {
                        th = th2;
                        c1881e2 = this;
                        c1881e2.f11136f = interfaceC3079h;
                        throw th;
                    }
                }
                c1881e2.f11136f = interfaceC3079h;
                return C1694m.f10482a;
            }
        }
        c1863c2 = new C1863c2(this, abstractC2583c);
        Object obj2 = c1863c2.f10999j;
        i7 = c1863c2.f11001l;
        if (i7 == 0) {
        }
        c1881e2.f11136f = interfaceC3079h;
        return C1694m.f10482a;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m3116b(AbstractC2583c abstractC2583c) {
        C1872d2 c1872d2;
        int i7;
        float f7;
        C1881e2 c1881e2;
        if (abstractC2583c instanceof C1872d2) {
            c1872d2 = (C1872d2) abstractC2583c;
            int i8 = c1872d2.f11061k;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1872d2.f11061k = i8 - Integer.MIN_VALUE;
                Object obj = c1872d2.f11059i;
                i7 = c1872d2.f11061k;
                if (i7 == 0) {
                    if (i7 == 1) {
                        c1881e2 = c1872d2.f11058h;
                        try {
                            AbstractC1793a0.m2972L(obj);
                        } catch (Throwable th) {
                            th = th;
                            c1881e2.f11136f = c1881e2.f11137g;
                            throw th;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    AbstractC1793a0.m2972L(obj);
                    InterfaceC3079h interfaceC3079h = this.f11137g;
                    if (interfaceC3079h instanceof C3083l) {
                        f7 = this.f11132b;
                    } else if (interfaceC3079h instanceof C3077f) {
                        f7 = this.f11133c;
                    } else if (interfaceC3079h instanceof C3075d) {
                        f7 = this.f11134d;
                    } else {
                        f7 = this.f11131a;
                    }
                    C2635d c2635d = this.f11135e;
                    if (!C3096f.m4776a(((C3096f) c2635d.f14261e.getValue()).f15693e, f7)) {
                        try {
                            C3096f c3096f = new C3096f(f7);
                            c1872d2.f11058h = this;
                            c1872d2.f11061k = 1;
                            Object m4207e = c2635d.m4207e(c3096f, c1872d2);
                            EnumC2465a enumC2465a = EnumC2465a.f13750e;
                            if (m4207e == enumC2465a) {
                                return enumC2465a;
                            }
                            c1881e2 = this;
                        } catch (Throwable th2) {
                            th = th2;
                            c1881e2 = this;
                            c1881e2.f11136f = c1881e2.f11137g;
                            throw th;
                        }
                    }
                    return C1694m.f10482a;
                }
                c1881e2.f11136f = c1881e2.f11137g;
                return C1694m.f10482a;
            }
        }
        c1872d2 = new C1872d2(this, abstractC2583c);
        Object obj2 = c1872d2.f11059i;
        i7 = c1872d2.f11061k;
        if (i7 == 0) {
        }
        c1881e2.f11136f = c1881e2.f11137g;
        return C1694m.f10482a;
    }
}
