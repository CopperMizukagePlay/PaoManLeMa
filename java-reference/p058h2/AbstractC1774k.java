package p058h2;

import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h2.k */
/* loaded from: classes.dex */
public abstract class AbstractC1774k {

    /* renamed from: a */
    public static final C1772i f10809a = new Canvas();

    /* renamed from: b */
    public static final long f10810b;

    /* JADX WARN: Type inference failed for: r0v0, types: [h2.i, android.graphics.Canvas] */
    static {
        long j6 = 0;
        f10810b = (j6 & 4294967295L) | (j6 << 32);
    }

    /* renamed from: a */
    public static final TextDirectionHeuristic m2938a(int i7) {
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 != 3) {
                        if (i7 != 4) {
                            if (i7 != 5) {
                                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            }
                            return TextDirectionHeuristics.LOCALE;
                        }
                        return TextDirectionHeuristics.ANYRTL_LTR;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        return TextDirectionHeuristics.LTR;
    }
}
