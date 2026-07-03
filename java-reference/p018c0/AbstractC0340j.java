package p018c0;

import android.view.inputmethod.CursorAnchorInfo;
import p027d1.C0465c;
import p050g2.C1598l0;
import p050g2.C1605p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.j */
/* loaded from: classes.dex */
public abstract class AbstractC0340j {
    /* renamed from: a */
    public static final CursorAnchorInfo.Builder m727a(CursorAnchorInfo.Builder builder, C1598l0 c1598l0, C0465c c0465c) {
        if (!c0465c.m1017d()) {
            float f7 = c0465c.f1626b;
            C1605p c1605p = c1598l0.f10289b;
            int m2600c = c1605p.m2600c(f7);
            int m2600c2 = c1605p.m2600c(c0465c.f1628d);
            if (m2600c <= m2600c2) {
                while (true) {
                    builder.addVisibleLineBounds(c1598l0.m2579f(m2600c), c1605p.m2601d(m2600c), c1598l0.m2580g(m2600c), c1605p.m2599b(m2600c));
                    if (m2600c == m2600c2) {
                        break;
                    }
                    m2600c++;
                }
            }
        }
        return builder;
    }
}
