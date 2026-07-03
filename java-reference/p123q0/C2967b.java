package p123q0;

import p037e3.C0691e;
import p060h5.AbstractC1798f;
import p108o0.InterfaceC2794d;
import p130r0.C3023a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.b */
/* loaded from: classes.dex */
public class C2967b extends AbstractC1798f implements InterfaceC2794d {

    /* renamed from: g */
    public static final C2967b f15371g = new C2967b(C2976k.f15392e, 0);

    /* renamed from: e */
    public final C2976k f15372e;

    /* renamed from: f */
    public final int f15373f;

    public C2967b(C2976k c2976k, int i7) {
        this.f15372e = c2976k;
        this.f15373f = i7;
    }

    @Override // p108o0.InterfaceC2794d
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2969d builder() {
        return new C2969d(this);
    }

    /* renamed from: b */
    public final C2967b m4608b(Object obj, C3023a c3023a) {
        int i7;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        C0691e m4634u = this.f15372e.m4634u(i7, 0, obj, c3023a);
        if (m4634u == null) {
            return this;
        }
        return new C2967b((C2976k) m4634u.f2245b, this.f15373f + m4634u.f2244a);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        int i7;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        return this.f15372e.m4618d(i7, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        int i7;
        if (obj != null) {
            i7 = obj.hashCode();
        } else {
            i7 = 0;
        }
        return this.f15372e.m4621g(i7, 0, obj);
    }
}
