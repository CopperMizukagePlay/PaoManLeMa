package p099m6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import p039e5.C0811dk;
import p053g5.C1687f;
import p060h5.AbstractC1804l;
import p068i5.AbstractC2080d;
import p106n6.AbstractC2721b;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.r */
/* loaded from: classes.dex */
public final class C2617r implements Iterable, InterfaceC3594a {

    /* renamed from: e */
    public final String[] f14141e;

    public C2617r(String[] strArr) {
        this.f14141e = strArr;
    }

    /* renamed from: a */
    public final String m4164a(String str) {
        AbstractC3367j.m5100e(str, "name");
        String[] strArr = this.f14141e;
        int length = strArr.length - 2;
        int m3402o = AbstractC2080d.m3402o(length, 0, -2);
        if (m3402o <= length) {
            while (!str.equalsIgnoreCase(strArr[length])) {
                if (length != m3402o) {
                    length -= 2;
                } else {
                    return null;
                }
            }
            return strArr[length + 1];
        }
        return null;
    }

    /* renamed from: b */
    public final String m4165b(int i7) {
        return this.f14141e[i7 * 2];
    }

    /* renamed from: c */
    public final C0811dk m4166c() {
        C0811dk c0811dk = new C0811dk(3);
        ArrayList arrayList = c0811dk.f3514f;
        AbstractC3367j.m5100e(arrayList, "<this>");
        String[] strArr = this.f14141e;
        AbstractC3367j.m5100e(strArr, "elements");
        arrayList.addAll(AbstractC1804l.m3010C(strArr));
        return c0811dk;
    }

    /* renamed from: d */
    public final String m4167d(int i7) {
        return this.f14141e[(i7 * 2) + 1];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2617r) {
            if (Arrays.equals(this.f14141e, ((C2617r) obj).f14141e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14141e);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int size = size();
        C1687f[] c1687fArr = new C1687f[size];
        for (int i7 = 0; i7 < size; i7++) {
            c1687fArr[i7] = new C1687f(m4165b(i7), m4167d(i7));
        }
        return AbstractC3367j.m5103h(c1687fArr);
    }

    public final int size() {
        return this.f14141e.length / 2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int size = size();
        for (int i7 = 0; i7 < size; i7++) {
            String m4165b = m4165b(i7);
            String m4167d = m4167d(i7);
            sb.append(m4165b);
            sb.append(": ");
            if (AbstractC2721b.m4371q(m4165b)) {
                m4167d = "██";
            }
            sb.append(m4167d);
            sb.append("\n");
        }
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
