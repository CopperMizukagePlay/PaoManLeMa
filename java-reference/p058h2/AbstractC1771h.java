package p058h2;

import android.text.Layout;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h2.h */
/* loaded from: classes.dex */
public abstract class AbstractC1771h {

    /* renamed from: a */
    public static final Layout.Alignment f10789a;

    /* renamed from: b */
    public static final Layout.Alignment f10790b;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (AbstractC3367j.m5096a(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (AbstractC3367j.m5096a(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        f10789a = alignment;
        f10790b = alignment2;
    }
}
