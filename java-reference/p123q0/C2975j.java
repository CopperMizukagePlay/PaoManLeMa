package p123q0;

import java.util.Iterator;
import p060h5.AbstractC1792a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: q0.j */
/* loaded from: classes.dex */
public final class C2975j extends AbstractC1792a {

    /* renamed from: e */
    public final C2967b f15391e;

    public C2975j(C2967b c2967b) {
        this.f15391e = c2967b;
    }

    @Override // p060h5.AbstractC1792a
    /* renamed from: a */
    public final int mo299a() {
        C2967b c2967b = this.f15391e;
        c2967b.getClass();
        return c2967b.f15373f;
    }

    @Override // p060h5.AbstractC1792a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f15391e.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        C2976k c2976k = this.f15391e.f15372e;
        AbstractC2977l[] abstractC2977lArr = new AbstractC2977l[8];
        for (int i7 = 0; i7 < 8; i7++) {
            abstractC2977lArr[i7] = new C2978m(2);
        }
        return new AbstractC2968c(c2976k, abstractC2977lArr);
    }
}
