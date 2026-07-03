package p039e5;

import java.util.Arrays;
import p001a0.AbstractC0094y0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.fl */
/* loaded from: classes.dex */
public final class C0875fl {

    /* renamed from: a */
    public final byte[] f4038a;

    /* renamed from: b */
    public final byte[] f4039b;

    /* renamed from: c */
    public final boolean f4040c;

    public C0875fl(byte[] bArr, byte[] bArr2, boolean z7) {
        this.f4038a = bArr;
        this.f4039b = bArr2;
        this.f4040c = z7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C0875fl) {
                C0875fl c0875fl = (C0875fl) obj;
                if (!this.f4038a.equals(c0875fl.f4038a) || !this.f4039b.equals(c0875fl.f4039b) || this.f4040c != c0875fl.f4040c) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4040c) + ((Arrays.hashCode(this.f4039b) + (Arrays.hashCode(this.f4038a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m189p = AbstractC0094y0.m189p("StunPacket(bytes=", Arrays.toString(this.f4038a), ", transactionKey=", Arrays.toString(this.f4039b), ", useMagicCookie=");
        m189p.append(this.f4040c);
        m189p.append(")");
        return m189p.toString();
    }
}
