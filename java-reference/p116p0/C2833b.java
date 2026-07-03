package p116p0;

import java.util.Collection;
import java.util.List;
import p150t5.InterfaceC3279c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p0.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C2833b implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f14907e;

    /* renamed from: f */
    public final /* synthetic */ Collection f14908f;

    public /* synthetic */ C2833b(int i7, Collection collection) {
        this.f14907e = i7;
        this.f14908f = collection;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        boolean contains;
        switch (this.f14907e) {
            case 0:
                contains = this.f14908f.contains(obj);
                break;
            case 1:
                contains = this.f14908f.contains(obj);
                break;
            default:
                contains = ((List) obj).retainAll(this.f14908f);
                break;
        }
        return Boolean.valueOf(contains);
    }
}
