package p130r0;

import java.util.Iterator;
import p015b6.C0303j;
import p060h5.AbstractC1801i;
import p108o0.InterfaceC2795e;
import p123q0.C2967b;
import p138s0.C3087b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r0.b */
/* loaded from: classes.dex */
public final class C3024b extends AbstractC1801i implements InterfaceC2795e {

    /* renamed from: h */
    public static final C3024b f15580h;

    /* renamed from: e */
    public final Object f15581e;

    /* renamed from: f */
    public final Object f15582f;

    /* renamed from: g */
    public final C2967b f15583g;

    static {
        C3087b c3087b = C3087b.f15684a;
        f15580h = new C3024b(c3087b, c3087b, C2967b.f15371g);
    }

    public C3024b(Object obj, Object obj2, C2967b c2967b) {
        this.f15581e = obj;
        this.f15582f = obj2;
        this.f15583g = c2967b;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        C2967b c2967b = this.f15583g;
        c2967b.getClass();
        return c2967b.f15373f;
    }

    @Override // p060h5.AbstractC1792a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f15583g.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C0303j(this.f15581e, this.f15583g);
    }
}
