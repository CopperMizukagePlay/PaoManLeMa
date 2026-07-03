package p132r2;

import java.util.ArrayList;
import p001a0.AbstractC0094y0;
import p155u2.AbstractC3353a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r2.l */
/* loaded from: classes.dex */
public final class C3038l {

    /* renamed from: b */
    public static final C3038l f15604b = new C3038l(0);

    /* renamed from: c */
    public static final C3038l f15605c = new C3038l(1);

    /* renamed from: d */
    public static final C3038l f15606d = new C3038l(2);

    /* renamed from: a */
    public final int f15607a;

    public C3038l(int i7) {
        this.f15607a = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3038l)) {
            return false;
        }
        if (this.f15607a == ((C3038l) obj).f15607a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f15607a;
    }

    public final String toString() {
        int i7 = this.f15607a;
        if (i7 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i7 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i7 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return AbstractC0094y0.m187n(new StringBuilder("TextDecoration["), AbstractC3353a.m5086a(arrayList, ", ", null, 62), ']');
    }
}
