package p134r4;

import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: r4.b */
/* loaded from: classes.dex */
public class C3050b {

    /* renamed from: a */
    public final int f15629a;

    /* renamed from: b */
    public final int f15630b;

    public C3050b(int i7, int i8) {
        this.f15629a = i7;
        this.f15630b = i8;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3050b)) {
            return false;
        }
        C3050b c3050b = (C3050b) obj;
        if (this.f15629a != c3050b.f15629a || this.f15630b != c3050b.f15630b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f15629a ^ this.f15630b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f15629a);
        sb.append("(");
        return AbstractC2487d.m4045i(sb, this.f15630b, ')');
    }
}
