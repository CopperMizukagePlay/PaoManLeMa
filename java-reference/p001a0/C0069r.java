package p001a0;

import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p032d6.InterfaceC0520b1;
import p034e0.C0622o0;
import p053g5.C1694m;
import p054g6.InterfaceC1704e;
import p060h5.AbstractC1793a0;
import p061h6.C1826h;
import p061h6.C1827i;
import p061h6.C1828j;
import p061h6.C1829k;
import p082k5.InterfaceC2313c;
import p087l2.C2447k;
import p087l2.C2460x;
import p090l5.EnumC2465a;
import p107o.C2787y;
import p137s.C3075d;
import p137s.C3076e;
import p137s.C3077f;
import p137s.C3078g;
import p137s.C3082k;
import p137s.C3083l;
import p137s.C3084m;
import p137s.InterfaceC3079h;
import p158u5.C3377t;
import p158u5.C3379v;
import p162v1.AbstractC3498f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.r */
/* loaded from: classes.dex */
public final class C0069r implements InterfaceC1704e {

    /* renamed from: e */
    public final /* synthetic */ int f346e;

    /* renamed from: f */
    public final /* synthetic */ Object f347f;

    /* renamed from: g */
    public final /* synthetic */ Object f348g;

    /* renamed from: h */
    public final /* synthetic */ Object f349h;

    /* renamed from: i */
    public final /* synthetic */ Object f350i;

    public /* synthetic */ C0069r(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f346e = i7;
        this.f347f = obj;
        this.f348g = obj2;
        this.f349h = obj3;
        this.f350i = obj4;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c6  */
    @Override // p054g6.InterfaceC1704e
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo160h(Object obj, InterfaceC2313c interfaceC2313c) {
        C1827i c1827i;
        int i7;
        C0069r c0069r;
        boolean z7;
        boolean z8;
        boolean z9;
        switch (this.f346e) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                C0622o0 c0622o0 = (C0622o0) this.f349h;
                C0043k1 c0043k1 = (C0043k1) this.f347f;
                if (booleanValue && c0043k1.m118b()) {
                    AbstractC0027g1.m64j((C2460x) this.f348g, c0043k1, c0622o0.m1287j(), (C2447k) this.f350i, c0622o0.f2045b);
                } else {
                    AbstractC0027g1.m61g(c0043k1);
                }
                return C1694m.f10482a;
            case 1:
                if (interfaceC2313c instanceof C1827i) {
                    c1827i = (C1827i) interfaceC2313c;
                    int i8 = c1827i.f10890l;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c1827i.f10890l = i8 - Integer.MIN_VALUE;
                        Object obj2 = c1827i.f10888j;
                        i7 = c1827i.f10890l;
                        if (i7 == 0) {
                            if (i7 == 1) {
                                obj = c1827i.f10887i;
                                c0069r = c1827i.f10886h;
                                AbstractC1793a0.m2972L(obj2);
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            AbstractC1793a0.m2972L(obj2);
                            InterfaceC0520b1 interfaceC0520b1 = (InterfaceC0520b1) ((C3379v) this.f347f).f16451e;
                            if (interfaceC0520b1 != null) {
                                interfaceC0520b1.mo1114c(new C1829k("Child of the scoped flow was cancelled", 0));
                                c1827i.f10886h = this;
                                c1827i.f10887i = obj;
                                c1827i.f10890l = 1;
                                Object mo1116s = interfaceC0520b1.mo1116s(c1827i);
                                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                                if (mo1116s == enumC2465a) {
                                    return enumC2465a;
                                }
                            }
                            c0069r = this;
                        }
                        ((C3379v) c0069r.f347f).f16451e = AbstractC0525d0.m1141s((InterfaceC0516a0) c0069r.f348g, null, new C1826h((C1828j) c0069r.f349h, (InterfaceC1704e) c0069r.f350i, obj, null), 1);
                        return C1694m.f10482a;
                    }
                }
                c1827i = new C1827i(this, interfaceC2313c);
                Object obj22 = c1827i.f10888j;
                i7 = c1827i.f10890l;
                if (i7 == 0) {
                }
                ((C3379v) c0069r.f347f).f16451e = AbstractC0525d0.m1141s((InterfaceC0516a0) c0069r.f348g, null, new C1826h((C1828j) c0069r.f349h, (InterfaceC1704e) c0069r.f350i, obj, null), 1);
                return C1694m.f10482a;
            default:
                InterfaceC3079h interfaceC3079h = (InterfaceC3079h) obj;
                C3377t c3377t = (C3377t) this.f349h;
                C3377t c3377t2 = (C3377t) this.f348g;
                C3377t c3377t3 = (C3377t) this.f347f;
                boolean z10 = true;
                if (interfaceC3079h instanceof C3083l) {
                    c3377t3.f16449e++;
                } else if (interfaceC3079h instanceof C3084m) {
                    c3377t3.f16449e--;
                } else if (interfaceC3079h instanceof C3082k) {
                    c3377t3.f16449e--;
                } else if (interfaceC3079h instanceof C3077f) {
                    c3377t2.f16449e++;
                } else if (interfaceC3079h instanceof C3078g) {
                    c3377t2.f16449e--;
                } else if (interfaceC3079h instanceof C3075d) {
                    c3377t.f16449e++;
                } else if (interfaceC3079h instanceof C3076e) {
                    c3377t.f16449e--;
                }
                int i9 = c3377t3.f16449e;
                boolean z11 = false;
                if (i9 > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (c3377t2.f16449e > 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (c3377t.f16449e > 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                C2787y c2787y = (C2787y) this.f350i;
                if (c2787y.f14793t != z7) {
                    c2787y.f14793t = z7;
                    z11 = true;
                }
                if (c2787y.f14794u != z8) {
                    c2787y.f14794u = z8;
                    z11 = true;
                }
                if (c2787y.f14795v != z9) {
                    c2787y.f14795v = z9;
                } else {
                    z10 = z11;
                }
                if (z10) {
                    AbstractC3498f.m5373m(c2787y);
                }
                return C1694m.f10482a;
        }
    }
}
