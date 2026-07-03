package p018c0;

import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorBoundsInfo;
import p008b.AbstractC0223b;
import p027d1.C0465c;
import p035e1.AbstractC0659i0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.h */
/* loaded from: classes.dex */
public abstract class AbstractC0338h {
    /* renamed from: a */
    public static final CursorAnchorInfo.Builder m696a(CursorAnchorInfo.Builder builder, C0465c c0465c) {
        EditorBoundsInfo.Builder editorBounds;
        EditorBoundsInfo.Builder handwritingBounds;
        EditorBoundsInfo build;
        CursorAnchorInfo.Builder editorBoundsInfo;
        editorBounds = AbstractC0223b.m491i().setEditorBounds(AbstractC0659i0.m1425y(c0465c));
        handwritingBounds = editorBounds.setHandwritingBounds(AbstractC0659i0.m1425y(c0465c));
        build = handwritingBounds.build();
        editorBoundsInfo = builder.setEditorBoundsInfo(build);
        return editorBoundsInfo;
    }
}
