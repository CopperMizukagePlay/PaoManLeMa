package p050g2;

import java.util.ArrayList;
import java.util.List;
import p001a0.C0068q2;
import p060h5.AbstractC1805m;
import p060h5.C1813u;
import p077k.AbstractC2199k;
import p077k.C2220v;
import p084l.AbstractC2334a;
import p095m2.AbstractC2550a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.g */
/* loaded from: classes.dex */
public final class C1587g implements CharSequence {

    /* renamed from: e */
    public final List f10238e;

    /* renamed from: f */
    public final String f10239f;

    /* renamed from: g */
    public final ArrayList f10240g;

    /* renamed from: h */
    public final ArrayList f10241h;

    static {
        C0068q2 c0068q2 = AbstractC1582d0.f10208a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b2, code lost:
    
        r1.m3643a(r3.f10231c);
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1587g(List list, String str) {
        ArrayList arrayList;
        ArrayList arrayList2;
        this.f10238e = list;
        this.f10239f = str;
        int i7 = 0;
        if (list != null) {
            int size = list.size();
            arrayList = null;
            arrayList2 = null;
            for (int i8 = 0; i8 < size; i8++) {
                C1583e c1583e = (C1583e) list.get(i8);
                Object obj = c1583e.f10229a;
                if (obj instanceof C1588g0) {
                    arrayList = arrayList == null ? new ArrayList() : arrayList;
                    arrayList.add(c1583e);
                } else if (obj instanceof C1613v) {
                    arrayList2 = arrayList2 == null ? new ArrayList() : arrayList2;
                    arrayList2.add(c1583e);
                }
            }
        } else {
            arrayList = null;
            arrayList2 = null;
        }
        this.f10240g = arrayList;
        this.f10241h = arrayList2;
        List m3061y0 = arrayList2 != null ? AbstractC1805m.m3061y0(arrayList2, new C1585f(i7)) : null;
        if (m3061y0 == null || m3061y0.isEmpty()) {
            return;
        }
        int i9 = ((C1583e) AbstractC1805m.m3045i0(m3061y0)).f10231c;
        int i10 = AbstractC2199k.f12702a;
        int i11 = 1;
        C2220v c2220v = new C2220v(1);
        c2220v.m3643a(i9);
        int size2 = m3061y0.size();
        while (i11 < size2) {
            C1583e c1583e2 = (C1583e) m3061y0.get(i11);
            while (true) {
                int i12 = c2220v.f12755b;
                if (i12 == 0) {
                    break;
                }
                if (i12 != 0) {
                    int i13 = c2220v.f12754a[i12 - 1];
                    int i14 = c1583e2.f10230b;
                    int i15 = c1583e2.f10231c;
                    if (i14 >= i13) {
                        c2220v.m3646d(i12 - 1);
                    } else if (i15 > i13) {
                        AbstractC2550a.m4078a("Paragraph overlap not allowed, end " + i15 + " should be less than or equal to " + i13);
                    }
                } else {
                    AbstractC2334a.m3714e("IntList is empty.");
                    throw null;
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        if (r3.isEmpty() != false) goto L29;
     */
    @Override // java.lang.CharSequence
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1587g subSequence(int i7, int i8) {
        boolean z7;
        ArrayList arrayList;
        if (i7 <= i8) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (!z7) {
            AbstractC2550a.m4078a("start (" + i7 + ") should be less or equal to end (" + i8 + ')');
        }
        String str = this.f10239f;
        if (i7 == 0 && i8 == str.length()) {
            return this;
        }
        String substring = str.substring(i7, i8);
        AbstractC3367j.m5099d(substring, "substring(...)");
        C1587g c1587g = AbstractC1589h.f10258a;
        if (i7 > i8) {
            AbstractC2550a.m4078a("start (" + i7 + ") should be less than or equal to end (" + i8 + ')');
        }
        List list = this.f10238e;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i9 = 0; i9 < size; i9++) {
                C1583e c1583e = (C1583e) list.get(i9);
                int i10 = c1583e.f10230b;
                int i11 = c1583e.f10231c;
                if (AbstractC1589h.m2570b(i7, i8, i10, i11)) {
                    arrayList.add(new C1583e(c1583e.f10229a, Math.max(i7, c1583e.f10230b) - i7, Math.min(i8, i11) - i7, c1583e.f10232d));
                }
            }
        }
        arrayList = null;
        return new C1587g(arrayList, substring);
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f10239f.charAt(i7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1587g)) {
            return false;
        }
        C1587g c1587g = (C1587g) obj;
        if (AbstractC3367j.m5096a(this.f10239f, c1587g.f10239f) && AbstractC3367j.m5096a(this.f10238e, c1587g.f10238e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i7;
        int hashCode = this.f10239f.hashCode() * 31;
        List list = this.f10238e;
        if (list != null) {
            i7 = list.hashCode();
        } else {
            i7 = 0;
        }
        return hashCode + i7;
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f10239f.length();
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f10239f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1587g(String str, ArrayList arrayList, int i7) {
        this(r2.isEmpty() ? null : r2, str);
        List list = (i7 & 2) != 0 ? C1813u.f10860e : arrayList;
        C1587g c1587g = AbstractC1589h.f10258a;
    }

    public /* synthetic */ C1587g(String str) {
        this(str, C1813u.f10860e);
    }

    public C1587g(String str, List list) {
        this(list.isEmpty() ? null : list, str);
    }
}
