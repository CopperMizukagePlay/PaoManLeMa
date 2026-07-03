package p070j;

import java.util.Iterator;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j.b */
/* loaded from: classes.dex */
public final class C2110b extends AbstractC2113e implements Iterator {

    /* renamed from: e */
    public C2111c f12392e;

    /* renamed from: f */
    public C2111c f12393f;

    /* renamed from: g */
    public final /* synthetic */ int f12394g;

    public C2110b(C2111c c2111c, C2111c c2111c2, int i7) {
        this.f12394g = i7;
        this.f12392e = c2111c2;
        this.f12393f = c2111c;
    }

    @Override // p070j.AbstractC2113e
    /* renamed from: a */
    public final void mo3469a(C2111c c2111c) {
        C2111c c2111c2;
        C2111c c2111c3 = null;
        if (this.f12392e == c2111c && c2111c == this.f12393f) {
            this.f12393f = null;
            this.f12392e = null;
        }
        C2111c c2111c4 = this.f12392e;
        if (c2111c4 == c2111c) {
            switch (this.f12394g) {
                case 0:
                    c2111c2 = c2111c4.f12398h;
                    break;
                default:
                    c2111c2 = c2111c4.f12397g;
                    break;
            }
            this.f12392e = c2111c2;
        }
        C2111c c2111c5 = this.f12393f;
        if (c2111c5 == c2111c) {
            C2111c c2111c6 = this.f12392e;
            if (c2111c5 != c2111c6 && c2111c6 != null) {
                c2111c3 = m3470b(c2111c5);
            }
            this.f12393f = c2111c3;
        }
    }

    /* renamed from: b */
    public final C2111c m3470b(C2111c c2111c) {
        switch (this.f12394g) {
            case 0:
                return c2111c.f12397g;
            default:
                return c2111c.f12398h;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12393f != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2111c c2111c;
        C2111c c2111c2 = this.f12393f;
        C2111c c2111c3 = this.f12392e;
        if (c2111c2 != c2111c3 && c2111c3 != null) {
            c2111c = m3470b(c2111c2);
        } else {
            c2111c = null;
        }
        this.f12393f = c2111c;
        return c2111c2;
    }
}
