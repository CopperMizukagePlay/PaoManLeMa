package p031d5;

import java.util.Comparator;
import p023c5.C0432x;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.m */
/* loaded from: classes.dex */
public final class C0513m implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ C0432x f1838e;

    /* renamed from: f */
    public final /* synthetic */ AbstractC0514n f1839f;

    public C0513m(AbstractC0514n abstractC0514n, C0432x c0432x) {
        this.f1839f = abstractC0514n;
        this.f1838e = c0432x;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        AbstractC0514n abstractC0514n = this.f1839f;
        C0432x c0432x = this.f1838e;
        return Float.compare(abstractC0514n.mo1095a((C0432x) obj2, c0432x), abstractC0514n.mo1095a((C0432x) obj, c0432x));
    }
}
