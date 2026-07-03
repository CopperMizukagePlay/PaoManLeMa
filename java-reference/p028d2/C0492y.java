package p028d2;

import java.util.Comparator;
import p039e5.C0918h0;
import p039e5.C1102n;
import p039e5.C1467yn;
import p066i3.AbstractC2067b;
import p162v1.C3502g0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.y */
/* loaded from: classes.dex */
public final class C0492y implements Comparator {

    /* renamed from: e */
    public final /* synthetic */ int f1774e;

    /* renamed from: f */
    public final /* synthetic */ Comparator f1775f;

    public C0492y(Comparator comparator) {
        this.f1774e = 0;
        this.f1775f = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1774e) {
            case 0:
                int compare = this.f1775f.compare(obj, obj2);
                if (compare == 0) {
                    return C3502g0.f16863W.compare(((C0482o) obj).f1693c, ((C0482o) obj2).f1693c);
                }
                return compare;
            case 1:
                int compare2 = ((C0492y) this.f1775f).compare(obj, obj2);
                if (compare2 == 0) {
                    return AbstractC2067b.m3284i(Integer.valueOf(((C0482o) obj).f1697g), Integer.valueOf(((C0482o) obj2).f1697g));
                }
                return compare2;
            case 2:
                int compare3 = ((C0918h0) this.f1775f).compare(obj, obj2);
                if (compare3 == 0) {
                    C1102n c1102n = (C1102n) obj2;
                    C1102n c1102n2 = (C1102n) obj;
                    return AbstractC2067b.m3284i(Long.valueOf((c1102n.f6129c.get() - c1102n.f6130d.get()) + 1), Long.valueOf((c1102n2.f6129c.get() - c1102n2.f6130d.get()) + 1));
                }
                return compare3;
            case 3:
                int compare4 = ((C0918h0) this.f1775f).compare(obj, obj2);
                if (compare4 == 0) {
                    return AbstractC2067b.m3284i(((C1467yn) obj).f9464a, ((C1467yn) obj2).f9464a);
                }
                return compare4;
            default:
                int compare5 = ((C0918h0) this.f1775f).compare(obj, obj2);
                if (compare5 == 0) {
                    return AbstractC2067b.m3284i(((C1467yn) obj).f9464a, ((C1467yn) obj2).f9464a);
                }
                return compare5;
        }
    }

    public /* synthetic */ C0492y(Comparator comparator, int i7) {
        this.f1774e = i7;
        this.f1775f = comparator;
    }
}
