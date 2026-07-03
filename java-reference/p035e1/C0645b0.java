package p035e1;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.List;
import p027d1.C0464b;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.b0 */
/* loaded from: classes.dex */
public final class C0645b0 extends AbstractC0663k0 {

    /* renamed from: c */
    public final List f2126c;

    /* renamed from: d */
    public final long f2127d;

    /* renamed from: e */
    public final long f2128e;

    public C0645b0(List list, long j6, long j7) {
        this.f2126c = list;
        this.f2127d = j6;
        this.f2128e = j7;
    }

    @Override // p035e1.AbstractC0663k0
    /* renamed from: b */
    public final Shader mo1348b(long j6) {
        long j7 = this.f2127d;
        int i7 = (int) (j7 >> 32);
        if (Float.intBitsToFloat(i7) == Float.POSITIVE_INFINITY) {
            i7 = (int) (j6 >> 32);
        }
        float intBitsToFloat = Float.intBitsToFloat(i7);
        int i8 = (int) (j7 & 4294967295L);
        if (Float.intBitsToFloat(i8) == Float.POSITIVE_INFINITY) {
            i8 = (int) (j6 & 4294967295L);
        }
        float intBitsToFloat2 = Float.intBitsToFloat(i8);
        long j8 = this.f2128e;
        int i9 = (int) (j8 >> 32);
        if (Float.intBitsToFloat(i9) == Float.POSITIVE_INFINITY) {
            i9 = (int) (j6 >> 32);
        }
        float intBitsToFloat3 = Float.intBitsToFloat(i9);
        int i10 = (int) (j8 & 4294967295L);
        if (Float.intBitsToFloat(i10) == Float.POSITIVE_INFINITY) {
            i10 = (int) (j6 & 4294967295L);
        }
        float intBitsToFloat4 = Float.intBitsToFloat(i10);
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) << 32) | (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L);
        List list = this.f2126c;
        AbstractC0659i0.m1399F(list);
        int m1411k = AbstractC0659i0.m1411k(list);
        return new LinearGradient(Float.intBitsToFloat((int) (floatToRawIntBits >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & 4294967295L)), AbstractC0659i0.m1417q(m1411k, list), AbstractC0659i0.m1418r(m1411k, list), Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C0645b0) {
            C0645b0 c0645b0 = (C0645b0) obj;
            if (this.f2126c.equals(c0645b0.f2126c) && C0464b.m1006b(this.f2127d, c0645b0.f2127d) && C0464b.m1006b(this.f2128e, c0645b0.f2128e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(this.f2126c.hashCode() * 961, 31, this.f2127d), 31, this.f2128e);
    }

    public final String toString() {
        String str;
        long j6 = this.f2127d;
        String str2 = "";
        if (((((j6 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) != 0) {
            str = "";
        } else {
            str = "start=" + ((Object) C0464b.m1013i(j6)) + ", ";
        }
        long j7 = this.f2128e;
        if (((((j7 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C0464b.m1013i(j7)) + ", ";
        }
        return "LinearGradient(colors=" + this.f2126c + ", stops=null, " + str + str2 + "tileMode=" + ((Object) "Clamp") + ')';
    }
}
