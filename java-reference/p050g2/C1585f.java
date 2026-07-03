package p050g2;

import java.util.Comparator;
import p066i3.AbstractC2067b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.f */
/* loaded from: classes.dex */
public final class C1585f implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ int f10234e;

    public /* synthetic */ C1585f(int i7) {
        this.f10234e = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f10234e) {
            case 0:
                return AbstractC2067b.m3284i(Integer.valueOf(((C1583e) obj).f10230b), Integer.valueOf(((C1583e) obj2).f10230b));
            default:
                return AbstractC2067b.m3284i(Integer.valueOf(((C1583e) obj).f10230b), Integer.valueOf(((C1583e) obj2).f10230b));
        }
    }
}
