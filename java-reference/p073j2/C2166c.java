package p073j2;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;
import p058h2.AbstractC1774k;
import p058h2.C1772i;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j2.c */
/* loaded from: classes.dex */
public final class C2166c implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i7, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12, int i13, boolean z7, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i12)) == layout.getLineCount() - 1) {
            C1772i c1772i = AbstractC1774k.f10809a;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float m3507A = AbstractC2168e.m3507A(layout, lineForOffset, paint) + AbstractC2168e.m3539z(layout, lineForOffset, paint);
                if (m3507A == 0.0f) {
                    return;
                }
                AbstractC3367j.m5097b(canvas);
                canvas.translate(m3507A, 0.0f);
            }
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z7) {
        return 0;
    }
}
