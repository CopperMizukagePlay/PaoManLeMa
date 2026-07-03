package p165v4;

import java.lang.reflect.Array;
import p157u4.AbstractC3355a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v4.f */
/* loaded from: classes.dex */
public abstract class AbstractC3592f {

    /* renamed from: a */
    public static final float[][] f17245a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 2787, 8);

    static {
        int i7;
        for (int i8 = 0; i8 < 2787; i8++) {
            int i9 = AbstractC3355a.f16418b[i8];
            int i10 = i9 & 1;
            int i11 = 0;
            while (i11 < 8) {
                float f7 = 0.0f;
                while (true) {
                    i7 = i9 & 1;
                    if (i7 == i10) {
                        f7 += 1.0f;
                        i9 >>= 1;
                    }
                }
                f17245a[i8][7 - i11] = f7 / 17.0f;
                i11++;
                i10 = i7;
            }
        }
    }
}
