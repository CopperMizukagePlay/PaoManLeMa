package p070j;

import java.util.Iterator;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j.d */
/* loaded from: classes.dex */
public final class C2112d extends AbstractC2113e implements Iterator {

    /* renamed from: e */
    public C2111c f12399e;

    /* renamed from: f */
    public boolean f12400f = true;

    /* renamed from: g */
    public final /* synthetic */ C2109a f12401g;

    public C2112d(C2109a c2109a) {
        this.f12401g = c2109a;
    }

    @Override // p070j.AbstractC2113e
    /* renamed from: a */
    public final void mo3469a(C2111c c2111c) {
        boolean z7;
        C2111c c2111c2 = this.f12399e;
        if (c2111c == c2111c2) {
            C2111c c2111c3 = c2111c2.f12398h;
            this.f12399e = c2111c3;
            if (c2111c3 == null) {
                z7 = true;
            } else {
                z7 = false;
            }
            this.f12400f = z7;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12400f) {
            if (this.f12401g.f12387e == null) {
                return false;
            }
            return true;
        }
        C2111c c2111c = this.f12399e;
        if (c2111c == null || c2111c.f12397g == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        C2111c c2111c;
        if (this.f12400f) {
            this.f12400f = false;
            this.f12399e = this.f12401g.f12387e;
        } else {
            C2111c c2111c2 = this.f12399e;
            if (c2111c2 != null) {
                c2111c = c2111c2.f12397g;
            } else {
                c2111c = null;
            }
            this.f12399e = c2111c;
        }
        return this.f12399e;
    }
}
