package p039e5;

import java.util.Arrays;
import p001a0.AbstractC0094y0;
import p024c6.AbstractC0444k;
import p092m.AbstractC2487d;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.za */
/* loaded from: classes.dex */
public final class C1485za {

    /* renamed from: a */
    public final String f9839a;

    /* renamed from: b */
    public final String f9840b;

    /* renamed from: c */
    public final int f9841c;

    /* renamed from: d */
    public final int f9842d;

    /* renamed from: e */
    public final byte[] f9843e;

    public C1485za(String str, String str2, int i7, int i8, byte[] bArr) {
        AbstractC3367j.m5100e(str, "label");
        AbstractC3367j.m5100e(str2, "cidr");
        this.f9839a = str;
        this.f9840b = str2;
        this.f9841c = i7;
        this.f9842d = i8;
        this.f9843e = bArr;
    }

    /* renamed from: a */
    public final String m2437a() {
        String str = this.f9839a;
        if (AbstractC0444k.m937a0(str)) {
            return this.f9840b;
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1485za)) {
            return false;
        }
        C1485za c1485za = (C1485za) obj;
        if (AbstractC3367j.m5096a(this.f9839a, c1485za.f9839a) && AbstractC3367j.m5096a(this.f9840b, c1485za.f9840b) && this.f9841c == c1485za.f9841c && this.f9842d == c1485za.f9842d && Arrays.equals(this.f9843e, c1485za.f9843e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9843e) + ((((AbstractC0094y0.m175b(this.f9839a.hashCode() * 31, 31, this.f9840b) + this.f9841c) * 31) + this.f9842d) * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f9843e);
        StringBuilder m189p = AbstractC0094y0.m189p("EdnsEcsQuerySubnet(label=", this.f9839a, ", cidr=", this.f9840b, ", family=");
        AbstractC0094y0.m192s(m189p, this.f9841c, ", sourcePrefixLength=", this.f9842d, ", addressBytes=");
        return AbstractC2487d.m4046j(m189p, arrays, ")");
    }
}
