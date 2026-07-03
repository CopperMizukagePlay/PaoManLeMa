package p196z6;

import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: z6.g */
/* loaded from: classes.dex */
public final class C3888g {

    /* renamed from: a */
    public final boolean f18212a;

    /* renamed from: b */
    public final Integer f18213b;

    /* renamed from: c */
    public final boolean f18214c;

    /* renamed from: d */
    public final Integer f18215d;

    /* renamed from: e */
    public final boolean f18216e;

    /* renamed from: f */
    public final boolean f18217f;

    public C3888g(boolean z7, Integer num, boolean z8, Integer num2, boolean z9, boolean z10) {
        this.f18212a = z7;
        this.f18213b = num;
        this.f18214c = z8;
        this.f18215d = num2;
        this.f18216e = z9;
        this.f18217f = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3888g)) {
            return false;
        }
        C3888g c3888g = (C3888g) obj;
        if (this.f18212a == c3888g.f18212a && AbstractC3367j.m5096a(this.f18213b, c3888g.f18213b) && this.f18214c == c3888g.f18214c && AbstractC3367j.m5096a(this.f18215d, c3888g.f18215d) && this.f18216e == c3888g.f18216e && this.f18217f == c3888g.f18217f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode;
        int i7 = 1;
        boolean z7 = this.f18212a;
        int i8 = z7;
        if (z7 != 0) {
            i8 = 1;
        }
        int i9 = i8 * 31;
        int i10 = 0;
        Integer num = this.f18213b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i11 = (i9 + hashCode) * 31;
        boolean z8 = this.f18214c;
        int i12 = z8;
        if (z8 != 0) {
            i12 = 1;
        }
        int i13 = (i11 + i12) * 31;
        Integer num2 = this.f18215d;
        if (num2 != null) {
            i10 = num2.hashCode();
        }
        int i14 = (i13 + i10) * 31;
        boolean z9 = this.f18216e;
        int i15 = z9;
        if (z9 != 0) {
            i15 = 1;
        }
        int i16 = (i14 + i15) * 31;
        boolean z10 = this.f18217f;
        if (!z10) {
            i7 = z10 ? 1 : 0;
        }
        return i16 + i7;
    }

    public final String toString() {
        return "WebSocketExtensions(perMessageDeflate=" + this.f18212a + ", clientMaxWindowBits=" + this.f18213b + ", clientNoContextTakeover=" + this.f18214c + ", serverMaxWindowBits=" + this.f18215d + ", serverNoContextTakeover=" + this.f18216e + ", unknownValues=" + this.f18217f + ')';
    }
}
