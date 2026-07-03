package p072j1;

import android.graphics.Bitmap;
import p035e1.C0654g;
import p035e1.C0666m;
import p049g1.InterfaceC1570d;
import p067i4.AbstractC2072e;
import p092m.AbstractC2487d;
import p140s2.C3100j;
import p140s2.C3102l;
import p158u5.AbstractC3367j;
import p162v1.C3508i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j1.a */
/* loaded from: classes.dex */
public final class C2162a extends AbstractC2163b {

    /* renamed from: e */
    public final C0654g f12559e;

    /* renamed from: f */
    public final long f12560f;

    /* renamed from: g */
    public int f12561g;

    /* renamed from: h */
    public final long f12562h;

    /* renamed from: i */
    public float f12563i;

    /* renamed from: j */
    public C0666m f12564j;

    public C2162a(C0654g c0654g, long j6) {
        int i7;
        int i8;
        Bitmap bitmap = c0654g.f2144a;
        this.f12559e = c0654g;
        this.f12560f = j6;
        this.f12561g = 1;
        if (((int) 0) >= 0 && ((int) 0) >= 0 && (i7 = (int) (j6 >> 32)) >= 0 && (i8 = (int) (4294967295L & j6)) >= 0 && i7 <= bitmap.getWidth() && i8 <= bitmap.getHeight()) {
            this.f12562h = j6;
            this.f12563i = 1.0f;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    @Override // p072j1.AbstractC2163b
    /* renamed from: a */
    public final void mo3502a(float f7) {
        this.f12563i = f7;
    }

    @Override // p072j1.AbstractC2163b
    /* renamed from: b */
    public final void mo3503b(C0666m c0666m) {
        this.f12564j = c0666m;
    }

    @Override // p072j1.AbstractC2163b
    /* renamed from: d */
    public final long mo3504d() {
        return AbstractC2072e.m3347y(this.f12562h);
    }

    @Override // p072j1.AbstractC2163b
    /* renamed from: e */
    public final void mo3505e(C3508i0 c3508i0) {
        InterfaceC1570d.m2542d0(c3508i0, this.f12559e, this.f12560f, (Math.round(Float.intBitsToFloat((int) (r1.mo2546c() & 4294967295L))) & 4294967295L) | (Math.round(Float.intBitsToFloat((int) (c3508i0.f16933e.mo2546c() >> 32))) << 32), this.f12563i, this.f12564j, this.f12561g, 328);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2162a) {
                C2162a c2162a = (C2162a) obj;
                if (AbstractC3367j.m5096a(this.f12559e, c2162a.f12559e) && C3100j.m4783a(0L, 0L) && C3102l.m4790a(this.f12560f, c2162a.f12560f) && this.f12561g == c2162a.f12561g) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f12561g) + AbstractC2487d.m4039c(AbstractC2487d.m4039c(this.f12559e.hashCode() * 31, 31, 0L), 31, this.f12560f);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BitmapPainter(image=");
        sb.append(this.f12559e);
        sb.append(", srcOffset=");
        sb.append((Object) C3100j.m4786d(0L));
        sb.append(", srcSize=");
        sb.append((Object) C3102l.m4791b(this.f12560f));
        sb.append(", filterQuality=");
        int i7 = this.f12561g;
        if (i7 == 0) {
            str = "None";
        } else if (i7 == 1) {
            str = "Low";
        } else if (i7 == 2) {
            str = "Medium";
        } else if (i7 == 3) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
