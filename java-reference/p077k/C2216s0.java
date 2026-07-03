package p077k;

import java.util.Arrays;
import p060h5.AbstractC1804l;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.s0 */
/* loaded from: classes.dex */
public final class C2216s0 implements Cloneable {

    /* renamed from: e */
    public /* synthetic */ int[] f12739e;

    /* renamed from: f */
    public /* synthetic */ Object[] f12740f;

    /* renamed from: g */
    public /* synthetic */ int f12741g;

    public C2216s0() {
        int i7;
        int i8 = 4;
        while (true) {
            i7 = 40;
            if (i8 >= 32) {
                break;
            }
            int i9 = (1 << i8) - 12;
            if (40 <= i9) {
                i7 = i9;
                break;
            }
            i8++;
        }
        int i10 = i7 / 4;
        this.f12739e = new int[i10];
        this.f12740f = new Object[i10];
    }

    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2216s0 clone() {
        Object clone = super.clone();
        AbstractC3367j.m5098c(clone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        C2216s0 c2216s0 = (C2216s0) clone;
        c2216s0.f12739e = (int[]) this.f12739e.clone();
        c2216s0.f12740f = (Object[]) this.f12740f.clone();
        return c2216s0;
    }

    /* renamed from: b */
    public final Object m3634b(int i7) {
        Object obj;
        int m3710a = AbstractC2334a.m3710a(this.f12741g, i7, this.f12739e);
        if (m3710a >= 0 && (obj = this.f12740f[m3710a]) != AbstractC2211q.f12725c) {
            return obj;
        }
        return null;
    }

    /* renamed from: c */
    public final void m3635c(int i7, Object obj) {
        int m3710a = AbstractC2334a.m3710a(this.f12741g, i7, this.f12739e);
        if (m3710a >= 0) {
            this.f12740f[m3710a] = obj;
            return;
        }
        int i8 = ~m3710a;
        int i9 = this.f12741g;
        if (i8 < i9) {
            Object[] objArr = this.f12740f;
            if (objArr[i8] == AbstractC2211q.f12725c) {
                this.f12739e[i8] = i7;
                objArr[i8] = obj;
                return;
            }
        }
        if (i9 >= this.f12739e.length) {
            int i10 = (i9 + 1) * 4;
            int i11 = 4;
            while (true) {
                if (i11 >= 32) {
                    break;
                }
                int i12 = (1 << i11) - 12;
                if (i10 <= i12) {
                    i10 = i12;
                    break;
                }
                i11++;
            }
            int i13 = i10 / 4;
            int[] copyOf = Arrays.copyOf(this.f12739e, i13);
            AbstractC3367j.m5099d(copyOf, "copyOf(...)");
            this.f12739e = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.f12740f, i13);
            AbstractC3367j.m5099d(copyOf2, "copyOf(...)");
            this.f12740f = copyOf2;
        }
        int i14 = this.f12741g;
        if (i14 - i8 != 0) {
            int[] iArr = this.f12739e;
            int i15 = i8 + 1;
            AbstractC1804l.m3015H(iArr, iArr, i15, i8, i14);
            Object[] objArr2 = this.f12740f;
            AbstractC1804l.m3017J(objArr2, objArr2, i15, i8, this.f12741g);
        }
        this.f12739e[i8] = i7;
        this.f12740f[i8] = obj;
        this.f12741g++;
    }

    /* renamed from: d */
    public final Object m3636d(int i7) {
        Object[] objArr = this.f12740f;
        if (i7 < objArr.length) {
            return objArr[i7];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i7 = this.f12741g;
        if (i7 <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i7 * 28);
        sb.append('{');
        int i8 = this.f12741g;
        for (int i9 = 0; i9 < i8; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(this.f12739e[i9]);
            sb.append('=');
            Object m3636d = m3636d(i9);
            if (m3636d != this) {
                sb.append(m3636d);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String sb2 = sb.toString();
        AbstractC3367j.m5099d(sb2, "toString(...)");
        return sb2;
    }
}
