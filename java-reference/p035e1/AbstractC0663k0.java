package p035e1;

import android.graphics.Paint;
import android.graphics.Shader;
import p001a0.C0019e1;
import p023c5.C0427s;
import p027d1.C0467e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.k0 */
/* loaded from: classes.dex */
public abstract class AbstractC0663k0 extends AbstractC0670o {

    /* renamed from: a */
    public C0019e1 f2174a;

    /* renamed from: b */
    public long f2175b = 9205357640488583168L;

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000f, code lost:
    
        if (p027d1.C0467e.m1023a(r5.f2175b, r7) == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r1v4, types: [a0.e1, java.lang.Object] */
    @Override // p035e1.AbstractC0670o
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1444a(float f7, long j6, C0427s c0427s) {
        C0019e1 c0019e1;
        Shader shader;
        Paint paint = (Paint) c0427s.f1462g;
        C0019e1 c0019e12 = this.f2174a;
        Shader shader2 = null;
        if (c0019e12 != null) {
            c0019e1 = c0019e12;
        }
        if (C0467e.m1027e(j6)) {
            this.f2174a = null;
            this.f2175b = 9205357640488583168L;
            c0019e1 = null;
        } else {
            C0019e1 c0019e13 = this.f2174a;
            C0019e1 c0019e14 = c0019e13;
            if (c0019e13 == null) {
                ?? obj = new Object();
                this.f2174a = obj;
                c0019e14 = obj;
            }
            c0019e14.f109e = mo1348b(j6);
            this.f2174a = c0019e14;
            this.f2175b = j6;
            c0019e1 = c0019e14;
        }
        long m1403c = AbstractC0659i0.m1403c(paint.getColor());
        long j7 = C0677s.f2204b;
        if (!C0677s.m1454c(m1403c, j7)) {
            c0427s.m910i(j7);
        }
        Shader shader3 = (Shader) c0427s.f1463h;
        if (c0019e1 != null) {
            shader = (Shader) c0019e1.f109e;
        } else {
            shader = null;
        }
        if (!AbstractC3367j.m5096a(shader3, shader)) {
            if (c0019e1 != null) {
                shader2 = (Shader) c0019e1.f109e;
            }
            c0427s.m913l(shader2);
        }
        if (paint.getAlpha() / 255.0f == f7) {
            return;
        }
        c0427s.m908g(f7);
    }

    /* renamed from: b */
    public abstract Shader mo1348b(long j6);
}
