package p077k;

import java.util.ConcurrentModificationException;
import p084l.AbstractC2334a;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.q */
/* loaded from: classes.dex */
public abstract class AbstractC2211q {

    /* renamed from: a */
    public static final Object f12723a = new Object();

    /* renamed from: b */
    public static final long[] f12724b = new long[0];

    /* renamed from: c */
    public static final Object f12725c = new Object();

    /* renamed from: a */
    public static final int m3622a(C2191g c2191g, Object obj, int i7) {
        int i8 = c2191g.f12662g;
        if (i8 == 0) {
            return -1;
        }
        try {
            int m3710a = AbstractC2334a.m3710a(i8, i7, c2191g.f12660e);
            if (m3710a < 0 || AbstractC3367j.m5096a(obj, c2191g.f12661f[m3710a])) {
                return m3710a;
            }
            int i9 = m3710a + 1;
            while (i9 < i8 && c2191g.f12660e[i9] == i7) {
                if (AbstractC3367j.m5096a(obj, c2191g.f12661f[i9])) {
                    return i9;
                }
                i9++;
            }
            for (int i10 = m3710a - 1; i10 >= 0 && c2191g.f12660e[i10] == i7; i10--) {
                if (AbstractC3367j.m5096a(obj, c2191g.f12661f[i10])) {
                    return i10;
                }
            }
            return ~i9;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
