package p087l2;

import p092m.AbstractC2487d;
import p100n.AbstractC2647h;
import p103n2.C2714b;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.k */
/* loaded from: classes.dex */
public final class C2447k {

    /* renamed from: g */
    public static final C2447k f13698g = new C2447k(false, 0, true, 1, 1, C2714b.f14562g);

    /* renamed from: a */
    public final boolean f13699a;

    /* renamed from: b */
    public final int f13700b;

    /* renamed from: c */
    public final boolean f13701c;

    /* renamed from: d */
    public final int f13702d;

    /* renamed from: e */
    public final int f13703e;

    /* renamed from: f */
    public final C2714b f13704f;

    public C2447k(boolean z7, int i7, boolean z8, int i8, int i9, C2714b c2714b) {
        this.f13699a = z7;
        this.f13700b = i7;
        this.f13701c = z8;
        this.f13702d = i8;
        this.f13703e = i9;
        this.f13704f = c2714b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2447k) {
                C2447k c2447k = (C2447k) obj;
                if (this.f13699a == c2447k.f13699a && this.f13700b == c2447k.f13700b && this.f13701c == c2447k.f13701c && this.f13702d == c2447k.f13702d && this.f13703e == c2447k.f13703e && AbstractC3367j.m5096a(this.f13704f, c2447k.f13704f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13704f.f14563e.hashCode() + AbstractC2647h.m4255a(this.f13703e, AbstractC2647h.m4255a(this.f13702d, AbstractC2487d.m4040d(AbstractC2647h.m4255a(this.f13700b, Boolean.hashCode(this.f13699a) * 31, 31), 31, this.f13701c), 31), 961);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ImeOptions(singleLine=");
        sb.append(this.f13699a);
        sb.append(", capitalization=");
        int i7 = this.f13700b;
        if (i7 == -1) {
            str = "Unspecified";
        } else if (i7 == 0) {
            str = "None";
        } else if (i7 == 1) {
            str = "Characters";
        } else if (i7 == 2) {
            str = "Words";
        } else if (i7 == 3) {
            str = "Sentences";
        } else {
            str = "Invalid";
        }
        sb.append((Object) str);
        sb.append(", autoCorrect=");
        sb.append(this.f13701c);
        sb.append(", keyboardType=");
        sb.append((Object) C2448l.m4021a(this.f13702d));
        sb.append(", imeAction=");
        sb.append((Object) C2446j.m4020a(this.f13703e));
        sb.append(", platformImeOptions=null, hintLocales=");
        sb.append(this.f13704f);
        sb.append(')');
        return sb.toString();
    }
}
