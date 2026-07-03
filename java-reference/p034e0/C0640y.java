package p034e0;

import p001a0.EnumC0088w0;
import p027d1.C0464b;
import p092m.AbstractC2487d;
import p100n.AbstractC2647h;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e0.y */
/* loaded from: classes.dex */
public final class C0640y {

    /* renamed from: a */
    public final EnumC0088w0 f2116a;

    /* renamed from: b */
    public final long f2117b;

    /* renamed from: c */
    public final int f2118c;

    /* renamed from: d */
    public final boolean f2119d;

    public C0640y(EnumC0088w0 enumC0088w0, long j6, int i7, boolean z7) {
        this.f2116a = enumC0088w0;
        this.f2117b = j6;
        this.f2118c = i7;
        this.f2119d = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0640y) {
                C0640y c0640y = (C0640y) obj;
                if (this.f2116a != c0640y.f2116a || !C0464b.m1006b(this.f2117b, c0640y.f2117b) || this.f2118c != c0640y.f2118c || this.f2119d != c0640y.f2119d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f2119d) + ((AbstractC2647h.m4257c(this.f2118c) + AbstractC2487d.m4039c(this.f2116a.hashCode() * 31, 31, this.f2117b)) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.f2116a);
        sb.append(", position=");
        sb.append((Object) C0464b.m1013i(this.f2117b));
        sb.append(", anchor=");
        int i7 = this.f2118c;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    str = "null";
                } else {
                    str = "Right";
                }
            } else {
                str = "Middle";
            }
        } else {
            str = "Left";
        }
        sb.append(str);
        sb.append(", visible=");
        sb.append(this.f2119d);
        sb.append(')');
        return sb.toString();
    }
}
