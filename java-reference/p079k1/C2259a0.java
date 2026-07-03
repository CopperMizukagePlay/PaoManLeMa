package p079k1;

import java.util.Iterator;
import java.util.Map;
import p123q0.AbstractC2977l;
import p123q0.C2969d;
import p123q0.C2970e;
import p123q0.C2979n;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k1.a0 */
/* loaded from: classes.dex */
public final class C2259a0 implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final /* synthetic */ int f13098e = 0;

    /* renamed from: f */
    public final Iterator f13099f;

    public C2259a0(C2969d c2969d) {
        AbstractC2977l[] abstractC2977lArr = new AbstractC2977l[8];
        for (int i7 = 0; i7 < 8; i7++) {
            abstractC2977lArr[i7] = new C2979n(this);
        }
        this.f13099f = new C2970e(c2969d, abstractC2977lArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f13098e) {
            case 0:
                return this.f13099f.hasNext();
            default:
                return ((C2970e) this.f13099f).f15376g;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f13098e) {
            case 0:
                return (AbstractC2265d0) this.f13099f.next();
            default:
                return (Map.Entry) ((C2970e) this.f13099f).next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f13098e) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ((C2970e) this.f13099f).remove();
                return;
        }
    }

    public C2259a0(C2261b0 c2261b0) {
        this.f13099f = c2261b0.f13114f.iterator();
    }
}
