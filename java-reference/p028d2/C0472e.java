package p028d2;

import java.util.Comparator;
import p027d1.C0465c;
import p053g5.C1687f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d2.e */
/* loaded from: classes.dex */
public final class C0472e implements Comparator {

    /* renamed from: f */
    public static final C0472e f1645f = new C0472e(0);

    /* renamed from: g */
    public static final C0472e f1646g = new C0472e(1);

    /* renamed from: h */
    public static final C0472e f1647h = new C0472e(2);

    /* renamed from: e */
    public final /* synthetic */ int f1648e;

    public /* synthetic */ C0472e(int i7) {
        this.f1648e = i7;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f1648e) {
            case 0:
                C0465c m1046h = ((C0482o) obj).m1046h();
                C0465c m1046h2 = ((C0482o) obj2).m1046h();
                int compare = Float.compare(m1046h.f1625a, m1046h2.f1625a);
                if (compare == 0) {
                    int compare2 = Float.compare(m1046h.f1626b, m1046h2.f1626b);
                    if (compare2 == 0) {
                        int compare3 = Float.compare(m1046h.f1628d, m1046h2.f1628d);
                        if (compare3 == 0) {
                            return Float.compare(m1046h.f1627c, m1046h2.f1627c);
                        }
                        return compare3;
                    }
                    return compare2;
                }
                return compare;
            case 1:
                C0465c m1046h3 = ((C0482o) obj).m1046h();
                C0465c m1046h4 = ((C0482o) obj2).m1046h();
                int compare4 = Float.compare(m1046h4.f1627c, m1046h3.f1627c);
                if (compare4 == 0) {
                    int compare5 = Float.compare(m1046h3.f1626b, m1046h4.f1626b);
                    if (compare5 == 0) {
                        int compare6 = Float.compare(m1046h3.f1628d, m1046h4.f1628d);
                        if (compare6 == 0) {
                            return Float.compare(m1046h4.f1625a, m1046h3.f1625a);
                        }
                        return compare6;
                    }
                    return compare5;
                }
                return compare4;
            default:
                C1687f c1687f = (C1687f) obj;
                C1687f c1687f2 = (C1687f) obj2;
                int compare7 = Float.compare(((C0465c) c1687f.f10471e).f1626b, ((C0465c) c1687f2.f10471e).f1626b);
                if (compare7 == 0) {
                    return Float.compare(((C0465c) c1687f.f10471e).f1628d, ((C0465c) c1687f2.f10471e).f1628d);
                }
                return compare7;
        }
    }
}
