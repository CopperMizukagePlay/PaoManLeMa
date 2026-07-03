package p051g3;

import android.view.WindowInsets;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.x0 */
/* loaded from: classes.dex */
public abstract class AbstractC1668x0 {
    /* renamed from: a */
    public static int m2732a(int i7) {
        int statusBars;
        int i8 = 0;
        for (int i9 = 1; i9 <= 512; i9 <<= 1) {
            if ((i7 & i9) != 0) {
                if (i9 == 1) {
                    statusBars = WindowInsets.Type.statusBars();
                } else if (i9 == 2) {
                    statusBars = WindowInsets.Type.navigationBars();
                } else if (i9 == 4) {
                    statusBars = WindowInsets.Type.captionBar();
                } else if (i9 == 8) {
                    statusBars = WindowInsets.Type.ime();
                } else if (i9 == 16) {
                    statusBars = WindowInsets.Type.systemGestures();
                } else if (i9 == 32) {
                    statusBars = WindowInsets.Type.mandatorySystemGestures();
                } else if (i9 == 64) {
                    statusBars = WindowInsets.Type.tappableElement();
                } else if (i9 == 128) {
                    statusBars = WindowInsets.Type.displayCutout();
                }
                i8 |= statusBars;
            }
        }
        return i8;
    }
}
