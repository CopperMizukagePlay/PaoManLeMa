package p085l0;

import p054g6.C1701c0;
import p082k5.InterfaceC2317g;
import p108o0.InterfaceC2795e;
import p123q0.C2967b;
import p123q0.C2976k;
import p130r0.C3023a;
import p130r0.C3024b;
import p138s0.C3087b;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l0.u0 */
/* loaded from: classes.dex */
public final class C2413u0 implements InterfaceC2317g, InterfaceC2370i2 {

    /* renamed from: f */
    public static final /* synthetic */ C2413u0 f13571f = new C2413u0(0);

    /* renamed from: g */
    public static final C2413u0 f13572g = new C2413u0(1);

    /* renamed from: h */
    public static final C2413u0 f13573h = new C2413u0(2);

    /* renamed from: i */
    public static final C2413u0 f13574i = new C2413u0(3);

    /* renamed from: j */
    public static final C2413u0 f13575j = new C2413u0(4);

    /* renamed from: e */
    public final /* synthetic */ int f13576e;

    public /* synthetic */ C2413u0(int i7) {
        this.f13576e = i7;
    }

    /* renamed from: b */
    public static final void m3913b(C2413u0 c2413u0) {
        C1701c0 c1701c0;
        InterfaceC2795e interfaceC2795e;
        C3024b c3024b;
        int i7;
        Object obj;
        C1701c0 c1701c02 = C2414u1.f13577x;
        do {
            c1701c0 = C2414u1.f13577x;
            interfaceC2795e = (InterfaceC2795e) c1701c0.getValue();
            c3024b = (C3024b) interfaceC2795e;
            C2967b c2967b = c3024b.f15583g;
            C3023a c3023a = (C3023a) c2967b.get(c2413u0);
            if (c3023a != null) {
                Object obj2 = c3023a.f15578a;
                Object obj3 = c3023a.f15579b;
                C2976k c2976k = c2967b.f15372e;
                if (c2413u0 != null) {
                    i7 = c2413u0.hashCode();
                } else {
                    i7 = 0;
                }
                C2976k m4635v = c2976k.m4635v(i7, 0, c2413u0);
                if (c2976k != m4635v) {
                    if (m4635v == null) {
                        c2967b = C2967b.f15371g;
                    } else {
                        c2967b = new C2967b(m4635v, c2967b.f15373f - 1);
                    }
                }
                C3087b c3087b = C3087b.f15684a;
                if (obj2 != c3087b) {
                    Object obj4 = c2967b.get(obj2);
                    AbstractC3367j.m5097b(obj4);
                    c2967b = c2967b.m4608b(obj2, new C3023a(((C3023a) obj4).f15578a, obj3));
                }
                if (obj3 != c3087b) {
                    Object obj5 = c2967b.get(obj3);
                    AbstractC3367j.m5097b(obj5);
                    c2967b = c2967b.m4608b(obj3, new C3023a(obj2, ((C3023a) obj5).f15579b));
                }
                if (obj2 != c3087b) {
                    obj = c3024b.f15581e;
                } else {
                    obj = obj3;
                }
                if (obj3 != c3087b) {
                    obj2 = c3024b.f15582f;
                }
                c3024b = new C3024b(obj, obj2, c2967b);
            }
            if (interfaceC2795e == c3024b) {
                return;
            }
        } while (!c1701c0.m2750g(interfaceC2795e, c3024b));
    }

    @Override // p085l0.InterfaceC2370i2
    /* renamed from: a */
    public boolean mo3798a(Object obj, Object obj2) {
        switch (this.f13576e) {
            case 1:
                return false;
            case 2:
                if (obj == obj2) {
                    return true;
                }
                return false;
            default:
                return AbstractC3367j.m5096a(obj, obj2);
        }
    }

    public String toString() {
        switch (this.f13576e) {
            case 1:
                return "NeverEqualPolicy";
            case 2:
                return "ReferentialEqualityPolicy";
            case 3:
            case AbstractC3122c.f15761f /* 5 */:
            default:
                return super.toString();
            case 4:
                return "StructuralEqualityPolicy";
            case AbstractC3122c.f15759d /* 6 */:
                return "Empty";
        }
    }
}
