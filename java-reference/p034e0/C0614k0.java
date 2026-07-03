package p034e0;

import java.util.List;
import p001a0.C0068q2;
import p077k.C2209p;
import p117p1.C2867r;
import p117p1.C2870u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.k0 */
/* loaded from: classes.dex */
public final class C0614k0 {

    /* renamed from: a */
    public final /* synthetic */ int f2016a = 1;

    /* renamed from: b */
    public boolean f2017b;

    /* renamed from: c */
    public final Object f2018c;

    /* renamed from: d */
    public final Object f2019d;

    public C0614k0(C2209p c2209p, C0068q2 c0068q2) {
        this.f2018c = c2209p;
        this.f2019d = c0068q2;
    }

    /* renamed from: a */
    public boolean m1250a(long j6) {
        Object obj;
        List list = (List) ((C0068q2) this.f2019d).f344f;
        int size = list.size();
        int i7 = 0;
        while (true) {
            if (i7 < size) {
                obj = list.get(i7);
                if (C2867r.m4548a(((C2870u) obj).f15024a, j6)) {
                    break;
                }
                i7++;
            } else {
                obj = null;
                break;
            }
        }
        C2870u c2870u = (C2870u) obj;
        if (c2870u == null) {
            return false;
        }
        return c2870u.f15031h;
    }

    /* renamed from: b */
    public int m1251b() {
        C0619n c0619n = (C0619n) this.f2019d;
        int i7 = c0619n.f2035b;
        int i8 = c0619n.f2036c;
        if (i7 < i8) {
            return 2;
        }
        if (i7 > i8) {
            return 1;
        }
        return 3;
    }

    public String toString() {
        String str;
        switch (this.f2016a) {
            case 0:
                StringBuilder sb = new StringBuilder("SingleSelectionLayout(isStartHandle=");
                sb.append(this.f2017b);
                sb.append(", crossed=");
                int m1251b = m1251b();
                if (m1251b != 1) {
                    if (m1251b != 2) {
                        if (m1251b != 3) {
                            str = "null";
                        } else {
                            str = "COLLAPSED";
                        }
                    } else {
                        str = "NOT_CROSSED";
                    }
                } else {
                    str = "CROSSED";
                }
                sb.append(str);
                sb.append(", info=\n\t");
                sb.append((C0619n) this.f2019d);
                sb.append(')');
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public C0614k0(boolean z7, C0623p c0623p, C0619n c0619n) {
        this.f2017b = z7;
        this.f2018c = c0623p;
        this.f2019d = c0619n;
    }
}
