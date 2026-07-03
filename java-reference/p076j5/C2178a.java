package p076j5;

import java.util.Comparator;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j5.a */
/* loaded from: classes.dex */
public final class C2178a implements Comparator {

    /* renamed from: f */
    public static final C2178a f12607f = new C2178a(0);

    /* renamed from: g */
    public static final C2178a f12608g = new C2178a(1);

    /* renamed from: e */
    public final /* synthetic */ int f12609e;

    public /* synthetic */ C2178a(int i7) {
        this.f12609e = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f12609e) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                AbstractC3367j.m5100e(comparable, "a");
                AbstractC3367j.m5100e(comparable2, "b");
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                AbstractC3367j.m5100e(comparable3, "a");
                AbstractC3367j.m5100e(comparable4, "b");
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f12609e) {
            case 0:
                return f12608g;
            default:
                return f12607f;
        }
    }
}
