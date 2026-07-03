package p163v2;

import android.os.Parcelable;
import android.util.SparseArray;
import p053g5.C1694m;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3368k;
import p162v1.C3530p1;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v2.h */
/* loaded from: classes.dex */
public final class C3568h extends AbstractC3368k implements InterfaceC3277a {

    /* renamed from: f */
    public final /* synthetic */ int f17132f;

    /* renamed from: g */
    public final /* synthetic */ C3576p f17133g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3568h(C3576p c3576p, int i7) {
        super(0);
        this.f17132f = i7;
        this.f17133g = c3576p;
    }

    @Override // p150t5.InterfaceC3277a
    /* renamed from: a */
    public final Object mo52a() {
        C3530p1 snapshotObserver;
        switch (this.f17132f) {
            case 0:
                this.f17133g.getLayoutNode().m5401C();
                return C1694m.f10482a;
            case 1:
                C3576p c3576p = this.f17133g;
                if (c3576p.f17141i && c3576p.isAttachedToWindow() && c3576p.getView().getParent() == c3576p) {
                    snapshotObserver = c3576p.getSnapshotObserver();
                    snapshotObserver.m5498a(c3576p, C3563c.f17114g, c3576p.getUpdate());
                }
                return C1694m.f10482a;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f17133g.f17180D.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                C3576p c3576p2 = this.f17133g;
                c3576p2.getReleaseBlock().mo23f(c3576p2.f17180D);
                C3576p.m5546h(c3576p2);
                return C1694m.f10482a;
            case 4:
                C3576p c3576p3 = this.f17133g;
                c3576p3.getResetBlock().mo23f(c3576p3.f17180D);
                return C1694m.f10482a;
            default:
                C3576p c3576p4 = this.f17133g;
                c3576p4.getUpdateBlock().mo23f(c3576p4.f17180D);
                return C1694m.f10482a;
        }
    }
}
