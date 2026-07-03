package p080k2;

import p100n.AbstractC2647h;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k2.q */
/* loaded from: classes.dex */
public final class C2306q {

    /* renamed from: a */
    public final AbstractC2305p f13245a;

    /* renamed from: b */
    public final C2300k f13246b;

    /* renamed from: c */
    public final int f13247c;

    /* renamed from: d */
    public final int f13248d;

    /* renamed from: e */
    public final Object f13249e;

    public C2306q(AbstractC2305p abstractC2305p, C2300k c2300k, int i7, int i8, Object obj) {
        this.f13245a = abstractC2305p;
        this.f13246b = c2300k;
        this.f13247c = i7;
        this.f13248d = i8;
        this.f13249e = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2306q)) {
            return false;
        }
        C2306q c2306q = (C2306q) obj;
        if (AbstractC3367j.m5096a(this.f13245a, c2306q.f13245a) && AbstractC3367j.m5096a(this.f13246b, c2306q.f13246b) && this.f13247c == c2306q.f13247c && this.f13248d == c2306q.f13248d && AbstractC3367j.m5096a(this.f13249e, c2306q.f13249e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        AbstractC2305p abstractC2305p = this.f13245a;
        if (abstractC2305p == null) {
            hashCode = 0;
        } else {
            hashCode = abstractC2305p.hashCode();
        }
        int m4255a = AbstractC2647h.m4255a(this.f13248d, AbstractC2647h.m4255a(this.f13247c, ((hashCode * 31) + this.f13246b.f13237e) * 31, 31), 31);
        Object obj = this.f13249e;
        if (obj != null) {
            i7 = obj.hashCode();
        }
        return m4255a + i7;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("TypefaceRequest(fontFamily=");
        sb.append(this.f13245a);
        sb.append(", fontWeight=");
        sb.append(this.f13246b);
        sb.append(", fontStyle=");
        String str2 = "Invalid";
        int i7 = this.f13247c;
        if (i7 == 0) {
            str = "Normal";
        } else if (i7 != 1) {
            str = "Invalid";
        } else {
            str = "Italic";
        }
        sb.append((Object) str);
        sb.append(", fontSynthesis=");
        int i8 = this.f13248d;
        if (i8 == 0) {
            str2 = "None";
        } else if (i8 == 1) {
            str2 = "Weight";
        } else if (i8 == 2) {
            str2 = "Style";
        } else if (i8 == 65535) {
            str2 = "All";
        }
        sb.append((Object) str2);
        sb.append(", resourceLoaderCacheKey=");
        sb.append(this.f13249e);
        sb.append(')');
        return sb.toString();
    }
}
